package pu3;


import java.util.Scanner;

public class Uppg5 {

	public static void main(String[] args) {
		// Scannerobjekt
		Scanner input = new Scanner(System.in);

		
		//variabler
		
		double [] tal = new double[100];
		char svar;
		boolean run = true; 
		int count = 0;
		double min[] = new double[100];
		double max[] = new double[100];
		
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
		
		// Uppg5
		//a)
		
		min[0] = tal[0];
		for(int i = 0; count >= i; i++) {
			
			if(min[0] > tal[i]) {
				min[0] = tal[i]; 
			}
			
			
		}
		System.out.println("Det minsta talet är: " + min[0]);
		
		//b)
		max[0] = tal[0];
		for(int i = 0; count >= i; i++) {
			
			if(max[0] < tal[i]) {
				max[0] = tal[i]; 
			}
			
			
		}
		System.out.println("Det största talet är: " + max[0]);
		
		
		
		
		
		
	}
}
	
		

		