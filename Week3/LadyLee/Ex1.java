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
		
		int frequent = Count(str, ch);
	}

	public static int Count(String strig, char cha) {
		int count = 0;
		for (int i = 0; i < strig.length(); i++) {
			if (strig.charAt(i) == cha) {
				count++;
			}
		}
		System.out.println("Times of " + "'" + cha + "'" + " is " + count + '\n');
		return count;
	}
}
