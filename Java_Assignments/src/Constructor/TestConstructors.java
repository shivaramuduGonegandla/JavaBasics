package Constructor;

// 1. Class with Default Constructor, One-Argument Constructor, and Two-Argument Constructor

class MyClass {
    // Default constructor
    MyClass() {
        System.out.println("Default Constructor Called");
    }

    // One-argument constructor
    MyClass(int a) {
        System.out.println("One-Argument Constructor Called with value: " + a);
    }

    // Two-argument constructor
    MyClass(int a, int b) {
        System.out.println("Two-Argument Constructor Called with values: " + a + " and " + b);
    }
}

public class TestConstructors {
    public static void main(String[] args) {
        // Calling all constructors
        MyClass obj1 = new MyClass();            // Calls default constructor
        MyClass obj2 = new MyClass(10);          // Calls one-argument constructor
        MyClass obj3 = new MyClass(10, 20);      // Calls two-argument constructor
    }
}


/* 
Default Constructor Called
One-Argument Constructor Called with value: 10
Two-Argument Constructor Called with values: 10 and 20

*/