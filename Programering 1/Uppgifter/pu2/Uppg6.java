package pu2;

import java.util.Scanner;

public class Uppg6 {

	public static void main(String[] args) {
		// Scannerobjekt
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv två tecken:");
		char tecken1 = input.next().charAt(0);
		char tecken2 = input.next().charAt(0);
		
		if (tecken1 == 'a' && tecken2 != 'a' || tecken2 == 'a' && tecken1 != 'a') {
			System.out.println("Vinst");
		}
		else {
			System.out.println("Förlust");
		}

	}

}
