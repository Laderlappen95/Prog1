package paket;

public class Aarrays {

	public static void main(String[] args) {
		// Arrays, listorl, talfärlt
		int[] tal = new int[10];
		
		System.out.println(tal);	//en array behöver skriva ut element för element
		
		System.out.println(tal[0]);	// index 0 är första position i fältet
		
		System.out.println(tal[tal.length - 1]);	//length returnerar antal element i fältet
		
		tal[3] = 5; //tal nummer fyra i fältet får värde 5

		double[] decArray = new double[100];
		
		String[] textList = new String[23];
		
		// en tvådimensionell array:
		
		char[][] twoDimField = new char[8][8]; // ett två dimensionellt teckenfält eller matris
		
		System.out.println(twoDimField);
		
		
		
	}

}
