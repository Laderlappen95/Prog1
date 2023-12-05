package packet;

import java.util.Scanner;

public class TioTusen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner neger = new Scanner(System.in);
		
		int dice1;
		int dice2;
		int dice3;
		int dice4;
		int dice5;
		boolean run = true;
		char behåll;
		
		do {
			dice1 = (int)(Math.random()*6+1);
			dice2 = (int)(Math.random()*6+1);
			dice3 = (int)(Math.random()*6+1);
			dice4 = (int)(Math.random()*6+1);
			dice5 = (int)(Math.random()*6+1);
			
			System.out.println("Tärning 1: " + dice1);
			System.out.println("Tärning 2: " + dice2);
			System.out.println("Tärning 3: " + dice3);
			System.out.println("Tärning 4: " + dice4);
			System.out.println("Tärning 5: " + dice5);
			
			if(dice1 == 5 || dice2 == 5 || dice3 == 5 || dice4 == 5 || dice5 == 5) {
				
			}
			
			
			
		}while(run);
		
		
		

	}

}
