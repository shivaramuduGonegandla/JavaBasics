package Operators;

// 3. Program to use equal (==) operator and not equal (!=) operators?

public class EqualityOperators {
   
	void checkEquality(int a, int b) {
        System.out.println("Equal: " + (a == b));
        System.out.println("Not Equal: " + (a != b));
    }

    public static void main(String[] args) {
        EqualityOperators obj = new EqualityOperators();
        obj.checkEquality(10, 20);
        obj.checkEquality(15, 15);
    }
}

/*    Output:-
     Not Equal: true
     Equal: true
     Not Equal: false
*/