package PPL_Fall2018.Week3.LadyLee;

public class Ex7 {
	public static void Exercise7() {
		System.out.println("Enter your string: ");
		String inp = Ex1.inputString();
		String chars = "";
		String nums = "";
		String vows = "ueoai";

		int countNum = 0;
		int countVows = 0;
		for (int i = 65; i < 90; i++) {
			chars += (char) i;
		}
		for (int i = 0; i < 10; i++) {
			nums += String.valueOf(i);
		}
		// gen charecters and numbers as a string

		String[] split = inp.split(" ");
		for (int i = 0; i < inp.length(); i++) {
			if (nums.indexOf(inp.charAt(i)) != -1) {
				countNum++;
			}
			if (vows.indexOf(inp.charAt(i)) != -1) {
				countVows++;
			}
		}
		int countChars = inp.length() - countNum - split.length + 1;
		System.out.println("Number of characters: " + countChars);
		System.out.println("Number of numbers: " + countNum);
		System.out.println("Your string: " + inp.trim());
		System.out.println("Number of words: " + split.length);
	}

	public static void main(String[] args) {
		Exercise7();
	}
}
