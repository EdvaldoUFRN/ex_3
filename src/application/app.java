package application;

import java.util.Locale;
import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double total = nota1 + nota2;
		double nota = 60.00;
		if (total < nota) {
			System.out.printf("NOTA FINAL = %.1f%n", total);
			System.out.println("REPROVADO");
		}
		else {
			System.out.printf("NOTA FINAL = %.1f%n", total);
		}
		
		
		sc.close();

	}

}
