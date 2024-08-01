package Static;

/* 1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance
methods and a main method.
2. Print instance variables in static methods
3. Print static variables in Instance methods
4. Call instance methods in static methods
5. Call static methods in instance methods
6. Print all the static, instance variables in main method
7. Call static methods and instance methods in main method

*/

public class StaticDemo {

    // Static variables
    static int staticVar1 = 10;
    static String staticVar2 = "Static Variable";

    // Instance variables
    int instanceVar1 = 20;
    String instanceVar2 = "Instance Variable";

    // Static methods
    public static void staticMethod1() {
        System.out.println("Static Method 1");
        // Printing instance variables in static method (will cause a compile-time error)
        // System.out.println("Instance Variable 1: " + instanceVar1); // Not allowed
        // System.out.println("Instance Variable 2: " + instanceVar2); // Not allowed
    }

    public static void staticMethod2() {
        System.out.println("Static Method 2");
        // Printing static variables
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);
        
        // Calling instance methods from static method (need an object reference)
        StaticDemo obj = new StaticDemo();
        obj.instanceMethod1();
        obj.instanceMethod2();
    }

    // Instance methods
    public void instanceMethod1() {
        System.out.println("Instance Method 1");
        // Printing instance variables
        System.out.println("Instance Variable 1: " + instanceVar1);
        System.out.println("Instance Variable 2: " + instanceVar2);
        
        // Calling static methods from instance method
        staticMethod1();
        staticMethod2();
    }

    public void instanceMethod2() {
        System.out.println("Instance Method 2");
        // Printing instance variables
        System.out.println("Instance Variable 1: " + instanceVar1);
        System.out.println("Instance Variable 2: " + instanceVar2);
        
        // Calling static methods from instance method
        staticMethod1();
        staticMethod2();
    }

    // Main method
    public static void main(String[] args) {
        // Printing static variables
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);

        // Creating an object to access instance variables and methods
        StaticDemo obj = new StaticDemo();

        // Printing instance variables
        System.out.println("Instance Variable 1: " + obj.instanceVar1);
        System.out.println("Instance Variable 2: " + obj.instanceVar2);

        // Calling static methods
        staticMethod1();
        staticMethod2();

        // Calling instance methods
        obj.instanceMethod1();
        obj.instanceMethod2();
    }
}

