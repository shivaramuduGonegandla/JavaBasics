package Arrays;

// Find the index of an array element

public class IndexOf {

	public static int indexOf(int[] arr, int value) {
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == value) return i;
	    }
	    return -1; // Element not found
	}

	public static void main(String[] args) {
	    int[] array = {10, 20, 30, 40, 50};
	    System.out.println("Index of 30: " + indexOf(array, 30));
	}

}
// Index of 30: 2
