package inlupp2;

import java.util.Scanner;

public class Elliot {
	
	public static void main (String [] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Hur många positioner vill du ha i din array?");		//Frågar hur många positioner du vill ha i din array
	int positioner = input.nextInt();							//Du skriver in hur många positioner du	vill ha 
	char [] bokstav = (tecken(positioner));			//denna är till för att det funkade bara om du gjorde en char array s
	System.out.println(bokstav);			//SKriver ut dina bokstäver i som en char array
	
	System.out.println("Antalet a:n i arrayen är: " + an(bokstav));			//Skriver ut hur många a:n som finns i din sträng av tecken
	
		
	}
	public static char[] tecken(int antal) {			//En metod som ska slumpa så många små bokstäver som du ville ha i din array	
		char[] hurm = new char[antal];					//En char array som har så många positioner som du ville ha
		int siffra = 0;							//variabeln siffra behövde ett värde
		for(int i = 0; antal > i; i++) {			//en for-sats som slumpar små bokstäver så många gånger som du har platser i din array
			siffra = (int)(Math.random()*122);			//denna slumpar tal som den sedan gör om till bokstäver med hjälp av unicode
			if(siffra > 96) {					//om talet är mer än 96 alltså lilla "a" så körs denna if-satsen
				hurm[i] = (char)siffra;				//här gör vi om tal till bokstäver och sätter in de på plats "i" i variablen hurm
			}
			else {								//om talet är mindre än 96 så körs denna else satsen
				i--;							//och tar i minus ett för att det ska bli plus minus 0 så att for-satsen inte kör färre gånger än den ska
			}
		}
		return hurm;				//returnerar variblen hurm
		
	}
	public static int an(char[] tecken){				//en metod som tar emot vår tecken-sträng och tar reda på hur många "a" som finns i den
		int antal = 0;								//variablen a behövde ett startvärde
		for(int i = 0; tecken.length > i; i++) {			//en for-sats som kör så länge i är mindre än längden på din tecken-sträng
			if(tecken[i] == 'a') {							//om tecknet med platsen "i" i din array
				antal++	;									//så ökar antal med 1 och på så sätt räknas hur många a:n som finns i tecken-strängen 	
			}
		}
		return antal;									//returnerar varialben antal
	}

}
