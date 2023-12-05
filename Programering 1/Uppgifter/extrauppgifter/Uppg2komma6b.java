package extrauppgifter;

import java.util.Scanner;

public class Uppg2komma6b {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hur mycket pengar vill du ha:");
		
		//skriver in ett tal
		
		double tal = input.nextDouble();
		
		tal = tal + 100;
		
		// tal2 är antalet 500 lappar
		
		double tal2 = tal/500;
		
		
		
		
		tal2 = tal%500;
		
		//antalet 100 lappar
		
		double tal3 = tal2/100;
		
		tal3 = tal3%100;
		
		
		System.out.println("Antal 500:"+tal2 + " Antal 100: " + tal3);
	}

}
