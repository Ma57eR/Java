package main;

import java.util.Scanner;

public class LoopsLess3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//FOR EACH -  Ползва се само за обхождане на колекции
		
		String name = "John";
		int index = 0;
		for (char ch : name.toCharArray()) {
			System.out.println(index + ": " + ch);
			index++;
		}
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}
		
		// Побитови оператори
		// <<, >>
		// 7 -> 00000111
		// 7 << 3 - > 00111000 = 56
		// 7 >> 2 00000001 = 1
		
		// x << n == x * 2^n
		// x >> n == x / (2^n)
		
		int n = 10;
		System.out.println(1 << 10);
		// 4^10 = 2^20
		System.out.println(1 << 2*n);
		
		
		
		//FOR CYCLE - Изпълнява се определен брой пъти
		
		// n^m = n*n*n*n......
//		int n = 3;
//		int m = 3;
//		
//		int power = 1;
//		for (int i = 0; i < m; i++) {
//			power *=n;
//		}
//		System.out.println(power);
		
//		final int numbersPerRow = 12; // Ако използваме final, стойността на променливата става константна и не може да ѝ се присвоява друга стойност
//		int n = 10;
//		int m = 1000;
//		int count = 0;
//		for (int number = n; number <= m; number++) {	
//
////		int number = 19;
//		int maxDivider = (int) Math.sqrt(number);
//		boolean isPrime = true;
//		for (int divider = 2; divider <= maxDivider; divider++) {
//			if (number % divider == 0) {
//				isPrime = false;
//				break;
//			}
//
//			}
//		if (isPrime) {
//			count +=1;
//			System.out.print(number + ", ");
//		} 
//		if (count == numbersPerRow) {
//			System.out.println();
//			count = 0;
//		}
//		}
		
		
		
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter Email");
//		String email = in.nextLine();
//		while (true) {
//			if (email.contains("@")) {
//				System.out.println("CHISTITU NA PICHILIVSHITI");
//				break;
//			}
//			System.out.println("Mail be brat mi");
//			email = in.nextLine();
//		}
//		
		
//		int n = 10;
//		for (int number = 0; number < n; number++) {
//			System.out.println(number);
//		}
//		
//		int index = 0;
//		while (index < n) {
//			System.out.println(index);
//			index++;
		}
		
		
		//WHILE CYCLE - Изпълнява се, докато не се изпълни условието
//		int index = 1;
//		int n = 1;
//		
//		while (index < n) {
//			System.out.println(index);
//			index++;
//		}
//		
//		
//		int index = 1;
//		int n = 10;
//		while (true) {
//			index++;
//			if (index == n) {
//				break;
//			}
//			if (index % 2 == 0 ) {
//				continue;
//			}
//			System.out.println(index);
//		}
//		
//		int index = 0;
//		while (index <= 10) {
//			System.out.println(index);
//			index++;
//		}
		
		
		//n - prime, when n | n && n | 1
		// 1, 2, 3, 5, 7, 11 ....
//		int m = 10;
//		int n = 29;
//		int number = n;
//		while (number <=n) {
//			System.out.println(number);
//			number++;
//		}
//		int divider = 2;
//		int maxDivider = (int) Math.sqrt(n);
//		boolean isPrime = true;
//		
//		while (isPrime && divider <= maxDivider) {
//			if (n % divider == 0) {
//				isPrime = false;
//			}
//			divider++;
//			
//		}
//		System.out.println("Is prime " + isPrime);
		
		// 28 
		
		//Calculate the sum of all numbers between 1 and N
		// N*(1 + N) / 2
//		int m = 10;
//		int n = 15;
//		int number = m;
//		if (number % 2 == 1) {
//			number++;			
//		}
//		int sum = 0;
//		
//		while (number <= n) {
//			sum += number;
//			number+= 2;
//		}
//		System.out.println(sum);
//		
	}
