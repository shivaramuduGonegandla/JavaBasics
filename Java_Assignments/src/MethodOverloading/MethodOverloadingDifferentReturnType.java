package MethodOverloading;

//5. Method Overloading with Same Name, Number of Parameters, and Data Type but Different Return Type

public class MethodOverloadingDifferentReturnType {
    // Method with integer return type
    public static int getValue() {
        return 42;
    }

    // Method with double return type
    public static double getValue(double x) {
        return x * 2;
    }

    public static void main(String[] args) {
        System.out.println("Integer return: " + getValue());          // Calls the method returning int
        System.out.println("Double return: " + getValue(5.5));         // Calls the method returning double
    }
}
