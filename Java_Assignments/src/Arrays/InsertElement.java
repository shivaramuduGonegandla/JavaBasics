package Arrays;

import java.util.Arrays;

// Insert an element at a specific position in the array

public class InsertElement {
	
	public static int[] insertElement(int[] arr, int value, int position) {
	    if (position < 0 || position > arr.length) throw new IllegalArgumentException("Invalid position");
	    int[] newArr = new int[arr.length + 1];
	    for (int i = 0; i < position; i++) {
	        newArr[i] = arr[i];
	    }
	    newArr[position] = value;
	    for (int i = position; i < arr.length; i++) {
	        newArr[i + 1] = arr[i];
	    }
	    return newArr;
	}

	public static void main(String[] args) {
	    int[] array = {1, 2, 3, 4, 5};
	    int[] newArray = insertElement(array, 10, 2);
	    System.out.println("Array after inserting 10 at position 2: " + Arrays.toString(newArray));
	}


}

// Array after inserting 10 at position 2: [1, 2, 10, 3, 4, 5]
