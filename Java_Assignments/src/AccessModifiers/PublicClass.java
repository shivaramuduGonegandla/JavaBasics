package AccessModifiers;

// Class with public fields and methods
public class PublicClass {
    public String publicField = "Public Field";

    public void publicMethod() {
        System.out.println("Public Method");
    }
}

// Another class in the same package to access public members
class AccessPublicClassSamePackage {
    public static void main(String[] args) {
        PublicClass obj = new PublicClass();
        // Accessing public fields and methods within the same package
        System.out.println(obj.publicField);
        obj.publicMethod();
    }
}
// Output:- Public Method