package day1extrahw;
import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		Scanner hoa = new Scanner(System.in);
		System.out.println("Nhập a đi em ơi");
		double a = hoa.nextDouble();
		System.out.println("Nhập tiếp b đi chứ còn gì");
		double b = hoa.nextDouble();
		System.out.println("Lại còn để ngta nhắc nữa à, nhập c đê");
		double c = hoa.nextDouble();
		
		System.out.println((double)Math.round(a*100)/100+"x^2 + " + (double)Math.round(b*100)/100+"x + " + (double)Math.round(c*100)/100);
		
		}

}
