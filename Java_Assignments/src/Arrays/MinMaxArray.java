package Arrays;

// Find the minimum and maximum value of an array


public class MinMaxArray {

	public static int[] minMaxArray(int[] arr) {
	    if (arr.length == 0) return new int[]{};
	    int min = arr[0];
	    int max = arr[0];
	    for (int num : arr) {
	        if (num < min) min = num;
	        if (num > max) max = num;
	    }
	    return new int[]{min, max};
	}

	public static void main(String[] args) {
	    int[] array = {1, 2, 3, 4, 5};
	    int[] minMax = minMaxArray(array);
	    System.out.println("Min: " + minMax[0] + ", Max: " + minMax[1]);
	}

}
// Min: 1, Max: 5
