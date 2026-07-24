package com.academy.library;

import java.io.IOException;
import java.nio.file.Path;
import java.util.TreeMap;

public class ReportService {

    private final LibraryService libraryService;

    public ReportService(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    private String getSummaryReport() {

        return "Report\nBooks : "
                + libraryService.getBooks().size()
                + "\nBorrowed : "
                + libraryService.getBooks() // TODO: calculate borrowed books
                + "\nAvailable : "
                + libraryService.getBooks() // TODO: cacluate available books
                + "\nMembers : "
                + libraryService.getMembers().size()
                + "\nMost Popular Category : "
                + findMostPopularCategory();
    }

    public void displaySummaryReport() {
        System.out.println(getSummaryReport());
        // TODO: compute totalBooks, borrowedBooks, availableBooks, totalMembers
        // TODO: findMostPopularCategory(); print Reports block matching solution format
    }

    public Path exportReportToFile(String fileName) throws IOException {
        String report = getSummaryReport();
        return Files.writeString();
        // TODO: build same summary + category breakdown; Files.writeString; return Path
    }

    private String findMostPopularCategory() {
        TreeMap<String, Integer> categoryBookCount = libraryService.getCategoryBookCount();
        if (categoryBookCount.isEmpty()) {
            return "N/A";
        }

        return categoryBookCount.firstKey();
    }
}
