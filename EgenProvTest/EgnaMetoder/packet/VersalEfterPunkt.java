package packet;

import java.util.Scanner;

public class VersalEfterPunkt {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String men = "";
		System.out.println("Skriv mening: ");
		men = input.nextLine();
		System.out.println(punktversal(men));

	}

	public static String punktversal(String mening) {
		char bokstav [] = new char [1000];

		String vers = "";

		for(int count = 0; mening.length() > count ; count++) {
			bokstav[count] = mening.charAt(count);
			if(bokstav[count] == '.') {

				vers = mening.replace(bokstav[count + 2], '-');
				
			}

		}
		return vers;
	}
}
