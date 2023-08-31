package application5;

import java.util.Locale;
import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int startTime = sc.nextInt();
		int finalTime = sc.nextInt();
		
		int duration;
		if (startTime < finalTime) {
			duration = finalTime - startTime;
		} 
		else {
			duration = 24 - startTime + finalTime;
		}
		System.out.println("O JOGO DUROU " + duration + " HORA(S)");
		
		sc.close();
		
	}

}
