package Loops;

// 11. Program to check whether a number is EVEN or ODD using switch?

public class EvenOddSwitch {
   
	public static void main(String[] args) {
        int number = 10;
        switch (number % 2) {
            case 0:
                System.out.println(number + " is even.");
                break;
            case 1:
                System.out.println(number + " is odd.");
                break;
        }
    }
}

// 10 is even.
