package arrays.exercises;

/**
 * Exercise 6: Binary Search
 * TODO:
 * 1. Create and sort an array.
 * 2. Ask user for a number.
 * 3. Implement binary search.
 * 4. Print result.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        int[] arr = {10000, 600, 7003, 5002, 1002, 900, 3, 4, 12, 15, 78, 93, 72};

        //1st step is to Sort an array
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the key number: ");
        int key = scanner.nextInt();

        int index = Arrays.binarySearch(arr, key);

        System.out.println("Sorted array: " + Arrays.toString(arr));

        // index == -1 means not found
        if (index > -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found"+index);
        }

    }
}

