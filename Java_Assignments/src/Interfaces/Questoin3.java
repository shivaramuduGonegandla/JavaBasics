package Interfaces;

// 3. Use Interface Instances to Call the Implemented Method in the Implemented Class

interface MyInterface {
    void myMethod();
}

class MyClass implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("My method implemented.");
    }

    public static void main(String[] args) {
        MyInterface obj = new MyClass();
        obj.myMethod();
    }
}

public class Questoin3 {

	 public static void main(String[] args) {
	        MyInterface obj = new MyClass();
	        obj.myMethod();
	    }
}
// Output:- My method implemented.