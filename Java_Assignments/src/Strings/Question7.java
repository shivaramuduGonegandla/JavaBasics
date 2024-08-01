package Strings;

// 7. Comparing Strings Using the Methods equals(), equalsIgnoreCase(), startsWith(), endsWith(), and compareTo()

public class Question7 {

    public static void main(String[] args) {
        
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "Hello";

        // equals
        boolean isEqual = str1.equals(str3); // true
        boolean isNotEqual = str1.equals(str2); // false

        // equalsIgnoreCase
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2); // true

        // startsWith
        boolean startsWith = str1.startsWith("He"); // true

        // endsWith
        boolean endsWith = str1.endsWith("lo"); // true

        // compareTo
        int comparison = str1.compareTo(str2); // negative value since 'H' < 'h'
        
        // Print results
        System.out.println("Equals: " + isEqual);
        System.out.println("Equals Ignore Case: " + isEqualIgnoreCase);
        System.out.println("Starts With: " + startsWith);
        System.out.println("Ends With: " + endsWith);
        System.out.println("Compare To: " + comparison);
    }
}

/* Output
Equals: true
Equals Ignore Case: true
Starts With: true
Ends With: true
Compare To: -32

*/