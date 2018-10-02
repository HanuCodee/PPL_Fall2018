package PPL_Fall2018.Week4.ThaoXD;

import java.util.Scanner;

public class TamGiac {
	private int a;
	private int b;
	private int c;

	public static void main(String[] args) {
		TamGiac tg = new TamGiac();

		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a: ");
		tg.a = sc.nextInt();
		System.out.print("Nhap b: ");
		tg.b = sc.nextInt();
		System.out.print("Nhap c: ");
		tg.c = sc.nextInt();

		boolean check = tg.laTamGiac();
		if (check == true) {
			System.out.println("La tam giac");
			System.out.println("P = " + tg.getChuVi());
			System.out.println("S = " + tg.getDienTich());
		} else {
			System.out.println("Khong la tam giac");
		}

	}

	public TamGiac() {
		
	}

	public TamGiac(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getCanhA() {
		return a;
	}

	public void setCanhA(int v) {
		if (validateA(a)) {
			this.a = v;
		}
	}

	public int getCanhB() {
		return b;
	}

	public void setCanhB(int v) {
		if (validateB(b)) {
			this.b = v;
		}
	}

	public int getCanhC() {
		return c;
	}

	public void setCanhC(int v) {
		if (validateC(c)) {
			this.c = v;
		}
	}

	public boolean laTamGiac() {
		if (a + b > c && a + c > b && c + b > a) {
			// System.out.println("La tam giac");
			return true;
		} else {
			// System.out.println("Khong phai tam giac");
			return false;
		}
	}

	public boolean laTamGiac(int a, int b, int c) {
		if (a + b > c || a + c > b || c + b > a) {
			return true;
		} else {
			return false;
		}
	}

	private boolean validateA(int a) {
		if (a <= 0) {
			System.out.println("Invalid value");
			return false;
		} else {
			return true;
		}
	}

	private boolean validateB(int b) {
		if (b <= 0) {
			System.out.println("Invalid value");
			return false;
		} else {
			return true;
		}
	}

	private boolean validateC(int c) {
		if (c <= 0) {
			System.out.println("Invalid value");
			return false;
		} else {
			return true;
		}
	}

	public double getChuVi() {
		return a + b + c;
	}

	public double getDienTich() {
		return (int) Math.sqrt((a + b + c) * (a + b - c) * (b + c - a) * (c + a - b)) / 4;
	}

}
