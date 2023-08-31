package application6;

import java.util.Locale;
import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double hotDog = 4.00;
		double xSalad = 4.50;
		double xBacon = 5.00;
		double plainToast = 2.00;
		double softDrink = 1.50;
		double total = 0;
		
		int order = sc.nextInt();
		int quantity = sc.nextInt();
		
		switch (order) {
		case 1:
			total = hotDog * quantity;
			break;
		case 2:
			total = xSalad * quantity;
			break;
		case 3:
			total = xBacon * quantity;
			break;
		case 4:
			total = plainToast * quantity;
			break;
		case 5:
			total = softDrink * quantity;
			break;

		default:
			break;
		}
		
		System.out.printf("Total: $%.2f%n", total);
		
		sc.close();
	}

}
