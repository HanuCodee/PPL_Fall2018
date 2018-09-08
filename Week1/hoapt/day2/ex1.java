package day2;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner hoa = new Scanner(System.in);
		System.out.println("Nhập 1 dãy số bất kì: ");
		int a = hoa.nextInt();
		int b = 0;
		
		while ( a > 0) {
			b += a % 10;
			System.out.println(a%10);
			a = a/10;
			System.out.println("a = " +a );
			System.out.println("b = " + b);
			
		}
		System.out.println("b = " + b);
		
	}

}
