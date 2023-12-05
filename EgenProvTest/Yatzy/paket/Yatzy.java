package paket;

import java.util.Scanner;

public class Yatzy {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Variabler
		int dice1;
		int dice2;
		int dice3;
		int dice4;
		int dice5;
		boolean run = true;
		boolean igen = true;
		char sla;
		int []count2 = new int[100];
		char fortsatt;
		int count = -1; 
		int []val = new int[100];
		int val1[] = new int[100];
		int val2[] = new int[100];
		int val3[] = new int[100];
		int val4[] = new int[100];
		char svar;
		char svar2;
		char svar3;
		char behåll1;



		do {
			count++;
			dice1 = (int)(Math.random()*6+1);
			dice2 = (int)(Math.random()*6+1);
			dice3 = (int)(Math.random()*6+1);
			dice4 = (int)(Math.random()*6+1);
			dice5 = (int)(Math.random()*6+1);
			System.out.println("Tärning 1:" + dice1);
			System.out.println("Tärning 2:" + dice2);
			System.out.println("Tärning 3:" + dice3);
			System.out.println("Tärning 4:" + dice4);
			System.out.println("Tärning 5:" + dice5);


			/*System.out.println("Vill du behålla tärningar? j/n");
			behåll1 = input.next().charAt(0);
			if(behåll1 == 'j') { 

			

			*/
			System.out.println("Vilken tärning vill du behålla?");
			val[0] = input.nextInt();
			//}

			//VAL1					nr1

			switch(val[0]){

			case 1: System.out.println("Du sparade tärning 1");
			val[count] = dice1;
			//i++;
			System.out.println("Vill du behålla fler tärningar?");
			svar2 = input.next().charAt(0);
			if (svar2 == 'n') {
				break;
			} 
			else {

				System.out.println("Vilken tärning vill du behålla?");
				val1[0] = input.nextInt();

				//VAL2

				switch(val1[0]) {
				case 1: System.out.println("Du sparade tärning 1");
				val1[count] = dice1;
				System.out.println("Vill du behålla fler tärningar?");
				svar2 = input.next().charAt(0);
				if (svar2 == 'n') {
					break;
				} 
				else {

					System.out.println("Vilken tärning vill du behålla?");
					val2[0] = input.nextInt();

					//VAL3

					switch(val2[0]) {

					case 1: System.out.println("Du sparade tärning 1");
					val2[count] = dice1;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();

						//VAL4

						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;

					case 2: System.out.println("Du sparade tärning 2");
					val2[count] = dice2;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;

					case 3: System.out.println("Du sparade tärning 3");
					val2[count] = dice3;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;

					case 4: System.out.println("Du sparade tärning 4");
					val2[count] = dice4;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;

					case 5: System.out.println("Du sparade tärning 5");
					val2[count] = dice5;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					}

				}


				break;

				//VAL2

				case 2: System.out.println("Du sparade tärning 2");
				val1[count] = dice2;
				System.out.println("Vill du behålla fler tärningar?");
				svar2 = input.next().charAt(0);
				if (svar2 == 'n') {
					break;
				} 
				else {

					System.out.println("Vilken tärning vill du behålla?");
					val2[0] = input.nextInt();

					//VAL3

					switch(val2[0]) {
					case 1: System.out.println("Du sparade tärning 1");
					val2[count] = dice1;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();

						//VAL4

						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 2: System.out.println("Du sparade tärning 2");
					val2[count] = dice2;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 3: System.out.println("Du sparade tärning 3");
					val2[count] = dice3;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 4: System.out.println("Du sparade tärning 4");
					val2[count] = dice4;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 5: System.out.println("Du sparade tärning 5");
					val2[count] = dice5;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					}

				}
				break;

				case 3: System.out.println("Du sparade tärning 3");
				val1[count] = dice3;

				//VAL2

				System.out.println("Vill du behålla fler tärningar?");
				svar2 = input.next().charAt(0);
				if (svar2 == 'n') {
					break;
				} 
				else {

					System.out.println("Vilken tärning vill du behålla?");
					val2[0] = input.nextInt();

					//VAL3

					switch(val2[0]) {
					case 1: System.out.println("Du sparade tärning 1");
					val2[count] = dice1;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 2: System.out.println("Du sparade tärning 2");
					val2[count] = dice2;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 3: System.out.println("Du sparade tärning 3");
					val2[count] = dice3;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 4: System.out.println("Du sparade tärning 4");
					val2[count] = dice4;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 5: System.out.println("Du sparade tärning 5");
					val2[count] = dice5;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					}

				}
				break;

				case 4: System.out.println("Du sparade tärning 4");
				val1[count] = dice4;

				//VAL2

				System.out.println("Vill du behålla fler tärningar?");
				svar2 = input.next().charAt(0);
				if (svar2 == 'n') {
					break;
				} 
				else {

					System.out.println("Vilken tärning vill du behålla?");
					val2[0] = input.nextInt();

					//VAL3

					switch(val2[0]) {
					case 1: System.out.println("Du sparade tärning 1");
					val2[count] = dice1;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();

						//VAL4

						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 2: System.out.println("Du sparade tärning 2");
					val2[count] = dice2;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 3: System.out.println("Du sparade tärning 3");
					val2[count] = dice3;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 4: System.out.println("Du sparade tärning 4");
					val2[count] = dice4;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 5: System.out.println("Du sparade tärning 5");
					val2[count] = dice5;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					}

				}
				break;

				case 5: System.out.println("Du sparade tärning 5");
				val1[count] = dice5;

				//VAL2

				System.out.println("Vill du behålla fler tärningar?");
				svar2 = input.next().charAt(0);
				if (svar2 == 'n') {
					break;
				} 
				else {

					System.out.println("Vilken tärning vill du behålla?");
					val2[0] = input.nextInt();

					//VAL3

					switch(val2[0]) {
					case 1: System.out.println("Du sparade tärning 1");
					val2[count] = dice1;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 2: System.out.println("Du sparade tärning 2");
					val2[count] = dice2;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 3: System.out.println("Du sparade tärning 3");
					val2[count] = dice3;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 4: System.out.println("Du sparade tärning 4");
					val2[count] = dice4;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 5: System.out.println("Du sparade tärning 5");
					val2[count] = dice5;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					}

				}
				break;
				}

			}
			break;

			case 2: System.out.println("Du sparade tärning 2");
			val[count] = dice2;

			//VAL1							nr2

			//i++;
			System.out.println("Vill du behålla fler tärningar?");
			svar2 = input.next().charAt(0);
			if (svar2 == 'n') {
				break;
			} 
			else {

				System.out.println("Vilken tärning vill du behålla?");
				val1[0] = input.nextInt();

				//VAL2

				switch(val1[0]) {
				case 1: System.out.println("Du sparade tärning 1");
				val1[count] = dice1;
				System.out.println("Vill du behålla fler tärningar?");
				svar2 = input.next().charAt(0);
				if (svar2 == 'n') {
					break;
				} 
				else {

					System.out.println("Vilken tärning vill du behålla?");
					val2[0] = input.nextInt();

					//VAL3

					switch(val2[0]) {
					case 1: System.out.println("Du sparade tärning 1");
					val2[count] = dice1;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();

						//VAL4

						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 2: System.out.println("Du sparade tärning 2");
					val2[count] = dice2;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 3: System.out.println("Du sparade tärning 3");
					val2[count] = dice3;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 4: System.out.println("Du sparade tärning 4");
					val2[count] = dice4;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 5: System.out.println("Du sparade tärning 5");
					val2[count] = dice5;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					}

				}
				break;

				//VAL2

				case 2: System.out.println("Du sparade tärning 2");
				val1[count] = dice2;
				System.out.println("Vill du behålla fler tärningar?");
				svar2 = input.next().charAt(0);
				if (svar2 == 'n') {
					break;
				} 
				else {

					System.out.println("Vilken tärning vill du behålla?");
					val2[0] = input.nextInt();

					//VAL3

					switch(val2[0]) {
					case 1: System.out.println("Du sparade tärning 1");
					val2[count] = dice1;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();

						//VAL4

						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 2: System.out.println("Du sparade tärning 2");
					val2[count] = dice2;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 3: System.out.println("Du sparade tärning 3");
					val2[count] = dice3;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 4: System.out.println("Du sparade tärning 4");
					val2[count] = dice4;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 5: System.out.println("Du sparade tärning 5");
					val2[count] = dice5;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					}

				}
				break;

				//VAL2

				case 3: System.out.println("Du sparade tärning 3");
				val1[count] = dice3;
				System.out.println("Vill du behålla fler tärningar?");
				svar2 = input.next().charAt(0);
				if (svar2 == 'n') {
					break;
				} 
				else {

					System.out.println("Vilken tärning vill du behålla?");
					val2[0] = input.nextInt();

					///VAL3

					switch(val2[0]) {
					case 1: System.out.println("Du sparade tärning 1");
					val2[count] = dice1;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();

						//VAL4

						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 2: System.out.println("Du sparade tärning 2");
					val2[count] = dice2;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 3: System.out.println("Du sparade tärning 3");
					val2[count] = dice3;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 4: System.out.println("Du sparade tärning 4");
					val2[count] = dice4;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 5: System.out.println("Du sparade tärning 5");
					val2[count] = dice5;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					}

				}
				break;

				//VAL2

				case 4: System.out.println("Du sparade tärning 4");
				val1[count] = dice4;
				System.out.println("Vill du behålla fler tärningar?");
				svar2 = input.next().charAt(0);
				if (svar2 == 'n') {
					break;
				} 
				else {

					System.out.println("Vilken tärning vill du behålla?");
					val2[0] = input.nextInt();

					//VAL3

					switch(val2[0]) {
					case 1: System.out.println("Du sparade tärning 1");
					val2[count] = dice1;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();

						//VAL4

						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 2: System.out.println("Du sparade tärning 2");
					val2[count] = dice2;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 3: System.out.println("Du sparade tärning 3");
					val2[count] = dice3;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 4: System.out.println("Du sparade tärning 4");
					val2[count] = dice4;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 5: System.out.println("Du sparade tärning 5");
					val2[count] = dice5;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					}

				}
				break;

				//VAL2

				case 5: System.out.println("Du sparade tärning 5");
				val1[count] = dice5;
				System.out.println("Vill du behålla fler tärningar?");
				svar2 = input.next().charAt(0);
				if (svar2 == 'n') {
					break;
				} 
				else {

					System.out.println("Vilken tärning vill du behålla?");
					val2[0] = input.nextInt();

					//VAL3

					switch(val2[0]) {
					case 1: System.out.println("Du sparade tärning 1");
					val2[count] = dice1;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();

						//VAL4

						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 2: System.out.println("Du sparade tärning 2");
					val2[count] = dice2;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 3: System.out.println("Du sparade tärning 3");
					val2[count] = dice3;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 4: System.out.println("Du sparade tärning 4");
					val2[count] = dice4;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 5: System.out.println("Du sparade tärning 5");
					val2[count] = dice5;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					}

				}
				break;
				}

			}
			break;

			case 3: System.out.println("Du sparade tärning 3");
			val[count] = dice3;

			//VAL1					nr3

			//i++;
			System.out.println("Vill du behålla fler tärningar?");
			svar2 = input.next().charAt(0);
			if (svar2 == 'n') {
				break;
			} 
			else {

				System.out.println("Vilken tärning vill du behålla?");
				val1[0] = input.nextInt();

				//VAL2

				switch(val1[0]) {
				case 1: System.out.println("Du sparade tärning 1");
				val1[count] = dice1;
				System.out.println("Vill du behålla fler tärningar?");
				svar2 = input.next().charAt(0);
				if (svar2 == 'n') {
					break;
				} 
				else {

					//VAL3

					System.out.println("Vilken tärning vill du behålla?");
					val2[0] = input.nextInt();
					switch(val2[0]) {
					case 1: System.out.println("Du sparade tärning 1");
					val2[count] = dice1;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();

						//VAL4

						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 2: System.out.println("Du sparade tärning 2");
					val2[count] = dice2;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 3: System.out.println("Du sparade tärning 3");
					val2[count] = dice3;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 4: System.out.println("Du sparade tärning 4");
					val2[count] = dice4;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 5: System.out.println("Du sparade tärning 5");
					val2[count] = dice5;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					}

				}
				break;

				//VAL2

				case 2: System.out.println("Du sparade tärning 2");
				val1[count] = dice2;
				System.out.println("Vill du behålla fler tärningar?");
				svar2 = input.next().charAt(0);
				if (svar2 == 'n') {
					break;
				} 
				else {

					System.out.println("Vilken tärning vill du behålla?");
					val2[0] = input.nextInt();

					//VAL3

					switch(val2[0]) {
					case 1: System.out.println("Du sparade tärning 1");
					val2[count] = dice1;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();

						//VAL4

						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 2: System.out.println("Du sparade tärning 2");
					val2[count] = dice2;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 3: System.out.println("Du sparade tärning 3");
					val2[count] = dice3;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 4: System.out.println("Du sparade tärning 4");
					val2[count] = dice4;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 5: System.out.println("Du sparade tärning 5");
					val2[count] = dice5;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					}

				}
				break;

				//VAL2

				case 3: System.out.println("Du sparade tärning 3");
				val1[count] = dice3;
				System.out.println("Vill du behålla fler tärningar?");
				svar2 = input.next().charAt(0);
				if (svar2 == 'n') {
					break;
				} 
				else {

					System.out.println("Vilken tärning vill du behålla?");
					val2[0] = input.nextInt();

					//VAL3

					switch(val2[0]) {
					case 1: System.out.println("Du sparade tärning 1");
					val2[count] = dice1;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();

						//VAL4

						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 2: System.out.println("Du sparade tärning 2");
					val2[count] = dice2;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 3: System.out.println("Du sparade tärning 3");
					val2[count] = dice3;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 4: System.out.println("Du sparade tärning 4");
					val2[count] = dice4;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 5: System.out.println("Du sparade tärning 5");
					val2[count] = dice5;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					}

				}
				break;

				//VAL2

				case 4: System.out.println("Du sparade tärning 4");
				val1[count] = dice4;
				System.out.println("Vill du behålla fler tärningar?");
				svar2 = input.next().charAt(0);
				if (svar2 == 'n') {
					break;
				} 
				else {

					System.out.println("Vilken tärning vill du behålla?");
					val2[0] = input.nextInt();

					//VAL3

					switch(val2[0]) {
					case 1: System.out.println("Du sparade tärning 1");
					val2[count] = dice1;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();

						//VAL4

						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 2: System.out.println("Du sparade tärning 2");
					val2[count] = dice2;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 3: System.out.println("Du sparade tärning 3");
					val2[count] = dice3;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 4: System.out.println("Du sparade tärning 4");
					val2[count] = dice4;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 5: System.out.println("Du sparade tärning 5");
					val2[count] = dice5;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					}

				}
				break;

				//VAL2

				case 5: System.out.println("Du sparade tärning 5");
				val1[count] = dice5;System.out.println("Vill du behålla fler tärningar?");
				svar2 = input.next().charAt(0);
				if (svar2 == 'n') {
					break;
				} 
				else {

					System.out.println("Vilken tärning vill du behålla?");
					val2[0] = input.nextInt();

					//VAL3

					switch(val2[0]) {
					case 1: System.out.println("Du sparade tärning 1");
					val2[count] = dice1;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();

						//VAL4

						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 2: System.out.println("Du sparade tärning 2");
					val2[count] = dice2;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 3: System.out.println("Du sparade tärning 3");
					val2[count] = dice3;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 4: System.out.println("Du sparade tärning 4");
					val2[count] = dice4;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 5: System.out.println("Du sparade tärning 5");
					val2[count] = dice5;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					}

				}

				break;
				}

			}
			break;

			case 4: System.out.println("Du sparade tärning 4");
			val[count] = dice4;

			//VAL1				nr4

			//i++;
			System.out.println("Vill du behålla fler tärningar?");
			svar2 = input.next().charAt(0);
			if (svar2 == 'n') {
				break;
			} 
			else {

				System.out.println("Vilken tärning vill du behålla?");
				val1[0] = input.nextInt();

				//VAL2

				switch(val1[0]) {
				case 1: System.out.println("Du sparade tärning 1");
				val1[count] = dice1;
				System.out.println("Vill du behålla fler tärningar?");
				svar2 = input.next().charAt(0);
				if (svar2 == 'n') {
					break;
				} 
				else {

					System.out.println("Vilken tärning vill du behålla?");
					val2[0] = input.nextInt();

					//VAL3

					switch(val2[0]) {
					case 1: System.out.println("Du sparade tärning 1");
					val2[count] = dice1;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();

						//VAL4

						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 2: System.out.println("Du sparade tärning 2");
					val2[count] = dice2;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 3: System.out.println("Du sparade tärning 3");
					val2[count] = dice3;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 4: System.out.println("Du sparade tärning 4");
					val2[count] = dice4;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 5: System.out.println("Du sparade tärning 5");
					val2[count] = dice5;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					}

				}
				break;

				//VAL2

				case 2: System.out.println("Du sparade tärning 2");
				val1[count] = dice2;
				System.out.println("Vill du behålla fler tärningar?");
				svar2 = input.next().charAt(0);
				if (svar2 == 'n') {
					break;
				} 
				else {

					System.out.println("Vilken tärning vill du behålla?");
					val2[0] = input.nextInt();

					//VAL3

					switch(val2[0]) {
					case 1: System.out.println("Du sparade tärning 1");
					val2[count] = dice1;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();

						//VAL4

						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 2: System.out.println("Du sparade tärning 2");
					val2[count] = dice2;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 3: System.out.println("Du sparade tärning 3");
					val2[count] = dice3;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 4: System.out.println("Du sparade tärning 4");
					val2[count] = dice4;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 5: System.out.println("Du sparade tärning 5");
					val2[count] = dice5;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					}

				}
				break;

				//VAL2

				case 3: System.out.println("Du sparade tärning 3");
				val1[count] = dice3;
				System.out.println("Vill du behålla fler tärningar?");
				svar2 = input.next().charAt(0);
				if (svar2 == 'n') {
					break;
				} 
				else {

					System.out.println("Vilken tärning vill du behålla?");
					val2[0] = input.nextInt();

					//VAL3

					switch(val2[0]) {
					case 1: System.out.println("Du sparade tärning 1");
					val2[count] = dice1;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();

						//VAL4

						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 2: System.out.println("Du sparade tärning 2");
					val2[count] = dice2;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 3: System.out.println("Du sparade tärning 3");
					val2[count] = dice3;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 4: System.out.println("Du sparade tärning 4");
					val2[count] = dice4;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 5: System.out.println("Du sparade tärning 5");
					val2[count] = dice5;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					}

				}
				break;

				//VAL2

				case 4: System.out.println("Du sparade tärning 4");
				val1[count] = dice4;
				System.out.println("Vill du behålla fler tärningar?");
				svar2 = input.next().charAt(0);
				if (svar2 == 'n') {
					break;
				} 
				else {

					System.out.println("Vilken tärning vill du behålla?");
					val2[0] = input.nextInt();

					//VAL3

					switch(val2[0]) {
					case 1: System.out.println("Du sparade tärning 1");
					val2[count] = dice1;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();

						//VAL4

						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 2: System.out.println("Du sparade tärning 2");
					val2[count] = dice2;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 3: System.out.println("Du sparade tärning 3");
					val2[count] = dice3;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 4: System.out.println("Du sparade tärning 4");
					val2[count] = dice4;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 5: System.out.println("Du sparade tärning 5");
					val2[count] = dice5;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					}

				}
				break;

				//VAL2

				case 5: System.out.println("Du sparade tärning 5");
				val1[count] = dice5;
				System.out.println("Vill du behålla fler tärningar?");
				svar2 = input.next().charAt(0);
				if (svar2 == 'n') {
					break;
				} 
				else {

					System.out.println("Vilken tärning vill du behålla?");
					val2[0] = input.nextInt();

					///VAL3

					switch(val2[0]) {
					case 1: System.out.println("Du sparade tärning 1");
					val2[count] = dice1;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();

						//VAL4

						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 2: System.out.println("Du sparade tärning 2");
					val2[count] = dice2;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 3: System.out.println("Du sparade tärning 3");
					val2[count] = dice3;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 4: System.out.println("Du sparade tärning 4");
					val2[count] = dice4;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 5: System.out.println("Du sparade tärning 5");
					val2[count] = dice5;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					}

				}
				break;
				}

			}
			break;

			case 5: System.out.println("Du sparade tärning 5");
			val[count] = dice5;

			//VAL1			nr5nr

			//i++;
			System.out.println("Vill du behålla fler tärningar?");
			svar2 = input.next().charAt(0);
			if (svar2 == 'n') {
				break;
			} 
			else {

				System.out.println("Vilken tärning vill du behålla?");
				val1[0] = input.nextInt();

				//VAL2

				switch(val1[0]) {
				case 1: System.out.println("Du sparade tärning 1");
				val1[count] = dice1;
				System.out.println("Vill du behålla fler tärningar?");
				svar2 = input.next().charAt(0);
				if (svar2 == 'n') {
					break;
				} 
				else {

					System.out.println("Vilken tärning vill du behålla?");
					val2[0] = input.nextInt();

					//VAL3

					switch(val2[0]) {
					case 1: System.out.println("Du sparade tärning 1");
					val2[count] = dice1;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();

						//VAL4

						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 2: System.out.println("Du sparade tärning 2");
					val2[count] = dice2;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 3: System.out.println("Du sparade tärning 3");
					val2[count] = dice3;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 4: System.out.println("Du sparade tärning 4");
					val2[count] = dice4;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 5: System.out.println("Du sparade tärning 5");
					val2[count] = dice5;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					}

				}
				break;

				//VAL2 

				case 2: System.out.println("Du sparade tärning 2");
				val1[count] = dice2;
				System.out.println("Vill du behålla fler tärningar?");
				svar2 = input.next().charAt(0);
				if (svar2 == 'n') {
					break;
				} 
				else {

					System.out.println("Vilken tärning vill du behålla?");
					val2[0] = input.nextInt();

					//VAL3

					switch(val2[0]) {
					case 1: System.out.println("Du sparade tärning 1");
					val2[count] = dice1;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();

						//VAL4

						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 2: System.out.println("Du sparade tärning 2");
					val2[count] = dice2;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 3: System.out.println("Du sparade tärning 3");
					val2[count] = dice3;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 4: System.out.println("Du sparade tärning 4");
					val2[count] = dice4;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 5: System.out.println("Du sparade tärning 5");
					val2[count] = dice5;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					}

				}
				break;

				//VAL2

				case 3: System.out.println("Du sparade tärning 3");
				val1[count] = dice3;
				System.out.println("Vill du behålla fler tärningar?");
				svar2 = input.next().charAt(0);
				if (svar2 == 'n') {
					break;
				} 
				else {

					System.out.println("Vilken tärning vill du behålla?");
					val2[0] = input.nextInt();

					//VAL3

					switch(val2[0]) {
					case 1: System.out.println("Du sparade tärning 1");
					val2[count] = dice1;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();

						//VAL4

						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 2: System.out.println("Du sparade tärning 2");
					val2[count] = dice2;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 3: System.out.println("Du sparade tärning 3");
					val2[count] = dice3;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 4: System.out.println("Du sparade tärning 4");
					val2[count] = dice4;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 5: System.out.println("Du sparade tärning 5");
					val2[count] = dice5;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					}

				}
				break;

				//VAL2

				case 4: System.out.println("Du sparade tärning 4");
				val1[count] = dice4;
				System.out.println("Vill du behålla fler tärningar?");
				svar2 = input.next().charAt(0);
				if (svar2 == 'n') {
					break;
				} 
				else {

					System.out.println("Vilken tärning vill du behålla?");
					val2[0] = input.nextInt();

					//VAL3

					switch(val2[0]) {
					case 1: System.out.println("Du sparade tärning 1");
					val2[count] = dice1;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();

						//VAL4

						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 2: System.out.println("Du sparade tärning 2");
					val2[count] = dice2;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 3: System.out.println("Du sparade tärning 3");
					val2[count] = dice3;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 4: System.out.println("Du sparade tärning 4");
					val2[count] = dice4;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 5: System.out.println("Du sparade tärning 5");
					val2[count] = dice5;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					}

				}
				break;

				//VAL2 

				case 5: System.out.println("Du sparade tärning 5");
				val1[count] = dice5;
				System.out.println("Vill du behålla fler tärningar?");
				svar2 = input.next().charAt(0);
				if (svar2 == 'n') {
					break;
				} 
				else {

					System.out.println("Vilken tärning vill du behålla?");
					val2[0] = input.nextInt();

					//VAL3

					switch(val2[0]) {
					case 1: System.out.println("Du sparade tärning 1");
					val2[count] = dice1;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();

						//VAL4

						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 2: System.out.println("Du sparade tärning 2");
					val2[count] = dice2;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 3: System.out.println("Du sparade tärning 3");
					val2[count] = dice3;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 4: System.out.println("Du sparade tärning 4");
					val2[count] = dice4;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}

					}
					break;
					case 5: System.out.println("Du sparade tärning 5");
					val2[count] = dice5;
					System.out.println("Vill du behålla fler tärningar?");
					svar2 = input.next().charAt(0);
					if (svar2 == 'n') {
						break;
					} 
					else {

						System.out.println("Vilken tärning vill du behålla?");
						val3[0] = input.nextInt();
						switch(val3[0]) {
						case 1: System.out.println("Du sparade tärning 1");
						val3[count] = dice1;
						break;
						case 2: System.out.println("Du sparade tärning 2");
						val3[count] = dice2;
						break;
						case 3: System.out.println("Du sparade tärning 3");
						val3[count] = dice3;
						break;
						case 4: System.out.println("Du sparade tärning 4");
						val3[count] = dice4;
						break;
						case 5: System.out.println("Du sparade tärning 5");
						val3[count] = dice5;
						break;
						}


						break;
					}

					}
					break;
				}

				}
				break;
			}

			}
			String trash = input.nextLine();

			System.out.println("Vill du slå igen?");
			svar = input.next().charAt(0);
			if(svar == 'n') {
				run=false;
			}




			if(dice1 == dice2 && dice1== dice3&&dice1==dice4&&dice1==dice5) {
				System.out.println("YATZY");
				System.out.println(count);
				System.out.println("Fortsätta?");
				fortsatt = input.next().charAt(0);


				if(fortsatt == 'n') {
					run = false;
				}

			}


		}while(run);
		count ++;
		for(int i = 0; i < count; i++) {
			System.out.println(val[i] + " " + val1[i] + " " + val2[i] + " " + val3[i]);
		}

	}
}


