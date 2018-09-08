package PPL_Fall2018.Week2.Hoapt;

import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {
		Scanner hoa = new Scanner(System.in);
		System.out.println("Please enter anything you want");
		String a = hoa.nextLine();
		String reverse = new StringBuffer(a).reverse().toString();
		//System.out.println("String before reverse: "+a );
		System.out.println("String after reverse: "+reverse);
		
	}

}
