package pu2;

import java.util.Scanner;

public class Uppg1 {

	public static void main(String[] args) {
		// Scanner objekt
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("Skriv in din ålder: ");
		int alder = input.nextInt();
		
		if(alder >17) {
			System.out.println("Myndig");
		}
		else {
			System.out.println("Inte myndig");
		}
	}

}
