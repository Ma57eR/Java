package Tasks;

//import java.util.Scanner;

public class Sort3Num {
	static int max(int x, int y) {
		 int max = x;
		if (x < y) {
			max = y;
		} return max;
		
		}
	
	static int min(int x, int y) {
		 int min = y;
		if (y > x) {
			min = x;
		} return min;
		
		}
	

	public static void main(String[] args) {
//		Write a program that enters 3 real numbers and prints them sorted in descending order.
//
//		- Use nested if statements.
//		- Don’t use arrays and the built-in sorting functionality.

//		Scanner in = new Scanner(System.in);
		
		// ТРЕТО РЕШЕНИЕ
		int x = 2;
		int y = 3;
		int z = 1;
		
		int max = max(max(x, y), z);
		int min = min(min(x, y), z);
		int mid = x+y+z - min - max;
		
		System.out.println(min);
		System.out.println(mid);
		System.out.println(max);
		
		
		
		
		
		// ВТОРО РЕШЕНИЕ
//		int x = 3;
//		int y = 2;
//		int z = 1;
//		
//		if (x < y && y <  z) {
//			System.out.println(x + " " + y + " " + z);
//		} else if (x < y && x < z && z < y) {
//			System.out.println(x + " " + z + " " + y);
//		} else if (y < x && x < z) {
//			System.out.println(y + " " + x + " " + z);
//		} else if (y < x && y < z && z < x) {
//			System.out.println(y + " " + z + " " + x);
//		} else if (z < x && y < x) {
//			System.out.println(z + " " + y + " " + x);
//		} else if (z < x && z < y && x < y) {
//			System.out.println(z + " " + x + " " + y);
//		}
		

		// ТРЕТО РЕШЕНИЕ
//		if (x < y) {
//			if (x < z) {
//				if (y < z) {
//					System.out.println(x + " " + y + " " + z);
//				} else {
//					System.out.println(x + " " + z + " " + y);
//				}
//			} else {
//				System.out.println(z + " " + x + " " + y);
//			}
//		} else {
//			// y < x
//			if (y < z) {
//				if (x < z) {
//					System.out.println(y + " " + x + " " + z);
//				} else {
//					System.out.println(y + " " + z + " " + x);
//				}
//			} else {
//				System.out.println(z + " " + y + " " + x);
//			}
//		}
		
		}
	}
