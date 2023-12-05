package pu2;

import java.util.Scanner;

public class Uppg2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in din ålder: ");
		
		int alder = input.nextInt();
		
		if(alder <= 50 && alder >= 35) {
			System.out.println("Medelålders");
		}
		else {
			System.out.println("Du är inte medelålders");
		}
		
	}

}
