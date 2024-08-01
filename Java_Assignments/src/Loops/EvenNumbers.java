package Loops;

//6. Write a program to print even numbers between 10 and 100 using while loop

public class EvenNumbers {
  
	public static void main(String[] args) {
        int i = 10;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

/*   Output:- 
10
12
14
16
18
20
22
24
26
28
30
32
34
36
38
40
42
44
46
48
50
52
54
56
58
60
62
64
66
68
70
72
74
76
78
80
82
84
86
88
90
92
94
96
98
100
*/