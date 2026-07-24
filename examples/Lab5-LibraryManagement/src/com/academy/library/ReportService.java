package com.academy.library;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.TreeMap;

public class ReportService {

    private final LibraryService libraryService;

    public ReportService(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    public void displaySummaryReport() {
        System.out.println(getSummaryReport());
    }

    public Path exportReportToFile(String fileName) throws IOException {
        String report = getSummaryReport();
        return Files.writeString(
                Path.of(
                        "/home/jacktheck02/java-bootcamp/examples/Lab5-LibraryManagement/report.txt"),
                report,
                StandardOpenOption.APPEND);
    }

    private String getSummaryReport() {
        List<Book> books = libraryService.getBooks();
        int borrowedCount = 0;

        for (Book book : books) {
            if (!book.isAvailable()) {
                borrowedCount++;
            }
        }

        int availableBooks = books.size() - borrowedCount;

        return "Report\nBooks : "
                + books.size()
                + "\nBorrowed : "
                + borrowedCount
                + "\nAvailable : "
                + availableBooks
                + "\nMembers : "
                + libraryService.getMembers().size()
                + "\nMost Popular Category : "
                + findMostPopularCategory();
    }

    private String findMostPopularCategory() {
        TreeMap<String, Integer> categoryBookCount = libraryService.getCategoryBookCount();
        if (categoryBookCount.isEmpty()) {
            return "N/A";
        }

        return categoryBookCount.firstKey();
    }
}
