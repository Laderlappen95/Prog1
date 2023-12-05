package extrauppgifter;

import java.util.Scanner;

public class BinäraTal {
	public static void main(String[] args) {
		//Ta heltal / 2 
		Scanner input = new Scanner(System.in);
		
		
		

		System.out.println("Skriv in ett heltal");
		int heltal = input.nextInt();

		int antal = (int)(Math.log(heltal)/ Math.log(2));
		int binärt[] = new int[antal+ 1];
				
		for(int i = antal ; 0 <= i; i--) {
			
			binärt[i] = (int)heltal % 2;
			heltal = heltal / 2;
			
			
			
			
		}
		for(int i = 0; antal >= i; i++) {
			System.out.print(binärt[i]);
		}
		
		
	}

}
