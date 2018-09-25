package day3;
import hoa.inputString;
public class Ex9 {
	public static void main(String[] args) {
		System.out.println("Enter anything: ");
		String str = inputString.enterString();
		Reverse(str);
	}
	public static String Reverse(String hoa) {
		String reverse = new StringBuffer(hoa).reverse().toString();
		System.out.println("String reverse: " + reverse);
		return hoa;
	}

}
