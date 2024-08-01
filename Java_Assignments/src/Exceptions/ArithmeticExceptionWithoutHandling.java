package Exceptions;

// 1. Generate Arithmetic Exception Without Exception Handling

public class ArithmeticExceptionWithoutHandling {
    public static void main(String[] args) {
        int result = 10 / 0; // This will generate ArithmeticException
        System.out.println(result);
    }
}

