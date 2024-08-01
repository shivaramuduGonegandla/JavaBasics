package thisAndsuper;

// 1. Print Fields/Instance Members of the Current Class Using this and Without Using Object

class MyClass {
    int num = 10;
    String text = "Hello";

    void display() {
        // Using 'this' to access instance members
        System.out.println("Using this:");
        System.out.println("Number: " + this.num);
        System.out.println("Text: " + this.text);
    }

    void displayWithoutThis() {
        // Accessing instance members without 'this'
        System.out.println("Without using this:");
        System.out.println("Number: " + num);
        System.out.println("Text: " + text);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
        obj.displayWithoutThis();
    }
}
