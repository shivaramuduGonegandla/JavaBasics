package AbstractClasses;

// 4. Create an Instance for the Child Class in Child Class and Call Non-Abstract Methods

class SubClassNonAbstract extends AbstractClass {
    // Implement the abstract method
    @Override
    void abstractMethod() {
        System.out.println("Abstract method implemented in SubClassNonAbstract.");
    }

    
}

public class Question4 {

	public static void main(String[] args) {
        // Create an instance of the child class
        SubClassNonAbstract obj = new SubClassNonAbstract();

        // Call the non-abstract method
        obj.nonAbstractMethod();
    }
}
// Output:- Abstract method implemented in SubClassNonAbstract.