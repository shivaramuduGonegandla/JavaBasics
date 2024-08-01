package Strings;

// 10. Splitting Strings with split()

public class Question10 {

	public static void main(String[] args) {
		
		String str = "apple,banana,orange";
		String[] fruits = str.split(","); // ["apple", "banana", "orange"]
		for (String fruit : fruits) {
		    System.out.println(fruit);
		}

	}
}

/* Output:-

apple
banana
orange

*/