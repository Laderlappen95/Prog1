package repetition;

import java.util.Scanner;

public class Whilesatser {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Villkorsstyrda repetitioner
		
		//Hur många 5% höjningar motsv en dubblering?
		
		//variabler
		double faktor= 1;
		int count = 0;
		
		while(faktor <= 2) {
			faktor = faktor * 1.05; 	//faktor *=1.05
			count++; //count +=1 eller count = count +1 
			
		}
		System.out.println("Det krävs " + count + " antal 5% höjningar för dubblering");
		
		//en del av programmet som körs tills vi avslutar:
		
		boolean run = true; //variabel som styr repitioner
		
		char val;
		
		do {		//do-while testar villkoret efter körning
			
			System.out.println("Vill du avsluta? j/n");
			val = input.next().charAt(0);
			if(val == 'j') {
				run = false;
			}
			
		}while(run);

	}

}
