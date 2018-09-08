package PPL_Fall2018.Week1.hoapt.day2;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		/*
		 * Scanner hoa = new Scanner(System.in); System.out.println("nhập số"); int
		 * a = hoa.nextInt();
		 */
		String a = "12345";
		String sum = null;
		for (int i = 0; i < a.length(); i++) {
			sum += Character.getNumericValue(a.charAt(i));

		}

	}

}
