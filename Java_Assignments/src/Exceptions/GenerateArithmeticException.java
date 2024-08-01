package Exceptions;

//8. Generate Arithmetic Exception

public class GenerateArithmeticException {
   
	public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will generate ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught Arithmetic Exception: " + e.getMessage());
        }
    }
}
