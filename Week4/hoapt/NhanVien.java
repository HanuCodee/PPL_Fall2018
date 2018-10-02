package day4;

public class NhanVien {
	String maNV;
	int soSP;
	public NhanVien() {
		this.maNV="";
		this.soSP=0;
	}
	public NhanVien(String maNV, int soSP) {
if(soSP<0) soSP=0;
this.maNV = maNV;
this.soSP = soSP;
}
		public String getMaNV() {
			return maNV;
		}
		public void setMaNV(String maNV) {
			this.maNV = maNV;
		}
		public int getSoSP() {
			return soSP;
		}
		public void setSoSP(int soSP) {
			if(soSP<0) {
				soSP=0;
			}
			this.soSP = soSP;
		}
		public boolean coVuotChuan(){
			return this.soSP > 500;
		}
		public String getTongKet(){
			String temp="";
			if(this.coVuotChuan()) {
				temp="Vuot";
			}
			return temp;
		}
		public double getLuong(){
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

		public static void xuatTieuDe(){
			System.out.println("MaNV \t| So San Pham\t| Luong \t| Tong Ket \t|");
		}

		public String toString() {
			return this.maNV +"\t|" + this.soSP +"\t|" + this.getLuong()+"\t|"+this.getTongKet()+"\t|";
		}

		public static void main(String[] args)  {
			NhanVien nv1 = new NhanVien();
			NhanVien nv2 = new NhanVien();
			
		}
}