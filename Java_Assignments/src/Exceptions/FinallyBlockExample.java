package Exceptions;

// 7. Program with Finally Block

public class FinallyBlockExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 2; // No exception
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Arithmetic Exception: " + e.getMessage());
        } finally {
            System.out.println("This block is always executed.");
        }
    }
}
