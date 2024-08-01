package Operators;

// 5. Programs on Logical AND (&&), OR (||) operator and Logical NOT (!)?

public class LogicalOperators {
    
	void logicalOperations(boolean x, boolean y) {
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT (x): " + (!x));
        System.out.println("Logical NOT (y): " + (!y));
    }

    public static void main(String[] args) {
        LogicalOperators obj = new LogicalOperators();
        obj.logicalOperations(true, false);
    }
}
/* Output:-

Logical OR: true
Logical NOT (x): false
Logical NOT (y): true   */