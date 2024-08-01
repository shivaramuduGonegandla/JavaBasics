package Interfaces;

// 6. Create an Interface with a Default Method and Implement It in a Class

interface DefaultMethodInterface {
    void abstractMethod();
    
    default void defaultMethod() {
        System.out.println("Default method in the interface.");
    }
}

class DefaultMethodClass implements DefaultMethodInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Abstract method implemented.");
    }

    
    
}


public class Question6 {

	public static void main(String[] args) {
        DefaultMethodClass obj = new DefaultMethodClass();
        obj.abstractMethod();
        obj.defaultMethod(); // Calling default method without implementation
    }
}
/*  Output:- 

Abstract method implemented.
Default method in the interface

*/