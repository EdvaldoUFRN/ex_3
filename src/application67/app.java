package application67;

import java.util.Locale;
import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double input = sc.nextDouble();
		
		if (input >= 0 && input <= 25) {
			System.out.println("Interval [0,25]");
		}
		else if (input > 25 && input <=50) {
			System.out.println("Interval (25,50]");
		}
		else if (input > 50 && input <=75) {
			System.out.println("Interval (50,75]");
		}
		else if (input > 75 && input <=100) {
			System.out.println("Interval (75,100]");
		}
		else {
			System.out.println("Out of range");
		}
		
		sc.close();
	}

}
