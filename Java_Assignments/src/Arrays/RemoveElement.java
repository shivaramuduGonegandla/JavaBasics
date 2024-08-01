package Arrays;

import java.util.Arrays;

// Remove a specific element from an array

public class RemoveElement {

	public static int[] removeElement(int[] arr, int value) {
	    int count = 0;
	    for (int num : arr) {
	        if (num == value) count++;
	    }
	    int[] newArr = new int[arr.length - count];
	    int index = 0;
	    for (int num : arr) {
	        if (num != value) newArr[index++] = num;
	    }
	    return newArr;
	}

	public static void main(String[] args) {
	    int[] array = {1, 2, 3, 2, 4, 5};
	    int[] newArray = removeElement(array, 2);
	    System.out.println("Array after removing 2: " + Arrays.toString(newArray));
	}

}
// Array after removing 2: [1, 3, 4, 5]
