package PPL_Fall2018.Week3.LadyLee;

import java.util.Scanner;

public class Ex2 {

	public static boolean Search() {
		System.out.println("Ex2. Enter a fullname: ");
		String fullName = Ex1.inputString();
		System.out.println("Enter a name: ");
		String name = Ex1.inputString();

		if (fullName.contains(name)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		if (Search() == true) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}
	}

}
