package inmatning;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
		//skapar ett scannerObjekt
		
		Scanner input = new Scanner(System.in); //Klassnamn egetNamn = new Klassnamn( indata);
		
		
		
		System.out.println("skriv ett tal:");
		
		
		
		int tal = input.nextInt(); //inmatning för heltal
		
		
		
		System.out.println("Du skrev: " + tal);
		
	
		
		System.out.println("skriv ett decimaltal: ");
		
		
		
		double decTal = input.nextDouble();
		
	
		
		System.out.println("Du skrev: " + decTal);
		
		
		
		System.out.println("Skriv ett tecken:");
		
		
		
		char tecken = input.next().charAt(0); // char har ingen nextChar utan får en omständigare...
		
		System.out.println(tecken);
		
		System.out.println("Du skrev: " + tecken);
	}

}
