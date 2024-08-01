package AbstractClasses;

// 2. Create a Subclass for the Abstract Class and Access the Non-Abstract Methods



//Abstract class with an abstract method and a non-abstract method
abstract class AbstractClass {
 // Abstract method (does not have a body)
 abstract void abstractMethod();

 // Non-abstract method
 void nonAbstractMethod() {
     System.out.println("Non-abstract method in AbstractClass.");
 }
}

//Subclass that extends the abstract class and implements its abstract method
class SubClass extends AbstractClass {
 // Implement the abstract method
 @Override
 void abstractMethod() {
     System.out.println("Abstract method implemented in SubClass.");
 }
}

//Public class containing the main method
public class Question2 {
 public static void main(String[] args) {
     // Create an object of the subclass
     SubClass obj = new SubClass();

     // Access the non-abstract method
     obj.nonAbstractMethod();

     // Access the abstract method
     obj.abstractMethod();
 }
}

// Output:- Non-abstract method in AbstractClass.
//          Abstract method implemented in SubClass.
