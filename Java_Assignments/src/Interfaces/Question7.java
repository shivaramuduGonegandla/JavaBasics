package Interfaces;

// 7. Create an Interface and Inherit It from Another Interface

interface ParentInterface {
    void parentMethod();
}

interface ChildInterface extends ParentInterface {
    void childMethod();
}

class InterfaceInheritanceClass implements ChildInterface {
    @Override
    public void parentMethod() {
        System.out.println("Parent method implemented.");
    }

    @Override
    public void childMethod() {
        System.out.println("Child method implemented.");
    }

    
}


public class Question7 {

	public static void main(String[] args) {
        InterfaceInheritanceClass obj = new InterfaceInheritanceClass();
        obj.parentMethod();
        obj.childMethod();
    }
}
/*  Output:-
Parent method implemented.
Child method implemented.
*/