package day3;

import hoa.inputString;

public class ex5 {
	
	public static void main(String[] args) {
		System.out.println("Enter string: ");
		String hoa = inputString.enterString();
	    countLetter(hoa);
		
	}
	public static void countLetter(String name) {
		char[] ch = name.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		for(int i = 0; i<name.length();i++){
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
