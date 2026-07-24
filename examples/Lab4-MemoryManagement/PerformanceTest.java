public class PerformanceTest {

    private static class SampleObject {
        private final int value;
        private final byte[] data = new byte[64];

        SampleObject(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        System.out.println("===== Performance Measurement =====");
        MemoryMonitor.printMemoryReport("Start");

        int[] objectCounts = {10, 100, 1_000, 100_000, 1_000_000};

        System.out.println();
        System.out.printf("%-12s %-14s %-18s%n", "Objects", "Used Memory", "Execution Time");
        System.out.println("--------------------------------------------------");

        for (int count : objectCounts) {
            runAllocationTest(count);
        }

        System.out.println();
        System.out.println("Additional measurements:");
        measureLoopExecution();
        measureArrayAllocation();
        measureLargeByteArray();
    }

    private static void runAllocationTest(int count) {
        MemoryMonitor.triggerGarbageCollection();
        long memoryBefore = MemoryMonitor.getUsedMemoryBytes();
        long start = System.nanoTime();
        SampleObject[] sampleObjects = new SampleObject[count];
        for (int i = 0; i < count; i++) {
            sampleObjects[i] = new SampleObject(i);
        }
        long elapsedMillis = (System.nanoTime() - start) / 1_000_000;
        long memoryAfter = MemoryMonitor.getUsedMemoryBytes();
        long memoryUsed = memoryAfter - memoryBefore;

        System.out.printf("%-12d %-14d %-18d%n", count, memoryUsed, elapsedMillis);
        sampleObjects = null;
        System.gc();
    }

    private static void measureLoopExecution() {
        long start = System.nanoTime();
        int sum = 0;
        for (int i = 0; i < 10_000_000; i++) {
            sum += i;
        }
        long elapsedMillis = (System.nanoTime() - start) / 1_000_000;
        System.out.println("Time elapsed in Loop Execution: " + elapsedMillis);
    }

    private static void measureArrayAllocation() {
        int[] array = new int[1_000_000];
        long start = System.nanoTime();
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        long elapsedMillis = (System.nanoTime() - start) / 1_000_000;
        System.out.println("Time elapsed in Memory Allocation: " + elapsedMillis);
    }

    private static void measureLargeByteArray() {
        MemoryMonitor.printMemoryReport("Before Large byte[]");
        byte[] byteArray = new byte[15_000_000];
        MemoryMonitor.printMemoryReport("After Large byte[] Allocation");

        byteArray = null;
        System.gc();
        MemoryMonitor.printMemoryReport("After Releasing byte[]");
        // TODO: allocate 10 MB byte[]; print After report; null + GC; print After Releasing
    }
}
