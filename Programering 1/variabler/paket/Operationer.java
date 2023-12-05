package paket;

import java.util.Scanner;

public class Operationer {

	public static void main(String[] args) {
		//Scanner objekt
		
		Scanner input = new Scanner(System.in);
		
		//De fem räknestätten:
		
		System.out.println("Skriv 2 tal: ");
		
		int tal1 = input.nextInt();
		int tal2 = input.nextInt();
		//int tal3 = input.nextInt();
		//int tal4 = input.nextInt();
		
		//addition
		
		int summa = tal1 + tal2;
		
		
		
		//System.out.println("Summan är: " + summa);
		
		//kortare
		
		
		//System.out.println(tal1 + tal2);
		
		
		//subtraktion
		
		int differans = tal2 - tal1;
		
		//multiplikation
		
		int produkt = tal1*tal2;
		
		//division
		
		
		double kvot = tal1 * 1.0 / tal2; // För att få en kvot med decimaler krävs en ingående del med decimaler
		
		
		System.out.println("Kvoten är: " + kvot);
		
		
		//Större uträkning
		
		double utr = (tal1 + tal2) * 1.0/ (tal1 + tal2); // paranteser som vanligt
		
		//System.out.println("Talet blir: " + utr);
		
		//moduloberäkningar (resten vid divition)
		
		int rest = tal1 % tal2;
		
		System.out.println("Resten vid divition är: "+rest);
		
		//tidsomvandling
		
		System.out.println("Skriv sek: ");
		
		int sek = input.nextInt();
		
		int min = sek / 60; 	//min är hela antalet minuter
		
		sek = sek % 60;	 		// sek är de sekunder som är kvar när hela minuter är borta
		
		int tim = min /60; 		//hela antal timmar
		
		min = min % 60;
		
		System.out.println(tim + " h\t" + min +" min\t"+ sek + " sek");
		
		
	}

}
