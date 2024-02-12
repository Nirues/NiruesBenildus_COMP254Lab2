class Exercises1 {

    /** Returns the sum of the integers in given array. */
    //O(n) - linear complexity, and n is the size of the input array.
    public static int example1(int[] arr) {
        int n = arr.length, total = 0;
        for (int j=0; j < n; j++)       // The loop from 0 to n-1, O(n)
            total += arr[j];
        return total;
    }

    /** Returns the sum of the integers with even index in given array. */
    //O(n) -  shows linear complexity, and  n is the size of the input array.
    public static int example2(int[] arr) {
        int n = arr.length, total = 0;
        for (int j=0; j < n; j += 2)    //  the increment of 2, O(n/2) -> O(n)
            total += arr[j];
        return total;
    }

    /** Returns the sum of the prefix sums of given array. */
   // O(n^2) - is the quadratic complexity, where n is the size of the input array.
    public static int example3(int[] arr) {
        int n = arr.length, total = 0;
        for (int j=0; j < n; j++)       //  loop from 0 to n-1, O(n)
            for (int k=0; k <= j; k++)    // loop from 0 to j, O(n)
                total += arr[j];
        return total;
    }

    /** Returns the sum of the prefix sums of given array. */
    // O(n) - linear complexity, where n is the size of the input array.
    public static int example4(int[] arr) {
        int n = arr.length, prefix = 0, total = 0;
        for (int j=0; j < n; j++) {     // loop from 0 to n-1, O(n)
            prefix += arr[j];
            total += prefix;
        }
        return total;
    }

    /** Returns the number of times second array stores sum of prefix sums from first. */
    //O(n^3) - cubic complexity, where n is the size of the input arrays
    public static int example5(int[] first, int[] second) {
        int n = first.length, count = 0;
        for (int i=0; i < n; i++) {     // the loop from 0 to n-1, O(n)
            int total = 0;
            for (int j=0; j < n; j++)     // the  loop from 0 to n-1, O(n)
                for (int k=0; k <= j; k++)  // the loop from 0 to j, O(n)
                    total += first[k];
            if (second[i] == total) count++;
        }
        return count;
    }
}

