import java.util.Random;

public class Exercise2 {

    public static void main(String[] args) {
        // Define the sizes of inputs
        int[] inputSizes = {15, 150, 1500, 15000, 150000};

        // Measure running time for each input size
        for (int n : inputSizes) {
            double[] input = generateRandomArray(n);

            long startTime1 = System.nanoTime();
            prefixAverage1(input);
            long endTime1 = System.nanoTime();
            long duration1 = endTime1 - startTime1;

            long startTime2 = System.nanoTime();
            prefixAverage2(input);
            long endTime2 = System.nanoTime();
            long duration2 = endTime2 - startTime2;

            // Output results
            System.out.println("Input size: " + n);
            System.out.println("prefixAverage1 has a duration of: " + duration1 + " nanoseconds");
            System.out.println("prefixAverage2 has a duration:of: " + duration2 + " nanoseconds");
            System.out.println();
        }
    }

    // Helper method to generate a random array of doubles
    public static double[] generateRandomArray(int n) {
        double[] arr = new double[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextDouble();
        }
        return arr;
    }

    // Prefix Average method 1
    public static double[] prefixAverage1(double[] input) {
        int n = input.length;
        double[] result = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += input[i];
            result[i] = sum / (i + 1);
        }
        return result;
    }

    // Prefix Average method 2
    public static double[] prefixAverage2(double[] input) {
        int n = input.length;
        double[] result = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += input[i];
            result[i] = sum / n;
        }
        return result;
    }
}


