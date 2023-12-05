package selektion;

import java.util.Scanner;

public class If_satser {

	public static void main(String[] args) {
		//Scanner objekt
		Scanner input = new Scanner(System.in);
		
		//if-satser styrs av logiska uttryck såkallade "villkor" ett villkor kan vara kan antingen vara sant eller falskt
		
		//variabler
		int helTal = 2;
		double tal = 2.5;
		char tecken = 'b';
		boolean val= true;
		
		//Skriver ut en logisk utsaga 
		System.out.println(helTal == 2);
		
		//en if-sats som styrs av en likhet
		if(helTal ==2) {
			System.out.println("Heltal har värdet 2");
		}
		else {// om if blocket ej körs så körs else blocket
			System.out.println("Heltal har inte värdet 2");
		}
		
		//decimaltal i ett intervall: -2 < x < 3		flera villkor med "och" && eller "eller" || (altGr + <)
		
		if(tal > -2 && tal < 3) {
			System.out.println("Decimaltalet ligger mellan -2 och 3");
		}
		else if(tal >= 3 && tal <5){
			System.out.println("Talet ligger mellan 3 och 5");
		}
		else{
			System.out.println("Talet är större än 5 eller mindre än -2");
		}
		
		//tecknet ska inte vara ett "K"
		if (tecken != 'k') {		//! betyder icke
			System.out.println("Tecknet är inte ett k");
		}
		
		//styra med boolsk variabel 
		if(val) {
			//kodblocket körs om val ej blivit falsk
		}
		
		if(true) {
			//kodblocket körs verkligen alltid
		}
		
		//styra if-satser med metoder/funktioner
		String anv = "Läderlappen";
		String pw = "password";
		
		//inloggning:
		
		System.out.println("Ange användarnamn: ");
		String mail = input.nextLine();
		
		System.out.println("Ange lösenord: ");
		String password = input.nextLine();
		
		if(anv.equalsIgnoreCase(mail) && pw.equals(password)) {
			System.out.println("Välkommen" + mail);
		}
		else {
			System.out.println("Användarnamn eller lösenord felaktigt");
			
		}
		
		
	}

}
