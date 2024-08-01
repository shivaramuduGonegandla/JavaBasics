package Strings;

// 4. Extract a String Using Substring
public class Question4 {

	public static void main(String[] args) {
		
		String str = "Hello, World!";
		String subStr = str.substring(7); // "World!"
		String subStr2 = str.substring(0, 5); // "Hello"
		System.out.println("Substring 1: " + subStr);
		System.out.println("Substring 2: " + subStr2);

	}
}

/* Output:- Substring 1: World!
Substring 2: Hello
*/