package Arrays;

import java.util.Arrays;

// Reverse an array of integer values
public class ReverseArray {

	public static int[] reverseArray(int[] arr) {
	    int[] reversed = new int[arr.length];
	    for (int i = 0; i < arr.length; i++) {
	        reversed[i] = arr[arr.length - 1 - i];
	    }
	    return reversed;
	}

	public static void main(String[] args) {
	    int[] array = {1, 2, 3, 4, 5};
	    int[] reversedArray = reverseArray(array);
	    System.out.println("Reversed array: " + Arrays.toString(reversedArray));
	}

}
// Reversed array: [5, 4, 3, 2, 1]
