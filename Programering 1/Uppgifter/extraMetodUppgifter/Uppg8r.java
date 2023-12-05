package extraMetodUppgifter;

import java.util.Scanner;

public class Uppg8r {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.println("Hur många rader(minst 2 max 20): ");
		int rader = input.nextInt();
		System.out.println("Hur många kolumner(minst 2 max 20): ");
		int kolumn = input.nextInt();
		System.out.println("Krypterat meddelande( högst 30 bokstäver): ");
		String ord = input.next();
		
		System.out.println(ursprung(rader,kolumn, ord));
		
	}
	public static String ursprung(int rader, int kolumn, String krypt) {
		
		
		for(int i = 0; rader  >i;i++) {
	}
		String hej = "hej";
		return hej;
	}
}

