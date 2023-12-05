package extraMetodUppgifter;

import java.util.Scanner;

public class Uppg3 {

	public static void main(String[] args) {
		Scanner hej = new Scanner(System.in);
		System.out.println("Skriv en mening: ");
		String men = hej.nextLine();
		System.out.println(samman(men));
		

	}
	public static String samman(String mening) {
		mening = (Uppg1.punkt(mening));
		mening = (Uppg2.versal(mening));
		return mening;
	}
	
}
