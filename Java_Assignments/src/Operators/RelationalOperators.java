package Operators;

// 6. Program for relational operators (<, <=, >, >=)

public class RelationalOperators {
   
	void relationalOperations(int a, int b) {
        System.out.println(a + " < " + b + ": " + (a < b));
        System.out.println(a + " <= " + b + ": " + (a <= b));
        System.out.println(a + " > " + b + ": " + (a > b));
        System.out.println(a + " >= " + b + ": " + (a >= b));
    }

    public static void main(String[] args) {
        RelationalOperators obj = new RelationalOperators();
        obj.relationalOperations(10, 20);
        obj.relationalOperations(30, 20);
    }
}

/* Output:-
 
10 < 20: true
10 <= 20: true
10 > 20: false
10 >= 20: false
30 < 20: false
30 <= 20: false
30 > 20: true
30 >= 20: true


*/