package Exceptions;

//5. Throw Exception with Your Own Message

public class ThrowExceptionWithMessage {
    public static void main(String[] args) {
        try {
            throw new Exception("Custom Exception Message");
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
