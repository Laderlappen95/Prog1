package extrauppgifter;

import java.util.Scanner;

public class Uppg2komma3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Substantiv:");
		
		String sub = input.next();
	
		System.out.println("Pluraländelse:");
		
		String plural = input.next();
		
		System.out.println("En "+ sub+ "," + " flera "+sub+plural);
		

	}

}
