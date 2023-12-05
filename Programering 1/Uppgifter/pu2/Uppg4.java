package pu2;

import java.util.Scanner;

public class Uppg4 {

	public static void main(String[] args) {
		// Scanner objekt
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv 3 heltal: ");
	
		int tal1 = input.nextInt();
		
		int tal2 = input.nextInt();
		
		int tal3 = input.nextInt();
		
		if(tal1>tal2 && tal3>tal2) {
			System.out.println("Det andra talet är minst");
		}
		if(tal2>tal1 && tal3>tal1){
			System.out.println("Det första talet är minst");
		}
		if(tal2>tal3 && tal1>tal3) {
			System.out.println("Det tredje talet är minst");
		}
	
		
		
	}

}
