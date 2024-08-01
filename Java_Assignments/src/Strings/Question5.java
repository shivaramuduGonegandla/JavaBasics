package Strings;

// 5. Searching in Strings Using indexOf()

public class Question5 {

	public static void main(String[] args) {
		
		String str = "Hello, World!";
		int index = str.indexOf("World"); // 7
		int index2 = str.indexOf("o");    // 4
		int index3 = str.indexOf("o", 5); // 8
		System.out.println("Index of 'World': " + index);
		System.out.println("Index of 'o': " + index2);
		System.out.println("Index of 'o' after index 5: " + index3);

	}
}

/* Index of 'World': 7
Index of 'o': 4
Index of 'o' after index 5: 8
*/