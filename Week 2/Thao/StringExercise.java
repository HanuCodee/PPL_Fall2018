package thao;

import java.util.Scanner;;

public class StringExercise {
	public static void main(String[] args) {
		// 2
		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("Nhập họ và tên: "); String fullname = sc.nextLine();
		 * 
		 * System.out.println("Nhập tên: "); String name = sc.nextLine();
		 * 
		 * if (fullname.contains(name)) { System.out.println("True"); } else {
		 * System.out.println("Not found"); }
		 */

		// 3
		/*
		 * System.out.println("Nhập một chuỗi bất kì: "); String str = sc.nextLine();
		 * 
		 * System.out.println("Kí tự đầu tiên của chuỗi là: " + str.charAt(0));
		 */

		// 4
		/*int letterCount = 0;
		int digitCount = 0;
		int wordCount = 0;

		System.out.println("Nhập chuỗi bất kì: ");
		String ch = sc.nextLine();

		for (int i = 0; i < ch.length(); i++) {
			if (Character.isLetter(ch.charAt(i)))
				letterCount++;
			if (Character.isDigit(ch.charAt(i)))
				digitCount++;
			if(ch.charAt(i) == ' ' && ch.charAt(i+1) != ' ')
				wordCount++;
		}
		System.out.println("Số chữ cái là: "+ letterCount);
		System.out.println("Số chữ số là: " + digitCount);
		System.out.println("Số từ là: "+ (wordCount + 1));*/
	
		//6
		/*int max = 0;
		int dem = 0;
		
		System.out.println("Nhập chuỗi bất kì: ");
		String a = sc.nextLine();
		for(int i =0; i < a.length(); i++) {
		}*/
		
		//7
		System.out.println("Nhập vào chuỗi bất kì: ");
		String b = sc.nextLine();
		
		
		for(int i = 0; i < b.length(); i++) {
			if(b.charAt(i) == 'u' && b.charAt(i)=='o' && b.charAt(i) == 'e' && b.charAt(i) == 'a' && b.charAt(i)=='i') {
				System.out.println(b.trim());
				System.out.println(b.replace('u', ' '));
			}
				
		} 
			
	}
	}
