package day3;
import hoa.inputString;
public class Ex10 {
	public static void main(String[] args) {
		Reverse();
	}

	public static String Reverse() {
		System.out.println("Enter a String: ");
		String a = inputString.enterString();
		String[] str = a.split(" ");

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length; i++) {
			sb = sb.append(str[str.length-i-1]).append(" ");
		}
		System.out.println("Result: " + sb);
		return a;

	}

}
