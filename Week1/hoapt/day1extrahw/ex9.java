package day1extrahw;
import java.util.Scanner;
public class ex9 {
	public static void main(String[] args) {
		Scanner hoa = new Scanner(System.in);
		System.out.println("Nhập số thứ nhất");
		double a = hoa.nextDouble();
		System.out.println("Nhập số thứ hai");
		double b = hoa.nextDouble();
		double sum;
		sum = a + b;
		
		double substraction;
		substraction = a - b;
		
		double division;
		division = a/b;
		
		double multip;
		multip = a * b;
		
		
		
		System.out.println(sum);
		System.out.println(substraction);
		System.out.println(division);
		System.out.println(multip);
	}

}
