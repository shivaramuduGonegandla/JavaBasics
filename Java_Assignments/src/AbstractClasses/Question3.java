package AbstractClasses;

// Abstract method implemented in SubClassForAbstract.

// Abstract class with an abstract method and a non-abstract method
abstract class AbstractCslass {
    // Abstract method (does not have a body)
    abstract void abstractMethod();

    // Non-abstract method
    void nonAbstractMethod() {
        System.out.println("Non-abstract method in AbstractClass.");
    }
}

// Subclass that extends the abstract class and implements its abstract method
class SubClassForAbstract extends AbstractCslass {
    // Implement the abstract method
    @Override
    void abstractMethod() {
        System.out.println("Abstract method implemented in SubClassForAbstract.");
    }
}

// Public class containing the main method
public class Question3 {
    public static void main(String[] args) {
        // Create an instance of the child class
        SubClassForAbstract obj = new SubClassForAbstract();

        // Call the abstract method
        obj.abstractMethod();
    }
}

// Abstract method implemented in SubClassForAbstract.
