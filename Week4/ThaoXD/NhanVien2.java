package PPL_Fall2018.Week4.ThaoXD;

import java.util.Scanner;

public class NhanVien2 {
	private int maNV;
	private String hoTen;
	private String diaChi;
	private boolean canBoQuanLi;

	public NhanVien2() {
		
	}
	public NhanVien2(int maNV, String hoTen, String diaChi, boolean CBQL) {
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.canBoQuanLi = CBQL;
	}

	public int getMaNV() {
		return maNV;
	}

	public void setMaNV(int maNV) {
		this.maNV = maNV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public boolean isCanBoQuanLi() {
		return canBoQuanLi;
	}

	public void setCanBoQuanLi(boolean canBoQuanLi) {
		if(canBoQuanLi == true) {
			this.canBoQuanLi = canBoQuanLi;
		} else {
			System.out.println("Nhan vien quen");
		}
	}
	public String toString() {
		return "Nhan Vien: " + maNV +  "-" + hoTen + "-" + diaChi + "-" + canBoQuanLi;
	}
	public static void main(String[] args) {
		NhanVien2 nv = new NhanVien2();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap maNV: ");
		nv.maNV = sc.nextInt();
		System.out.print("Nhap ho ten: ");
		nv.hoTen = sc.next();
		System.out.print("Nhap dia chi: ");
		nv.diaChi = sc.next();
		System.out.print("Co la CBQL khong (T/F): ");
		nv.canBoQuanLi = sc.nextBoolean();
		
		System.out.println(nv.toString());
	}
	
}
