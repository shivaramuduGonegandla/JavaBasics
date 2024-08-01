package Exceptions;

// 3. Method That Throws Exception, Called Without Try Block

public class MethodThrowsException {
    public static void riskyMethod() throws Exception {
        throw new Exception("This is a thrown exception");
    }

    public static void main(String[] args) {
        try {
            riskyMethod();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

}
