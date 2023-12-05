package aktivitetsdiagram;

import java.util.Scanner;

public class Aktivitetsdiagram {

	public static void main(String[] args) {
		// Scannerobjekt
		
		Scanner input = new Scanner(System.in);
		
		
		
		 int slumptal = (int)(Math.random()*10);
		
		boolean run = true;
		 
		
		
		while (run) {
			System.out.println("Gissa på en siffra:");
			 int siffra = input.nextInt();
			
			
			if (slumptal > siffra) {
		
			System.out.println("Gissa högre:");
			}
		
			else if( slumptal < siffra) {
			System.out.println("Gissa lägre");
			
			}
			else {
				System.out.println("Grattis");
				run=false;
			}
		}
		

	}

}
