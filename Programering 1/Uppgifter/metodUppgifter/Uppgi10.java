package metodUppgifter;

public class Uppgi10 {

	public static void main(String[] args) {
		
		int[] tal = binär(7);
			
		for(int a : tal) {
			
		
		System.out.print(a);
		}
	}
	public static int[] binär( int konvert){
		int antal = (int)(Math.log(konvert) / Math.log(2));
		int binärt[] = new int[antal + 1];
			
			for(int k = antal; 0 <= k; k--) {
				
				binärt[k] = (int)konvert % 2;
				konvert = konvert / 2;
				
				
			}
			
		return binärt;
		
	}
	
}
