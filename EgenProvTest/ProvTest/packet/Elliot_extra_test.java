package packet;

import java.util.Scanner;

public class Elliot_extra_test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
			boolean val = true;
			String svar;
			boolean run = true;
			int count = 1; 
			int i = 0;
		
		do {
			
		
			while(count > 0){
			System.out.println("Vill du köra igen? j/n");
			svar = input.nextLine();
			if(svar == "n" || svar== "N") {
				i = -1;
			}
			else if(svar != "J" && svar != "j") {
				System.out.println(svar + " är ett ogiltligt svar");
				count++;
			}
			else {
				count = 0;
			}
			
			

		}
		}while(i > -1);

	}

}
