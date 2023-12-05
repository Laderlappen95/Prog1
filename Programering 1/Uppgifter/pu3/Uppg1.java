package pu3;

import java.util.Scanner;

public class Uppg1 {

	public static void main(String[] args) {
		// Scannerobjekt
		Scanner input = new Scanner(System.in);

		int tal = 0;
		int count;
		int tal2 = 0;
		
		while(tal <= 5) {
			
			System.out.print(" "+tal);
			tal=tal+1;
		}
		System.out.println();
		boolean run = true;
		
		do {
			System.out.print(" " +tal2);
			
			tal2 = tal2 + 1;
			
			if(tal2 == 6) {
				run = false;
			}
		}while(run);
		
		System.out.println();
		
		for(int tal3 = 0; tal3 <= 5; tal3++) {
			System.out.print(" "+tal3);
		}
		
		
	}

}
