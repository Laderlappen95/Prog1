package paket;

import java.util.Scanner;

public class YatzyTvåPunktNoll {
	
	/*System.out.println("Spelare\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t| Nummer");
	System.out.println("Ettor: \t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  "  + "\t| 1");
	System.out.println("Tvåor: \t|" + "  " + "\t|" + "  "  + "\t|" +"  " + "\t|" + "  " + "\t|" + "  " + "\t| 2");
	System.out.println("Treor: \t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  "  + "\t| 3");
	System.out.println("Fyror: \t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t| 4");
	System.out.println("Femmor:\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t| 5");
	System.out.println("Sexor: \t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t| 6");
	System.out.println("Summa: \t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t| 7");
	System.out.println("Bonus: \t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t| 8");
	System.out.println("Par: \t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t| 9");
	System.out.println("2-par: \t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t| 10");
	System.out.println("3-tal: \t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t| 11");
	System.out.println("4-tal: \t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t| 12");
	System.out.println("Kåk: \t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t| 13");
	System.out.println("Ls: \t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t| 14");
	System.out.println("Ss: \t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t| 15");
	System.out.println("Chans: \t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t| 16");
	System.out.println("YATZY: \t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t| 17");
	System.out.println("Summa: \t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|" + "  " + "\t|");*/

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Variabler

		int dice[] = new int[10];
		boolean run = true;
		int val[] = new int[10];
		String namn[] = new String[5];
		int var[][] = new int[20][20]; 
		char vad = 0;
		double[][] var2 = new double[20][20];
		char [][] var3 = new char[20][20];
		char spela;
		System.out.println("Liten stege = 15 poäng \t\t\t Ettor = Rad 1"
				+ "\nStor Stege = 20 poäng \t\t\t Tvåor = Rad 2"
				+ "\nYatzy = 50 poäng \t\t\t Treor = Rad 3"
				+ "\nBonus 50 poäng - 63 poäng krävs \t Fyror = Rad 4" 
				+ "\nSkippa: Skriv 0,1 \t\t\t Femmor = Rad 5"
				+ "\n \t\t\t\t\t Sexor = Rad 6"
				+ "\n \t\t\t\t\t Summa = Rad 7"
				+ "\n \t\t\t\t\t Bonus = Rad 8"
				+ "\n \t\t\t\t\t Par = Rad 9"
				+ "\n \t\t\t\t\t Tvåpar = Rad 10"
				+ "\n \t\t\t\t\t Tretal = Rad 11"
				+ "\n \t\t\t\t\t Fyrtal = Rad 12"
				+ "\n \t\t\t\t\t Kåk = Rad 13"
				+ "\n \t\t\t\t\t Liten stege = Rad 14"
				+ "\n \t\t\t\t\t Stor stege = Rad 15"
				+ "\n \t\t\t\t\t Chans = Rad 16"
				+ "\n \t\t\t\t\t Yatzy = Rad 17"
				+ "\n \t\t\t\t\t Total summa = Rad 18");


		


		System.out.println("Hur många spelare? Max 5");
		int spelare = input.nextInt();

		if(spelare == 1) {
			System.out.println("Vad heter du? Använd inte mer än 6 tecken");
			System.out.print("Spelare 1: "); namn[0] = input.next();
			namn[1] = " ";
			namn[2] = " ";
			namn[3] = " ";
			namn[4] = " ";
		}
		else if(spelare == 2) {
			System.out.println("Vad heter ni? Använd inte mer än 6 tecken");
			System.out.print("Spelare 1: "); namn[0] = input.next();
			System.out.print("Spelare 2: "); namn[1] = input.next();
			namn[2] = " ";
			namn[3] = " ";
			namn[4] = " ";
		}
		else if(spelare == 3) {
			System.out.println("Vad heter ni? Använd inte mer än 6 tecken");
			System.out.print("Spelare 1: "); namn[0] = input.next();
			System.out.print("Spelare 2: "); namn[1] = input.next();
			System.out.print("Spelare 3: "); namn[2] = input.next();
			namn[3] = " ";
			namn[4] = " ";
		}
		else if(spelare == 4) {
			System.out.println("Vad heter ni? Använd inte mer än 6 tecken");
			System.out.print("Spelare 1"); namn[0] = input.next();
			System.out.print("Spelare 2: ");namn[1] = input.next();
			System.out.print("Spelare 3: ");namn[2] = input.next();
			System.out.print("Spelare 4: ");namn[3] = input.next();
			namn[4] = " ";
		}
		else if(spelare == 5) {
			System.out.println("Vad heter ni? Använd inte mer än 6 tecken");
			System.out.print("Spelare 1: "); namn[0] = input.next();
			System.out.print("Spelare 2: "); namn[1] = input.next();
			System.out.print("Spelare 3: "); namn[2] = input.next();
			System.out.print("Spelare 4: "); namn[3] = input.next();
			System.out.print("Spelare 5: "); namn[4] = input.next();
		}
		System.out.println("Spelare 1, din tur");
		for(int i = 0; i>= 0;i++ ) { 

			for(int s = 1; s>=0; s++ ) {

				dice[0] = (int)(Math.random()*6+1);
				dice[1] = (int)(Math.random()*6+1);
				dice[2] = (int)(Math.random()*6+1);
				dice[3] = (int)(Math.random()*6+1);
				dice[4] = (int)(Math.random()*6+1);

				System.out.println("Tärning 1: " + dice[0]);
				System.out.println("Tärning 2: " + dice[1]);
				System.out.println("Tärning 3: " + dice[2]);
				System.out.println("Tärning 4: " + dice[3]);
				System.out.println("Tärning 5: " + dice[4]);

				System.out.println("Vill du slå om nån tärning? j/n");
				char slaom = input.next().charAt(0);
				if(slaom == 'j') {
					System.out.println("Hur många vill du slå om?");
					int slaom2 = input.nextInt();
					if(slaom2 == 1) {
						System.out.println("Vilken vill du slå om?");
						val[0] = input.nextInt();
						if(val[0] == 1) {
							dice[0] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}
						else if(val[0] == 2) {
							dice[1] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}
						else if(val[0] == 3) {
							dice[2] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}
						else if(val[0] == 4) {
							dice[3] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}
						else if(val[0] == 5) {
							dice[4] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}
					}

					//OM DU VÄLJER ATT SLÅ OM 2

					else if(slaom2 == 2) {
						System.out.println("Vilka vill du slå om? Ange tärningsnummerna i ordning minst till störst");
						val[0] = input.nextInt();
						val[1] = input.nextInt();
						if(val[0] == 1 && val[1] == 2) {
							dice[0] = (int)(Math.random()*6+1);
							dice[1] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}
						else if(val[0] == 1 && val[1] == 3) {
							dice[0] = (int)(Math.random()*6+1);
							dice[2] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}
						else if(val[0] == 1 && val[1] == 4) {
							dice[0] = (int)(Math.random()*6+1);
							dice[3] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}
						else if(val[0] == 1 && val[1] == 5) {
							dice[0] = (int)(Math.random()*6+1);
							dice[4] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}
						else if(val[0] == 2 && val[1] == 3) {
							dice[1] = (int)(Math.random()*6+1);
							dice[2] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}
						else if(val[0] == 2 && val[1] == 4) {
							dice[1] = (int)(Math.random()*6+1);
							dice[3] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}
						else if(val[0] == 2 && val[1] == 5) {
							dice[1] = (int)(Math.random()*6+1);
							dice[4] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}
						else if(val[0] == 3 && val[1] == 4) {
							dice[2] = (int)(Math.random()*6+1);
							dice[3] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}
						else if(val[0] == 3 && val[1] == 5) {
							dice[2] = (int)(Math.random()*6+1);
							dice[4] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}
						else if(val[0] == 4 && val[1] == 5) {
							dice[3] = (int)(Math.random()*6+1);
							dice[4] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}

					}		//Till om du väljer att slå om 2

					//OM DU VÄLJER ATT SLÅ OM 3

					else if(slaom2 == 3) {
						System.out.println("Vilka vill du slå om? Skriv de i ordning minst till störst");
						val[0] = input.nextInt();
						val[1] = input.nextInt();
						val[2] = input.nextInt();
						if(val[0] == 1 && val[1] == 2 && val[2] == 3) {
							dice[0] = (int)(Math.random()*6+1);
							dice[1] = (int)(Math.random()*6+1);
							dice[2] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}
						else if(val[0] == 1 && val[1] == 2 && val[2] == 4) {
							dice[0] = (int)(Math.random()*6+1);
							dice[1] = (int)(Math.random()*6+1);
							dice[3] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}
						else if(val[0] == 1 && val[1] == 2 && val[2] == 5) {
							dice[0] = (int)(Math.random()*6+1);
							dice[1] = (int)(Math.random()*6+1);
							dice[4] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}
						else if(val[0] == 1 && val[1] == 3 && val[2] == 4) {
							dice[0] = (int)(Math.random()*6+1);
							dice[2] = (int)(Math.random()*6+1);
							dice[3] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}
						else if(val[0] == 1 && val[1] == 3 && val[2] == 5) {
							dice[0] = (int)(Math.random()*6+1);
							dice[2] = (int)(Math.random()*6+1);
							dice[4] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}
						else if(val[0] == 1 && val[1] == 4 && val[2] == 5) {
							dice[0] = (int)(Math.random()*6+1);
							dice[3] = (int)(Math.random()*6+1);
							dice[4] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}
						else if(val[0] == 2 && val[1] == 3 && val[2] == 4) {
							dice[1] = (int)(Math.random()*6+1);
							dice[2] = (int)(Math.random()*6+1);
							dice[3] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}
						else if(val[0] == 2 && val[1] == 3 && val[2] == 5) {
							dice[1] = (int)(Math.random()*6+1);
							dice[2] = (int)(Math.random()*6+1);
							dice[4] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}
						else if(val[0] == 2 && val[1] == 4 && val[2] == 5) {
							dice[1] = (int)(Math.random()*6+1);
							dice[3] = (int)(Math.random()*6+1);
							dice[4] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}
						else if(val[0] == 3 && val[1] == 4 && val[2] == 5) {
							dice[2] = (int)(Math.random()*6+1);
							dice[3] = (int)(Math.random()*6+1);
							dice[4] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}
					}//Till om du vill slå om 3


					//OM DU VÄLJER ATT SLÅ OM 4

					else if(slaom2 == 4) {
						System.out.println("Vilka vill du slå om? Skriv de i ordning minst till störst");
						val[0] = input.nextInt();
						val[1] = input.nextInt();
						val[2] = input.nextInt();
						val[3] = input.nextInt();
						if(val[0] == 1 && val[1] == 2 && val[2] == 3 && val[3] == 4) {
							dice[0] = (int)(Math.random()*6+1);
							dice[1] = (int)(Math.random()*6+1);
							dice[2] = (int)(Math.random()*6+1);
							dice[3] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}
						else if(val[0] == 1 && val[1] == 2 && val[2] == 3 && val[3] == 5) {
							dice[0] = (int)(Math.random()*6+1);
							dice[1] = (int)(Math.random()*6+1);
							dice[2] = (int)(Math.random()*6+1);
							dice[4] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}
						else if(val[0] == 1 && val[1] == 2 && val[2] == 4 && val[3] == 5) {
							dice[0] = (int)(Math.random()*6+1);
							dice[1] = (int)(Math.random()*6+1);
							dice[3] = (int)(Math.random()*6+1);
							dice[4] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}
						else if(val[0] == 1 && val[1] == 3 && val[2] == 4 && val[3] == 5) {
							dice[0] = (int)(Math.random()*6+1);
							dice[2] = (int)(Math.random()*6+1);
							dice[3] = (int)(Math.random()*6+1);
							dice[4] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}
						else if(val[0] == 2 && val[1] == 3 && val[2] == 4 && val[3] == 5) {
							dice[0] = (int)(Math.random()*6+1);
							dice[2] = (int)(Math.random()*6+1);
							dice[3] = (int)(Math.random()*6+1);
							dice[4] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}
					} //Till om du vill slå om 4

					else if(slaom2 == 5) {
						dice[0] = (int)(Math.random()*6+1);
						dice[1] = (int)(Math.random()*6+1);
						dice[2] = (int)(Math.random()*6+1);
						dice[3] = (int)(Math.random()*6+1);
						dice[4] = (int)(Math.random()*6+1);
						System.out.println("Tärning 1: " + dice[0]);
						System.out.println("Tärning 2: " + dice[1]);
						System.out.println("Tärning 3: " + dice[2]);
						System.out.println("Tärning 4: " + dice[3]);
						System.out.println("Tärning 5: " + dice[4]);
					}

					System.out.println("Vill du slå igen?");
					char slaom3 = input.next().charAt(0);
					if(slaom3 == 'j') {

						System.out.println("Hur många vill du slå om?");
						int slaom4 = input.nextInt();
						if(slaom4 == 1) {
							System.out.println("Vilken vill du slå om?");
							val[0] = input.nextInt();
							if(val[0] == 1) {
								dice[0] = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice[0]);
								System.out.println("Tärning 2: " + dice[1]);
								System.out.println("Tärning 3: " + dice[2]);
								System.out.println("Tärning 4: " + dice[3]);
								System.out.println("Tärning 5: " + dice[4]);
							}
							else if(val[0] == 2) {
								dice[1] = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice[0]);
								System.out.println("Tärning 2: " + dice[1]);
								System.out.println("Tärning 3: " + dice[2]);
								System.out.println("Tärning 4: " + dice[3]);
								System.out.println("Tärning 5: " + dice[4]);
							}
							else if(val[0] == 3) {
								dice[2] = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice[0]);
								System.out.println("Tärning 2: " + dice[1]);
								System.out.println("Tärning 3: " + dice[2]);
								System.out.println("Tärning 4: " + dice[3]);
								System.out.println("Tärning 5: " + dice[4]);
							}
							else if(val[0] == 4) {
								dice[3] = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice[0]);
								System.out.println("Tärning 2: " + dice[1]);
								System.out.println("Tärning 3: " + dice[2]);
								System.out.println("Tärning 4: " + dice[3]);
								System.out.println("Tärning 5: " + dice[4]);
							}
							else if(val[0] == 5) {
								dice[4] = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice[0]);
								System.out.println("Tärning 2: " + dice[1]);
								System.out.println("Tärning 3: " + dice[2]);
								System.out.println("Tärning 4: " + dice[3]);
								System.out.println("Tärning 5: " + dice[4]);
							}
						}

						//OM DU VÄLJER ATT SLÅ OM 2

						else if(slaom4 == 2) {
							System.out.println("Vilka vill du slå om? Ange tärningsnummerna i ordning minst till störst");
							val[0] = input.nextInt();
							val[1] = input.nextInt();
							if(val[0] == 1 && val[1] == 2) {
								dice[0] = (int)(Math.random()*6+1);
								dice[1] = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice[0]);
								System.out.println("Tärning 2: " + dice[1]);
								System.out.println("Tärning 3: " + dice[2]);
								System.out.println("Tärning 4: " + dice[3]);
								System.out.println("Tärning 5: " + dice[4]);
							}
							else if(val[0] == 1 && val[1] == 3) {
								dice[0] = (int)(Math.random()*6+1);
								dice[2] = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice[0]);
								System.out.println("Tärning 2: " + dice[1]);
								System.out.println("Tärning 3: " + dice[2]);
								System.out.println("Tärning 4: " + dice[3]);
								System.out.println("Tärning 5: " + dice[4]);
							}
							else if(val[0] == 1 && val[1] == 4) {
								dice[0] = (int)(Math.random()*6+1);
								dice[3] = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice[0]);
								System.out.println("Tärning 2: " + dice[1]);
								System.out.println("Tärning 3: " + dice[2]);
								System.out.println("Tärning 4: " + dice[3]);
								System.out.println("Tärning 5: " + dice[4]);
							}
							else if(val[0] == 1 && val[1] == 5) {
								dice[0] = (int)(Math.random()*6+1);
								dice[4] = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice[0]);
								System.out.println("Tärning 2: " + dice[1]);
								System.out.println("Tärning 3: " + dice[2]);
								System.out.println("Tärning 4: " + dice[3]);
								System.out.println("Tärning 5: " + dice[4]);
							}
							else if(val[0] == 2 && val[1] == 3) {
								dice[1] = (int)(Math.random()*6+1);
								dice[2] = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice[0]);
								System.out.println("Tärning 2: " + dice[1]);
								System.out.println("Tärning 3: " + dice[2]);
								System.out.println("Tärning 4: " + dice[3]);
								System.out.println("Tärning 5: " + dice[4]);
							}
							else if(val[0] == 2 && val[1] == 4) {
								dice[1] = (int)(Math.random()*6+1);
								dice[3] = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice[0]);
								System.out.println("Tärning 2: " + dice[1]);
								System.out.println("Tärning 3: " + dice[2]);
								System.out.println("Tärning 4: " + dice[3]);
								System.out.println("Tärning 5: " + dice[4]);
							}
							else if(val[0] == 2 && val[1] == 5) {
								dice[1] = (int)(Math.random()*6+1);
								dice[4] = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice[0]);
								System.out.println("Tärning 2: " + dice[1]);
								System.out.println("Tärning 3: " + dice[2]);
								System.out.println("Tärning 4: " + dice[3]);
								System.out.println("Tärning 5: " + dice[4]);
							}
							else if(val[0] == 3 && val[1] == 4) {
								dice[2] = (int)(Math.random()*6+1);
								dice[3] = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice[0]);
								System.out.println("Tärning 2: " + dice[1]);
								System.out.println("Tärning 3: " + dice[2]);
								System.out.println("Tärning 4: " + dice[3]);
								System.out.println("Tärning 5: " + dice[4]);
							}
							else if(val[0] == 3 && val[1] == 5) {
								dice[2] = (int)(Math.random()*6+1);
								dice[4] = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice[0]);
								System.out.println("Tärning 2: " + dice[1]);
								System.out.println("Tärning 3: " + dice[2]);
								System.out.println("Tärning 4: " + dice[3]);
								System.out.println("Tärning 5: " + dice[4]);
							}
							else if(val[0] == 4 && val[1] == 5) {
								dice[3] = (int)(Math.random()*6+1);
								dice[4] = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice[0]);
								System.out.println("Tärning 2: " + dice[1]);
								System.out.println("Tärning 3: " + dice[2]);
								System.out.println("Tärning 4: " + dice[3]);
								System.out.println("Tärning 5: " + dice[4]);
							}

						}		//Till om du väljer att slå om 2

						//OM DU VÄLJER ATT SLÅ OM 3

						else if(slaom4 == 3) {
							System.out.println("Vilka vill du slå om? Ange tärningsnummerna i ordning minst till störst");
							val[0] = input.nextInt();
							val[1] = input.nextInt();
							val[2] = input.nextInt();
							if(val[0] == 1 && val[1] == 2 && val[2] == 3) {
								dice[0] = (int)(Math.random()*6+1);
								dice[1] = (int)(Math.random()*6+1);
								dice[2] = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice[0]);
								System.out.println("Tärning 2: " + dice[1]);
								System.out.println("Tärning 3: " + dice[2]);
								System.out.println("Tärning 4: " + dice[3]);
								System.out.println("Tärning 5: " + dice[4]);
							}
							else if(val[0] == 1 && val[1] == 2 && val[2] == 4) {
								dice[0] = (int)(Math.random()*6+1);
								dice[1] = (int)(Math.random()*6+1);
								dice[3] = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice[0]);
								System.out.println("Tärning 2: " + dice[1]);
								System.out.println("Tärning 3: " + dice[2]);
								System.out.println("Tärning 4: " + dice[3]);
								System.out.println("Tärning 5: " + dice[4]);
							}
							else if(val[0] == 1 && val[1] == 2 && val[2] == 5) {
								dice[0] = (int)(Math.random()*6+1);
								dice[1] = (int)(Math.random()*6+1);
								dice[4] = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice[0]);
								System.out.println("Tärning 2: " + dice[1]);
								System.out.println("Tärning 3: " + dice[2]);
								System.out.println("Tärning 4: " + dice[3]);
								System.out.println("Tärning 5: " + dice[4]);
							}
							else if(val[0] == 1 && val[1] == 3 && val[2] == 4) {
								dice[0] = (int)(Math.random()*6+1);
								dice[2] = (int)(Math.random()*6+1);
								dice[3] = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice[0]);
								System.out.println("Tärning 2: " + dice[1]);
								System.out.println("Tärning 3: " + dice[2]);
								System.out.println("Tärning 4: " + dice[3]);
								System.out.println("Tärning 5: " + dice[4]);
							}
							else if(val[0] == 1 && val[1] == 3 && val[2] == 5) {
								dice[0] = (int)(Math.random()*6+1);
								dice[2] = (int)(Math.random()*6+1);
								dice[4] = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice[0]);
								System.out.println("Tärning 2: " + dice[1]);
								System.out.println("Tärning 3: " + dice[2]);
								System.out.println("Tärning 4: " + dice[3]);
								System.out.println("Tärning 5: " + dice[4]);
							}
							else if(val[0] == 1 && val[1] == 4 && val[2] == 5) {
								dice[0] = (int)(Math.random()*6+1);
								dice[3] = (int)(Math.random()*6+1);
								dice[4] = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice[0]);
								System.out.println("Tärning 2: " + dice[1]);
								System.out.println("Tärning 3: " + dice[2]);
								System.out.println("Tärning 4: " + dice[3]);
								System.out.println("Tärning 5: " + dice[4]);
							}
							else if(val[0] == 2 && val[1] == 3 && val[2] == 4) {
								dice[1] = (int)(Math.random()*6+1);
								dice[2] = (int)(Math.random()*6+1);
								dice[3] = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice[0]);
								System.out.println("Tärning 2: " + dice[1]);
								System.out.println("Tärning 3: " + dice[2]);
								System.out.println("Tärning 4: " + dice[3]);
								System.out.println("Tärning 5: " + dice[4]);
							}
							else if(val[0] == 2 && val[1] == 3 && val[2] == 5) {
								dice[1] = (int)(Math.random()*6+1);
								dice[2] = (int)(Math.random()*6+1);
								dice[4] = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice[0]);
								System.out.println("Tärning 2: " + dice[1]);
								System.out.println("Tärning 3: " + dice[2]);
								System.out.println("Tärning 4: " + dice[3]);
								System.out.println("Tärning 5: " + dice[4]);
							}
							else if(val[0] == 3 && val[1] == 4 && val[2] == 5) {
								dice[2] = (int)(Math.random()*6+1);
								dice[3] = (int)(Math.random()*6+1);
								dice[4] = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice[0]);
								System.out.println("Tärning 2: " + dice[1]);
								System.out.println("Tärning 3: " + dice[2]);
								System.out.println("Tärning 4: " + dice[3]);
								System.out.println("Tärning 5: " + dice[4]);
							}
						}//Till om du vill slå om 3


						//OM DU VÄLJER ATT SLÅ OM 4

						else if(slaom4 == 4) {
							System.out.println("Vilka vill du slå om? Ange tärningsnummerna i ordning minst till störst");
							val[0] = input.nextInt();
							val[1] = input.nextInt();
							val[2] = input.nextInt();
							val[3] = input.nextInt();
							if(val[0] == 1 && val[1] == 2 && val[2] == 3 && val[3] == 4) {
								dice[0] = (int)(Math.random()*6+1);
								dice[1] = (int)(Math.random()*6+1);
								dice[2] = (int)(Math.random()*6+1);
								dice[3] = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice[0]);
								System.out.println("Tärning 2: " + dice[1]);
								System.out.println("Tärning 3: " + dice[2]);
								System.out.println("Tärning 4: " + dice[3]);
								System.out.println("Tärning 5: " + dice[4]);
							}
							else if(val[0] == 1 && val[1] == 2 && val[2] == 3 && val[3] == 5) {
								dice[0] = (int)(Math.random()*6+1);
								dice[1] = (int)(Math.random()*6+1);
								dice[2] = (int)(Math.random()*6+1);
								dice[4] = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice[0]);
								System.out.println("Tärning 2: " + dice[1]);
								System.out.println("Tärning 3: " + dice[2]);
								System.out.println("Tärning 4: " + dice[3]);
								System.out.println("Tärning 5: " + dice[4]);
							}
							else if(val[0] == 1 && val[1] == 2 && val[2] == 4 && val[3] == 5) {
								dice[0] = (int)(Math.random()*6+1);
								dice[1] = (int)(Math.random()*6+1);
								dice[3] = (int)(Math.random()*6+1);
								dice[4] = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice[0]);
								System.out.println("Tärning 2: " + dice[1]);
								System.out.println("Tärning 3: " + dice[2]);
								System.out.println("Tärning 4: " + dice[3]);
								System.out.println("Tärning 5: " + dice[4]);
							}
							else if(val[0] == 1 && val[1] == 3 && val[2] == 4 && val[3] == 5) {
								dice[0] = (int)(Math.random()*6+1);
								dice[2] = (int)(Math.random()*6+1);
								dice[3] = (int)(Math.random()*6+1);
								dice[4] = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice[0]);
								System.out.println("Tärning 2: " + dice[1]);
								System.out.println("Tärning 3: " + dice[2]);
								System.out.println("Tärning 4: " + dice[3]);
								System.out.println("Tärning 5: " + dice[4]);
							}
							else if(val[0] == 2 && val[1] == 3 && val[2] == 4 && val[3] == 5) {
								dice[0] = (int)(Math.random()*6+1);
								dice[2] = (int)(Math.random()*6+1);
								dice[3] = (int)(Math.random()*6+1);
								dice[4] = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice[0]);
								System.out.println("Tärning 2: " + dice[1]);
								System.out.println("Tärning 3: " + dice[2]);
								System.out.println("Tärning 4: " + dice[3]);
								System.out.println("Tärning 5: " + dice[4]);
							}
						} //Till om du vill slå om 4

						else if(slaom4 == 5) {
							dice[0] = (int)(Math.random()*6+1);
							dice[1] = (int)(Math.random()*6+1);
							dice[2] = (int)(Math.random()*6+1);
							dice[3] = (int)(Math.random()*6+1);
							dice[4] = (int)(Math.random()*6+1);
							System.out.println("Tärning 1: " + dice[0]);
							System.out.println("Tärning 2: " + dice[1]);
							System.out.println("Tärning 3: " + dice[2]);
							System.out.println("Tärning 4: " + dice[3]);
							System.out.println("Tärning 5: " + dice[4]);
						}
					}

				}	//Till om du vill slå om tärningarna eller inte


				System.out.println("Vilken rad i protokollet vill du skriva in? Kolla längst upp");
				
				int vart = input.nextInt();
				
				if(vart == 1) {
					System.out.println("Vad vill du skriva?");
					 char vad1 = input.next().charAt(0);
					 var3[s][1] = vad1;
				}
				else if(vart == 2) {
					System.out.println("Vad vill du skriva?");
					double vad1 = input.nextDouble();
					var2[s][2] = vad1;
					
				}
				else if(vart == 3) {
					System.out.println("Vad vill du skriva?");
					double vad1 = input.nextDouble();
					var2[s][3] = vad1;
				}
				else if(vart == 4) {
					System.out.println("Vad vill du skriva?");
					double vad1 = input.nextDouble();
					var2[s][4] = vad1;
				}
				else if(vart == 5) {
					System.out.println("Vad vill du skriva?");
					double vad1 = input.nextDouble();
					var2[s][5] = vad1;
				}
				else if(vart == 6) {
					System.out.println("Vad vill du skriva?");
					double vad1 = input.nextDouble();
					var2[s][6] = vad1;
				}
				else if(vart == 7) {
					System.out.println("Vad vill du skriva?");
					double vad1 = input.nextDouble();
					var2[s][7] = vad1;
				}
				else if(vart == 8) {
					System.out.println("Vad vill du skriva?");
					double vad1 = input.nextDouble();
					var2[s][8] = vad1;
				}
				else if(vart == 9) {
					System.out.println("Vad vill du skriva?");
					double vad1 = input.nextDouble();
					var2[s][9] = vad1;
				}
				else if(vart == 10) {
					System.out.println("Vad vill du skriva?");
					double vad1 = input.nextDouble();
					var2[s][10] = vad1;
				}
				else if(vart == 11) {
					System.out.println("Vad vill du skriva?");
					double vad1 = input.nextDouble();
					var2[s][11] = vad1;
				}
				else if(vart == 12) {
					System.out.println("Vad vill du skriva?");
					double vad1 = input.nextDouble();
					var2[s][12] = vad1;
				}
				else if(vart == 13) {
					System.out.println("Vad vill du skriva?");
					double vad1 = input.nextDouble();
					var2[s][13] = vad1;
				}
				else if(vart == 14) {
					System.out.println("Vad vill du skriva?");
					double vad1 = input.nextDouble();
					var2[s][14] = vad1;
				}
				else if(vart == 15) {
					System.out.println("Vad vill du skriva?");
					 double vad1 = input.nextDouble();
					var2[s][15] = vad1;
				}
				else if(vart == 16) {
					System.out.println("Vad vill du skriva?");
					double vad1 = input.nextDouble();
					var2[s][16] = vad1;
				}
				else if(vart == 17) {
					System.out.println("Vad vill du skriva?");
					double vad1 = input.nextDouble();
					var2[s][17] = vad1;
				}
				else if(vart == 18) {
					System.out.println("Vad vill du skriva?");
					double vad1 = input.nextDouble();
					var2[s][18] = vad1;
				}
				
				



				System.out.println("Spelare\t|" + namn[0] + "\t|" + namn[1] + "\t|" + namn[2] + "\t|" + namn[3] + "\t|" + namn[4] + "\t| Nummer");
				System.out.println("Ettor: \t|" + var3[1][1] + "\t|" + var2[2][1] + "\t|" + var2[3][1] + "\t|" + var2[4][1] + "\t|" + var2[5][1] + "\t| 1");
				System.out.println("Tvåor: \t|" + var2[1][2] + "\t|" + var2[2][2] + "\t|" + var2[3][2] + "\t|" + var2[4][2] + "\t|" + var2[5][2] + "\t| 2");
				System.out.println("Treor: \t|" + var2[1][3] + "\t|" + var2[2][3] + "\t|" + var2[3][3] + "\t|" + var2[4][3] + "\t|" + var2[5][3] + "\t| 3");
				System.out.println("Fyror: \t|" + var2[1][4] + "\t|" + var2[2][4] + "\t|" + var2[3][4] + "\t|" + var2[4][4] + "\t|" + var2[5][4] + "\t| 4");
				System.out.println("Femmor:\t|" + var2[1][5] + "\t|" + var2[2][5] + "\t|" + var2[3][5] + "\t|" + var2[4][5] + "\t|" + var2[5][5] + "\t| 5");
				System.out.println("Sexor: \t|" + var2[1][6] + "\t|" + var2[2][6] + "\t|" + var2[3][6] + "\t|" + var2[4][6] + "\t|" + var2[5][6] + "\t| 6");
				System.out.println("Summa: \t|" + var2[1][7] + "\t|" + var2[2][7] + "\t|" + var2[3][7] + "\t|" + var2[4][7] + "\t|" + var2[5][7] + "\t| 7");
				System.out.println("Bonus: \t|" + var2[1][8] + "\t|" + var2[2][8] + "\t|" + var2[3][8] + "\t|" + var2[4][8] + "\t|" + var2[5][8] + "\t| 8");
				System.out.println("Par: \t|" + var2[1][9] + "\t|" + var2[2][9] + "\t|" + var2[3][9] + "\t|" + var2[4][9] + "\t|" + var2[5][9] + "\t| 9");
				System.out.println("2-par: \t|" + var2[1][10] + "\t|" + var2[2][10] + "\t|" + var2[3][10] + "\t|" + var2[4][10] + "\t|" + var2[5][10] + "\t| 10");
				System.out.println("3-tal: \t|" + var2[1][11] + "\t|" + var2[2][11] + "\t|" + var2[3][11] + "\t|" + var2[4][11] + "\t|" + var2[5][11] + "\t| 11");
				System.out.println("4-tal: \t|" + var2[1][12] + "\t|" + var2[2][12] + "\t|" + var2[3][12] + "\t|" + var2[4][12] + "\t|" + var2[5][12] + "\t| 12");
				System.out.println("Kåk: \t|" + var2[1][13] + "\t|" + var2[2][13] + "\t|" + var2[3][13] + "\t|" + var2[4][13] + "\t|" + var2[5][13] + "\t| 13");
				System.out.println("Ls: \t|" + var2[1][14] + "\t|" + var2[2][14] + "\t|" + var2[3][14] + "\t|" + var2[4][14] + "\t|" + var2[5][14] + "\t| 14");
				System.out.println("Ss: \t|" + var2[1][15] + "\t|" + var2[2][15] + "\t|" + var2[3][15] + "\t|" + var2[4][15] + "\t|" + var2[5][15] + "\t| 15");
				System.out.println("Chans: \t|" + var2[1][16] + "\t|" + var2[2][16] + "\t|" + var2[3][16] + "\t|" + var2[4][16] + "\t|" + var2[5][16] + "\t| 16");
				System.out.println("YATZY: \t|" + var2[1][17] + "\t|" + var2[2][17] + "\t|" + var2[3][17] + "\t|" + var2[4][17] + "\t|" + var2[5][17] + "\t| 17");
				System.out.println("Summa: \t|" + var2[1][18] + "\t|" + var2[2][18] + "\t|" + var2[3][18] + "\t|" + var2[4][18] + "\t|" + var2[5][18] + "\t| 18");

				if (spelare == 1) {
					System.out.println("Vill fortsätta spela? j/n");
					spela = input.next().charAt(0);
					
					if(spela == 'n') {
						i=-2;
					}
					s = 0;
				}
				else if(spelare == 2) {
					if(s == 1) {
						System.out.println("Spelar 2, din tur. Tryck J för att spela");
						spela = input.next().charAt(0);
						
					}
					else if(s == 2) {
						System.out.println("Spelare 1, din tur");
						spela = input.next().charAt(0);
						s = 0;

					}
				}
				else if( spelare == 3) {
					if(s == 1) {
						System.out.println("Spelare 2, din tur");
						spela = input.next().charAt(0);
					}
					else if(s == 2) {
						System.out.println("Spelare 3, din tur");
						spela = input.next().charAt(0);
						
						
					}
					else if(s == 3) {
						System.out.println("Spelare 1, din tur");
						spela = input.next().charAt(0);
						s = 0;
					}
				}
				else if(spelare == 4) {
					if(s == 1) {
						System.out.println("Spelare 2, din tur");
						spela = input.next().charAt(0);
					}
					else if(s == 2) {
						System.out.println("Spelare 3, din tur");
						spela = input.next().charAt(0);
						
					}
					else if(s == 3) {
						System.out.println("Spelare 4, din tur");
						spela = input.next().charAt(0);
						
					}
					else if(s == 4) {
						System.out.println("Spelare 1, din tur");
						spela = input.next().charAt(0);
						s = 0;
					}
				}
				else if(spelare == 5) {
					if(s == 1) {
						System.out.println("Spelare 2, din tur");
						spela = input.next().charAt(0);
					}
					else if(s == 2) {
						System.out.println("Spelare 3, din tur");
						spela = input.next().charAt(0);
						
					}
					else if(s == 3) {
						System.out.println("Spelare 4, din tur");
						spela = input.next().charAt(0);
					}
					else if(s == 4) {
						System.out.println("Spelare 5, din tur");
						spela = input.next().charAt(0);
						
					}
					else if(s == 5) {
						System.out.println("Spelare 1, din tur");
						spela = input.next().charAt(0);
						s = 0;
					}
				}

			} // TILL FOR SATS ( S )
		}// TILL FOR SATS ( I ) 
	}


}
