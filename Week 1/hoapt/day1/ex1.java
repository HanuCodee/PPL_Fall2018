package day1;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		/*
		 * Viết chương trình giải phương trình bậc hai.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập a");
		double a = sc.nextDouble();
		System.out.println("Nhập b");
		double b = sc.nextDouble();
		System.out.println("Nhập c");
		double c = sc.nextDouble();
		/*
		 * Trở thành phương trình bậc 1
		 */
		if (a == 0) {
			if (b == 0 && c != 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (b == 0 && c == 0) {
				System.out.println("Phương trình vô số nghiệm");
			} else {
				System.out.println("Phương trình có nghiệm là: " + -c / b);
			}

		} else {
			double delta = b * b - 4 * a * c;
			if (delta == 0) {
				System.out.println("Phương trình có nghiệm kép là: " + -b / (2 * a));
			} else if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else {
				System.out.println("phương trình có hai nghiệm phân biệt là :" + (-b - Math.sqrt(delta)) / (2 * a)
						+ "và" + (-b + Math.sqrt(delta)) / (2 * a));
			}
		}

	}
}
