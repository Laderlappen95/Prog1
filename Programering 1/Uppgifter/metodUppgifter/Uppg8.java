package metodUppgifter;

public class Uppg8 {

	public static void main(String[] args) {
		
		int[] Array = {2, 1, 19, 52, -4, 5, 23, -62, 0};

		int hogsta[] = (heltal(Array));
		for(int a: hogsta) {
			System.out.println((a));
		}

	}

	public static int[] heltal(int[] tal) {
		int storsta = tal[0];
		int stor[] = new int [2];

		for(int i = 0; tal.length >	 i;i++) {
			if(tal[i] > storsta) {
				storsta = tal[i];
				stor[0] = tal[i];
			}
		}


		stor[1]= tal[0];
		for(int i = 1; tal.length > i; i++) {
			if(tal[i] < stor[1]) {
				stor[1] = tal[i];
			}
		}
		return stor;


	}

}
