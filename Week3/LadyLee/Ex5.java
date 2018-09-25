package PPL_Fall2018.Week3.LadyLee;

public class Ex5 {
	public static void Count() {
		System.out.println("Enter a string: ");
		String a = Ex1.inputString();
		int letter = 0;
		int digit = 0;
		int word = 0;

		for (int i = 0; i < a.length(); i++) {
			if (Character.isLetter(a.charAt(i))) {
				letter++;
			} else if (Character.isDigit(a.charAt(i))) {
				digit++;

			}
		}
		System.out.println("Number of letters: " + letter);
		System.out.println("Number of disgits: " + digit);
		String[] str = a.split(" ");
		for (String s : str) {
			if (!s.isEmpty()) {
				word++;
			}
		}
		System.out.println("Number of words: " + word);

	}

	public static void main(String[] args) {
		Count();

	}
}
