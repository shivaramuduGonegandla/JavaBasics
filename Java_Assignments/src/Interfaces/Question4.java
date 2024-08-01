package Interfaces;

// 4. Create Two Interfaces with One Method Each and Implement These Two Interfaces in One Class

interface FirstInterface {
    void firstMethod();
}

interface SecondInterface {
    void secondMethod();
}

class CombinedClass implements FirstInterface, SecondInterface {
    @Override
    public void firstMethod() {
        System.out.println("First method implemented.");
    }

    @Override
    public void secondMethod() {
        System.out.println("Second method implemented.");
    }

    
}

public class Question4 {
	
	public static void main(String[] args) {
        CombinedClass obj = new CombinedClass();
        obj.firstMethod();
        obj.secondMethod();
    }

}
/*  Output:- 
First method implemented.
Second method implemented.
*/