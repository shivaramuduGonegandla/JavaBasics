package Interfaces;

//1. Create an Interface with Only One Method and Implement It in a Class

interface SimpleInterface {
    void simpleMethod();
}

class SimpleClass implements SimpleInterface {
    @Override
    public void simpleMethod() {
        System.out.println("Simple method implemented.");
    }

}

public class Question1 {

	public static void main(String[] args) {
        SimpleClass obj = new SimpleClass();
        obj.simpleMethod();
    }
}
// Output:- Simple method implemented.
