package paket;

public class MetoderMain {

	public static void main(String[] args) {
		//metodtest:
		int square = kvadrat(9);

		System.out.println(square);
		
		print("Hej hej");
		
		System.out.println(tecken("Hej", 2));
		
		//Test av Extern metod:
		
		char bokstav = tecken("Vad�r�?", 3);
		
		if(ExternaMetoder.charTest(bokstav)) {
			print("Versal");
		}
		else {
			print("Gemen");
		}
		
	}
	//statisk funktion går att köra direkt
	//public/protected/private static returtyp namn(indata, indata)
	public static int kvadrat(int tal) {
		int square = tal * tal;
		return square;
	}
	
	//Metod som returnerar ett tecken
	public static char tecken(String text, int index) {
		char retur = text.charAt(index);
		return retur;
	}
	//metod utan retur
	//Utskrift av text
	public static void print(String utskr) {
		System.out.println(utskr);
	}

}
