package pu1;

import java.util.Scanner;

public class Uppg3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Din ålder: "); //säger åt dig att skriva din ålder här
		
		
		int ålder1 = input.nextInt(); //läser av vad du har anget för ålder
		
		
		System.out.println("Kompis ålder: "); //frågar efter en ny ålder, jag har valt att kalla den för "Kompis ålder"
	
		
		int ålder2 = input.nextInt(); //läser av vad du anget för ålder för din kompis
		
		
		System.out.println("Kompis nr 2 ålder: "); //frågar efter en ny ålder hos en ny kompis AKA "kompis 2"
		
		
		int ålder3 = input.nextInt(); // avläser kompis 2s ålder
		
		
		double medel = (ålder1 + ålder2 + ålder3) / 3; // räknar ut medelåldern
		
		
		System.out.println("Er medelålder är: " +medel); // Skriver ut vad medelåldern är

	}

}
