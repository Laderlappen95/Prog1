package metodUppgifter;

public class Uppg1 {


	public static void main(String[] args) {
		System.out.println(tal(-1));
		
		
		

	}
	public static String tal(int kod) {
		String hej1;
		
		if(0 > kod) {
			hej1 = "-";
			return hej1;
		}
		else {
			hej1 = "+";
			return hej1;
		}
	}
	
	
}
