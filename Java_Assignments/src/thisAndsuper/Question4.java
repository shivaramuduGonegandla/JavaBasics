package thisAndsuper;

// 4. Call Argument Constructor of the Current Class Using this()

class MyClass4 {
    int num;
    String text;

    // Parameterized constructor
    MyClass4(int num, String text) {
        this.num = num;
        this.text = text;
    }

    // No-argument constructor
    MyClass4() {
        this(20, "Hello World"); // Calls parameterized constructor
    }

    void display() {
        System.out.println("Number: " + num);
        System.out.println("Text: " + text);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass(); // Calls the no-argument constructor
        obj.display();
    }
}


public class Question4 {

}
