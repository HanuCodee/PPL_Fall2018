package day3;

import hoa.inputString;

public class ex6 {
	
	public static void main(String[] args) {
		System.out.println("Enter string: ");
		String hoa = inputString.enterString();
		findMostCommonLetter(hoa);
	}
	public static String findMostCommonLetter(String num) {
		int count = 0;
		char[] a = num.toCharArray();
		for(int i = 0; i < a.length; i++ ) {
			for(int j = 0; j< a.length; j++) {
				if(i < j && a[i] == a[j] ) {
					break;
				}
				if(a[i] == a[j]) {
					count++;
					
				}
			}
			System.out.println("The most common letter "+a[i]+" occur "+count+" times.");	
		}
		
		return num;
	}

}
