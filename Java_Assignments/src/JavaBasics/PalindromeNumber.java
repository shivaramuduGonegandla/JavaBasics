package JavaBasics;

//10. Write a program to check if a number is a palindrome or not

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 121;
        int reversedNumber = 0, remainder, originalNumber;

        originalNumber = number;

        while (number != 0) {
            remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}
// 121 is a palindrome.
