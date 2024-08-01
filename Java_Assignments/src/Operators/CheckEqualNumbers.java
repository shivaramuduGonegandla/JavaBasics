package Operators;

//4. Write a program to find if two numbers are equal or not?

public class CheckEqualNumbers {
	
    void checkNumbers(int a, int b) {
        if (a == b) {
            System.out.println("The numbers are equal.");
        } else {
            System.out.println("The numbers are not equal.");
        }
    }

    public static void main(String[] args) {
        CheckEqualNumbers obj = new CheckEqualNumbers();
        obj.checkNumbers(10, 20);
        obj.checkNumbers(30, 30);
    }
}
/* Output:- 

The numbers are not equal.
The numbers are equal.

*/
