package JavaBasics;

/*  5. Define the local and global variables with the same name and 
 *     print both variables and understand the scope of the variables?   
 */

public class VariableScopeExample {
	
	// Global variable
    int var = 10;

    void printVar() {
        // Local variable
        int var = 20;
        System.out.println("Local variable: " + var);
        System.out.println("Global variable: " + this.var);
    }

    public static void main(String[] args) {
        VariableScopeExample obj = new VariableScopeExample();
        obj.printVar();
    }

    
}

/*  Output:-
   
   Local variable: 20
   Global variable: 10
  */
