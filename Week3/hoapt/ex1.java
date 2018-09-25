
package day3;
import hoa.inputString;
public class ex1 {
	public static int countFrequenceLetter(int count) {
		//int count = 0;
		String hoa = "What is the most common letter in string?";
		//System.out.println("Enter string: ");
		
		for (int i = 0; i < hoa.length(); i++) {
			if(hoa.charAt(i) == 'h') {
				count++;
			}
		}
		System.out.println("Count: " + count);
		return count;
	}
	public static void main(String[] args) {
		countFrequenceLetter(0);
	}

}
