package MethodOverloading;

//4. Method Overloading with Same Name and Same Number of Parameters but Different Types


public class MethodOverloadingDifferentTypesParameters {
    // Method with int and double parameters
    public static void process(int a, double b) {
        System.out.println("Int and double: " + a + ", " + b);
    }

    // Method with double and int parameters
    public static void process(double a, int b) {
        System.out.println("Double and int: " + a + ", " + b);
    }

    public static void main(String[] args) {
        process(10, 20.5);    // Calls the method with int and double
        process(10.5, 20);    // Calls the method with double and int
    }
}
