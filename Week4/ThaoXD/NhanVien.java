package PPL_Fall2018.Week4.ThaoXD;

import java.util.Scanner;

public class NhanVien {
	private String maNV;
	private int soSP;

	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien();
		NhanVien nv2 = new NhanVien();
		
		
	}
	public NhanVien() {

	}

	public NhanVien(String ma, int sp) {
		this.maNV = ma;
		this.soSP = sp;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		if(validateMaNV(maNV)) {			
			this.maNV = maNV;
		}
	}

	public int getSoSP() {
		return soSP;
	}

	public void setSoSP(int soSP) {
		if (validateSoSP(soSP)) {
			this.soSP = soSP;
		} else {
			this.soSP = 0;
		}
	}

	private boolean validateMaNV(String maNV) {
		if (maNV == null) {
			return false;
		} else {
			return true;
		}
	}

	private boolean validateSoSP(int soSP) {
		if (soSP > 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean coVuotChuan() {
		if (soSP > 500) {
			return true;
		} else {
			return false;
		}
	}

	public String getTongKet() {
		if (soSP > 500) {
			System.out.println("Vuot");
		}
		return null;
	}

	public double getLuong() {
		int luong;
		if (soSP > 500) {
			luong = 500 * 20000 + (soSP - 500) * 30000;
			System.out.println("Luong vuot chuan la: " + luong);
		} else {
			luong = 20000 * soSP;
			System.out.println("Luong co ban la: " + luong);
		}
		return luong;

	}

	public static void xuatTieuDe() {
		System.out.println("MaNV" + "|" + "SoSP" + "|" + "Luong" + "|" + "TongKet");
	}

	public String toString() {
		return "Customer: {" + maNV + "_" + soSP + getLuong() + getTongKet() + "}";
	}

	
}
