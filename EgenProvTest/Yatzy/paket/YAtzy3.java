package paket;

import java.util.Scanner;

public class YAtzy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		//variabler
		int val1[] = new int[100];
		int val2[] = new int[100];
		int val3[] = new int[100];
		int val4[] = new int[100];
		int val5[] = new int[100];
		int spelare = 0;
		boolean kör =true;
		

		int spela = 0;
		int count1 = 0;
		int count = 0;
		int count2 = 1;
		
		while(kör) {


			System.out.println("Hur många spelare vill spela? 1 - 5");
			spelare = input.nextInt();
			if(spelare == 1) {

				kör = false;
			}
			else if(spelare == 2) {

				kör = false;
			}
			else if(spelare == 3) {

				kör =false;
			}
			else if(spelare == 4) {

				kör = false;
			}
			else if(spelare ==5) {

				kör = false;
			}
			else {
				System.out.println("Mellan 1 och 5 spelare.");
			}
		}


		do {
			

			spela++;
			System.out.println(" ");

			System.out.println("Vill du slå tärningarna? j/n");
			char sla = input.next().charAt(0);

			int dice1 = (int)(Math.random()*6+1);
			int dice2 = (int)(Math.random()*6+1);
			int dice3 = (int)(Math.random()*6+1);
			int dice4 = (int)(Math.random()*6+1);
			int dice5 = (int)(Math.random()*6+1);





			System.out.println("Tärning 1: " + dice1);
			System.out.println("Tärning 2: " + dice2);
			System.out.println("Tärning 3: " + dice3);
			System.out.println("Tärning 4: " + dice4);
			System.out.println("Tärning 5: " + dice5);




			do {
				
				int slaom2;
				count++;
				count1 ++;
				//System.out.println("Count1 =" +count1);
				System.out.println("Vill du slå om tärningar? j/n");
				char slaom = input.next().charAt(0);
				if(slaom == 'j') {
					System.out.println("Hur många tärningar vill du slå om?");
					slaom2 = input.nextInt();
					if(slaom2 >= 6) {
						System.out.println("Idiot, du har inte så många tärningar!");
					}
					else {


						if(slaom2 == 1) {
							System.out.println("Vilken vill du slå om?");
							val1[0] = input.nextInt();
							if(val1[0] == 1) {
								dice1 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);
							}
							if(val1[0] == 2) {
								dice2 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}
							if(val1[0] == 3) {
								dice3 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}
							if(val1[0] == 4) {
								dice4 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}
							if(val1[0] == 5) {
								dice5 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}
						}


						//OM DU VÄLJER ATT SLÅ OM 2 ST


						else if(slaom2 == 2){
							System.out.println("Vilka tärningar vill du slå om?");
							val1[0] = input.nextInt();
							val2[0] = input.nextInt();
							if(
									val1[0] == 1 && val2[0] == 2 || 
									val2[0] == 1 && val1[0] == 2) {
								dice1 = (int)(Math.random()*6+1);
								dice2 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}
							if(
									val1[0] == 1 && val2[0] == 3 || 
									val2[0] == 1 && val1[0] == 3) {
								dice1 = (int)(Math.random()*6+1);
								dice3 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}
							if(
									val1[0] == 1 && val2[0] == 4 || 
									val2[0] == 1 && val1[0] == 4) {
								dice1 = (int)(Math.random()*6+1);
								dice4 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}
							if(
									val1[0] == 1 && val2[0] == 5 || 
									val2[0] == 1 && val1[0] == 5) {
								dice1 = (int)(Math.random()*6+1);
								dice5 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}




							if(
									val1[0] == 2 && val2[0] == 3 || 
									val1[0] == 3 && val2[0] == 2) {
								dice2 = (int)(Math.random()*6+1);
								dice3 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}
							if(
									val1[0] == 2 && val2[0] == 4 || 
									val1[0] == 4 && val2[0] == 2) {
								dice2 = (int)(Math.random()*6+1);
								dice4 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}
							if(
									val1[0] == 2 && val2[0] == 5 ||
									val1[0] == 5 && val2[0] == 2) {
								dice2 = (int)(Math.random()*6+1);
								dice5 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}

							if(
									val1[0] == 3 && val2[0] == 4 || 
									val1[0] == 4 && val2[0] == 3) {
								dice3 = (int)(Math.random()*6+1);
								dice4 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}
							if(
									val1[0] == 3 && val2[0] == 5 || 
									val1[0] == 5 && val2[0] == 3) {
								dice3 = (int)(Math.random()*6+1);
								dice5 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}

							if(
									val1[0] == 4 && val2[0] == 5 || 
									val2[0] == 4 && val1[0] == 5) {
								dice4 = (int)(Math.random()*6+1);
								dice5 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}

						} 


						//OM DU VÄLJER ATT SLÅ OM 3 ST TÄRNINGAR


						else if(slaom2 == 3){
							System.out.println("Vilka tärningar vill du slå om?");
							val1[0] = input.nextInt();
							val2[0] = input.nextInt();
							val3[0] = input.nextInt();

							// 1 2 3

							if(
									val1[0] == 1 && val2[0] == 2 && val3[0] == 3 || 
									val1[0] == 2 && val2[0] == 3 && val3[0] == 1 || 
									val1[0] == 3 && val2[0] == 1 && val3[0] == 2 || 
									val1[0] == 3 && val2[0] == 2 && val3[0] == 1 || 
									val1[0] == 2 && val2[0] == 1 && val3[0] == 3 || 
									val1[0] == 1 && val2[0] == 3 && val3[0] == 2) {
								dice1 = (int)(Math.random()*6+1);
								dice2 = (int)(Math.random()*6+1);
								dice3 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}

							//1 2 4 

							if(
									val1[0] == 1 && val2[0] == 2 && val3[0] == 4|| 
									val1[0] == 2 && val2[0] == 4 && val3[0] == 1 || 
									val1[0] == 4 && val2[0] == 1 && val3[0] == 2 || 
									val1[0] == 4 && val2[0] == 2 && val3[0] == 1 || 
									val1[0] == 2 && val2[0] == 1 && val3[0] == 4 || 
									val1[0] == 1 && val2[0] == 4 && val3[0] == 2) {
								dice1 = (int)(Math.random()*6+1);
								dice2 = (int)(Math.random()*6+1);
								dice4 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}

							// 1 2 5 

							if(
									val1[0] == 1 && val2[0] == 2 && val3[0] == 5|| 
									val1[0] == 2 && val2[0] == 5 && val3[0] == 1 || 
									val1[0] == 5 && val2[0] == 1 && val3[0] == 2 || 
									val1[0] == 5 && val2[0] == 2 && val3[0] == 1 || 
									val1[0] == 2 && val2[0] == 1 && val3[0] == 5 || 
									val1[0] == 1 && val2[0] == 5 && val3[0] == 2) {
								dice1 = (int)(Math.random()*6+1);
								dice2 = (int)(Math.random()*6+1);
								dice5 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}

							// 1 3 4


							if(
									val1[0] == 1 && val2[0] == 3 && val3[0] == 4 || 
									val1[0] == 3 && val2[0] == 4 && val3[0] == 1 || 
									val1[0] == 4 && val2[0] == 1 && val3[0] == 3 || 
									val1[0] == 4 && val2[0] == 3 && val3[0] == 1 || 
									val1[0] == 3 && val2[0] == 1 && val3[0] == 4 || 
									val1[0] == 1 && val2[0] == 4 && val3[0] == 3) {
								dice1 = (int)(Math.random()*6+1);
								dice3 = (int)(Math.random()*6+1);
								dice4 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}

							//1 3 5

							if(
									val1[0] == 1 && val2[0] == 3 && val3[0] == 5 || 
									val1[0] == 3 && val2[0] == 5 && val3[0] == 1 ||
									val1[0] == 5 && val2[0] == 1 && val3[0] == 3 ||
									val1[0] == 5 && val2[0] == 3 && val3[0] == 1 ||
									val1[0] == 3 && val2[0] == 1 && val3[0] == 5 || 
									val1[0] == 1 && val2[0] == 5 && val3[0] == 3) {
								dice1 = (int)(Math.random()*6+1);
								dice2 = (int)(Math.random()*6+1);
								dice5 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}

							//1 4 5

							if(
									val1[0] == 1 && val2[0] == 4 && val3[0] == 5|| 
									val1[0] == 4 && val2[0] == 5 && val3[0] == 1 || 
									val1[0] == 5 && val2[0] == 1 && val3[0] == 4 || 
									val1[0] == 5 && val2[0] == 4 && val3[0] == 1 || 
									val1[0] == 4 && val2[0] == 1 && val3[0] == 5 || 
									val1[0] == 1 && val2[0] == 5 && val3[0] == 4) {
								dice1 = (int)(Math.random()*6+1);
								dice2 = (int)(Math.random()*6+1);
								dice5 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);
							}

							// 2 4 5

							if(
									val1[0] == 2 && val2[0] == 4 && val3[0] == 5 || 
									val1[0] == 4 && val2[0] == 5 && val3[0] == 2 || 
									val1[0] == 5 && val2[0] == 2 && val3[0] == 4 || 
									val1[0] == 5 && val2[0] == 4 && val3[0] == 2 || 
									val1[0] == 4 && val2[0] == 2 && val3[0] == 5 || 
									val1[0] == 2 && val2[0] == 5 && val3[0] == 4) {
								dice2 = (int)(Math.random()*6+1);
								dice4 = (int)(Math.random()*6+1);
								dice5 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);
							}

							// 3 4 5 

							if(
									val1[0] == 3 && val2[0] == 4 && val3[0] == 5|| 
									val1[0] == 4 && val2[0] == 5 && val3[0] == 3 || 
									val1[0] == 5 && val2[0] == 3 && val3[0] == 4 || 
									val1[0] == 5 && val2[0] == 4 && val3[0] == 3 || 
									val1[0] == 4 && val2[0] == 3 && val3[0] == 5 || 
									val1[0] == 3 && val2[0] == 5 && val3[0] == 4) {
								dice3 = (int)(Math.random()*6+1);
								dice4 = (int)(Math.random()*6+1);
								dice5 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);
							}
						}


						//OM DU VÄLJER ATT SLÅ OM 4 ST TÄRNINGAR

						else if(slaom2 == 4){
							System.out.println("Vilka tärningar vill du slå om?");
							val1[0] = input.nextInt();
							val2[0] = input.nextInt();
							val3[0] = input.nextInt();
							val4[0] = input.nextInt();

							// 1 2 3 4

							if(
									val1[0] == 1 && val2[0] == 2 && val3[0] == 3 && val4[0] == 4|| 
									val1[0] == 1 && val2[0] == 2 && val3[0] == 4 && val4[0] == 3|| 
									val1[0] == 1 && val2[0] == 3 && val3[0] == 4 && val4[0] == 2|| 
									val1[0] == 1 && val2[0] == 3 && val3[0] == 2 && val4[0] == 4|| 
									val1[0] == 1 && val2[0] == 4 && val3[0] == 2 && val4[0] == 3|| 
									val1[0] == 1 && val2[0] == 4 && val3[0] == 3 && val4[0] == 2||
									val1[0] == 2 && val2[0] == 3 && val3[0] == 4 && val4[0] == 1||
									val1[0] == 2 && val2[0] == 3 && val3[0] == 1 && val4[0] == 4||
									val1[0] == 2 && val2[0] == 1 && val3[0] == 3 && val4[0] == 4||
									val1[0] == 2 && val2[0] == 1 && val3[0] == 4 && val4[0] == 3||
									val1[0] == 2 && val2[0] == 4 && val3[0] == 1 && val4[0] == 3||
									val1[0] == 2 && val2[0] == 4 && val3[0] == 3 && val4[0] == 1||
									val1[0] == 3 && val2[0] == 4 && val3[0] == 1 && val4[0] == 2||
									val1[0] == 3 && val2[0] == 4 && val3[0] == 2 && val4[0] == 1||
									val1[0] == 3 && val2[0] == 2 && val3[0] == 4 && val4[0] == 1||
									val1[0] == 3 && val2[0] == 2 && val3[0] == 1 && val4[0] == 4||
									val1[0] == 3 && val2[0] == 1 && val3[0] == 4 && val4[0] == 2||
									val1[0] == 3 && val2[0] == 1 && val3[0] == 2 && val4[0] == 4||
									val1[0] == 4 && val2[0] == 1 && val3[0] == 2 && val4[0] == 3||
									val1[0] == 4 && val2[0] == 1 && val3[0] == 3 && val4[0] == 2||
									val1[0] == 4 && val2[0] == 2 && val3[0] == 3 && val4[0] == 1||
									val1[0] == 4 && val2[0] == 2 && val3[0] == 1 && val4[0] == 3||
									val1[0] == 4 && val2[0] == 3 && val3[0] == 2 && val4[0] == 1||
									val1[0] == 4 && val2[0] == 3 && val3[0] == 1 && val4[0] == 2
									) {
								dice1 = (int)(Math.random()*6+1);
								dice2 = (int)(Math.random()*6+1);
								dice3 = (int)(Math.random()*6+1);
								dice4 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);
							}

							// 1 2 3 5

							if(
									val1[0] == 1 && val2[0] == 2 && val3[0] == 3 && val4[0] == 5|| 
									val1[0] == 1 && val2[0] == 2 && val3[0] == 5 && val4[0] == 3|| 
									val1[0] == 1 && val2[0] == 3 && val3[0] == 5 && val4[0] == 2|| 
									val1[0] == 1 && val2[0] == 3 && val3[0] == 2 && val4[0] == 5|| 
									val1[0] == 1 && val2[0] == 5 && val3[0] == 2 && val4[0] == 3|| 
									val1[0] == 1 && val2[0] == 5 && val3[0] == 3 && val4[0] == 2||
									val1[0] == 2 && val2[0] == 3 && val3[0] == 5 && val4[0] == 1||
									val1[0] == 2 && val2[0] == 3 && val3[0] == 1 && val4[0] == 5||
									val1[0] == 2 && val2[0] == 1 && val3[0] == 3 && val4[0] == 5||
									val1[0] == 2 && val2[0] == 1 && val3[0] == 5 && val4[0] == 3||
									val1[0] == 2 && val2[0] == 5 && val3[0] == 1 && val4[0] == 3||
									val1[0] == 2 && val2[0] == 5 && val3[0] == 3 && val4[0] == 1||
									val1[0] == 3 && val2[0] == 5 && val3[0] == 1 && val4[0] == 2||
									val1[0] == 3 && val2[0] == 5 && val3[0] == 2 && val4[0] == 1||
									val1[0] == 3 && val2[0] == 2 && val3[0] == 5 && val4[0] == 1||
									val1[0] == 3 && val2[0] == 2 && val3[0] == 1 && val4[0] == 5||
									val1[0] == 3 && val2[0] == 1 && val3[0] == 5 && val4[0] == 2||
									val1[0] == 3 && val2[0] == 1 && val3[0] == 2 && val4[0] == 5||
									val1[0] == 5 && val2[0] == 1 && val3[0] == 2 && val4[0] == 3||
									val1[0] == 5 && val2[0] == 1 && val3[0] == 3 && val4[0] == 2||
									val1[0] == 5 && val2[0] == 2 && val3[0] == 3 && val4[0] == 1||
									val1[0] == 5 && val2[0] == 2 && val3[0] == 1 && val4[0] == 3||
									val1[0] == 5 && val2[0] == 3 && val3[0] == 2 && val4[0] == 1||
									val1[0] == 5 && val2[0] == 3 && val3[0] == 1 && val4[0] == 2
									) {
								dice1 = (int)(Math.random()*6+1);
								dice2 = (int)(Math.random()*6+1);
								dice3 = (int)(Math.random()*6+1);
								dice5 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 5: " + dice5);
							}

							// 1 2 4 5

							if(
									val1[0] == 1 && val2[0] == 2 && val3[0] == 4 && val4[0] == 5|| 
									val1[0] == 1 && val2[0] == 2 && val3[0] == 5 && val4[0] == 4|| 
									val1[0] == 1 && val2[0] == 4 && val3[0] == 5 && val4[0] == 2|| 
									val1[0] == 1 && val2[0] == 4 && val3[0] == 2 && val4[0] == 5|| 
									val1[0] == 1 && val2[0] == 5 && val3[0] == 2 && val4[0] == 4|| 
									val1[0] == 1 && val2[0] == 5 && val3[0] == 4 && val4[0] == 2||
									val1[0] == 2 && val2[0] == 4 && val3[0] == 5 && val4[0] == 1||
									val1[0] == 2 && val2[0] == 4 && val3[0] == 1 && val4[0] == 5||
									val1[0] == 2 && val2[0] == 1 && val3[0] == 4 && val4[0] == 5||
									val1[0] == 2 && val2[0] == 1 && val3[0] == 5 && val4[0] == 4||
									val1[0] == 2 && val2[0] == 5 && val3[0] == 1 && val4[0] == 4||
									val1[0] == 2 && val2[0] == 5 && val3[0] == 4 && val4[0] == 1||
									val1[0] == 4 && val2[0] == 5 && val3[0] == 1 && val4[0] == 2||
									val1[0] == 4 && val2[0] == 5 && val3[0] == 2 && val4[0] == 1||
									val1[0] == 4 && val2[0] == 2 && val3[0] == 5 && val4[0] == 1||
									val1[0] == 4 && val2[0] == 2 && val3[0] == 1 && val4[0] == 5||
									val1[0] == 4 && val2[0] == 1 && val3[0] == 5 && val4[0] == 2||
									val1[0] == 4 && val2[0] == 1 && val3[0] == 2 && val4[0] == 5||
									val1[0] == 5 && val2[0] == 1 && val3[0] == 2 && val4[0] == 4||
									val1[0] == 5 && val2[0] == 1 && val3[0] == 4 && val4[0] == 2||
									val1[0] == 5 && val2[0] == 2 && val3[0] == 4 && val4[0] == 1||
									val1[0] == 5 && val2[0] == 2 && val3[0] == 1 && val4[0] == 4||
									val1[0] == 5 && val2[0] == 4 && val3[0] == 2 && val4[0] == 1||
									val1[0] == 5 && val2[0] == 4 && val3[0] == 1 && val4[0] == 2
									) {
								dice1 = (int)(Math.random()*6+1);
								dice2 = (int)(Math.random()*6+1);
								dice4 = (int)(Math.random()*6+1);
								dice5 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 +  "\nTärning 3: " + dice3 + "\nTärning 4: " + dice4+ "\nTärning 5: " + dice5);
							}

							// 1 3 4 5


							if(
									val1[0] == 1 && val2[0] == 3 && val3[0] == 4 && val4[0] == 5|| 
									val1[0] == 1 && val2[0] == 3 && val3[0] == 5 && val4[0] == 4|| 
									val1[0] == 1 && val2[0] == 4 && val3[0] == 5 && val4[0] == 3|| 
									val1[0] == 1 && val2[0] == 4 && val3[0] == 3 && val4[0] == 5|| 
									val1[0] == 1 && val2[0] == 5 && val3[0] == 3 && val4[0] == 4|| 
									val1[0] == 1 && val2[0] == 5 && val3[0] == 4 && val4[0] == 3||
									val1[0] == 3 && val2[0] == 4 && val3[0] == 5 && val4[0] == 1||
									val1[0] == 3 && val2[0] == 4 && val3[0] == 1 && val4[0] == 5||
									val1[0] == 3 && val2[0] == 1 && val3[0] == 4 && val4[0] == 5||
									val1[0] == 3 && val2[0] == 1 && val3[0] == 5 && val4[0] == 4||
									val1[0] == 3 && val2[0] == 5 && val3[0] == 1 && val4[0] == 4||
									val1[0] == 3 && val2[0] == 5 && val3[0] == 4 && val4[0] == 1||
									val1[0] == 4 && val2[0] == 5 && val3[0] == 1 && val4[0] == 3||
									val1[0] == 4 && val2[0] == 5 && val3[0] == 3 && val4[0] == 1||
									val1[0] == 4 && val2[0] == 3 && val3[0] == 5 && val4[0] == 1||
									val1[0] == 4 && val2[0] == 3 && val3[0] == 1 && val4[0] == 5||
									val1[0] == 4 && val2[0] == 1 && val3[0] == 5 && val4[0] == 3||
									val1[0] == 4 && val2[0] == 1 && val3[0] == 3 && val4[0] == 5||
									val1[0] == 5 && val2[0] == 1 && val3[0] == 3 && val4[0] == 4||
									val1[0] == 5 && val2[0] == 1 && val3[0] == 4 && val4[0] == 3||
									val1[0] == 5 && val2[0] == 3 && val3[0] == 4 && val4[0] == 1||
									val1[0] == 5 && val2[0] == 3 && val3[0] == 1 && val4[0] == 4||
									val1[0] == 5 && val2[0] == 4 && val3[0] == 3 && val4[0] == 1||
									val1[0] == 5 && val2[0] == 4 && val3[0] == 1 && val4[0] == 3
									) {
								dice1 = (int)(Math.random()*6+1);
								dice3 = (int)(Math.random()*6+1);
								dice4 = (int)(Math.random()*6+1);
								dice5 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 3: " + dice3 + "\nTärning 4: " + dice4+ "\nTärning 5: " + dice5);
							}

							// 2 3 4 5

							if(
									val1[0] == 2 && val2[0] == 3 && val3[0] == 4 && val4[0] == 5|| 
									val1[0] == 2 && val2[0] == 3 && val3[0] == 5 && val4[0] == 4|| 
									val1[0] == 2 && val2[0] == 4 && val3[0] == 5 && val4[0] == 3|| 
									val1[0] == 2 && val2[0] == 4 && val3[0] == 3 && val4[0] == 5|| 
									val1[0] == 2 && val2[0] == 5 && val3[0] == 3 && val4[0] == 4|| 
									val1[0] == 2 && val2[0] == 5 && val3[0] == 4 && val4[0] == 3||
									val1[0] == 3 && val2[0] == 4 && val3[0] == 5 && val4[0] == 2||
									val1[0] == 3 && val2[0] == 4 && val3[0] == 2 && val4[0] == 5||
									val1[0] == 3 && val2[0] == 2 && val3[0] == 4 && val4[0] == 5||
									val1[0] == 3 && val2[0] == 2 && val3[0] == 5 && val4[0] == 4||
									val1[0] == 3 && val2[0] == 5 && val3[0] == 2 && val4[0] == 4||
									val1[0] == 3 && val2[0] == 5 && val3[0] == 4 && val4[0] == 2||
									val1[0] == 4 && val2[0] == 5 && val3[0] == 2 && val4[0] == 3||
									val1[0] == 4 && val2[0] == 5 && val3[0] == 3 && val4[0] == 2||
									val1[0] == 4 && val2[0] == 3 && val3[0] == 5 && val4[0] == 2||
									val1[0] == 4 && val2[0] == 3 && val3[0] == 2 && val4[0] == 5||
									val1[0] == 4 && val2[0] == 2 && val3[0] == 5 && val4[0] == 3||
									val1[0] == 4 && val2[0] == 2 && val3[0] == 3 && val4[0] == 5||
									val1[0] == 5 && val2[0] == 2 && val3[0] == 3 && val4[0] == 4||
									val1[0] == 5 && val2[0] == 2 && val3[0] == 4 && val4[0] == 3||
									val1[0] == 5 && val2[0] == 3 && val3[0] == 4 && val4[0] == 2||
									val1[0] == 5 && val2[0] == 3 && val3[0] == 2 && val4[0] == 4||
									val1[0] == 5 && val2[0] == 4 && val3[0] == 3 && val4[0] == 2||
									val1[0] == 5 && val2[0] == 4 && val3[0] == 2 && val4[0] == 3
									) {
								dice2 = (int)(Math.random()*6+1);
								dice3 = (int)(Math.random()*6+1);
								dice4 = (int)(Math.random()*6+1);
								dice5 = (int)(Math.random()*6+1);
								System.out.println("Tärning 2: " + dice2 + "\nTärning 3: " + dice3 + "\nTärning 4: " + dice4+ "\nTärning 5: " + dice5);
							}
						}

						//OM DU VÄLJER ATT RULLA OM 5 ST TÄRNINGAR

						else if(slaom2 == 5){
							System.out.println("Vilka tärningar vill du slå om?");
							val1[0] = input.nextInt();
							val2[0] = input.nextInt();
							val3[0] = input.nextInt();
							val4[0] = input.nextInt();
							val5[0] = input.nextInt();

							// 1 2 3 4 5

							if(
									val1[0] == 1 && val2[0] ==  2 && val3[0] == 3 && val4[0] == 4 && val5[0] == 5|| 
									val1[0] == 1 && val2[0] ==  2 && val3[0] == 3 && val4[0] == 5 && val5[0] == 4|| 
									val1[0] == 1 && val2[0] ==  2 && val3[0] == 4 && val4[0] == 5 && val5[0] == 3|| 
									val1[0] == 1 && val2[0] ==  2 && val3[0] == 4 && val4[0] == 3 && val5[0] == 5|| 
									val1[0] == 1 && val2[0] ==  2 && val3[0] == 5 && val4[0] == 3 && val5[0] == 4|| 
									val1[0] == 1 && val2[0] ==  2 && val3[0] == 5 && val4[0] == 4 && val5[0] == 3||
									val1[0] == 1 && val2[0] ==  3 && val3[0] == 2 && val4[0] == 4 && val5[0] == 5||
									val1[0] == 1 && val2[0] ==  3 && val3[0] == 2 && val4[0] == 5 && val5[0] == 4||
									val1[0] == 1 && val2[0] ==  3 && val3[0] == 4 && val4[0] == 5 && val5[0] == 2||
									val1[0] == 1 && val2[0] ==  3 && val3[0] == 4 && val4[0] == 2 && val5[0] == 5||
									val1[0] == 1 && val2[0] ==  3 && val3[0] == 5 && val4[0] == 4 && val5[0] == 2||
									val1[0] == 1 && val2[0] ==  3 && val3[0] == 5 && val4[0] == 2 && val5[0] == 4||
									val1[0] == 1 && val2[0] ==  4 && val3[0] == 2 && val4[0] == 3 && val5[0] == 5||
									val1[0] == 1 && val2[0] ==  4 && val3[0] == 2 && val4[0] == 5 && val5[0] == 3||
									val1[0] == 1 && val2[0] ==  4 && val3[0] == 3 && val4[0] == 5 && val5[0] == 2||
									val1[0] == 1 && val2[0] ==  4 && val3[0] == 3 && val4[0] == 2 && val5[0] == 5||
									val1[0] == 1 && val2[0] ==  4 && val3[0] == 5 && val4[0] == 2 && val5[0] == 3||
									val1[0] == 1 && val2[0] ==  4 && val3[0] == 5 && val4[0] == 3 && val5[0] == 2||
									val1[0] == 1 && val2[0] ==  5 && val3[0] == 2 && val4[0] == 3 && val5[0] == 4||
									val1[0] == 1 && val2[0] ==  5 && val3[0] == 2 && val4[0] == 4 && val5[0] == 3||
									val1[0] == 1 && val2[0] ==  5 && val3[0] == 3 && val4[0] == 4 && val5[0] == 2||
									val1[0] == 1 && val2[0] ==  5 && val3[0] == 3 && val4[0] == 2 && val5[0] == 4||
									val1[0] == 1 && val2[0] ==  5 && val3[0] == 4 && val4[0] == 3 && val5[0] == 2||
									val1[0] == 1 && val2[0] ==  5 && val3[0] == 4 && val4[0] == 2 && val5[0] == 3
									) {
								dice1 = (int)(Math.random()*6+1);
								dice2 = (int)(Math.random()*6+1);
								dice3 = (int)(Math.random()*6+1);
								dice4 = (int)(Math.random()*6+1);
								dice5 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);
							}

							// 2 1 3 4 5

							if(
									val1[0] == 2 && val2[0] ==  1 && val3[0] == 3 && val4[0] == 4 && val5[0] == 5|| 
									val1[0] == 2 && val2[0] ==  1 && val3[0] == 3 && val4[0] == 5 && val5[0] == 4|| 
									val1[0] == 2 && val2[0] ==  1 && val3[0] == 4 && val4[0] == 5 && val5[0] == 3|| 
									val1[0] == 2 && val2[0] ==  1 && val3[0] == 4 && val4[0] == 3 && val5[0] == 5|| 
									val1[0] == 2 && val2[0] ==  1 && val3[0] == 5 && val4[0] == 3 && val5[0] == 4|| 
									val1[0] == 2 && val2[0] ==  1 && val3[0] == 5 && val4[0] == 4 && val5[0] == 3||
									val1[0] == 2 && val2[0] ==  3 && val3[0] == 1 && val4[0] == 4 && val5[0] == 5||
									val1[0] == 2 && val2[0] ==  3 && val3[0] == 1 && val4[0] == 5 && val5[0] == 4||
									val1[0] == 2 && val2[0] ==  3 && val3[0] == 4 && val4[0] == 5 && val5[0] == 1||
									val1[0] == 2 && val2[0] ==  3 && val3[0] == 4 && val4[0] == 1 && val5[0] == 5||
									val1[0] == 2 && val2[0] ==  3 && val3[0] == 5 && val4[0] == 4 && val5[0] == 1||
									val1[0] == 2 && val2[0] ==  3 && val3[0] == 5 && val4[0] == 1 && val5[0] == 4||
									val1[0] == 2 && val2[0] ==  4 && val3[0] == 1 && val4[0] == 3 && val5[0] == 5||
									val1[0] == 2 && val2[0] ==  4 && val3[0] == 1 && val4[0] == 5 && val5[0] == 3||
									val1[0] == 2 && val2[0] ==  4 && val3[0] == 3 && val4[0] == 5 && val5[0] == 1||
									val1[0] == 2 && val2[0] ==  4 && val3[0] == 3 && val4[0] == 1 && val5[0] == 5||
									val1[0] == 2 && val2[0] ==  4 && val3[0] == 5 && val4[0] == 1 && val5[0] == 3||
									val1[0] == 2 && val2[0] ==  4 && val3[0] == 5 && val4[0] == 3 && val5[0] == 1||
									val1[0] == 2 && val2[0] ==  5 && val3[0] == 1 && val4[0] == 3 && val5[0] == 4||
									val1[0] == 2 && val2[0] ==  5 && val3[0] == 1 && val4[0] == 4 && val5[0] == 3||
									val1[0] == 2 && val2[0] ==  5 && val3[0] == 3 && val4[0] == 4 && val5[0] == 1||
									val1[0] == 2 && val2[0] ==  5 && val3[0] == 3 && val4[0] == 1 && val5[0] == 4||
									val1[0] == 2 && val2[0] ==  5 && val3[0] == 4 && val4[0] == 3 && val5[0] == 1||
									val1[0] == 2 && val2[0] ==  5 && val3[0] == 4 && val4[0] == 1 && val5[0] == 3
									) {
								dice1 = (int)(Math.random()*6+1);
								dice2 = (int)(Math.random()*6+1);
								dice3 = (int)(Math.random()*6+1);
								dice4 = (int)(Math.random()*6+1);
								dice5 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);
							}

							// 3 1 2 4 5

							if(
									val1[0] == 3 && val2[0] ==  1 && val3[0] == 2 && val4[0] == 4 && val5[0] == 5|| 
									val1[0] == 3 && val2[0] ==  1 && val3[0] == 2 && val4[0] == 5 && val5[0] == 4|| 
									val1[0] == 3 && val2[0] ==  1 && val3[0] == 4 && val4[0] == 5 && val5[0] == 2|| 
									val1[0] == 3 && val2[0] ==  1 && val3[0] == 4 && val4[0] == 2 && val5[0] == 5|| 
									val1[0] == 3 && val2[0] ==  1 && val3[0] == 5 && val4[0] == 2 && val5[0] == 4|| 
									val1[0] == 3 && val2[0] ==  1 && val3[0] == 5 && val4[0] == 4 && val5[0] == 2||
									val1[0] == 3 && val2[0] ==  2 && val3[0] == 1 && val4[0] == 4 && val5[0] == 5||
									val1[0] == 3 && val2[0] ==  2 && val3[0] == 1 && val4[0] == 5 && val5[0] == 4||
									val1[0] == 3 && val2[0] ==  2 && val3[0] == 4 && val4[0] == 5 && val5[0] == 1||
									val1[0] == 3 && val2[0] ==  2 && val3[0] == 4 && val4[0] == 1 && val5[0] == 5||
									val1[0] == 3 && val2[0] ==  2 && val3[0] == 5 && val4[0] == 4 && val5[0] == 1||
									val1[0] == 3 && val2[0] ==  2 && val3[0] == 5 && val4[0] == 1 && val5[0] == 4||
									val1[0] == 3 && val2[0] ==  4 && val3[0] == 1 && val4[0] == 2 && val5[0] == 5||
									val1[0] == 3 && val2[0] ==  4 && val3[0] == 1 && val4[0] == 5 && val5[0] == 2||
									val1[0] == 3 && val2[0] ==  4 && val3[0] == 2 && val4[0] == 5 && val5[0] == 1||
									val1[0] == 3 && val2[0] ==  4 && val3[0] == 2 && val4[0] == 1 && val5[0] == 5||
									val1[0] == 3 && val2[0] ==  4 && val3[0] == 5 && val4[0] == 1 && val5[0] == 2||
									val1[0] == 3 && val2[0] ==  4 && val3[0] == 5 && val4[0] == 2 && val5[0] == 1||
									val1[0] == 3 && val2[0] ==  5 && val3[0] == 1 && val4[0] == 2 && val5[0] == 4||
									val1[0] == 3 && val2[0] ==  5 && val3[0] == 1 && val4[0] == 4 && val5[0] == 2||
									val1[0] == 3 && val2[0] ==  5 && val3[0] == 2 && val4[0] == 4 && val5[0] == 1||
									val1[0] == 3 && val2[0] ==  5 && val3[0] == 2 && val4[0] == 1 && val5[0] == 4||
									val1[0] == 3 && val2[0] ==  5 && val3[0] == 4 && val4[0] == 2 && val5[0] == 1||
									val1[0] == 3 && val2[0] ==  5 && val3[0] == 4 && val4[0] == 1 && val5[0] == 2
									) {
								dice1 = (int)(Math.random()*6+1);
								dice2 = (int)(Math.random()*6+1);
								dice3 = (int)(Math.random()*6+1);
								dice4 = (int)(Math.random()*6+1);
								dice5 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);
							}

							// 4 1 2 3 5

							if(
									val1[0] == 4 && val2[0] ==  1 && val3[0] == 3 && val4[0] == 2 && val5[0] == 5|| 
									val1[0] == 4 && val2[0] ==  1 && val3[0] == 3 && val4[0] == 5 && val5[0] == 2|| 
									val1[0] == 4 && val2[0] ==  1 && val3[0] == 2 && val4[0] == 5 && val5[0] == 3|| 
									val1[0] == 4 && val2[0] ==  1 && val3[0] == 2 && val4[0] == 3 && val5[0] == 5|| 
									val1[0] == 4 && val2[0] ==  1 && val3[0] == 5 && val4[0] == 3 && val5[0] == 2|| 
									val1[0] == 4 && val2[0] ==  1 && val3[0] == 5 && val4[0] == 2 && val5[0] == 3||
									val1[0] == 4 && val2[0] ==  3 && val3[0] == 1 && val4[0] == 2 && val5[0] == 5||
									val1[0] == 4 && val2[0] ==  3 && val3[0] == 1 && val4[0] == 5 && val5[0] == 2||
									val1[0] == 4 && val2[0] ==  3 && val3[0] == 2 && val4[0] == 5 && val5[0] == 1||
									val1[0] == 4 && val2[0] ==  3 && val3[0] == 2 && val4[0] == 1 && val5[0] == 5||
									val1[0] == 4 && val2[0] ==  3 && val3[0] == 5 && val4[0] == 2 && val5[0] == 1||
									val1[0] == 4 && val2[0] ==  3 && val3[0] == 5 && val4[0] == 1 && val5[0] == 2||
									val1[0] == 4 && val2[0] ==  2 && val3[0] == 1 && val4[0] == 3 && val5[0] == 5||
									val1[0] == 4 && val2[0] ==  2 && val3[0] == 1 && val4[0] == 5 && val5[0] == 3||
									val1[0] == 4 && val2[0] ==  2 && val3[0] == 3 && val4[0] == 5 && val5[0] == 1||
									val1[0] == 4 && val2[0] ==  2 && val3[0] == 3 && val4[0] == 1 && val5[0] == 5||
									val1[0] == 4 && val2[0] ==  2 && val3[0] == 5 && val4[0] == 1 && val5[0] == 3||
									val1[0] == 4 && val2[0] ==  2 && val3[0] == 5 && val4[0] == 3 && val5[0] == 1||
									val1[0] == 4 && val2[0] ==  5 && val3[0] == 1 && val4[0] == 3 && val5[0] == 2||
									val1[0] == 4 && val2[0] ==  5 && val3[0] == 1 && val4[0] == 2 && val5[0] == 3||
									val1[0] == 4 && val2[0] ==  5 && val3[0] == 3 && val4[0] == 2 && val5[0] == 1||
									val1[0] == 4 && val2[0] ==  5 && val3[0] == 3 && val4[0] == 1 && val5[0] == 2||
									val1[0] == 4 && val2[0] ==  5 && val3[0] == 2 && val4[0] == 3 && val5[0] == 1||
									val1[0] == 4 && val2[0] ==  5 && val3[0] == 2 && val4[0] == 1 && val5[0] == 3
									) { 
								dice1 = (int)(Math.random()*6+1);
								dice2 = (int)(Math.random()*6+1);
								dice3 = (int)(Math.random()*6+1);
								dice4 = (int)(Math.random()*6+1);
								dice5 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);
							}

							// 5 1 2 3 4

							if(
									val1[0] == 5 && val2[0] ==  1 && val3[0] == 3 && val4[0] == 2 && val5[0] == 4|| 
									val1[0] == 5 && val2[0] ==  1 && val3[0] == 3 && val4[0] == 4 && val5[0] == 2|| 
									val1[0] == 5 && val2[0] ==  1 && val3[0] == 2 && val4[0] == 4 && val5[0] == 3|| 
									val1[0] == 5 && val2[0] ==  1 && val3[0] == 2 && val4[0] == 3 && val5[0] == 4|| 
									val1[0] == 5 && val2[0] ==  1 && val3[0] == 4 && val4[0] == 3 && val5[0] == 2|| 
									val1[0] == 5 && val2[0] ==  1 && val3[0] == 4 && val4[0] == 2 && val5[0] == 3||
									val1[0] == 5 && val2[0] ==  3 && val3[0] == 1 && val4[0] == 2 && val5[0] == 4||
									val1[0] == 5 && val2[0] ==  3 && val3[0] == 1 && val4[0] == 4 && val5[0] == 2||
									val1[0] == 5 && val2[0] ==  3 && val3[0] == 2 && val4[0] == 4 && val5[0] == 1||
									val1[0] == 5 && val2[0] ==  3 && val3[0] == 2 && val4[0] == 1 && val5[0] == 4||
									val1[0] == 5 && val2[0] ==  3 && val3[0] == 4 && val4[0] == 2 && val5[0] == 1||
									val1[0] == 5 && val2[0] ==  3 && val3[0] == 4 && val4[0] == 1 && val5[0] == 2||
									val1[0] == 5 && val2[0] ==  2 && val3[0] == 1 && val4[0] == 3 && val5[0] == 4||
									val1[0] == 5 && val2[0] ==  2 && val3[0] == 1 && val4[0] == 4 && val5[0] == 3||
									val1[0] == 5 && val2[0] ==  2 && val3[0] == 3 && val4[0] == 4 && val5[0] == 1||
									val1[0] == 5 && val2[0] ==  2 && val3[0] == 3 && val4[0] == 1 && val5[0] == 4||
									val1[0] == 5 && val2[0] ==  2 && val3[0] == 4 && val4[0] == 1 && val5[0] == 3||
									val1[0] == 5 && val2[0] ==  2 && val3[0] == 4 && val4[0] == 3 && val5[0] == 1||
									val1[0] == 5 && val2[0] ==  4 && val3[0] == 1 && val4[0] == 3 && val5[0] == 2||
									val1[0] == 5 && val2[0] ==  4 && val3[0] == 1 && val4[0] == 2 && val5[0] == 3||
									val1[0] == 5 && val2[0] ==  4 && val3[0] == 3 && val4[0] == 2 && val5[0] == 1||
									val1[0] == 5 && val2[0] ==  4 && val3[0] == 3 && val4[0] == 1 && val5[0] == 2||
									val1[0] == 5 && val2[0] ==  4 && val3[0] == 2 && val4[0] == 3 && val5[0] == 1||
									val1[0] == 5 && val2[0] ==  4 && val3[0] == 2 && val4[0] == 1 && val5[0] == 3
									) {
								dice1 = (int)(Math.random()*6+1);
								dice2 = (int)(Math.random()*6+1);
								dice3 = (int)(Math.random()*6+1);
								dice4 = (int)(Math.random()*6+1);
								dice5 = (int)(Math.random()*6+1);
								System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);
							}
						}
						System.out.println("Vill du slå igen? j/n");
						char slaom3 = input.next().charAt(0);
						if(slaom3 == 'j') {
							System.out.println("Hur många tärningar vill du slå om?");
							int slaom4 = input.nextInt();
							if(slaom4 >= 6) {
								System.out.println("Idiot, du har inte så många tärningar!");
							}
							else {



								if(slaom4 == 1) {
									System.out.println("Vilken vill du slå om?");
									val1[0] = input.nextInt();
									if(val1[0] == 1) {
										dice1 = (int)(Math.random()*6+1);
										System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);
									}
									if(val1[0] == 2) {
										dice2 = (int)(Math.random()*6+1);
										System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}
									if(val1[0] == 3) {
										dice3 = (int)(Math.random()*6+1);
										System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}
									if(val1[0] == 4) {
										dice4 = (int)(Math.random()*6+1);
										System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}
									if(val1[0] == 5) {
										dice5 = (int)(Math.random()*6+1);
										System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}
								}


								//OM DU VÄLJER ATT SLÅ OM 2 ST


								else if(slaom4 == 2){
									System.out.println("Vilka tärningar vill du slå om?");
									val1[0] = input.nextInt();
									val2[0] = input.nextInt();
									if(
											val1[0] == 1 && val2[0] == 2 || 
											val2[0] == 1 && val1[0] == 2) {
										dice1 = (int)(Math.random()*6+1);
										dice2 = (int)(Math.random()*6+1);
										System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}
									if(
											val1[0] == 1 && val2[0] == 3 || 
											val2[0] == 1 && val1[0] == 3) {
										dice1 = (int)(Math.random()*6+1);
										dice3 = (int)(Math.random()*6+1);
										System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}
									if(
											val1[0] == 1 && val2[0] == 4 || 
											val2[0] == 1 && val1[0] == 4) {
										dice1 = (int)(Math.random()*6+1);
										dice4 = (int)(Math.random()*6+1);
										System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}
									if(
											val1[0] == 1 && val2[0] == 5 || 
											val2[0] == 1 && val1[0] == 5) {
										dice1 = (int)(Math.random()*6+1);
										dice5 = (int)(Math.random()*6+1);
										System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}




									if(
											val1[0] == 2 && val2[0] == 3 || 
											val1[0] == 3 && val2[0] == 2) {
										dice2 = (int)(Math.random()*6+1);
										dice3 = (int)(Math.random()*6+1);
										System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}
									if(
											val1[0] == 2 && val2[0] == 4 || 
											val1[0] == 4 && val2[0] == 2) {
										dice2 = (int)(Math.random()*6+1);
										dice4 = (int)(Math.random()*6+1);
										System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}
									if(
											val1[0] == 2 && val2[0] == 5 ||
											val1[0] == 5 && val2[0] == 2) {
										dice2 = (int)(Math.random()*6+1);
										dice5 = (int)(Math.random()*6+1);
										System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}

									if(
											val1[0] == 3 && val2[0] == 4 || 
											val1[0] == 4 && val2[0] == 3) {
										dice3 = (int)(Math.random()*6+1);
										dice4 = (int)(Math.random()*6+1);
										System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}
									if(
											val1[0] == 3 && val2[0] == 5 || 
											val1[0] == 5 && val2[0] == 3) {
										dice3 = (int)(Math.random()*6+1);
										dice5 = (int)(Math.random()*6+1);
										System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}

									if(
											val1[0] == 4 && val2[0] == 5 || 
											val2[0] == 4 && val1[0] == 5) {
										dice4 = (int)(Math.random()*6+1);
										dice5 = (int)(Math.random()*6+1);
										System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}

								} 


								//OM DU VÄLJER ATT SLÅ OM 3 ST TÄRNINGAR


								else if(slaom4 == 3){
									System.out.println("Vilka tärningar vill du slå om?");
									val1[0] = input.nextInt();
									val2[0] = input.nextInt();
									val3[0] = input.nextInt();

									// 1 2 3

									if(
											val1[0] == 1 && val2[0] == 2 && val3[0] == 3 || 
											val1[0] == 2 && val2[0] == 3 && val3[0] == 1 || 
											val1[0] == 3 && val2[0] == 1 && val3[0] == 2 || 
											val1[0] == 3 && val2[0] == 2 && val3[0] == 1 || 
											val1[0] == 2 && val2[0] == 1 && val3[0] == 3 || 
											val1[0] == 1 && val2[0] == 3 && val3[0] == 2) {
										dice1 = (int)(Math.random()*6+1);
										dice2 = (int)(Math.random()*6+1);
										dice3 = (int)(Math.random()*6+1);
										System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}

									//1 2 4 

									if(
											val1[0] == 1 && val2[0] == 2 && val3[0] == 4|| 
											val1[0] == 2 && val2[0] == 4 && val3[0] == 1 || 
											val1[0] == 4 && val2[0] == 1 && val3[0] == 2 || 
											val1[0] == 4 && val2[0] == 2 && val3[0] == 1 || 
											val1[0] == 2 && val2[0] == 1 && val3[0] == 4 || 
											val1[0] == 1 && val2[0] == 4 && val3[0] == 2) {
										dice1 = (int)(Math.random()*6+1);
										dice2 = (int)(Math.random()*6+1);
										dice4 = (int)(Math.random()*6+1);
										System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}

									// 1 2 5 

									if(
											val1[0] == 1 && val2[0] == 2 && val3[0] == 5|| 
											val1[0] == 2 && val2[0] == 5 && val3[0] == 1 || 
											val1[0] == 5 && val2[0] == 1 && val3[0] == 2 || 
											val1[0] == 5 && val2[0] == 2 && val3[0] == 1 || 
											val1[0] == 2 && val2[0] == 1 && val3[0] == 5 || 
											val1[0] == 1 && val2[0] == 5 && val3[0] == 2) {
										dice1 = (int)(Math.random()*6+1);
										dice2 = (int)(Math.random()*6+1);
										dice5 = (int)(Math.random()*6+1);
										System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}

									// 1 3 4


									if(
											val1[0] == 1 && val2[0] == 3 && val3[0] == 4 || 
											val1[0] == 3 && val2[0] == 4 && val3[0] == 1 || 
											val1[0] == 4 && val2[0] == 1 && val3[0] == 3 || 
											val1[0] == 4 && val2[0] == 3 && val3[0] == 1 || 
											val1[0] == 3 && val2[0] == 1 && val3[0] == 4 || 
											val1[0] == 1 && val2[0] == 4 && val3[0] == 3) {
										dice1 = (int)(Math.random()*6+1);
										dice3 = (int)(Math.random()*6+1);
										dice4 = (int)(Math.random()*6+1);
										System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}

									//1 3 5

									if(
											val1[0] == 1 && val2[0] == 3 && val3[0] == 5 || 
											val1[0] == 3 && val2[0] == 5 && val3[0] == 1 ||
											val1[0] == 5 && val2[0] == 1 && val3[0] == 3 ||
											val1[0] == 5 && val2[0] == 3 && val3[0] == 1 ||
											val1[0] == 3 && val2[0] == 1 && val3[0] == 5 || 
											val1[0] == 1 && val2[0] == 5 && val3[0] == 3) {
										dice1 = (int)(Math.random()*6+1);
										dice2 = (int)(Math.random()*6+1);
										dice5 = (int)(Math.random()*6+1);
										System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);				}

									//1 4 5

									if(
											val1[0] == 1 && val2[0] == 4 && val3[0] == 5|| 
											val1[0] == 4 && val2[0] == 5 && val3[0] == 1 || 
											val1[0] == 5 && val2[0] == 1 && val3[0] == 4 || 
											val1[0] == 5 && val2[0] == 4 && val3[0] == 1 || 
											val1[0] == 4 && val2[0] == 1 && val3[0] == 5 || 
											val1[0] == 1 && val2[0] == 5 && val3[0] == 4) {
										dice1 = (int)(Math.random()*6+1);
										dice2 = (int)(Math.random()*6+1);
										dice5 = (int)(Math.random()*6+1);
										System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);
									}
								}


								//OM DU VÄLJER ATT SLÅ OM 4 ST TÄRNINGAR

								else if(slaom4 == 4){
									System.out.println("Vilka tärningar vill du slå om?");
									val1[0] = input.nextInt();
									val2[0] = input.nextInt();
									val3[0] = input.nextInt();
									val4[0] = input.nextInt();

									// 1 2 3 4

									if(
											val1[0] == 1 && val2[0] == 2 && val3[0] == 3 && val4[0] == 4|| 
											val1[0] == 1 && val2[0] == 2 && val3[0] == 4 && val4[0] == 3|| 
											val1[0] == 1 && val2[0] == 3 && val3[0] == 4 && val4[0] == 2|| 
											val1[0] == 1 && val2[0] == 3 && val3[0] == 2 && val4[0] == 4|| 
											val1[0] == 1 && val2[0] == 4 && val3[0] == 2 && val4[0] == 3|| 
											val1[0] == 1 && val2[0] == 4 && val3[0] == 3 && val4[0] == 2||
											val1[0] == 2 && val2[0] == 3 && val3[0] == 4 && val4[0] == 1||
											val1[0] == 2 && val2[0] == 3 && val3[0] == 1 && val4[0] == 4||
											val1[0] == 2 && val2[0] == 1 && val3[0] == 3 && val4[0] == 4||
											val1[0] == 2 && val2[0] == 1 && val3[0] == 4 && val4[0] == 3||
											val1[0] == 2 && val2[0] == 4 && val3[0] == 1 && val4[0] == 3||
											val1[0] == 2 && val2[0] == 4 && val3[0] == 3 && val4[0] == 1||
											val1[0] == 3 && val2[0] == 4 && val3[0] == 1 && val4[0] == 2||
											val1[0] == 3 && val2[0] == 4 && val3[0] == 2 && val4[0] == 1||
											val1[0] == 3 && val2[0] == 2 && val3[0] == 4 && val4[0] == 1||
											val1[0] == 3 && val2[0] == 2 && val3[0] == 1 && val4[0] == 4||
											val1[0] == 3 && val2[0] == 1 && val3[0] == 4 && val4[0] == 2||
											val1[0] == 3 && val2[0] == 1 && val3[0] == 2 && val4[0] == 4||
											val1[0] == 4 && val2[0] == 1 && val3[0] == 2 && val4[0] == 3||
											val1[0] == 4 && val2[0] == 1 && val3[0] == 3 && val4[0] == 2||
											val1[0] == 4 && val2[0] == 2 && val3[0] == 3 && val4[0] == 1||
											val1[0] == 4 && val2[0] == 2 && val3[0] == 1 && val4[0] == 3||
											val1[0] == 4 && val2[0] == 3 && val3[0] == 2 && val4[0] == 1||
											val1[0] == 4 && val2[0] == 3 && val3[0] == 1 && val4[0] == 2
											) {
										dice1 = (int)(Math.random()*6+1);
										dice2 = (int)(Math.random()*6+1);
										dice3 = (int)(Math.random()*6+1);
										dice4 = (int)(Math.random()*6+1);
										System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);
									}

									// 1 2 3 5

									if(
											val1[0] == 1 && val2[0] == 2 && val3[0] == 3 && val4[0] == 5|| 
											val1[0] == 1 && val2[0] == 2 && val3[0] == 5 && val4[0] == 3|| 
											val1[0] == 1 && val2[0] == 3 && val3[0] == 5 && val4[0] == 2|| 
											val1[0] == 1 && val2[0] == 3 && val3[0] == 2 && val4[0] == 5|| 
											val1[0] == 1 && val2[0] == 5 && val3[0] == 2 && val4[0] == 3|| 
											val1[0] == 1 && val2[0] == 5 && val3[0] == 3 && val4[0] == 2||
											val1[0] == 2 && val2[0] == 3 && val3[0] == 5 && val4[0] == 1||
											val1[0] == 2 && val2[0] == 3 && val3[0] == 1 && val4[0] == 5||
											val1[0] == 2 && val2[0] == 1 && val3[0] == 3 && val4[0] == 5||
											val1[0] == 2 && val2[0] == 1 && val3[0] == 5 && val4[0] == 3||
											val1[0] == 2 && val2[0] == 5 && val3[0] == 1 && val4[0] == 3||
											val1[0] == 2 && val2[0] == 5 && val3[0] == 3 && val4[0] == 1||
											val1[0] == 3 && val2[0] == 5 && val3[0] == 1 && val4[0] == 2||
											val1[0] == 3 && val2[0] == 5 && val3[0] == 2 && val4[0] == 1||
											val1[0] == 3 && val2[0] == 2 && val3[0] == 5 && val4[0] == 1||
											val1[0] == 3 && val2[0] == 2 && val3[0] == 1 && val4[0] == 5||
											val1[0] == 3 && val2[0] == 1 && val3[0] == 5 && val4[0] == 2||
											val1[0] == 3 && val2[0] == 1 && val3[0] == 2 && val4[0] == 5||
											val1[0] == 5 && val2[0] == 1 && val3[0] == 2 && val4[0] == 3||
											val1[0] == 5 && val2[0] == 1 && val3[0] == 3 && val4[0] == 2||
											val1[0] == 5 && val2[0] == 2 && val3[0] == 3 && val4[0] == 1||
											val1[0] == 5 && val2[0] == 2 && val3[0] == 1 && val4[0] == 3||
											val1[0] == 5 && val2[0] == 3 && val3[0] == 2 && val4[0] == 1||
											val1[0] == 5 && val2[0] == 3 && val3[0] == 1 && val4[0] == 2
											) {
										dice1 = (int)(Math.random()*6+1);
										dice2 = (int)(Math.random()*6+1);
										dice3 = (int)(Math.random()*6+1);
										dice5 = (int)(Math.random()*6+1);
										System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 5: " + dice5);
									}

									// 1 2 4 5

									if(
											val1[0] == 1 && val2[0] == 2 && val3[0] == 4 && val4[0] == 5|| 
											val1[0] == 1 && val2[0] == 2 && val3[0] == 5 && val4[0] == 4|| 
											val1[0] == 1 && val2[0] == 4 && val3[0] == 5 && val4[0] == 2|| 
											val1[0] == 1 && val2[0] == 4 && val3[0] == 2 && val4[0] == 5|| 
											val1[0] == 1 && val2[0] == 5 && val3[0] == 2 && val4[0] == 4|| 
											val1[0] == 1 && val2[0] == 5 && val3[0] == 4 && val4[0] == 2||
											val1[0] == 2 && val2[0] == 4 && val3[0] == 5 && val4[0] == 1||
											val1[0] == 2 && val2[0] == 4 && val3[0] == 1 && val4[0] == 5||
											val1[0] == 2 && val2[0] == 1 && val3[0] == 4 && val4[0] == 5||
											val1[0] == 2 && val2[0] == 1 && val3[0] == 5 && val4[0] == 4||
											val1[0] == 2 && val2[0] == 5 && val3[0] == 1 && val4[0] == 4||
											val1[0] == 2 && val2[0] == 5 && val3[0] == 4 && val4[0] == 1||
											val1[0] == 4 && val2[0] == 5 && val3[0] == 1 && val4[0] == 2||
											val1[0] == 4 && val2[0] == 5 && val3[0] == 2 && val4[0] == 1||
											val1[0] == 4 && val2[0] == 2 && val3[0] == 5 && val4[0] == 1||
											val1[0] == 4 && val2[0] == 2 && val3[0] == 1 && val4[0] == 5||
											val1[0] == 4 && val2[0] == 1 && val3[0] == 5 && val4[0] == 2||
											val1[0] == 4 && val2[0] == 1 && val3[0] == 2 && val4[0] == 5||
											val1[0] == 5 && val2[0] == 1 && val3[0] == 2 && val4[0] == 4||
											val1[0] == 5 && val2[0] == 1 && val3[0] == 4 && val4[0] == 2||
											val1[0] == 5 && val2[0] == 2 && val3[0] == 4 && val4[0] == 1||
											val1[0] == 5 && val2[0] == 2 && val3[0] == 1 && val4[0] == 4||
											val1[0] == 5 && val2[0] == 4 && val3[0] == 2 && val4[0] == 1||
											val1[0] == 5 && val2[0] == 4 && val3[0] == 1 && val4[0] == 2
											) {
										dice1 = (int)(Math.random()*6+1);
										dice2 = (int)(Math.random()*6+1);
										dice4 = (int)(Math.random()*6+1);
										dice5 = (int)(Math.random()*6+1);
										System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 4: " + dice4+ "\nTärning 5: " + dice5);
									}

									// 1 3 4 5


									if(
											val1[0] == 1 && val2[0] == 3 && val3[0] == 4 && val4[0] == 5|| 
											val1[0] == 1 && val2[0] == 3 && val3[0] == 5 && val4[0] == 4|| 
											val1[0] == 1 && val2[0] == 4 && val3[0] == 5 && val4[0] == 3|| 
											val1[0] == 1 && val2[0] == 4 && val3[0] == 3 && val4[0] == 5|| 
											val1[0] == 1 && val2[0] == 5 && val3[0] == 3 && val4[0] == 4|| 
											val1[0] == 1 && val2[0] == 5 && val3[0] == 4 && val4[0] == 3||
											val1[0] == 3 && val2[0] == 4 && val3[0] == 5 && val4[0] == 1||
											val1[0] == 3 && val2[0] == 4 && val3[0] == 1 && val4[0] == 5||
											val1[0] == 3 && val2[0] == 1 && val3[0] == 4 && val4[0] == 5||
											val1[0] == 3 && val2[0] == 1 && val3[0] == 5 && val4[0] == 4||
											val1[0] == 3 && val2[0] == 5 && val3[0] == 1 && val4[0] == 4||
											val1[0] == 3 && val2[0] == 5 && val3[0] == 4 && val4[0] == 1||
											val1[0] == 4 && val2[0] == 5 && val3[0] == 1 && val4[0] == 3||
											val1[0] == 4 && val2[0] == 5 && val3[0] == 3 && val4[0] == 1||
											val1[0] == 4 && val2[0] == 3 && val3[0] == 5 && val4[0] == 1||
											val1[0] == 4 && val2[0] == 3 && val3[0] == 1 && val4[0] == 5||
											val1[0] == 4 && val2[0] == 1 && val3[0] == 5 && val4[0] == 3||
											val1[0] == 4 && val2[0] == 1 && val3[0] == 3 && val4[0] == 5||
											val1[0] == 5 && val2[0] == 1 && val3[0] == 3 && val4[0] == 4||
											val1[0] == 5 && val2[0] == 1 && val3[0] == 4 && val4[0] == 3||
											val1[0] == 5 && val2[0] == 3 && val3[0] == 4 && val4[0] == 1||
											val1[0] == 5 && val2[0] == 3 && val3[0] == 1 && val4[0] == 4||
											val1[0] == 5 && val2[0] == 4 && val3[0] == 3 && val4[0] == 1||
											val1[0] == 5 && val2[0] == 4 && val3[0] == 1 && val4[0] == 3
											) {
										dice1 = (int)(Math.random()*6+1);
										dice3 = (int)(Math.random()*6+1);
										dice4 = (int)(Math.random()*6+1);
										dice5 = (int)(Math.random()*6+1);
										System.out.println("Tärning 1: " + dice1 + "\nTärning 3: " + dice3 + "\nTärning 4: " + dice4+ "\nTärning 5: " + dice5);
									}

									// 2 3 4 5

									if(
											val1[0] == 2 && val2[0] == 3 && val3[0] == 4 && val4[0] == 5|| 
											val1[0] == 2 && val2[0] == 3 && val3[0] == 5 && val4[0] == 4|| 
											val1[0] == 2 && val2[0] == 4 && val3[0] == 5 && val4[0] == 3|| 
											val1[0] == 2 && val2[0] == 4 && val3[0] == 3 && val4[0] == 5|| 
											val1[0] == 2 && val2[0] == 5 && val3[0] == 3 && val4[0] == 4|| 
											val1[0] == 2 && val2[0] == 5 && val3[0] == 4 && val4[0] == 3||
											val1[0] == 3 && val2[0] == 4 && val3[0] == 5 && val4[0] == 2||
											val1[0] == 3 && val2[0] == 4 && val3[0] == 2 && val4[0] == 5||
											val1[0] == 3 && val2[0] == 2 && val3[0] == 4 && val4[0] == 5||
											val1[0] == 3 && val2[0] == 2 && val3[0] == 5 && val4[0] == 4||
											val1[0] == 3 && val2[0] == 5 && val3[0] == 2 && val4[0] == 4||
											val1[0] == 3 && val2[0] == 5 && val3[0] == 4 && val4[0] == 2||
											val1[0] == 4 && val2[0] == 5 && val3[0] == 2 && val4[0] == 3||
											val1[0] == 4 && val2[0] == 5 && val3[0] == 3 && val4[0] == 2||
											val1[0] == 4 && val2[0] == 3 && val3[0] == 5 && val4[0] == 2||
											val1[0] == 4 && val2[0] == 3 && val3[0] == 2 && val4[0] == 5||
											val1[0] == 4 && val2[0] == 2 && val3[0] == 5 && val4[0] == 3||
											val1[0] == 4 && val2[0] == 2 && val3[0] == 3 && val4[0] == 5||
											val1[0] == 5 && val2[0] == 2 && val3[0] == 3 && val4[0] == 4||
											val1[0] == 5 && val2[0] == 2 && val3[0] == 4 && val4[0] == 3||
											val1[0] == 5 && val2[0] == 3 && val3[0] == 4 && val4[0] == 2||
											val1[0] == 5 && val2[0] == 3 && val3[0] == 2 && val4[0] == 4||
											val1[0] == 5 && val2[0] == 4 && val3[0] == 3 && val4[0] == 2||
											val1[0] == 5 && val2[0] == 4 && val3[0] == 2 && val4[0] == 3
											) {
										dice2 = (int)(Math.random()*6+1);
										dice3 = (int)(Math.random()*6+1);
										dice4 = (int)(Math.random()*6+1);
										dice5 = (int)(Math.random()*6+1);
										System.out.println("Tärning 2: " + dice2 + "\nTärning 3: " + dice3 + "\nTärning 4: " + dice4+ "\nTärning 5: " + dice5);
									}
								}

								//OM DU VÄLJER ATT RULLA OM 5 ST TÄRNINGAR

								else if(slaom4 == 5){
									System.out.println("Vilka tärningar vill du slå om?");
									val1[0] = input.nextInt();
									val2[0] = input.nextInt();
									val3[0] = input.nextInt();
									val4[0] = input.nextInt();
									val5[0] = input.nextInt();


									// 1 2 3 4 5

									if(
											val1[0] == 1 && val2[0] ==  2 && val3[0] == 3 && val4[0] == 4 && val5[0] == 5|| 
											val1[0] == 1 && val2[0] ==  2 && val3[0] == 3 && val4[0] == 5 && val5[0] == 4|| 
											val1[0] == 1 && val2[0] ==  2 && val3[0] == 4 && val4[0] == 5 && val5[0] == 3|| 
											val1[0] == 1 && val2[0] ==  2 && val3[0] == 4 && val4[0] == 3 && val5[0] == 5|| 
											val1[0] == 1 && val2[0] ==  2 && val3[0] == 5 && val4[0] == 3 && val5[0] == 4|| 
											val1[0] == 1 && val2[0] ==  2 && val3[0] == 5 && val4[0] == 4 && val5[0] == 3||
											val1[0] == 1 && val2[0] ==  3 && val3[0] == 2 && val4[0] == 4 && val5[0] == 5||
											val1[0] == 1 && val2[0] ==  3 && val3[0] == 2 && val4[0] == 5 && val5[0] == 4||
											val1[0] == 1 && val2[0] ==  3 && val3[0] == 4 && val4[0] == 5 && val5[0] == 2||
											val1[0] == 1 && val2[0] ==  3 && val3[0] == 4 && val4[0] == 2 && val5[0] == 5||
											val1[0] == 1 && val2[0] ==  3 && val3[0] == 5 && val4[0] == 4 && val5[0] == 2||
											val1[0] == 1 && val2[0] ==  3 && val3[0] == 5 && val4[0] == 2 && val5[0] == 4||
											val1[0] == 1 && val2[0] ==  4 && val3[0] == 2 && val4[0] == 3 && val5[0] == 5||
											val1[0] == 1 && val2[0] ==  4 && val3[0] == 2 && val4[0] == 5 && val5[0] == 3||
											val1[0] == 1 && val2[0] ==  4 && val3[0] == 3 && val4[0] == 5 && val5[0] == 2||
											val1[0] == 1 && val2[0] ==  4 && val3[0] == 3 && val4[0] == 2 && val5[0] == 5||
											val1[0] == 1 && val2[0] ==  4 && val3[0] == 5 && val4[0] == 2 && val5[0] == 3||
											val1[0] == 1 && val2[0] ==  4 && val3[0] == 5 && val4[0] == 3 && val5[0] == 2||
											val1[0] == 1 && val2[0] ==  5 && val3[0] == 2 && val4[0] == 3 && val5[0] == 4||
											val1[0] == 1 && val2[0] ==  5 && val3[0] == 2 && val4[0] == 4 && val5[0] == 3||
											val1[0] == 1 && val2[0] ==  5 && val3[0] == 3 && val4[0] == 4 && val5[0] == 2||
											val1[0] == 1 && val2[0] ==  5 && val3[0] == 3 && val4[0] == 2 && val5[0] == 4||
											val1[0] == 1 && val2[0] ==  5 && val3[0] == 4 && val4[0] == 3 && val5[0] == 2||
											val1[0] == 1 && val2[0] ==  5 && val3[0] == 4 && val4[0] == 2 && val5[0] == 3
											) {
										dice1 = (int)(Math.random()*6+1);
										dice2 = (int)(Math.random()*6+1);
										dice3 = (int)(Math.random()*6+1);
										dice4 = (int)(Math.random()*6+1);
										dice5 = (int)(Math.random()*6+1);
										System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);
									}

									// 2 1 3 4 5

									if(
											val1[0] == 2 && val2[0] ==  1 && val3[0] == 3 && val4[0] == 4 && val5[0] == 5|| 
											val1[0] == 2 && val2[0] ==  1 && val3[0] == 3 && val4[0] == 5 && val5[0] == 4|| 
											val1[0] == 2 && val2[0] ==  1 && val3[0] == 4 && val4[0] == 5 && val5[0] == 3|| 
											val1[0] == 2 && val2[0] ==  1 && val3[0] == 4 && val4[0] == 3 && val5[0] == 5|| 
											val1[0] == 2 && val2[0] ==  1 && val3[0] == 5 && val4[0] == 3 && val5[0] == 4|| 
											val1[0] == 2 && val2[0] ==  1 && val3[0] == 5 && val4[0] == 4 && val5[0] == 3||
											val1[0] == 2 && val2[0] ==  3 && val3[0] == 1 && val4[0] == 4 && val5[0] == 5||
											val1[0] == 2 && val2[0] ==  3 && val3[0] == 1 && val4[0] == 5 && val5[0] == 4||
											val1[0] == 2 && val2[0] ==  3 && val3[0] == 4 && val4[0] == 5 && val5[0] == 1||
											val1[0] == 2 && val2[0] ==  3 && val3[0] == 4 && val4[0] == 1 && val5[0] == 5||
											val1[0] == 2 && val2[0] ==  3 && val3[0] == 5 && val4[0] == 4 && val5[0] == 1||
											val1[0] == 2 && val2[0] ==  3 && val3[0] == 5 && val4[0] == 1 && val5[0] == 4||
											val1[0] == 2 && val2[0] ==  4 && val3[0] == 1 && val4[0] == 3 && val5[0] == 5||
											val1[0] == 2 && val2[0] ==  4 && val3[0] == 1 && val4[0] == 5 && val5[0] == 3||
											val1[0] == 2 && val2[0] ==  4 && val3[0] == 3 && val4[0] == 5 && val5[0] == 1||
											val1[0] == 2 && val2[0] ==  4 && val3[0] == 3 && val4[0] == 1 && val5[0] == 5||
											val1[0] == 2 && val2[0] ==  4 && val3[0] == 5 && val4[0] == 1 && val5[0] == 3||
											val1[0] == 2 && val2[0] ==  4 && val3[0] == 5 && val4[0] == 3 && val5[0] == 1||
											val1[0] == 2 && val2[0] ==  5 && val3[0] == 1 && val4[0] == 3 && val5[0] == 4||
											val1[0] == 2 && val2[0] ==  5 && val3[0] == 1 && val4[0] == 4 && val5[0] == 3||
											val1[0] == 2 && val2[0] ==  5 && val3[0] == 3 && val4[0] == 4 && val5[0] == 1||
											val1[0] == 2 && val2[0] ==  5 && val3[0] == 3 && val4[0] == 1 && val5[0] == 4||
											val1[0] == 2 && val2[0] ==  5 && val3[0] == 4 && val4[0] == 3 && val5[0] == 1||
											val1[0] == 2 && val2[0] ==  5 && val3[0] == 4 && val4[0] == 1 && val5[0] == 3
											) {
										dice1 = (int)(Math.random()*6+1);
										dice2 = (int)(Math.random()*6+1);
										dice3 = (int)(Math.random()*6+1);
										dice4 = (int)(Math.random()*6+1);
										dice5 = (int)(Math.random()*6+1);
										System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);
									}

									// 3 1 2 4 5

									if(
											val1[0] == 3 && val2[0] ==  1 && val3[0] == 2 && val4[0] == 4 && val5[0] == 5|| 
											val1[0] == 3 && val2[0] ==  1 && val3[0] == 2 && val4[0] == 5 && val5[0] == 4|| 
											val1[0] == 3 && val2[0] ==  1 && val3[0] == 4 && val4[0] == 5 && val5[0] == 2|| 
											val1[0] == 3 && val2[0] ==  1 && val3[0] == 4 && val4[0] == 2 && val5[0] == 5|| 
											val1[0] == 3 && val2[0] ==  1 && val3[0] == 5 && val4[0] == 2 && val5[0] == 4|| 
											val1[0] == 3 && val2[0] ==  1 && val3[0] == 5 && val4[0] == 4 && val5[0] == 2||
											val1[0] == 3 && val2[0] ==  2 && val3[0] == 1 && val4[0] == 4 && val5[0] == 5||
											val1[0] == 3 && val2[0] ==  2 && val3[0] == 1 && val4[0] == 5 && val5[0] == 4||
											val1[0] == 3 && val2[0] ==  2 && val3[0] == 4 && val4[0] == 5 && val5[0] == 1||
											val1[0] == 3 && val2[0] ==  2 && val3[0] == 4 && val4[0] == 1 && val5[0] == 5||
											val1[0] == 3 && val2[0] ==  2 && val3[0] == 5 && val4[0] == 4 && val5[0] == 1||
											val1[0] == 3 && val2[0] ==  2 && val3[0] == 5 && val4[0] == 1 && val5[0] == 4||
											val1[0] == 3 && val2[0] ==  4 && val3[0] == 1 && val4[0] == 2 && val5[0] == 5||
											val1[0] == 3 && val2[0] ==  4 && val3[0] == 1 && val4[0] == 5 && val5[0] == 2||
											val1[0] == 3 && val2[0] ==  4 && val3[0] == 2 && val4[0] == 5 && val5[0] == 1||
											val1[0] == 3 && val2[0] ==  4 && val3[0] == 2 && val4[0] == 1 && val5[0] == 5||
											val1[0] == 3 && val2[0] ==  4 && val3[0] == 5 && val4[0] == 1 && val5[0] == 2||
											val1[0] == 3 && val2[0] ==  4 && val3[0] == 5 && val4[0] == 2 && val5[0] == 1||
											val1[0] == 3 && val2[0] ==  5 && val3[0] == 1 && val4[0] == 2 && val5[0] == 4||
											val1[0] == 3 && val2[0] ==  5 && val3[0] == 1 && val4[0] == 4 && val5[0] == 2||
											val1[0] == 3 && val2[0] ==  5 && val3[0] == 2 && val4[0] == 4 && val5[0] == 1||
											val1[0] == 3 && val2[0] ==  5 && val3[0] == 2 && val4[0] == 1 && val5[0] == 4||
											val1[0] == 3 && val2[0] ==  5 && val3[0] == 4 && val4[0] == 2 && val5[0] == 1||
											val1[0] == 3 && val2[0] ==  5 && val3[0] == 4 && val4[0] == 1 && val5[0] == 2
											) {
										dice1 = (int)(Math.random()*6+1);
										dice2 = (int)(Math.random()*6+1);
										dice3 = (int)(Math.random()*6+1);
										dice4 = (int)(Math.random()*6+1);
										dice5 = (int)(Math.random()*6+1);
										System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);
									}

									// 4 1 2 3 5

									if(
											val1[0] == 4 && val2[0] ==  1 && val3[0] == 3 && val4[0] == 2 && val5[0] == 5|| 
											val1[0] == 4 && val2[0] ==  1 && val3[0] == 3 && val4[0] == 5 && val5[0] == 2|| 
											val1[0] == 4 && val2[0] ==  1 && val3[0] == 2 && val4[0] == 5 && val5[0] == 3|| 
											val1[0] == 4 && val2[0] ==  1 && val3[0] == 2 && val4[0] == 3 && val5[0] == 5|| 
											val1[0] == 4 && val2[0] ==  1 && val3[0] == 5 && val4[0] == 3 && val5[0] == 2|| 
											val1[0] == 4 && val2[0] ==  1 && val3[0] == 5 && val4[0] == 2 && val5[0] == 3||
											val1[0] == 4 && val2[0] ==  3 && val3[0] == 1 && val4[0] == 2 && val5[0] == 5||
											val1[0] == 4 && val2[0] ==  3 && val3[0] == 1 && val4[0] == 5 && val5[0] == 2||
											val1[0] == 4 && val2[0] ==  3 && val3[0] == 2 && val4[0] == 5 && val5[0] == 1||
											val1[0] == 4 && val2[0] ==  3 && val3[0] == 2 && val4[0] == 1 && val5[0] == 5||
											val1[0] == 4 && val2[0] ==  3 && val3[0] == 5 && val4[0] == 2 && val5[0] == 1||
											val1[0] == 4 && val2[0] ==  3 && val3[0] == 5 && val4[0] == 1 && val5[0] == 2||
											val1[0] == 4 && val2[0] ==  2 && val3[0] == 1 && val4[0] == 3 && val5[0] == 5||
											val1[0] == 4 && val2[0] ==  2 && val3[0] == 1 && val4[0] == 5 && val5[0] == 3||
											val1[0] == 4 && val2[0] ==  2 && val3[0] == 3 && val4[0] == 5 && val5[0] == 1||
											val1[0] == 4 && val2[0] ==  2 && val3[0] == 3 && val4[0] == 1 && val5[0] == 5||
											val1[0] == 4 && val2[0] ==  2 && val3[0] == 5 && val4[0] == 1 && val5[0] == 3||
											val1[0] == 4 && val2[0] ==  2 && val3[0] == 5 && val4[0] == 3 && val5[0] == 1||
											val1[0] == 4 && val2[0] ==  5 && val3[0] == 1 && val4[0] == 3 && val5[0] == 2||
											val1[0] == 4 && val2[0] ==  5 && val3[0] == 1 && val4[0] == 2 && val5[0] == 3||
											val1[0] == 4 && val2[0] ==  5 && val3[0] == 3 && val4[0] == 2 && val5[0] == 1||
											val1[0] == 4 && val2[0] ==  5 && val3[0] == 3 && val4[0] == 1 && val5[0] == 2||
											val1[0] == 4 && val2[0] ==  5 && val3[0] == 2 && val4[0] == 3 && val5[0] == 1||
											val1[0] == 4 && val2[0] ==  5 && val3[0] == 2 && val4[0] == 1 && val5[0] == 3
											) { 
										dice1 = (int)(Math.random()*6+1);
										dice2 = (int)(Math.random()*6+1);
										dice3 = (int)(Math.random()*6+1);
										dice4 = (int)(Math.random()*6+1);
										dice5 = (int)(Math.random()*6+1);
										System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);
									}

									// 5 1 2 3 4

									if(
											val1[0] == 5 && val2[0] ==  1 && val3[0] == 3 && val4[0] == 2 && val5[0] == 4|| 
											val1[0] == 5 && val2[0] ==  1 && val3[0] == 3 && val4[0] == 4 && val5[0] == 2|| 
											val1[0] == 5 && val2[0] ==  1 && val3[0] == 2 && val4[0] == 4 && val5[0] == 3|| 
											val1[0] == 5 && val2[0] ==  1 && val3[0] == 2 && val4[0] == 3 && val5[0] == 4|| 
											val1[0] == 5 && val2[0] ==  1 && val3[0] == 4 && val4[0] == 3 && val5[0] == 2|| 
											val1[0] == 5 && val2[0] ==  1 && val3[0] == 4 && val4[0] == 2 && val5[0] == 3||
											val1[0] == 5 && val2[0] ==  3 && val3[0] == 1 && val4[0] == 2 && val5[0] == 4||
											val1[0] == 5 && val2[0] ==  3 && val3[0] == 1 && val4[0] == 4 && val5[0] == 2||
											val1[0] == 5 && val2[0] ==  3 && val3[0] == 2 && val4[0] == 4 && val5[0] == 1||
											val1[0] == 5 && val2[0] ==  3 && val3[0] == 2 && val4[0] == 1 && val5[0] == 4||
											val1[0] == 5 && val2[0] ==  3 && val3[0] == 4 && val4[0] == 2 && val5[0] == 1||
											val1[0] == 5 && val2[0] ==  3 && val3[0] == 4 && val4[0] == 1 && val5[0] == 2||
											val1[0] == 5 && val2[0] ==  2 && val3[0] == 1 && val4[0] == 3 && val5[0] == 4||
											val1[0] == 5 && val2[0] ==  2 && val3[0] == 1 && val4[0] == 4 && val5[0] == 3||
											val1[0] == 5 && val2[0] ==  2 && val3[0] == 3 && val4[0] == 4 && val5[0] == 1||
											val1[0] == 5 && val2[0] ==  2 && val3[0] == 3 && val4[0] == 1 && val5[0] == 4||
											val1[0] == 5 && val2[0] ==  2 && val3[0] == 4 && val4[0] == 1 && val5[0] == 3||
											val1[0] == 5 && val2[0] ==  2 && val3[0] == 4 && val4[0] == 3 && val5[0] == 1||
											val1[0] == 5 && val2[0] ==  4 && val3[0] == 1 && val4[0] == 3 && val5[0] == 2||
											val1[0] == 5 && val2[0] ==  4 && val3[0] == 1 && val4[0] == 2 && val5[0] == 3||
											val1[0] == 5 && val2[0] ==  4 && val3[0] == 3 && val4[0] == 2 && val5[0] == 1||
											val1[0] == 5 && val2[0] ==  4 && val3[0] == 3 && val4[0] == 1 && val5[0] == 2||
											val1[0] == 5 && val2[0] ==  4 && val3[0] == 2 && val4[0] == 3 && val5[0] == 1||
											val1[0] == 5 && val2[0] ==  4 && val3[0] == 2 && val4[0] == 1 && val5[0] == 3
											) {
										dice1 = (int)(Math.random()*6+1);
										dice2 = (int)(Math.random()*6+1);
										dice3 = (int)(Math.random()*6+1);
										dice4 = (int)(Math.random()*6+1);
										dice5 = (int)(Math.random()*6+1);
										System.out.println("Tärning 1: " + dice1 + "\nTärning 2: " + dice2 + "\nTärning 3: " + dice3+ "\nTärning 4: " + dice4 + "\nTärning 5: " + dice5);
									}
								}
							}
						}
					} 
				}
				else {
					
				}
				if(spelare == 1) {
					System.out.println("Vill du spela mer? j/n");
					char mer = input.next().charAt(0);
					if(mer == 'n') {
						break;
					}
				}
				else if(spelare == 2 && count1 == 1 && count2 == 0) {

						System.out.println("Spelare 1. Skriv in F för att spela");
						char nästa = input.next().charAt(0);
						count1 = 0;
						count2 = 1;
				}
					

					else if(spelare == 2 && count1 == 1 && count2 == 1) {


						System.out.println("Spelare 2. Skriv in F för att spela");

						char nästa = input.next().charAt(0);
					
					count1 = 0;
					count2 = 0;
					}
				

				else if( spelare == 3) {
					if(count1 == 1) {


						System.out.println("Spelare 2. Skriv in ett tecken för att spela");

						char nästa = input.next().charAt(0);
					}
					else if(count1 == 2 && count2 ==1) {
						System.out.println("Spelare 3. Skriv in ett tecken för att spela");

						char nästa = input.next().charAt(0);
						count1 = 0;
						count2 = 0;
					}
					else if(count1 == 1 && count2 == 0) {
						System.out.println("Spelare 1. Skriv in F för att spela");

						char nästa = input.next().charAt(0);
						count1 = 0;
						count2 = 1;
						
					}

				}


				else if(spelare == 4 && count1 == 1 && count2 ==1) {
					System.out.println("Spelare 2. Skriv in F för att spela");

					char nästa = input.next().charAt(0);
				}
				else if(spelare == 4 && count1 == 2 && count2 ==1) {
					System.out.println("Spelare 3. Skriv in F för att spela");

					char nästa = input.next().charAt(0);
				}
				else if(spelare == 4 && count1 == 3 && count2 ==1) {
					System.out.println("Spelare 4. Skriv in F för att spela");

					char nästa = input.next().charAt(0);
					count1 = 0;
					count2 = 0;
				}
				else if(spelare == 4 && count1 == 1 && count2 == 0) {
					System.out.println("Spelare 1. Skriv in F för att spela");

					char nästa = input.next().charAt(0);
					count1 = 0;
					count2 = 1;
				}


				else if(spelare == 5 && count1 == 1 && count2 ==1) {
					System.out.println("Spelare 2. Skriv in F för att spela");

					char nästa = input.next().charAt(0);
				}
				else if(spelare == 5 && count1 == 2 && count2 ==1) {
					System.out.println("Spelare 3. Skriv in F för att spela");

					char nästa = input.next().charAt(0);
				}
				else if(spelare == 5 && count1 == 3 && count2 ==1) {
					System.out.println("Spelare 4. Skriv in F för att spela");

					char nästa = input.next().charAt(0);
				}
				else if(spelare == 5 && count1 == 4 && count2 ==1) {
					System.out.println("Spelare 5. Skriv in F för att spela");

					char nästa = input.next().charAt(0);
					count1 = 0;
					count2 = 0;
				}
				else if(spelare == 5 && count1 == 1 && count2 == 0) {
					System.out.println("Spelare 1. Skriv in F för att spela");

					char nästa = input.next().charAt(0);
					count1 = 0;
					count2 = 1;
				}






			}while(count < 0);
		}while(count1 < 18);

	}

}





