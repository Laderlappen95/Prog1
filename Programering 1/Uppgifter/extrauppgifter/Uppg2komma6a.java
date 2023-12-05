package extrauppgifter;

import java.util.Scanner;

public class Uppg2komma6a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.println("Hur mycket pengar vill du ha:");
		
		int tal = input.nextInt();
		
		tal = tal + 100;
		
		int tal2 = tal%100;
		
		tal2 = tal-tal2;
		
		System.out.println(tal2);
		
		
		
		
	}

}
