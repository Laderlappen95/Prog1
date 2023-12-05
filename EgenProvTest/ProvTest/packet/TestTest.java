package packet;

import java.util.Scanner;

public class TestTest {

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
			System.out.println("Hur mycket vill du satsa?");
			satsa = input.nextDouble();
			dice1 = (int)(Math.random()*6+1);
			dice2 = (int)(Math.random()*6+1);
			System.out.println("Tärning 1: " + dice1);
			System.out.println("Tärning 2: " + dice2);
			
			if(dice1 == 1 && dice2 == 6 || dice2 == 1 && dice1 ==6) {
				System.out.println("Dubbelvinst, " + satsa*3 + "kr");
			}
			else if(dice1 + dice2 == 7) {
				System.out.println("Vinst, " + satsa *2 + "kr");
			}
			else if (dice1 == dice2) {
				System.out.println("Par, " + satsa + "kr");
			}
			else {
				System.out.println("Förlust, 0 kr");
			}
			
			
			
			
			System.out.println("Vill du spela igen? j/n");
			svar = input.next().charAt(0);
			
			
		}while(run);

	}

}
