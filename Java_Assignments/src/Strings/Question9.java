package Strings;

// 9. Replacing Characters in Strings with replace()

public class Question9 {

	public static void main(String[] args) {
		
		String str = "Hello, World!";
		String replacedStr = str.replace('o', 'O'); // "HellO, WOrld!"
		String replacedStr2 = str.replace("World", "Java"); // "Hello, Java!"
		System.out.println("Replaced Characters: " + replacedStr);
		System.out.println("Replaced Substring: " + replacedStr2);

		
	}
}

/* Output:-
 
Replaced Characters: HellO, WOrld!
Replaced Substring: Hello, Java!

*/