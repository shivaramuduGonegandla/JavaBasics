package Inheritance;

//Superclass
class A {
 // Specific methods
 public void methodA1() {
     System.out.println("Method A1 from class A");
 }

 public void methodA2() {
     System.out.println("Method A2 from class A");
 }

 // Overridden method
 public void methodOverride() {
     System.out.println("Overridden Method from class A");
 }

 // Data member
 protected String field = "Field in A";
}

class B extends A {
    // Specific methods
    public void methodB1() {
        System.out.println("Method B1 from class B");
    }

    public void methodB2() {
        System.out.println("Method B2 from class B");
    }

    // Overridden method
    @Override
    public void methodOverride() {
        System.out.println("Overridden Method from class B");
    }

    // Data member
    protected String field = "Field in B";
}

class C extends B {
    // Specific methods
    public void methodC1() {
        System.out.println("Method C1 from class C");
    }

    public void methodC2() {
        System.out.println("Method C2 from class C");
    }

    // Overridden method
    @Override
    public void methodOverride() {
        System.out.println("Overridden Method from class C");
    }

    // Data member
    protected String field = "Field in C";
}

public class MainClass {
    public static void main(String[] args) {
        // Creating instances of each class
        A a = new A();
        B b = new B();
        C c = new C();

        // Calling methods specific to each class
        System.out.println("Calling methods of class A:");
        a.methodA1();
        a.methodA2();
        a.methodOverride(); // Calls method from A

        System.out.println("\nCalling methods of class B:");
        b.methodA1(); // Inherited from A
        b.methodA2(); // Inherited from A
        b.methodB1();
        b.methodB2();
        b.methodOverride(); // Calls overridden method in B

        System.out.println("\nCalling methods of class C:");
        c.methodA1(); // Inherited from A
        c.methodA2(); // Inherited from A
        c.methodB1(); // Inherited from B
        c.methodB2(); // Inherited from B
        c.methodC1();
        c.methodC2();
        c.methodOverride(); // Calls overridden method in C

        // Runtime Polymorphism with superclass reference
        System.out.println("\nRuntime Polymorphism:");
        A aRef;
        aRef = b;
        aRef.methodOverride(); // Calls overridden method in B

        aRef = c;
        aRef.methodOverride(); // Calls overridden method in C

        // Accessing data members (fields) to demonstrate the impact of runtime polymorphism
        System.out.println("\nAccessing fields:");
        System.out.println("Field in A: " + a.field); // Prints "Field in A"
        System.out.println("Field in B: " + b.field); // Prints "Field in B"
        System.out.println("Field in C: " + c.field); // Prints "Field in C"

        // Accessing field through superclass reference
        aRef = b;
        System.out.println("Field accessed via A reference (B object): " + aRef.field); // Prints "Field in B"

        aRef = c;
        System.out.println("Field accessed via A reference (C object): " + aRef.field); // Prints "Field in C"
    }
}


/* Output:-
Calling methods of class A:
Method A1 from class A
Method A2 from class A
Overridden Method from class A

Calling methods of class B:
Method A1 from class A
Method A2 from class A
Method B1 from class B
Method B2 from class B
Overridden Method from class B

Calling methods of class C:
Method A1 from class A
Method A2 from class A
Method B1 from class B
Method B2 from class B
Method C1 from class C
Method C2 from class C
Overridden Method from class C

Runtime Polymorphism:
Overridden Method from class B
Overridden Method from class C

Accessing fields:
Field in A: Field in A
Field in B: Field in B
Field in C: Field in C
Field accessed via A reference (B object): Field in A
Field accessed via A reference (C object): Field in A

*/