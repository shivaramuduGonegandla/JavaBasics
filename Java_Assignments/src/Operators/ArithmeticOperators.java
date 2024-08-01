package Operators;

// 1. Write a function for arithmetic operators (+, -, *, /)

public class ArithmeticOperators {
    
	void performOperations(int a, int b) {
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
    }

    public static void main(String[] args) {
        ArithmeticOperators obj = new ArithmeticOperators();
        obj.performOperations(10, 5);
    }
}

/* Output:-
 
   Addition: 15
   Subtraction: 5
   Multiplication: 50
   Division: 2

*/