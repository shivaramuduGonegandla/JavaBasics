package AccessModifiers;

// 1. Class with private fields, private method, and main method

class PrivateClass {
    private String privateField = "Private Field";

    private void privateMethod() {
        System.out.println("Private Method");
    }

    // Public getter for privateField
    public String getPrivateField() {
        return privateField;
    }

    // Public method to call privateMethod
    public void callPrivateMethod() {
        privateMethod();
    }
}

// Subclass to try accessing private fields and methods
class SubPrivateClass extends PrivateClass {
    public void accessPrivateMembers() {
        // This will result in a compile-time error as private members are not accessible
        // System.out.println(privateField);
        // privateMethod();
    }
}

public class Question1 {
    public static void main(String[] args) {
        PrivateClass obj = new PrivateClass();
        // Accessing private fields and methods using public getters and methods
        System.out.println(obj.getPrivateField());
        obj.callPrivateMethod();
    }
}

/* Output:-

Private Field
Private Method

*/