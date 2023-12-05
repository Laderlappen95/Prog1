package extraMetodUppgifter;

import java.util.Scanner;

public class Uppg2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv en mening: ");
		String men = input.nextLine();
		System.out.println(versal(men));
	}
	
	public static String versal(String mening) {
		//String vers = mening;
		char första = mening.charAt(0);// hittar första tecknet
		
		int först = (int)första;		//gör om första tecknet till en int
		
		if(97 <= först && först <= 122) {		//kollar om det är en versal
			 första = (char)(först - 32); 	/*om det är en versal
			  								bytas den ut mot en gemen*/
			
		}
		//vers = vers.replace(vers.charAt(0), första);
		
		return mening.replace(mening.charAt(0), första);
	}

}
