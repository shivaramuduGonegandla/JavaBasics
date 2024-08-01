package JavaBasics;


//Question:- 1. How to create a class, object, method and its signature


public class MyClass {
	
	void displayMessage() {
		
		// Method Signature
		System.out.println("This is Method Signature.");
	}
	
	public static void main(String[] args) {
		
		//Create Object
		MyClass object = new MyClass();
		
		//Call The Method
		object.displayMessage();
	}

}

// Output:- This is Method Signature.
