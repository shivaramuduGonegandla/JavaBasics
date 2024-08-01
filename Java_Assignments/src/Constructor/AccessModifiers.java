package Constructor;

//3. Apply Private, Public, Protected, and Default Access Modifiers to Constructors

public class AccessModifiers {
    // Public constructor
    public AccessModifiers() {
        System.out.println("Public Constructor Called");
    }

    // Private constructor
    private AccessModifiers(int a) {
        System.out.println("Private Constructor Called with value: " + a);
    }

    // Protected constructor
    protected AccessModifiers(double b) {
        System.out.println("Protected Constructor Called with value: " + b);
    }

    // Default constructor
    AccessModifiers(String s) {
        System.out.println("Default Constructor Called with value: " + s);
    }
}

class TestAccessModifiers {
    public static void main(String[] args) {
        // Calling public constructor
        AccessModifiers obj1 = new AccessModifiers();

        // Calling private constructor will cause a compile-time error
        // AccessModifiers obj2 = new AccessModifiers(10);

        // Calling protected constructor
        AccessModifiers obj3 = new AccessModifiers(10.5);

        // Calling default constructor
        AccessModifiers obj4 = new AccessModifiers("Test");
    }
}
