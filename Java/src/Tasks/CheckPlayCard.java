package Tasks;

import java.util.Scanner;

public class CheckPlayCard {

	public static void main(String[] args) {
/*		Classical play cards use the following signs to designate the card face: 
		2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K and A. Write a program that 
		enters a string and prints "yes CONTENT_OF_STRING" if it is a valid 
		card sign or "no CONTENT_OF_STRING" otherwise.
*/
		Scanner in = new Scanner(System.in);
				
		String card = in.nextLine();
		
		switch (card) {
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
		case "10":
		case "J":
		case "Q":
		case "K":
		case "A":
			System.out.println("Yes " + card);
			break;
			
//		case "2":
//			System.out.println("Yes 2");
//			break;
//		case "3":
//			System.out.println("Yes 3");
//			break;
//		case "4":
//			System.out.println("Yes 4");
//			break;
//		case "5":
//			System.out.println("Yes 5");
//			break;
//		case "6":
//			System.out.println("Yes 6");
//			break;
//		case "7":
//			System.out.println("Yes 7");
//			break;
//		case "8":
//			System.out.println("Yes 8");
//			break;
//		case "9":
//			System.out.println("Yes 9");
//			break;
//		case "10":
//			System.out.println("Yes 10");
//			break;
//		case "J":
//			System.out.println("Yes J");
//			break;
//		case "Q":
//			System.out.println("Yes Q");
//			break;
//		case "K":
//			System.out.println("Yes K");
//			break;
//		case "A":
//			System.out.println("Yes A");
//			break;
		default:
			System.out.println("No " + card);
			break;
		}
		
//		if (card.equals("2")
//			|| card.equals("3")
//			|| card.equals("4")
//			|| card.equals("5")
//			|| card.equals("6")
//			|| card.equals("7")
//			|| card.equals("8")
//			|| card.equals("9")
//			|| card.equals("10")
//			|| card.equals("J")
//			|| card.equals("Q")
//			|| card.equals("K")
//			|| card.equals("A")) {
//			System.out.println("yes " + card);
//		} else {
//			System.out.println("no " + card);
//		}
		
		
		
//		if (card.length() > 2) {
//			System.out.println("No " + card);
//		} else if (card.length() == 2 && card != "10") { 
//			System.out.println("No " + card);			
//		} else if (card == "10"){
//			// Знаем, че дължината е един символ или е 10
//			
//		}
//		
		
	}

}
