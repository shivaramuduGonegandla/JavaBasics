package thisAndsuper;

// 2. Print Fields/Instance Members of the Parent Class Using super

class ParentClass {
    int parentField = 100;
}

class ChildClass extends ParentClass {
    int childField = 200;

    void display() {
        // Accessing parent class field using 'super'
        System.out.println("Parent field using super: " + super.parentField);
        System.out.println("Child field: " + childField);
    }

    public class Question2 {

    
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.display();
    }
}
}

