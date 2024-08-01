package Exceptions;

// create own Exception

//Custom Exception Class
class MyCustomException extends Exception {
 public MyCustomException(String message) {
     super(message);
 }
}

public class CreateOwnException {
 public static void main(String[] args) {
     try {
         throw new MyCustomException("This is a custom exception message");
     } catch (MyCustomException e) {
         System.out.println("Caught custom exception: " + e.getMessage());
     }
 }
}
