package Loops;

//5. Write a program to print the largest number among three numbers

public class LargestNumber {
   
	public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        if (a >= b && a >= c) {
            System.out.println("Largest number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest number is: " + b);
        } else {
            System.out.println("Largest number is: " + c);
        }
    }
}

// Output:- Largest number is: 30
