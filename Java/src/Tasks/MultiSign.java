package Tasks;


public class MultiSign {

	public static void main(String[] args) {
		// Write a program that shows the sign (+, - or 0) 
//		of the product of three real numbers, without calculating it.
//		Use If operators

		//Scanner in = new Scanner(System.in);
		double x = 1;
		double y = -0.001;
		double z = 0.1;
		

		
		if (x == 0 || y == 0 || z == 0) {
			System.out.println("0");
		} else if (x < 0 || y < 0 || z < 0) {
			System.out.println("-");
		} else {
			System.out.println("+");
		}
		
	}

}
