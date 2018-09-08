package day2;

import java.util.Scanner;

public class ex8 {
	public static void main(String[] args) {
		String string = "Cute lạc lối";
		Scanner hoa = new Scanner(System.in);
		System.out.println("Please enter 1 character you want to remove!!!");
		String a = hoa.nextLine();
		char[] ch = a.toCharArray();
		removeItem(a, string);
		
	}

}
