package day2;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		Scanner hoa = new Scanner(System.in);
		System.out.println("Please enter anything you want!!!");
		String a = hoa.nextLine();
		// chuyển string về dạng array
		char[] ch = a.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		for(int i = 0; i<a.length();i++){
			if(Character.isLetter(ch[i])) {
				letter ++;
			}
			else if(Character.isDigit(ch[i])) {
				num ++;
			}
			else if(Character.isSpaceChar(ch[i])) {
				space ++;
			}else {
				other ++;
				
			}
			
		}
		System.out.println("letter: "+letter);
		System.out.println("num: "+num);
		System.out.println("space: "+space);
		System.out.println("other: "+other);
	}

}
