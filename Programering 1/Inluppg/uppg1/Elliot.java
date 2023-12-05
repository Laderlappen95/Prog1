package uppg1;

import java.util.Scanner;

public class Elliot {

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
			dice2 = (int)(Math.random()*6+1);		//Slår tärning 2
			System.out.println("Tärning 1: " + dice1);   	//Skriver ut tärning 1
			System.out.println("Tärning 2: " + dice2);		//Skriver ut tärning 2
			
			
			//Om tärningarna visar 1 och 6
			if(dice1 == 1 && dice2 == 6 || dice2 == 1 && dice1 ==6) {
				//Så skrivs Dubbelvinst ut och det du satsar blir gångrat med 3
				System.out.println("Dubbelvinst, " + satsa*3 + "kr");		
			}
			//Om summan av tärningarna blir 7
			else if(dice1 + dice2 == 7) {
				//Så skrivs Vinst och det du satsar blir gångrat med 2
				System.out.println("Vinst, " + satsa *2 + "kr");
			}
			//Om tärningarna visar samma sak
			else if (dice1 == dice2) {
				//Så skrivs Par och det du satsar ändras inte
				System.out.println("Par, " + satsa + "kr");
			}
			//Om inget av det som står ovan händer
			else {
				//Så skrivs Förlust och du förlorar alla pengar
				System.out.println("Förlust, 0 kr");
			}
			
			
			
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
