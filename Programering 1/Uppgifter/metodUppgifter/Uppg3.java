package metodUppgifter;

public class Uppg3 {

	public static void main(String[] args) {

		

		System.out.println(upphöjt(4,5));


	}

	public static int upphöjt(int tal, int upphöjt) {
		int talet = tal;
		
		
		for(int i = 1; i < upphöjt; i++) {
			
				talet = talet*tal;
		}
		return talet;

				
	}

}
