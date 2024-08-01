package Loops;

//4. Write a program to print odd and even numbers

public class OddEvenNumbers {
    public static void main(String[] args) {
        System.out.println("Even Numbers:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Odd Numbers:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

/* Output:- 
 Even Numbers:
2
4
6
8
10
12
14
16
18
20

Odd Numbers:
1
3
5
7
9
11
13
15
17
19
*/
