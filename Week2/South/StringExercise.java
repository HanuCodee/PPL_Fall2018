package PPL_Fall2018.Week2.South;

import java.util.Scanner;;

public class StringExercise {
	public static void main(String[] args) {
		// 2
		Scanner sc = new Scanner(System.in);

		System.out.println("Nháº­p há»� vÃ  tÃªn: ");
		String fullname = sc.nextLine();

		System.out.println("Nháº­p tÃªn: ");
		String name = sc.nextLine();

		if (fullname.contains(name)) {
			System.out.println("True");
		} else {
			System.out.println("Not found");
		}

		// 3

		System.out.println("Nháº­p má»™t chuá»—i báº¥t kÃ¬: ");
		String str = sc.nextLine();

		System.out.println("KÃ­ tá»± Ä‘áº§u tiÃªn cá»§a chuá»—i lÃ : " + str.charAt(0));

		//5
		int letterCount = 0;
		int digitCount = 0;
		int wordCount = 0;

		System.out.println("Nháº­p chuá»—i báº¥t kÃ¬: ");
		String ch = sc.nextLine();

		for (int i = 0; i < ch.length(); i++) {
			if (Character.isLetter(ch.charAt(i)))
				letterCount++;
			if (Character.isDigit(ch.charAt(i)))
				digitCount++;
			if (ch.charAt(i) == ' ' && ch.charAt(i + 1) != ' ')
				wordCount++;
		}
		System.out.println("Sá»‘ chá»¯ cÃ¡i lÃ : " + letterCount);
		System.out.println("Sá»‘ chá»¯ sá»‘ lÃ : " + digitCount);
		System.out.println("Sá»‘ tá»« lÃ : " + (wordCount + 1));

		// 6

		int max = 0;
		int dem = 0;

		System.out.println("Nháº­p chuá»—i báº¥t kÃ¬: ");
		String a = sc.nextLine();
		for (int i = 0; i < a.length(); i++) {
		}

		// 7
		System.out.println("Nháº­p vÃ o chuá»—i báº¥t kÃ¬: ");
		String b = sc.nextLine();

		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) == 'u' && b.charAt(i) == 'o' && b.charAt(i) == 'e' && b.charAt(i) == 'a'
					&& b.charAt(i) == 'i') {
				System.out.println(b.trim());
				System.out.println(b.replace('u', ' '));
			}

		}

		//8
	}
}
