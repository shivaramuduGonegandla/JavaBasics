package AbstractClasses;

// 1. Create an abstract class with abstract and non-abstract methods.
abstract class AbsttractClass {
    // Abstract method (does not have a body)
    abstract void abstractMethod();

    // Non-abstract method
    void nonAbstractMethod() {
        System.out.println("This is a non-abstract method in AbstractClass.");
    }
}

// 2. Create a subclass for the abstract class.
class SubsClass extends AbsttractClass {
    // Implement the abstract method
    @Override
    void abstractMethod() {
        System.out.println("Abstract method implemented in SubClass.");
    }

    // 3. Create an instance of the child class in the child class and call abstract methods
    void callAbstractMethod() {
        SubClass subClass = new SubClass();
        subClass.abstractMethod(); // Calling the abstract method
    }

    // 4. Create an instance of the child class in the child class and call non-abstract methods
    void callNonAbstractMethod() {
        SubClass subClass = new SubClass();
        subClass.nonAbstractMethod(); // Calling the non-abstract method
    }
}

// Main class to test the implementation
public class Combined4Examples {
    public static void main(String[] args) {
        // Create an instance of the subclass
        SubsClass obj = new SubsClass();

        // Call the non-abstract method
        obj.nonAbstractMethod();

        // Call the abstract method
        obj.abstractMethod();

        // Call abstract method using the child class instance method
        obj.callAbstractMethod();

        // Call non-abstract method using the child class instance method
        obj.callNonAbstractMethod();
    }
}
/* Output:-

This is a non-abstract method in AbstractClass.
Abstract method implemented in SubClass.

*/