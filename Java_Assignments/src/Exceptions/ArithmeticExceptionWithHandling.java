package Exceptions;

// 2. Handle Arithmetic Exception Using Try-Catch Block

public class ArithmeticExceptionWithHandling {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will generate ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred: " + e.getMessage());
        }
    }
}
