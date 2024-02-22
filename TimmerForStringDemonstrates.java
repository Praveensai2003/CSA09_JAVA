public class StringBuilderVsStringBuffer {
    public static void main(String[] args) {
        // Example of StringBuilder and StringBuffer appending strings
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        stringBuilder.append("StringBuilder");
        stringBuffer.append("StringBuffer");

        System.out.println("StringBuilder: " + stringBuilder);
        System.out.println("StringBuffer: " + stringBuffer);

        // Comparing performance by appending a large number of strings
        int iterations = 100000;
        long startTime, endTime, duration;

        // StringBuilder performance
        startTime = System.nanoTime();
        StringBuilder stringBuilderPerformance = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilderPerformance.append("Append");
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time taken by StringBuilder: " + duration + " nanoseconds");

        // StringBuffer performance
        startTime = System.nanoTime();
        StringBuffer stringBufferPerformance = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBufferPerformance.append("Append");
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Time taken by StringBuffer: " + duration + " nanoseconds");
    }
}
