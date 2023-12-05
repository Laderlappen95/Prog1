package extraMetodUppgifter;

import java.util.Scanner;

public class Uppg1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv in en mening: "); 	//Ber dig skriva in din mening
		
		String mening = input.nextLine();
		System.out.println(punkt(mening));
	}
	
	public static String punkt(String mening) {
		String meningen = "";
		int antal = mening.length();
		char sista = mening.charAt(antal - 1);
		if (sista != '.') {
			meningen = mening + ".";
		}
		return meningen;
		
	}

}
