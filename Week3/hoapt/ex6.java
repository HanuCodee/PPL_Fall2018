package day3;
import hoa.inputString;

public class ex6 {
	
	public static void main(String[] args) {
		System.out.println("Enter string: ");
		String hoa = inputString.enterString();
		findMostCommonLetter(hoa);
	}
	public static char findMostCommonLetter(String str) {
		//int count = 0;
		char ch = str.charAt(0);
		int max = countFrequence(str, str.charAt(0));
		for (int i = 0; i< str.length(); i ++){
			if (countFrequence(str, str.charAt(i)) > max){
				max = countFrequence(str, str.charAt(i)) ;
				ch =str.charAt(i);
			}
		}
		return ch;
	}
	public static int countFrequence(String str, char ch){

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("Times of " + "'" + ch + "'" + " is " + count + '\n');
		return count;
	}
}