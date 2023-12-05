package extraMetodUppgifter;

import java.util.Scanner;

public class Uppg4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv in ett tal: ");
		int tal = input.nextInt();
		System.out.println("Skriv in ett tal: ");
		int tal1 = input.nextInt();
		
		System.out.println(tal(tal, tal1));
	}
	public static int tal(int tal, int tal1) {
		int delad;
		int delad1;
		int antal = 0;
		int count = 0;
		if(tal > tal1) {
			antal = tal;
		}
		else {
			antal = tal1;
		}
		
		for(int i = antal; 0 < i; i--) {
			count++;
			delad = tal/count;
			delad1 = tal1/count;
			if(delad == delad1) {
				break;
			}
			
		}
		return count;
	}

}
