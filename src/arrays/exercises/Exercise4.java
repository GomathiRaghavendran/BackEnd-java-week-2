package arrays.exercises;

/**
 * Exercise 4: Array Operations
 * TODO:
 * 1. Create an array of 6 integers.
 * 2. Sort array.
 * 3. Copy into another array.
 * 4. Search for a value.
 * 5. Compare two arrays.
 */

import java.util.Arrays;
public class Exercise4
{
    public static void main(String[] args)
    {
        // TODO: Implement exercise
        int[] arr={110,20,430,490,350,1060};

        //Sort array
        Arrays.sort(arr);
        System.out.println("sorted arrayed: "+Arrays.toString(arr));

        //Copy into another array.
        int[] copy=Arrays.copyOf(arr,arr.length);
        System.out.println("Copied arrayed: "+Arrays.toString(arr));

       // Search for a value.
        int search=Arrays.binarySearch(arr,110);
        System.out.println("Searched value of an array: "+search);

       // Compare two arrays.
        int[] arr2={1050,20,110,350,430,490};
        System.out.println("Comparing the arrays: "+Arrays.equals(arr,arr2));


    }
}

