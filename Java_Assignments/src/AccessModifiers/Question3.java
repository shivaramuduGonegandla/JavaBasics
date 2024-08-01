package AccessModifiers;

//3. Create a Class with PROTECTED Fields and Methods

// Class with protected fields and methods
class ProtectedClass {
    protected String protectedField = "Protected Field";

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }
}

// Another class in the same package to access protected members
class AccessProtectedClassSamePackage {
    // You can add code here if needed
}

public class Question3 {
    public static void main(String[] args) {
        ProtectedClass obj = new ProtectedClass();
        // Accessing protected fields and methods within the same package
        System.out.println(obj.protectedField);
        obj.protectedMethod();
    }
}

/* Output:-
Protected Field
Protected Method

*/