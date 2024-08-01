package Operators;

// 2. Write a method for increment and decrement operators (++, --)

public class IncrementDecrement {
   
	void incrementDecrementOperations(int a) {
        
		System.out.println("Original value: " + a);
        System.out.println("After increment: " + (++a));
        System.out.println("After decrement: " + (--a));
    }

    public static void main(String[] args) {
        IncrementDecrement obj = new IncrementDecrement();
        obj.incrementDecrementOperations(10);
    }
}

/* Output:-

Original value: 10
After increment: 11
After decrement: 10

*/