package pu2;

import java.util.Scanner;

public class Uppg3 {

	public static void main(String[] args) {
		// Scanner objekt
		Scanner input = new Scanner(System.in);
	
		System.out.println("Skriv två tal: ");
		
		int tal1 = input.nextInt();
		int tal2 = input.nextInt();
		
		if (tal1 > tal2) {
			System.out.println("Det första är störst");
		}
		else if(tal1 == tal2) {
			System.out.println("De är lika stora");
		}
		else {
			System.out.println("Det sista talet är störst");
		}
	}

}
