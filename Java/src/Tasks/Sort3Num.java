package Tasks;

//import java.util.Scanner;

public class Sort3Num {

	public static void main(String[] args) {
//		Write a program that enters 3 real numbers and prints them sorted in descending order.
//
//		- Use nested if statements.
//		- Don’t use arrays and the built-in sorting functionality.

//		Scanner in = new Scanner(System.in);
		
		int x = 2;
		int y = 1;
		int z = 3;
		
		if (x < y && x < z) {
			if (y < z) {
				System.out.println(x + " " +  y + " " +  z);
			} else {
				System.out.println(x + " " +  z + " " +  y);
			} if (y < x && y < z) {
				if (x < z) {
					System.out.println(y + " " +  x + " " +  z);
				} else {
					System.out.println(y + " " +  z + " " +  x);
				}
			}
			} else if (z < x && z < y) {
				if (y < x) {
					System.out.println(z + " " + y +  " " + x);
				} else {
					System.out.println(z + " " +  x + " " +  y);
				}
			}
			}
	}
