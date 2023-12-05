package extrauppgifter;

import java.util.Scanner;

public class Uppg2komma1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ange sidolängd i cm: ");
		
		int längd = input.nextInt();
		
		System.out.println("Ange höjd i cm: ");
		
		int bredd = input.nextInt();
		
		int area = (längd*bredd) / 2;
		System.out.println("Arean är: " + area + "cm^2");
		

	}

}
