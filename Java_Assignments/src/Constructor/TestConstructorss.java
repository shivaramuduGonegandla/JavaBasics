package Constructor;

// 2. Call Constructors of Superclass from a Child Class

class SuperClass {
    // Default constructor
    SuperClass() {
        System.out.println("SuperClass Default Constructor Called");
    }

    // Argument constructor
    SuperClass(int a) {
        System.out.println("SuperClass Argument Constructor Called with value: " + a);
    }
}

class SubClass extends SuperClass {
    // Default constructor
    SubClass() {
        // Calls the default constructor of SuperClass
        super();
        System.out.println("SubClass Default Constructor Called");
    }

    // Argument constructor
    SubClass(int a) {
        // Calls the argument constructor of SuperClass
        super(a);
        System.out.println("SubClass Argument Constructor Called");
    }
}

public class TestConstructorss {
    public static void main(String[] args) {
        // Calling constructors
        SubClass obj1 = new SubClass();          // Calls default constructors of both classes
        SubClass obj2 = new SubClass(100);       // Calls argument constructors of both classes
    }
}

/* 
  SuperClass Default Constructor Called
SubClass Default Constructor Called
SuperClass Argument Constructor Called with value: 100
SubClass Argument Constructor Called
*/
