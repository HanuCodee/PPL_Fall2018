package day1;
import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		/*
		 * Viết chương trình tính n! 
		 * với n là số nguyên dương được nhập từ bàn phím.

		 */
		int frac = 1;
		Scanner bai7 = new Scanner(System.in);
		System.out.println("Nhập n");
		int n = bai7.nextInt();
		if( n == 0 || n == 1) {
			System.out.println("Gia thừa của " + frac + " là 1." );
		}else {
			for(int i=2; i<=n; i++) {
				frac *= i;
			}
			System.out.println("Giai thừa của " + n +" là " + frac);
		}
		/**
		 * void thì ko có return
		 * int bắt buộc phải có return
		 * 
		 * đệ quy 2 phần 
		 * + base
		 * + công thức: gọi lại chính nó
		 * public static int factory (int n){
		 * 		if (n == 1){
		 *			 return 1;
		 * 
		 *		 } else{			
		 * 			return n*factory(n-1);
		 * 		}
		 * }
		 */
		}

}
