package metodUppgifter;

public class Uppg6{



	public static void main(String args[]) {
	
		System.out.println(tecken('-'));
		
		
	}
	
	public static boolean tecken(char tal) {
		int tek1 = tal;
		boolean hej = true;
		
		if(tek1 >= 48 && tek1 <= 57) {			//Om det är en siffra
			hej = true;
			
		}
		else {		//Om det inte är en siffra
			hej = false;
		}
		
		return hej;
		
	}
}