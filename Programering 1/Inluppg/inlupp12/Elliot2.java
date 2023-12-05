package inlupp12;

import java.util.Scanner;

public class Elliot2 {

	public static void main(String[] args) {
		//Scannerobjekt

		Scanner input = new Scanner(System.in);

		//variabler
		char svar;
		boolean run = true;
		int dice1;
		int dice2;
		double satsa;

		do {
			System.out.println("Hur mycket vill du satsa?");	//Frågar hur mycket du vill satsa
			satsa = input.nextDouble();							//Du skriver in hur mycket du vill satsa
			dice1 = (int)(Math.random()*6+1);			//Slår tärning 1
			dice2 = (int)(Math.random()*6+1);			//Slår tärning 2

			//Frågar om du vill satsa på Cho eller Han
			System.out.println("Vill du satsa på Cho eller Han? Skriv in Cho eller Han");
			char val = input.next().charAt(0);		//Läser in vad du skrivit

			int ChoHan = (dice1 + dice2) % 2;		/*En ny variabel som tar tärningarna plus varandra och sedan ser om det är jämnt eller udda,
			 										om ChoHan blir 1 så är det ett udda tal så blir ChoHan 1 och om det är jämnt blir ChoHan 0*/
			//Om ChoHan är lika med 0 så körs denna
			if(ChoHan == 0) {
				//Om din gissaning är Cho
				if(val == 'c' || val == 'C') {
					System.out.println("Du vann " + satsa *2 + "kr");	//Om din gissning är Cho så vinner du 
				}
				else if(val == 'h' || val == 'H') {
					System.out.println("Du förlorade");		//Om din gissning är Han så förlorar du 
				}
			}
			//Om din gissning är Han så körs denna
			else if(ChoHan == 1) {
				if(val == 'c' || val == 'C') {
					System.out.println("Du förlorade");			//Om din gissning är Cho förlorar du
				}
				else if(val == 'h' || val == 'H') {
					System.out.println("Du vann " + satsa*2+"kr");//Om din gissning är Han så vinner du 
				}
			}

			System.out.println("Tärning 1: " + dice1);   	//Skriver ut tärning 1
			System.out.println("Tärning 2: " + dice2);		//Skriver ut tärning 2
			
			//Frågar om du vill spela igen
			System.out.println("Vill du spela igen? ja/nej");

			//Du skriver in antingen j eller n
			svar = input.next().charAt(0);
			//Om du skrivit in n, så avslutas programmet
			if(svar == 'n') {
				run=false;
			}
			//Om det inte skrivs in n så fortsätter programmet

		}while(run);


	}

}
