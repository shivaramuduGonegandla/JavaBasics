package Arrays;

import java.util.Arrays; // Import Arrays class for printing

// Get the difference of largest and smallest value
public class DiffMinMax {

    // Method to find the minimum and maximum values in an array
    public static int[] minMaxArray(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return new int[] {min, max};
    }

    // Method to calculate the difference between the largest and smallest values
    public static int differenceMinMax(int[] arr) {
        int[] minMax = minMaxArray(arr);
        return minMax[1] - minMax[0];
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Difference between largest and smallest value: " + differenceMinMax(array));
    }
}
// Difference between largest and smallest value: 4
