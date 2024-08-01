package JavaBasics;

/* 
      6. Write a function to print your name and call the function from main method?
 */
public class PrintNameFunction {
   
	// Function to print name
    void printName() {
        System.out.println("Shivaramudu"); 
    }

    public static void main(String[] args) {
        PrintNameFunction obj = new PrintNameFunction();
        // Calling the function
        obj.printName();
    }
}
// Output:- Shivaramudu