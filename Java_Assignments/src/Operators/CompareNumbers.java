package Operators;

public class CompareNumbers {
    void compare(int a, int b) {
        if (a < b) {
            System.out.println("Smaller number: " + a);
            System.out.println("Larger number: " + b);
        } else if (a > b) {
            System.out.println("Smaller number: " + b);
            System.out.println("Larger number: " + a);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }

    public static void main(String[] args) {
        CompareNumbers obj = new CompareNumbers();
        obj.compare(10, 20);
        obj.compare(30, 20);
        obj.compare(15, 15);
    }
}

/* Output:-
Smaller number: 10
Larger number: 20
Smaller number: 20
Larger number: 30
Both numbers are equal.
*/
