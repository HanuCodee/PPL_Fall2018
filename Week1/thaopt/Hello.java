package thao;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		/*
		 * // bai 5: S = 1 + 2 + 3 + ... + n int s = 0; Scanner sc = new
		 * Scanner(System.in); System.out.println("Nhập số tự nhiên n"); int n =
		 * sc.nextInt(); for (int i = 0; i <= n; i++) { s += i; }
		 * System.out.println("Tổng " + n + " số tự nhiên là " + s);
		 * 
		 * // bai 6: S = 1 + 1/2 + 1/3 + ... + 1/n float s1 = 0;
		 * System.out.println("Nhập số tự nhiên m"); int m = sc.nextInt(); if (n == 0) {
		 * System.out.println("Không tính được"); } for (float i = 1; i <= m; i++) { s1
		 * += 1 / i; } System.out.println("Tổng  S = 1 + 1/2 + 1/3 + ... + 1/n là " +
		 * s1);
		 * 
		 * // bai 7: n! int a = 1; System.out.println("Nhập số bất kì"); int k =
		 * sc.nextInt(); for (int i = 1; i <= k; i++) { a *= i; }
		 * System.out.println("Giai thua = " + a);
		 * 
		 * // bai 8: S = 1 /1! + 2 /2! + ....+ n / n! int t = 1; float sum = 0;
		 * System.out.println("Nhập số bất kì"); int h = sc.nextInt(); if (h == 1 || h
		 * == 0) { System.out.println("Giai thua = 1"); } else { for (int i = 1; i <= h;
		 * i++) { t *= i; sum += (float) i / t; } }
		 * System.out.println("Tổng S =  1 /1! +  2 /2! + ....+  +  n / n! = " + sum);
		 * //làm bài 8 = đệ quy
		 */
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Nhập số bất kì");
		 * int n = sc.nextInt(); int s = 0; while(n > 0) { s += n % 10;
		 * System.out.println("n =" + n%10); n = n/10; System.out.println("n = "+ n);
		 * System.out.println("s = " + s); } System.out.println("s = "+ s);
		 */

		// bai10: tổng các chữ só trong 1 số - cách 2
	/*	String a = "12345";
		int sum = 0;
		for (int i = 0; i < a.length(); i++) {
			sum += Character.getNumericValue(a.charAt(i));
		}
		System.out.println(sum);*/

		String b = "jsdsjc";
		char c = 'j';
		int count = 0;
		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) == c) {
				count++;
			}
System.out.println(count);
		}
	}

	private static String charAt(String a) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * public static int factory(int n) { if (n == 1) return 1; else { return n *
	 * factory(n - 1); }
	 */
}
