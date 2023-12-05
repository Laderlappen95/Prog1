package paket;

public class Casting {

	public static void main(String[] args) {
		// Variabelomvandling
		
		int heltal = 2;
		
		double decTal = heltal; 	//int ryms i double direkt
		
		heltal = (int)decTal; 	//castar med önskad typ inom parantes före
		
		//avrundar
		
		decTal = 2.9;
		int avrund = (int)(decTal + 0.5);		//adderar 0,5 och castar för att avrunda korrekt
		
		//cast char som heltal
		int gemen = (int)'a';
		
		System.out.println(gemen);

		int versal = (int)'A';
		
		System.out.println(versal);
		
		//testar fler bokstäver
		
		System.out.println((int)'k' - (int)'K');
		
		//Textredigering
		
		String text = "Hej, idag har jag jobbat. Kul!";
		char tecken;
		char tecken2;
		
		for(int i = 0; i < text.length(); i++) {
			tecken = text.charAt(i);
			if((int)tecken >= 65 && (int)tecken <= 90) {
				tecken2 = (char)((int)tecken + 32);
				System.out.println(tecken2);
				text.replace(tecken, tecken2);
				text.replace(tecken2, tecken);
			}
		}
		System.out.println(text);
	}

}
