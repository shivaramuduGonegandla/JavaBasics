package Interfaces;

// 8. Create a PUBLIC Interface with Fields and Methods java

public interface PublicInterface {
    int CONSTANT = 100; // public static final by default
    void interfaceMethod();
}

class PublicInterfaceClass implements PublicInterface {
    @Override
    public void interfaceMethod() {
        System.out.println("Interface method implemented.");
    }

    public static void main(String[] args) {
        PublicInterfaceClass obj = new PublicInterfaceClass();
        obj.interfaceMethod();
        System.out.println("Constant value: " + CONSTANT);
    }
}

// Output:- Interface method implemented.

