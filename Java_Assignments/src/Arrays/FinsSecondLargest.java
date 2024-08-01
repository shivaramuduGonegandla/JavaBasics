package Arrays;

// Find the second largest number in an array

public class FinsSecondLargest {

	public static int findSecondLargest(int[] arr) {
	    if (arr.length < 2) throw new IllegalArgumentException("Array must have at least two elements");
	    int largest = Integer.MIN_VALUE;
	    int secondLargest = Integer.MIN_VALUE;
	    for (int num : arr) {
	        if (num > largest) {
	            secondLargest = largest;
	            largest = num;
	        } else if (num > secondLargest && num < largest) {
	            secondLargest = num;
	        }
	    }
	    if (secondLargest == Integer.MIN_VALUE) throw new IllegalArgumentException("No second largest element");
	    return secondLargest;
	}

	public static void main(String[] args) {
	    int[] array = {1, 2, 3, 4, 5};
	    System.out.println("Second largest number: " + findSecondLargest(array));
	}

}

// Second largest number: 4
