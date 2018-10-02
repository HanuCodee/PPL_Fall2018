package Ex5_1;

public class NhanVien {
	private String maNV;
	private int soSP;

	public NhanVien(String ma, int sp) {
		this.maNV = ma;
		this.soSP = sp;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String ma) {
		this.maNV = ma;
	}

	public int getSoSP() {
		return soSP;
	}

	public void setSoSP(int sp) {
		this.soSP = sp;
	}

	public boolean coVuotChuan(int soSP) {
		if (soSP > 500) {
			return true;
		} else {
			return false;
		}
	}

	public String getTongKet() {
		if (coVuotChuan(soSP)) {
			return "Vuot";
		} else {
			return " ";
		}
	}

	public double getLuong() {
		double luong = 0;
		if (coVuotChuan(this.getSoSP())) {
			luong = this.getSoSP() * 30000;
		} else {
			luong = this.getSoSP() * 20000;
		}
		return luong;
	}

	public String XuatTieuDe() {
		return this.getMaNV() + ", " + this.getSoSP() + ", " + this.getLuong() + ", " + this.getTongKet();
	}

	public String toString() {
		return XuatTieuDe();
	}

	public static void main(String[] args) {
		NhanVien nv = new NhanVien ("123", 456);
		NhanVien nv1 = new NhanVien("", 6778);
		
		System.out.println(nv);
		System.out.println(nv1);
	}
}
