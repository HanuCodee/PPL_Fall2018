package Ex5_1;

import java.util.Scanner;

public class SinhVien {
	
	public static void main(String[] args) {
		int maSV;
		String hoTen;
		int diemLT;
		int diemTH;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên sinh viên: ");
		hoTen = sc.nextLine();
		System.out.println("Nhập mã sinh viên: ");
		maSV = sc.nextInt();
		System.out.println("Nhập điểm lý thuyết: ");
		diemLT = sc.nextInt();
		System.out.println("Nhập điểm thực hành: ");
		diemTH = sc.nextInt();
		
		int diemTB = (diemLT+diemTH)/2;
		System.out.println("Điểm TB của sinh viên: "+ diemTB);
	
		
	}
	public int diemTB() {
		if(diemTB >= 5) {
			System.out.println(" ");
		}else {
			System.out.println(" ");
		}

	}
}
	