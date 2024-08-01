package Strings;

// 13. Converting to Uppercase and Lowercase


public class Question13 {
	
	public static void main(String[] args) {
		
		String str = "Hello, World!";
		String upperCaseStr = str.toUpperCase(); // "HELLO, WORLD!"
		String lowerCaseStr = str.toLowerCase(); // "hello, world!"
		System.out.println("Uppercase: " + upperCaseStr);
		System.out.println("Lowercase: " + lowerCaseStr);

		
	}

}

/* Output:-

Uppercase: HELLO, WORLD!
Lowercase: hello, world!

*/