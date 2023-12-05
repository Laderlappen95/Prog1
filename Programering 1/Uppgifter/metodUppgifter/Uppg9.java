package metodUppgifter;

public class Uppg9 {

	public static void main(String[] args) {

			System.out.println(alfabet());
			
	}

	public static char []alfabet(){
		char[] alfa = new char[26];
		for(int i = 0;  26 > i; i++){
			alfa[i] = (char)(97 + i);
		}
		return alfa;
	}

}
