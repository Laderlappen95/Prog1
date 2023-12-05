package pu1;

import java.util.Scanner;

public class Uppg5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ange betalning: ");
		
		int tal = input.nextInt();
		
		int tvåhundra = tal / 200;
		
		tal = tal % 200;
		
		int hundra = tal / 100;
		
		tal = tal %100;
		
		int femtio = tal /50;
		
		tal = tal % 50;
		
		int tjugio= tal/20;
		
		tal =tal %20;
		
		int fem = tal/5;
		
		tal =tal %5;
		
		int ett = tal/1;
		
		
		System.out.println( tvåhundra+ "x200" + "kr " + hundra+"x100"+ "kr " + femtio + "x50" + " kr " + tjugio + "x20" + "kr "+ fem + "x5" + "kr " + ett + "x1" +"kr" );
		
		
		
		

	}

}
