package Arrays;

import java.util.Arrays; // Import the Arrays class

// Copy an array to another array
public class CopyArray {

    // Method to copy an array
    public static int[] copyArray(int[] arr) {
        int[] newArr = new int[arr.length];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        return newArr;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] copiedArray = copyArray(array);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));
    }
}
// Copied array: [1, 2, 3, 4, 5]
