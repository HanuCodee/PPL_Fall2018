package day3;

import java.util.Scanner;

//import hoa.inputString;
public class ex2 {
	public static String findName(String name, String fullName) {
		if(fullName.contains(name)) {
			System.out.println("The name exists in full name");
		}else {
			System.out.println("The name doesn't exist in full name");
		}
		
		
		return name;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter full name: ");		
		String fullName = sc.nextLine();
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		findName(name, fullName);
		
	}

}
