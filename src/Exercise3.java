import java.util.Random;

public class Exercise3 {

    public static void main(String[] args) {
        long minN = 1;
        long maxN = 1000;


        long maxNUnique1 = findMaxNForAlgorithm("unique1", minN, maxN);
        long maxNUnique2 = findMaxNForAlgorithm("unique2", minN, maxN);


        System.out.println("Max value of n for unique1: " + maxNUnique1);
        System.out.println("Max value of n for unique2: " + maxNUnique2);
    }

    // Helper method to find the maximum value of n for a given algorithm
    public static long findMaxNForAlgorithm(String algorithm, long minN, long maxN) {
        long n = minN;
        long startTime, endTime, duration;
        boolean timeExceeded = false;

        // Binary search loop
        while (minN <= maxN) {
            n = (minN + maxN) / 2;

            // Measure the running time of the algorithm
            startTime = System.currentTimeMillis();
            boolean result = false;
            switch (algorithm) {
                case "unique1":
                    result = Uniqueness.unique1((int) n);
                    break;
                case "unique2":
                    if (Uniqueness.unique2((int) n)) result = true;
                    else result = false;
                    break;
                default:
            }
            endTime = System.currentTimeMillis();
            duration = endTime - startTime;

            // Check if time exceeded one minute
            if (!result || duration > 60000) {
                maxN = n - 1;
            } else {
                minN = n + 1;
            }
        }

        return n;
    }
}
