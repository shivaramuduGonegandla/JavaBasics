package Interfaces;

// 5. Create Two Interfaces with the Same Method and Implement Them in One Class

interface InterfaceOne {
    void sameMethod();
}

interface InterfaceTwo {
    void sameMethod();
}

class SameMethodClass implements InterfaceOne, InterfaceTwo {
    @Override
    public void sameMethod() {
        System.out.println("Same method implemented.");
    }

    
}

public class Question5 {

	public static void main(String[] args) {
        SameMethodClass obj = new SameMethodClass();
        obj.sameMethod();
    }
}
// Output:- Same method implemented.
