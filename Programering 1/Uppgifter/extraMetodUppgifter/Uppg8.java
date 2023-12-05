package extraMetodUppgifter;

import java.util.Scanner;

public class Uppg8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Hur många rader(minst 2 max 20): ");
		int rader = input.nextInt();
		System.out.println("Hur många kolumner(minst 2 max 20): ");
		int kolumn = input.nextInt();
		System.out.println("Krypterat meddelande( högst 30 bokstäver): ");
		String ord = input.next();
		
		System.out.println(tabell(rader, kolumn, ord));
		

	}
	public static String tabell(int rad, int kolumn, String ord) {
		String tabell = "";
		char bokstav[] = new char[rad * kolumn];
		String ruta = "";
		for(int i = 0; rad > i; i++) {
			bokstav[i] = ord.charAt(i);
			ruta = "[" + bokstav[i] + "]";
			for(int k = 0; kolumn > k; k++) {
				tabell = tabell + ruta;
			}
			
			tabell = tabell + "\n";
		}
		
		 return tabell;
	}

}
