package AbstractClasses;

//1. Create an Abstract Class with Abstract and Non-Abstract Methods

public class Question1 {

	abstract class AbstractClass {
	    // Abstract method (does not have a body)
	    abstract void abstractMethod();

	    // Non-abstract method
	    void nonAbstractMethod() {
	        System.out.println("This is a non-abstract method.");
	    }
	}

}
// Output:- "This is a non-abstract method.