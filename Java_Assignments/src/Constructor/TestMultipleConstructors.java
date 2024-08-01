package Constructor;

// 5. Try to Call the Constructor Multiple Times with the Same Object

class MyClasses {
    MyClasses() {
        System.out.println("Constructor Called");
    }
}

public class TestMultipleConstructors {
    public static void main(String[] args) {
        MyClasses obj1 = new MyClasses();  // Calls the constructor once

        // Attempting to call constructor again for the same object will not work
        // obj1.MyClass(); // Compile-time error: Constructor cannot be called like a method
    }
}
