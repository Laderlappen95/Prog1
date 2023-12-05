package selektion;


import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// Scannerobjekt

		Scanner input = new Scanner(System.in);
	
		System.out.println("1. Alternativ ett\n2. Alternativ två\n3. Alternativ tre\n4. Alternativ fyra\n4. Hjälp");
		int val = input.nextInt();
		
		switch(val) {
		case 1:
			System.out.println("Du valde alternativ ett!");
			break;
		case 2:
			System.out.println("Du valde alternativ två!");
			break;
		case 3:
			System.out.println("Du valde alternativ tre!");
			break;
		case 4:
			System.out.println("Du valde alternativ fyra!");
			break;
		default:
			System.out.println("felaktigt val, Vv försök igen");
		}
		String trash = input.nextLine();		//kan behövas eftersom att det kan samlas text-strängar som fastnar och förstör din kod
		
		//En switch-case där alternativen styrs av text
		System.out.println("Vilken dag är det idag?");
		
		String dag = input.next();
		switch(dag) {
		case "måndag":
			System.out.println("Tisdag");
		case "tisdag":
			System.out.println("Onsdag");
		case "onsdag":
			System.out.println("Torsdag");
		case "torsdag":
			System.out.println("Fredag");
		case "fredag":
			System.out.println("Lördag");
		case "lördag":
			System.out.println("Söndag");
			break;
			default:
				System.out.println("Skriv dagen med bara gemener");
		
				
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


