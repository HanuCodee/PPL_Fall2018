package day3;

import java.util.Scanner;

public class ex3 {
	public static String printFirstCharac(String name) {
		String[] myName = name.split(" ");
		for(int i = 0; i<myName.length; i++) {
			
				String a = myName[i];
				System.out.print(a.charAt(0)+"."); 
				}
		 return name;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter full name: ");
		String name = sc.nextLine();
		printFirstCharac(name);
	}
}
