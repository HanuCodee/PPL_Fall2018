package PPL_Fall2018.Week3.LadyLee;

import java.util.Scanner;

public class Functions {
	public static String Scanner() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

	public static String inputString() {
		System.out.println("Ex1. Enter a string: ");
		String str = Scanner();
		System.out.println("Enter a character: ");
		char ch = (char) Scanner().charAt(0);

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("Times of " + "'" + ch + "'" + " is " + count + '\n');
		return str;
	}

	public static boolean Search() {
		System.out.println("Ex2. Enter a fullname: ");
		String fullName = Scanner();
		System.out.println("Enter a name: ");
		String name = Scanner();
		name = Scanner();

		if (fullName.contains(name)) {
			System.out.println(name + " is Found in " + fullName);
			return true;
		} else {
			System.out.println("Not Found");
			return false;
		}
	}

	public static String FirstCharacter() {
		System.out.println("Ex3. Enter name: ");
		String a = Scanner();
		System.out.println("The first character of name is: " + a.charAt(0));
		return a;
	}

	public static void main(String[] args) {
		Functions ex1 = new Functions();
		ex1.inputString();

		Functions ex2 = new Functions();
		ex2.Search();

		Functions ex3 = new Functions();
		ex3.FirstCharacter();
	}
}
