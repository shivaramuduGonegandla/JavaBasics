package Interfaces;

// 2. Create an Interface with Two Methods, Implement Only One in a Class

interface TwoMethodsInterface {
    void methodOne();
    void methodTwo();
}

class PartialImplementation implements TwoMethodsInterface {
    @Override
    public void methodOne() {
        System.out.println("Method one implemented.");
    }

	@Override
	public void methodTwo() {
		// TODO Auto-generated method stub
		
	}

    
}

public class Question2 {

	public static void main(String[] args) {
        PartialImplementation obj = new PartialImplementation();
        obj.methodOne();
    }
}
// Output:- Method one implemented.