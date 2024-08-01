package thisAndsuper;

// 3. Call Constructor of the Current Class Using this()

class MyClasss {
    int num;
    String text;

    // Default constructor
    MyClasss() {
        this(10, "Default"); // Calls parameterized constructor
    }

    // Parameterized constructor
    MyClasss(int num, String text) {
        this.num = num;
        this.text = text;
    }

    void display() {
        System.out.println("Number: " + num);
        System.out.println("Text: " + text);
    }

    
}

public class Question3 {
	public static void main(String[] args) {
        MyClass obj = new MyClass(); // Calls the default constructor
        obj.display();
    }

}
/* Output:-
Using this:
Number: 10
Text: Hello */