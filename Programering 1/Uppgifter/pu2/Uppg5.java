package pu2;

import java.util.Scanner;

public class Uppg5 {

	public static void main(String[] args) {
		// Scannerobjekt
		Scanner input = new Scanner(System.in);

		
		System.out.println("Skriv din ålder:");
		int age = input.nextInt();
		
		if(age < 30){
			System.out.println("Ung");
		}
		else if (age>=30 && age<40) {
			System.out.println("Medelålder");
		}
		else if  (age>=40 && age<65) {
			System.out.println("Över medelåldern");
		}
		else {
			System.out.println("Gammal");
		}
		
		
	}

}
