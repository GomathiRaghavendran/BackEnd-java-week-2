/**
 * . 📊 Array Statistics
 * Concepts used: Arrays, loops, methods.
 * <p>
 * Ask the user to enter n numbers and store them in an array.
 * <p>
 * Write methods to calculate:
 * <p>
 * Maximum value
 * Minimum value
 * Average
 * Sum
 * Print all results.
 */

package projects;

import java.util.Scanner;

public class ArrayStatistics {
    public static void main(String[] args) {
        Array a = new Array();
        a.getValuesOfn();
        a.maxValue();
        a.minValue();
        a.sum();
        a.average();
    }
}

class Array {
    Scanner scanner = new Scanner(System.in);
    int size;
    int[] n;

    public void getValuesOfn() {
        System.out.println("Enter the array size: ");
        size = scanner.nextInt();
        n = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter values of n[" + i + "]:  ");
            n[i] = scanner.nextInt();
        }
    }

    public int maxValue() {
        int max = n[0];
        for (int i = 0; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
            }
        }
        System.out.println("maximum value: " + max);
        return max;
    }

    public int minValue() {
        int min = n[0];
        for (int i = 0; i < n.length; i++) {
            if (n[i] < min) {
                min = n[i];
            }
        }
        System.out.println("minimum value: " + min);
        return min;
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum = sum + n[i];
        }
        System.out.println("sum of Arrays: " + sum);
        return sum;
    }

    public int average() {
        int avg = 0;
        avg = sum() / n.length;
        System.out.println("Average of Arrays are:  " + avg);
        return avg;
    }
    //scanner.close();
}











