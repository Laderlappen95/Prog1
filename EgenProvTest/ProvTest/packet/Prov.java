package packet;

import java.util.Scanner;

public class Prov {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		
		int [] s = {5,2,7,9,8, 1,2,3, 9 , 8 ,7};
		int[] code = new int[10];
		for( int i = 1; i< s.length-1; i++) {
			if((s[i-1] - s[i+1]) == s[i] || (s[i+1] - s[i-1]) == s[i]) {
				code[i-1] = s[i];
			}
		}
		
		
		
		for( int i = 0; i< code.length; i++) {
			if(code[i] != 0  ) {
				System.out.println(code[i]);
			}
			
		}
		
		
		
		boolean run = true;
		do {
			System.out.println("Hur mycket vill du satsa?");
			int gold = input.nextInt();
			
			int dice1 = (int)(Math.random()*6 +1);
			int dice2 = (int)(Math.random()*6 +1);
			
			System.out.println("Tärning 1: " + dice1);
			System.out.println("Tärning 2: " + dice2);
			
			if(dice1 + dice2 == 7) {
				System.out.println("DUUUU VANNNN!!! " + dice1);
			}
			System.out.println("Vill du spela igen? j / n");
			char svar = input.next().charAt(0);
			if(svar == 'n') {
				run = false;
			}
			
		}while(run);

	}

}
