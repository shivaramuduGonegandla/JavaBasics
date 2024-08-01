package Strings;

// 6. Matching a String Against a Regular Expression With matches()

public class Question6 {
	
	public static void main(String[] args) {
		String str = "hello123";
		boolean isMatch = str.matches("hello\\d+"); // true
		System.out.println("Matches regex: " + isMatch);

		
	}

}
// Matches regex: true