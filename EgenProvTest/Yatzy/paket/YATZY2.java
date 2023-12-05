package paket;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class YATZY2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		char igen;
		char igen2;
		int dice1 = 0;
		int dice2 = 0;
		int dice3 = 0;
		int dice4 = 0;
		int dice5 = 0;
		//int []val = new int[100];
		char val1[] = new char[20];
		char val2;
		char val3;
		char val4;
		char val5;
		int count = 0;




		for(int i = 0; 1 > i; i++) {
			count++;
			dice1 = (int)(Math.random()*6+1);
			dice2 = (int)(Math.random()*6+1);
			dice3 = (int)(Math.random()*6+1);
			dice4 = (int)(Math.random()*6+1);
			dice5 = (int)(Math.random()*6+1);
			System.out.println("Tärning 1 visar: " + dice1);
			System.out.println("Tärning 2 visar: " + dice2);
			System.out.println("Tärning 3 visar: " + dice3);
			System.out.println("Tärning 4 visar: " + dice4);
			System.out.println("Tärning 5 visar: " + dice5);


			System.out.println("Vill du slå om nån tärning? j/n");			//vill du behålla tärningar?
			igen = input.next().charAt(0);							//svar
			if(igen == 'n') {					//om du inte vill det så skrvier du nej och då avslutars programmet
				break;
			}
			
			
			
			System.out.println("Vilken tärning vill du slå om?");			//om du vill slå om tärnignar, så skriver du in vilka, börja med en
			val1[0] = input.next().charAt(0);								//du skriver vilken du vill skriva in
			System.out.println("Vill du slå om fler? j/n");						//frågar om du vill skriva in fler

			igen2 = input.next().charAt(0);								//du skriver in om du vill behålla eller inte
			if(igen2 == 'n') {									
				if(val1[0] == '1') {								//om du inte vill så srkvier den ut det talet som du ville slå om 
					dice1 = (int)(Math.random()*6+1);
					System.out.println("Tärning 1: " + dice1);
					break;
				}
				else if(val1[0] == '2'){
					dice2 = (int)(Math.random()*6+1);
					System.out.println("Tärning 2: " + dice2 );
					break;

				}
				else if(val1[0] == '3') {
					dice3 = (int)(Math.random()*6+1);
					System.out.println("Tärning 3: " + dice3);
					break;
				}
			}
			else {


				if(val1[0] == '1') {
					dice1 = (int)(Math.random()*6+1);
					System.out.println("Tärning 1 : " +dice1);
				}
				if(val1[0] == '2') {
					dice2 = (int)(Math.random()*6+1);


				}
				System.out.println("Vill du slå om fler? j/n");
				igen = input.next().charAt(0);

			}






		}
		count++;
		//for(int i = 0; i<count;i++) {
		//System.out.println( val1[i]);
		//}

		System.out.println(dice1 + " " + dice2 + " " + dice3 + " " + dice4 + " " + dice5);

	}

}
