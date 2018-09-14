package PPL_Fall2018.Week3.LadyLee;

import java.util.*;

public class Ex1 {
	public static String inputString() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

	public static void main(String[] args) {
		System.out.println("Ex1. Enter a string: ");
		String str = inputString();
		System.out.println("Enter a character: ");
		char ch = (char) inputString().charAt(0);

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("Times of " + "'" + ch + "'" + " is " + count + '\n');
	}
}
