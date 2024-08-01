package Loops;

// 8. Write a program to find if a number is an Armstrong number or not

public class ArmstrongNumber {
    
	public static void main(String[] args) {
        int number = 153;
        int originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}

//output:- 153 is an Armstrong number.
