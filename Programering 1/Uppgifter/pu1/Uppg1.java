package pu1;

import java.util.Scanner;

public class Uppg1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv längd i centimeter: ");
		
		double langd = input.nextDouble();
		
		System.out.println("Längd: " +langd +  "cm");
		
		System.out.println("Skriv bredd i centimeter: ");
		
		double bredd = input.nextDouble();
		
		System.out.println("Bredd: " + bredd + "cm");
		
		double area = bredd * langd*1.0;
		
		System.out.println("Arean är: " + area+ "cm^2");
		
		
		
		
	}

}
