package MethodOverloading;

//3. Method Overloading with Same Name and Same Number of Parameters of Same Type


public class MethodOverloadingSameParameters {
    // Method with two integer parameters
    public static void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // Method with two integer parameters (same name, same type)
    public static void add(int a, int b, int c) {
        System.out.println("Sum: " + (a + b + c));
    }

    public static void main(String[] args) {
        add(5, 10);        // Calls the method with two parameters
        add(5, 10, 15);    // Calls the method with three parameters
    }
}
