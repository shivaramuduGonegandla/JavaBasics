package thisAndsuper;

// 5. Call Constructor of the Parent Class Using super()

class ParenteClass {
    ParenteClass() {
        System.out.println("Parent class constructor called");
    }
}

class ChildsClasss extends ParentClass {
    ChildsClasss() {
        super(); // Calls the parent class constructor
        System.out.println("Child class constructor called");
    }

    }


public class Question5 {

	public static void main(String[] args) {
        ChildClass obj = new ChildClass(); // Calls both parent and child class constructors
    }

}
