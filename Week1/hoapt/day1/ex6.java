package day1;
import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		/*
		 * Viết chương trình tính tổng S = 1 + 1/2 + 1/3 + … + 1/n 
		 * với n nguyên dương được nhập từ bàn phím.
		 */
		double sum = 0;
		 
		Scanner bai6 = new Scanner(System.in);
		System.out.println("Nhập n ");
		int n = bai6.nextInt();
		 /*
		  * chia các trường hợp
		  */
		if( n == 0) {
			System.out.println("Phương trình vô nghiệm");
		}else {
			/*
			 * (double)(1/i) ép kiểu double
			 */
		
			for(double i = 1; i<=n; i++) {
				sum += 1/i;
			}
			System.out.println("Tổng dãy số là " + sum);
		}
		
		
		
		
	}

}
