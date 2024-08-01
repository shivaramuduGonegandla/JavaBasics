package Arrays;

// Find number of even and odd numbers in an array\

public class CountEvenOdd {

	
	public static int[] countEvenOdd(int[] arr) {
	    int evenCount = 0;
	    int oddCount = 0;
	    for (int num : arr) {
	        if (num % 2 == 0) {
	            evenCount++;
	        } else {
	            oddCount++;
	        }
	    }
	    return new int[]{evenCount, oddCount};
	}

	public static void main(String[] args) {
	    int[] array = {1, 2, 3, 4, 5};
	    int[] counts = countEvenOdd(array);
	    System.out.println("Even numbers: " + counts[0] + ", Odd numbers: " + counts[1]);
	}

}
// Even numbers: 2, Odd numbers: 3
