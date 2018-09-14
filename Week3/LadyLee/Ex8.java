package PPL_Fall2018.Week3.LadyLee;

public class Ex8 {
	public static void deleteString() {
		System.out.println("Enter a string: ");
		String str = Ex1.inputString();
		String ch;
		do {
			System.out.println("Enter a character want to delete: ");
			ch = Ex1.inputString();
		} while (str.contains(ch));
		String result = str.replaceAll(str, " ");
		System.out.println("Result: " + result);

	}

	public static void main(String[] args) {
		deleteString();
	}
}
