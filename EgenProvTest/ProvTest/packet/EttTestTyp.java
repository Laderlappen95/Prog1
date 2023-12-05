package packet;

import java.util.Scanner;

public class EttTestTyp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*System.out.println("Skriv ett tal: ");
		int tal = hej.nextInt();
		int hex= 0;
		int antal = (int)(Math.log(tal)/Math.log(16));
		for(int i = 0; i >= 0; i++) {
			hex = tal%16;
			tal = tal/16;


		}
		System.out.println(hex);

		String mening = hej.nextLine();
		char bokstav [] = new char [1000];
		
		String hejsan = "";
		int count = 0;
		for( count = 0; mening.length() > count; count++) {
			
			bokstav[count] = mening.charAt(count);
			if(bokstav[count] == '.') {

			hejsan = mening.replace(bokstav[count], (char)(bokstav[count] + 32));
			}
			
		}
		System.out.println(hejsan);*/
		
	

			
			System.out.println("Hur många positioner vill du ha i din array?");
			int positioner = input.nextInt();
			char [] bokstav = (tecken(positioner));
			System.out.println(bokstav);
			System.out.println("Antalet a:n i arrayen är: " + an(bokstav));
			
				
			}
			public static char[] tecken(int antal) {
				char[] hurm = new char[antal];
				int siffra = 0;
				for(int i = 0; antal > i; i++) {
					siffra = (int)(Math.random()*122);
					if(siffra > 96) {
						hurm[i] = (char)siffra;
					}
					else {
						i--;
					}
				}
				return hurm;
				
			}
			public static int an(char[] tecken){
				int antal = 0;
				char[] kod = tecken;
				for(int i : kod) {
					if(kod[i] == 'a') {
						antal++;
					}
					else {
						
					}
				}
				return antal;
			}

		

		
		
		


	}




