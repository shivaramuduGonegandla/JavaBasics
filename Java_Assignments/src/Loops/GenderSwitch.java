package Loops;

//12. Print gender (Male/Female) program according to given M/F using switch

public class GenderSwitch {
   
	public static void main(String[] args) {
        char gender = 'M';
        switch (gender) {
            case 'M':
                System.out.println("Gender: Male");
                break;
            case 'F':
                System.out.println("Gender: Female");
                break;
            default:
                System.out.println("Unknown gender");
                break;
        }
    }
}
 // Output:- Gender: Male
