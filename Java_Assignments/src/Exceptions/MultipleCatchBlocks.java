package Exceptions;

//4. Program with Multiple Catch Blocks

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[2];
            int result = 10 / 0; // ArithmeticException
            numbers[5] = 10; // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Caught Arithmetic Exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBounds Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
