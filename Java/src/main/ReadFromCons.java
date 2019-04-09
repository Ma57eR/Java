package main;

import java.util.Scanner;

public class ReadFromCons {
	static double min(double x, double y) {
		if (x < y) {
			return x;
		} else {
			return y;
		}
	}
	
	static double max(double x, double y) {
		double max = x;
		if (x < y) {
			max = y;
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int x = 5;
//		int y = 6;
//		boolean isXBig = x>y;
//		System.out.println(isXBig);
		
//		String text = "Hi I'm Bat Georgi";
//		System.out.println(text);
//		
//		String x = "5"; //Това не е равно на числото 5, а на стринга 5
//		int xs = 5;
//		
//		System.out.println(x + 5); // Събира двете едно ДО друго - concatenate
//		System.out.println(xs + 5); // Събира числата, защото xs e int
//		
//		char ch = (char) 48;
//		System.out.println(ch);
		
//		for (int i = 0; i < 256; i++) {
//			System.out.println(i + " " + (char) i);
//		}
		
//		String name = "Doncho";
//		name += " Minkov";
//		System.out.println(name);
		
//		Scanner in = new Scanner(System.in);
//		int x = in.nextInt(); // Когато имаме nextInt може двете стойности, които търсим да са на един ред, но това важи само за Java
//		int y = in.nextInt();
//		System.out.println(x > y);
		
		// Условни оператори
		
		Scanner in = new Scanner(System.in);
		double x = in.nextDouble();
		double y = in.nextDouble();
		double z = in.nextDouble();
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		double min = min(
				min(min(x, y), z),
				min(min(a, b), c)
				);
		double max = max(max(x, y), z);
		
		
//		if (x < y) {
//			if (x < z) {
//				min = x;
//			} else {
//			min = z;
//		 }
//			if (z<y) {
//				max = y;
//			} else {
//				max = z;
//			}
//		} else {
//			if (y < z) {
//				min = y;
//			} else {
//			min = z;
//		 }
//		}
		

		
		
//(		if (x < y) {
//			min = x;
//			max = y;
//		} 
//		
//		if (z < min) {
//			min = z;
//		}
//		
//		if (max < z) {
//			max = z;
//		}
//		
//		System.out.println(min);
//		System.out.println(max);
		
//		if (y > x) {
//			max = y;
//		}
//		
//		if (y < x) {
//			min = y;
//		}
		
//		if (y > x) {
//		max = y;
//	} else {
//		min = y;
//	})
		
		System.out.println("The bigger number is " + max);
		System.out.println("The smaller number is " + min);
	}

}
