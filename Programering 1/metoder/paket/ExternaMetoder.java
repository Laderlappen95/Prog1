package paket;

public class ExternaMetoder {
	//Kollar om tecknet �r en versal
	public static boolean charTest(char tecken) {
		int code = (int)tecken;
		if(code >= 65 && code <= 90) {
			return true;
		}
		else {
			return false;
		}
	}
}
