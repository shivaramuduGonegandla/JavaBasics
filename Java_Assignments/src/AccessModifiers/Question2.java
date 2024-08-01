package AccessModifiers;

// 2. Create a Class with DEFAULT Fields and Methods



//Class with default fields and methods
class DefaultClass {
 String defaultField = "Default Field";

 void defaultMethod() {
     System.out.println("Default Method");
 }
}

//Another class in the same package to access default members
class AccessDefaultClass {
 
}

public class Question2 {

	public static void main(String[] args) {
	     DefaultClass obj = new DefaultClass();
	     // Accessing default fields and methods within the same package
	     System.out.println(obj.defaultField);
	     obj.defaultMethod();
	 }
}
/* Output:-
Default Field
Default Method
*/