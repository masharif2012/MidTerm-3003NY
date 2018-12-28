package math.problems;

import java.util.Arrays;

public class FindLowestDifference {


    static int findMinDiff(int[] array1, int n) {

        // Initialize difference as infinite
        int diff = Integer.MAX_VALUE;

        // Find the min diff by comparing difference
        // of all possible pairs in given array
        for (int i=0; i<n-1; i++)
            for (int j=i+1; j<n; j++)
                if (Math.abs((array1[i] - array1[j]) )< diff)
                    diff = Math.abs((array1[i] - array1[j]));

        // Return min diff
        return diff;
    }

    public static int findMinDiffr(int[] array2, int p) {

        // Initialize difference as infinite
        int diff = Integer.MAX_VALUE;

        // Find the min diff by comparing difference
        // of all possible pairs in given array
        for (int i=0; i<p-1; i++)
            for (int j=i+1; j<p; j++)
                if (Math.abs((array2[i] - array2[j]) )< diff)
                    diff = Math.abs((array2[i] - array2[j]));

        // Return min diff
        return diff;
    }

    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */



        int [] array1 =new int[]  {30,12,5,9,2,20,33,1};
        int [] array2 = new int []{18,25,41,47,17,36,14,19};

        System.out.println("Minimum difference in the first Array is: "+ findMinDiff(array1, array1.length));

        System.out.println("Minimum difference in the second Array is:  "+ findMinDiffr(array2, array2.length));

    }

}
