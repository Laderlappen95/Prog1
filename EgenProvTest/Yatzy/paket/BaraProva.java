package paket;

import java.util.Scanner;

public class BaraProva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int count;
		
		
		//System.out.println("Hur många spelare?");
	//	int spelare = input.nextInt();

		/*for(int i = 1; i >= 2; i++) {

			System.out.println("Det blir +1");
			char blå = input.next().charAt(0);
			

			if(spelare == 1) {
				System.out.println("Vill du spela igen?");
			}

			else if(spelare == 2) {
				if(i == 1) {
					System.out.println("Spelare 2, din tur");
					i = -1;
				}
				else if(i == 0) {
					System.out.println("Spelare 1, din tur");
				}
			}
		}*/
	char hur[][] = new char[10][10];
		 hur[0][0] = input.next().charAt(0);
		System.out.println(hur[0][0]);
		
	}

}
