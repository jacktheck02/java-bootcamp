public class StringBuilderComparison {
    private static final int ITERATIONS = 50_000;

    static String withString() {
        String result = "";
        for (int i = 0; i < ITERATIONS; i++) {
            result += "x";
        }
        return result;
    }

    static String withBuilder() {
        // Initial capacity avoids repeated buffer growth.
        StringBuilder result = new StringBuilder(ITERATIONS);
        for (int i = 0; i < ITERATIONS; i++) {
            result.append('x');
        }
        return result.toString();
    }

    public static void main(String[] args) {
        long startTimeWithString = System.nanoTime();
        withString();
        long elapsedMillisWithString = (System.nanoTime() - startTimeWithString) / 1_000_000;

        long startTimeWithStringBuilder = System.nanoTime();
        withBuilder();
        long elapsedMillisWithStringBuilder =
                (System.nanoTime() - startTimeWithStringBuilder) / 1_000_000;

        System.out.println("Time Elapsed: " + elapsedMillisWithString);

        System.out.println("Time Elapsed: " + elapsedMillisWithStringBuilder);
    }
}
