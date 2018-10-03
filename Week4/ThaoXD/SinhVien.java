package PPL_Fall2018.Week4.ThaoXD;

import java.util.Scanner;

public class SinhVien {
	private String maSV;
	private String hoTen;
	private double diemLT;
	private double diemTH;

	public SinhVien() {

	}

	public SinhVien(String maSV, String hoTen, double diemLT, double diemTH) {
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		if (validateMaSV(maSV))
			this.maSV = maSV;
	}

	private boolean validateMaSV(String maSV) {
		if (maSV == null) {
			return false;
		} else {
			return true;
		}
	}
	
	public String getHoTen() {
		return hoTen;
	}
	
	public void setHoTen(String hoTen) {
		if(validateHoTen(hoTen))
		this.hoTen = hoTen;
	}
	private boolean validateHoTen(String hoTen) {
		if(hoTen == null) {
			return false;
		} else {
			return true;
		}
	}

	public double getDiemLT() {
		return diemLT;
	}

	public void setDiemLT(int diemLT) {
		this.diemLT = diemLT;
	}

	public double getDiemTH() {
		return diemTH;
	}

	public void setDiemTH(int diemTH) {
		this.diemTH = diemTH;
	}

	public double diemTB() {
		return (diemLT + diemTH) / 2;
	}

	public String toString() {
		return "Ket Qua: " + maSV + "-" + hoTen + "-" + diemLT + "-" + diemTH + "-" + diemTB();
	}

	public void check() {
		if (diemTB() >= 5) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

	public static void main(String[] args) {
		SinhVien sv = new SinhVien();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap Ma SV: ");
		sv.maSV = sc.nextLine();
		System.out.print("Nhap Ho Ten: ");
		sv.hoTen = sc.nextLine();
		System.out.print("Nhap diem li thuyet: ");
		sv.diemLT = sc.nextDouble();
		System.out.print("Nhap diem thuc hanh: ");
		sv.diemTH = sc.nextDouble();

		System.out.println("Diem trung binh cua " + sv.hoTen + " la: " + sv.diemTB());
		System.out.println(sv.toString());
		sv.check();
	}

}
