package Arrays;

// Add integer values of an array

public class SumArray {

	public static int sumArray(int[] arr) {
	    int sum = 0;
	    for (int num : arr) {
	        sum += num;
	    }
	    return sum;
	}

	public static void main(String[] args) {
	    int[] array = {1, 2, 3, 4, 5};
	    System.out.println("Sum of array elements: " + sumArray(array));
	}

}

// Output:- Sum of array elements: 15
