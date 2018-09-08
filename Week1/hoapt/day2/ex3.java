package PPL_Fall2018.Week1.hoapt.day2;

public class ex3 {
	public static void main(String[] args) {
		String a = "the most beautiful girl in the world ";
		int count = 0;
		for(int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 'b') {
			count ++;
		}
		
	}
		System.out.println(count);

	}
}
