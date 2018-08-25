package day1;
import java.util.Scanner;
/**
 * 
 * làm thêm phần đệ quy 
 *
 */
public class ex8 {
	public static void main(String[] args) {
		/*
		 * Viết chương trình tính tổng S = 1 /1! + 2 /2! + ....+ n / n!

		 */
		Scanner hoa = new Scanner(System.in);
		System.out.println("Nhập n");
		int n = hoa.nextInt();
		int frac = 1;
		float sum = 0;
		for(float i = 1; i <= n; i++) {
			frac *= i;
			sum += i/frac;
			
			
			
		}
		System.out.println("Tổng của dãy số là " + sum);
		
	}

}
