package PPL_Fall2018.Week3.LadyLee;

public class Ex6 {
	//sai
	public static void max() {
		int count = 0;
		int max = 0;
		char k = 0;
		System.out.println("Enter a string: ");
		String a = Ex1.inputString();

		for (int i = 0; i < a.length(); i++) {
			count = 1;
			for (int j = i + 1; j < a.length(); j++) {
				if (a.charAt(i) == a.charAt(j) && count > max) {
					max = count;
					count++;
				}
			}
		}
		int result = max;
		System.out.println("Result: " + max);

	}

	public static void main(String[] args) {
		max();
	}
}
