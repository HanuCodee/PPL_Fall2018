package day4;

public class HinhTron {
	private float banKinh;
	public HinhTron( float banKinh) {
		this.banKinh = banKinh;
		
	}
	public static void main(String[] args) {
		HinhTron ht = new HinhTron(12);
		float chuVi = ht.getChuVi();
		float dienTich = ht.getDienTich();
		System.out.println("Chu vi: " + chuVi);
		System.out.println("Diện tích: " + dienTich);
	}
	public float getDienTich() {
		float dienTich;
		dienTich = (float) (banKinh*banKinh*3.14);
		return dienTich;
		
	}
	public float getChuVi() {
		float chuVi;
		chuVi = (float) (2*3.14*banKinh);
		return chuVi;
	}
	
}
