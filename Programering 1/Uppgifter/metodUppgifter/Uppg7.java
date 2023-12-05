package metodUppgifter;

import java.lang.reflect.Array;

public class Uppg7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] array = {'2','5','f','_'};
		
		System.out.println(array(array,'2'));
		
	}
	public static int array(char[] tecken, char tecken1) {
		int return1 = -1;
		
		for(int i = 0; tecken.length > i; i++) {
			if(tecken[i] == tecken1) {
				return1 = i;
				break;
			}
			
			
			
		}
		return return1;
		
	}

}
