package pu3;


import java.util.Scanner;

public class Uppg4 {

	public static void main(String[] args) {
		// Scannerobjekt
		Scanner input = new Scanner(System.in);

		
		//variabler
		
		double [] tal = new double[100];
		char svar;
		boolean run = true; 
		int count = 0;
		
		for(int i = 0; i >= 0; i++) {
			System.out.println("Skriv ett decimaltal:");			//säger åt dig att skrica ett decTal
			tal[i] = input.nextDouble();
			
			System.out.println("Vill du skriva ett till tal? j/n");
			svar = input.next().charAt(0);
			
			if(svar == 'n') {
				break;
			}
			count++;
			
		}
		
		//Skriver ut det första talet du skrev in
		
		System.out.println("Det första talet du skrev va: "+ tal[0]);

		//Skriver ut de talen som du skrev in
		
		for(int i = 0; count >= i; i++) {
			System.out.println("Talen du skrivit in är: " + tal[i]);
			
		}
		
		//Skriver ut den talen du skrev in i omvänd ordning
		
		for(int i = count; i >= 0; i--) {
			System.out.println("Talen du skrev in, i omvänd ordning: " + tal[i]);
		
		
		}
		
		//Skriver bara ut de positiva talen som du skrev in
		
		for(int i = 0; count >=i; i++) {
			 
			if(tal[i] >= 0 ) {
				System.out.println("De positiva talen som du skrev är: " + tal[i]);
			}
		}
		
		for(int i = 0; count >= i; i+=2) {
			System.out.println("Vartannat tal du skrev va: " + tal[i]);
			
		}
		
		
		
		
		
		
		
		
		
	}
}
	
		

		