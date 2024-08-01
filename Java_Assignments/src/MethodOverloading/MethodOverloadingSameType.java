package MethodOverloading;

// 1. Method Overloading with Same Name but Different Number of Parameters (Same Type)

public class MethodOverloadingSameType {
    // Method with one parameter
    public static void display(int a) {
        System.out.println("Method with one parameter: " + a);
    }

    // Method with two parameters
    public static void display(int a, int b) {
        System.out.println("Method with two parameters: " + a + ", " + b);
    }

    public static void main(String[] args) {
        display(10);        // Calls the method with one parameter
        display(10, 20);    // Calls the method with two parameters
    }
}

