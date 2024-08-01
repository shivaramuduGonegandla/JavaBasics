package Arrays;

// Test if array contains a specific value

public class Contains {

    // Method to find the index of a value in the array
    public static int indexOf(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1; // Value not found
    }

    // Method to check if the array contains a specific value
    public static boolean contains(int[] arr, int value) {
        return indexOf(arr, value) != -1;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        System.out.println("Array contains 30: " + contains(array, 30));
    }
}
// Array contains 30: true
