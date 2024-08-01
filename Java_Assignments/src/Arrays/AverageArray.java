package Arrays;

// 2. Calculate the average value of an array of integers

public class AverageArray {

    // Method to calculate the sum of array elements
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Method to calculate the average value of an array
    public static double averageArray(int[] arr) {
        if (arr.length == 0) return 0;
        int sum = sumArray(arr);
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Average of array elements: " + averageArray(array));
    }
}
// Average of array elements: 3.0
