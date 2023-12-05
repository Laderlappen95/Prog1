package metodUppgifter;

public class Uppg5 {

	public static void main(String[] args) {
		System.out.println(bokstav('ö'));

		
	
	}
	public static char bokstav(char liten) {
		char bokstav = liten;
		
		int stor = bokstav;

		stor = stor - 32;
		
		bokstav = (char)stor;
		
		return bokstav;
	}
}
