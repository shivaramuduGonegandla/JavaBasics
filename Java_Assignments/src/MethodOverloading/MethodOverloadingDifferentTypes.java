package MethodOverloading;

//2. Method Overloading with Same Name but Different Number of Parameters (Different Data Types)

public class MethodOverloadingDifferentTypes {
    // Method with one integer parameter
    public static void display(int a) {
        System.out.println("Method with int parameter: " + a);
    }

    // Method with one double parameter
    public static void display(double a) {
        System.out.println("Method with double parameter: " + a);
    }

    public static void main(String[] args) {
        display(10);        // Calls the method with int parameter
        display(10.5);      // Calls the method with double parameter
    }
}
