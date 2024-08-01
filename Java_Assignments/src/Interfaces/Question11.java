package Interfaces;

// 11. Create an Interface with a Static Final Variable

interface StaticFinalInterface {
    static final int STATIC_FINAL_VARIABLE = 10;
    
    void display();
}

class StaticFinalClass implements StaticFinalInterface {
    @Override
    public void display() {
        System.out.println("Static final variable value: " + STATIC_FINAL_VARIABLE);
    }

    
}

public class Question11 {

	public static void main(String[] args) {
        StaticFinalClass obj = new StaticFinalClass();
        obj.display();
    }
}
// Output:- Static final variable value: 10
