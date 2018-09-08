package day1;

import java.util.Scanner;

public class ex5 {
	/*
	 * Viết chương trình tính tổng S = 1 + 2 + 3 + … + n với n nguyên 
	 * dương được nhập từ bàn phím.
	 */
	public static void main(String[] args) {
		int sum = 0;
	
		Scanner hoa = new Scanner(System.in);
		System.out.println("Nhập số n ");
		int n = hoa.nextInt();
		
		/*
		 * chia trường hợp n=0, n!=0
		 */
		sum = (n*(n+1))/2;
		System.out.println("Tổng dãy số là " + sum);
		
	}

}
