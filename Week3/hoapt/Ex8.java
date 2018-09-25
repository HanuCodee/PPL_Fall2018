package day3;
import hoa.inputString;
public class Ex8 {
	public static void deleteString() {
		System.out.println("Enter a string: ");
		String str = inputString.enterString();
		String ch;
		do {
			System.out.println("Enter a character want to delete: ");
			ch = inputString.enterString();
		} while (str.contains(ch));
		String result = str.replaceAll(str, " ");
		System.out.println("Result: " + result);

	}

	public static void main(String[] args) {
		deleteString();
	}

}
