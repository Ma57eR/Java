package Tasks;

import java.util.Scanner;

// Make a new method to find Max number



public class BiggestOf3 {
	
	static int max(int x, int y) {
		 int max = x;
		if (x < y) {
			max = y;
		} return max;
		
		}
	
	public static void main(String[] args) {
		// Write a program that finds the biggest 
//		of three numbers that are read from the console.
		
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		
		int max = max(max(x, y), z);
		System.out.println("Max number is " + max);
	}

}
