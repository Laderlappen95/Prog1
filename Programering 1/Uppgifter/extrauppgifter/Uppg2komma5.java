package extrauppgifter;

import java.util.Scanner;

public class Uppg2komma5 {

	public static void main(String[] args) {
		
		//Scannerobjekt
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv ett decimaltal:");
		
		double decTal = input.nextDouble();
		
		decTal = decTal + 0.5; 
		
		double decTal2 = decTal %1;
		
		decTal2 = decTal - decTal2;
		
		System.out.println(decTal2);
		
	}

}
