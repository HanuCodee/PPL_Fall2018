package PPL_Fall2018.Week3.LadyLee;

import java.util.*;

public class Temp {

	public static void main(String[] args) {
		String chars = "";
		System.out.println("Enter your string: ");
		String inp = inputString();
		String element;
		
		do {
			System.out.println("Enter a Character: ");
			element = inputString();
		} while (element.length() != 1);
		String result = inp.replaceAll(element, "");
		System.out.println("Result: " + result);

	}

	public static String inputString() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
}