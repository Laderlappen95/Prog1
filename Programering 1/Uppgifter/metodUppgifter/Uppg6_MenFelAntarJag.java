package metodUppgifter;

import java.util.Scanner;

public class Uppg6_MenFelAntarJag{

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		
		boolean run = true;
		boolean run1 = true;
		do {
		
		
		System.out.println("Skriv in ett nummer(0-9) eller en bokstav(inte å ä ö): ");
		char tecken1 = input.next().charAt(0);

		
		do {	
		
		if(tecken(tecken1) == 1) {
			System.out.println("true");
			run1 = false;
		}
		else if(tecken(tecken1) == 2){
			System.out.println("false");
			run1 = false;
		}
		else {
			System.out.println("Läs frågan igen");
			System.out.println("Skriv in ett nummer(0-9) eller en bokstav(inte å ä ö): ");
			tecken1 = input.next().charAt(0);
		}
		}while(run1);
		System.out.println("Igen j/n");
		char igen = input.next().charAt(0);
		
		if(igen == 'n') {
			run = false;
		}
	
		}while(run);
	
	
 
 	}
	public static char tecken(char tal) {
		int tek1 = tal;
		char hej = 0;
		
		if(tek1 >= 48 && tek1 <= 57) {
			hej = 1;
			
		}
		else if(tek1 >= 97 && tek1 <= 122) {
			hej = 2;
		}
		else{
			
		}
		return hej;
		
	}
 
}  
    