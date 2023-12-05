package metodUppgifter;

public class Uppg4 {

	public static void main(String[] args) {
		System.out.println(romb(9));

	}
	public static String romb(int tal) {
		String romb = "";
		for(int i = 0;  tal > i; i++) {
			for(int s = 0; i > s; s++) {
				romb = romb + " ";
			}
			for(int s = 0; tal > s; s++) {
				romb = romb + "*";
			}
			
			romb = romb +"\n";
		}
		return romb;
	}

}
