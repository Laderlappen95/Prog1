package paket;

import java.util.Scanner;

public class YatzyBräde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		String [] namn = new String[5];
		int summa;

		for(int k = 0; k >=0; k++) {


			System.out.println("Vilka spelar? Använd inte mer än 6 tecken");
			namn[0] = input.next();
			namn[1] = input.next();
			namn[2] = input.next();
			namn[3] = input.next();
			namn[4] = input.next();

			int dice1[] = new int[100];
			int dice2[] = new int[100];
			int dice3[] = new int[100];
			int dice4[] = new int[100];
			int dice5[] = new int[100];




			int val1[] = new int[100];
			int val2[] = new int[100];
			int val3[] = new int[100];
			int val4[] = new int[100];
			int val5[] = new int[100];


			for(int s = 0; s>=0; s++) {

				dice1[s] = (int)(Math.random()*6+1);
				dice2[s] = (int)(Math.random()*6+1);
				dice3[s] = (int)(Math.random()*6+1);
				dice4[s] = (int)(Math.random()*6+1);
				dice5[s] = (int)(Math.random()*6+1);
				System.out.println("Tärning 1: " + dice1[s]);
				System.out.println("Tärning 2: " + dice2[s]);
				System.out.println("Tärning 3: " + dice3[s]);
				System.out.println("Tärning 4: " + dice4[s]);
				System.out.println("Tärning 5: " + dice5[s]);


				System.out.println("Vart vill du skriva in dina tärningar?");
				int vald = input.nextInt();
				if(vald == 1) {
					summa = dice1[s] + dice2[s] + dice3[s] + dice4[s] + dice5[s];
					val1[1] = summa;
					System.out.println("Avsluta j /n");
					char avslut = input.next().charAt(0);
					if(avslut == 'n') {
						s = -3;
					}
				}






				for(int i = 0; i>=0; i++) {		

				}
				//System.out.println("Tärning 1: " + dice1[0]);
				//System.out.println("Tärning 1: " + dice1[1]);








				System.out.println("Spelare\t|" + namn[0] + "\t|" + namn[1] + "\t|" + namn[2] + "\t|" + namn[3] + "\t|" + namn[4] + "\t| Nummer");
				System.out.println("Ettor: \t|" + val1[1] + "\t|" + val2[1] + "\t|" + val3[1] + "\t|" + val4[1] + "\t|" + val5[1] + "\t| 1");
				System.out.println("Tvåor: \t|" + val1[2] + "\t|" + val2[2] + "\t|" + val3[2] + "\t|" + val4[2] + "\t|" + val5[2] + "\t| 2");
				System.out.println("Treor: \t|" + val1[3] + "\t|" + val2[3] + "\t|" + val3[3] + "\t|" + val4[3] + "\t|" + val5[3] + "\t| 3");
				System.out.println("Fyror: \t|" + val1[4] + "\t|" + val2[4] + "\t|" + val3[4] + "\t|" + val4[4] + "\t|" + val5[4] + "\t| 4");
				System.out.println("Femmor:\t|" + val1[5] + "\t|" + val2[5] + "\t|" + val3[5] + "\t|" + val4[5] + "\t|" + val5[5] + "\t| 5");
				System.out.println("Sexor: \t|" + val1[6] + "\t|" + val2[6] + "\t|" + val3[6] + "\t|" + val4[6] + "\t|" + val5[6] + "\t| 6");
				System.out.println("Summa: \t|" + val1[7] + "\t|" + val2[7] + "\t|" + val3[7] + "\t|" + val4[7] + "\t|" + val5[7] + "\t| 7");
				System.out.println("Bonus: \t|" + val1[8] + "\t|" + val2[8] + "\t|" + val3[8] + "\t|" + val4[8] + "\t|" + val5[8] + "\t| 8");
				System.out.println("Par: \t|" + val1[9] + "\t|" + val2[9] + "\t|" + val3[9] + "\t|" + val4[9] + "\t|" + val5[9] + "\t| 9");
				System.out.println("2-par: \t|" + val1[10] + "\t|" + val2[10] + "\t|" + val3[10] + "\t|" + val4[10] + "\t|" + val5[10] + "\t| 10");
				System.out.println("3-tal: \t|" + val1[11] + "\t|" + val2[11] + "\t|" + val3[11] + "\t|" + val4[11] + "\t|" + val5[11] + "\t| 11");
				System.out.println("4-tal: \t|" + val1[12] + "\t|" + val2[12] + "\t|" + val3[12] + "\t|" + val4[12] + "\t|" + val5[12] + "\t| 12");
				System.out.println("Kåk: \t|" + val1[13] + "\t|" + val2[13] + "\t|" + val3[13] + "\t|" + val4[13] + "\t|" + val5[13] + "\t| 13");
				System.out.println("Ls: \t|" + val1[14] + "\t|" + val2[14] + "\t|" + val3[14] + "\t|" + val4[14] + "\t|" + val5[14] + "\t| 14");
				System.out.println("Ss: \t|" + val1[15] + "\t|" + val2[15] + "\t|" + val3[15] + "\t|" + val4[15] + "\t|" + val5[15] + "\t| 15");
				System.out.println("Chans: \t|" + val1[16] + "\t|" + val2[16] + "\t|" + val3[16] + "\t|" + val4[16] + "\t|" + val5[16] + "\t| 16");
				System.out.println("YATZY: \t|" + val1[17] + "\t|" + val2[17] + "\t|" + val3[17] + "\t|" + val4[17] + "\t|" + val5[17] + "\t| 17");
				System.out.println("Summa: \t|" + val1[0] + "\t|" + val2[0] + "\t|" + val3[0] + "\t|" + val4[7] + "\t|" + val5[7] + "\t|");
				System.out.println("TA BORT S");
				char ta = input.next().charAt(0);
				if(ta== 'j') {
					s= - 3;
				}

				else {
					s=-3;
				}
			}
		}
	}

}
