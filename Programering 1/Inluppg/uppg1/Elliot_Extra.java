package uppg1;

import java.util.Scanner;

public class Elliot_Extra {

	public static void main(String[] args) {
		//Scannerobjekt
		Scanner input = new Scanner(System.in);

		//variabler
		String svar;
		boolean run = true;
		int dice1;
		int dice2;
		double satsa;
		double konto = 0;
		boolean kor = true;
		boolean val = true;

		while(kor) {


			System.out.println("Hur mycket vill du spela med?");
			konto = input.nextDouble();
			if(konto<=0) {
				System.out.println("Lägg in mer!");
			}
			else {
				kor=false;
			}
		}


		do {
			System.out.println("Hur mycket vill du satsa?");
			satsa = input.nextDouble();
			if(satsa>konto || satsa < 0) {
				System.out.println("Ogiltlig summa!");
			}
			else {
				dice1 = (int)(Math.random()*6+1);
				dice2 = (int)(Math.random()*6+1);
				System.out.println("Tärning 1: " + dice1);
				System.out.println("Tärning 2: " + dice2);

				if(dice1 == 1 && dice2 == 6 || dice2 == 1 && dice1 ==6) {
					System.out.println("Dubbelvinst, " + satsa*3 + "kr");
					konto = (konto-satsa) + satsa*3;
					System.out.println("Konto: " + konto + "kr");
				}
				else if(dice1 + dice2 == 7) {
					System.out.println("Vinst, " + satsa *2 + "kr");
					konto = (konto-satsa) + satsa*2;
					System.out.println("Konto: " + konto +"kr");
				}
				else if (dice1 == dice2) {
					System.out.println("Par, " + satsa + "kr");
					System.out.println("Konto: " + konto + "kr");

				}
				else {
					System.out.println("Förlust");
					konto = konto - satsa;
					System.out.println("Konto: " + konto + "kr");


					if(konto==0) {
						System.out.println("No More Money!");
						break;
					}

				}

				val = true;
				while(val){
					System.out.println("Vill du köra igen? j/n");
					svar = input.nextLine();
					if(svar == "j" || svar== "J") {
						val= false;
					}
					else if(svar == "n" || svar == "N") {
						val = false;
						run=false;
					}


				}
			}


		}while(run);
		System.out.println("Du gick ut med: " + konto+"kr");

	}

}


