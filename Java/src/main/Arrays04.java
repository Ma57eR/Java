package main;

import java.util.Scanner;

public class Arrays04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1)Enter n
		 * 2) enter n names
		 * 3) enter command
		 * 3.1) if command is number i: print it name; goto 3)
		 * 3.2) if commans is "end": stop the program
		 */
		
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		String[] names =  new String[n];
		for (int i = 0; i < names.length; i++) {
			System.out.println();
			names[i] = in.nextLine();
		}
		while (true) {
			String command = in.next();
			if (command.equals("end")) {
				break;
			}
			int index = Integer.parseInt(command);
			if (index < 1 || index > n) {
				System.out.println("Invalid name number");
				continue;
			}
			System.out.println(names[index-1]);
		}
		
		
	}

}
