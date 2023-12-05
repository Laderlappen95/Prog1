package pu1;

import java.util.Scanner;

public class Uppg2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Ange temperatur i Farenheit: "); //säger åt dig att skriva in en temperatur i Farenheit
		
		
		double tempF = input.nextDouble();  //läser av vad du skrivit in för temperatur
		
		// C = (F - 32) . 0.56 
		
		
		double tempC = (tempF - 32) * 0.56; // räknar ut vad den temperaturen du skrivit in är i celsius
		
		
		System.out.println(tempF + "° Farenheit i Celsius är" + tempC +"°"); // Presenterar fram svaret
		

	}

}
