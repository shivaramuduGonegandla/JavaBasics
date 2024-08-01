package Strings;

//1. Different Ways of Creating a String

public class Question1 {

	public static void main(String[] args) {
		
	
	// Using string literal
	String str1 = "Hello, World!";
	System.out.println(str1);

	// Using new keyword
	String str2 = new String("Hello, World!");
	System.out.println(str2);

	// Using StringBuilder
	StringBuilder sb = new StringBuilder("Hello, World!");
	String str3 = sb.toString();
	System.out.println(str3);

}
}

/*  Output:-
Hello, World!
Hello, World!
Hello, World!

*/