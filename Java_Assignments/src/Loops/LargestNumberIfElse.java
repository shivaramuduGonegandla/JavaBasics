package Loops;

// 13. Program for multiple if-else statements (Largest number among 10, 20, and 30)


public class LargestNumberIfElse {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 30;

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Largest number is: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Largest number is: " + num2);
        } else {
            System.out.println("Largest number is: " + num3);
        }
    }
}
// Output: Largest number is: 30