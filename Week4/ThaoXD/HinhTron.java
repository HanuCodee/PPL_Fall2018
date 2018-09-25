package PPL_Fall2018.Week4.ThaoXD;

public class HinhTron {

	private float banKinh;

//constructor
	public HinhTron(float banKinh) {
		this.banKinh = banKinh;
	}

	public double getDienTich() {
		return banKinh * banKinh * Math.PI;
	}

	public double getChuVi() {
		return banKinh * 2 * Math.PI;
	}

	public static void main(String[] args) {
		HinhTron ht = new HinhTron(13);
		System.out.println("Dientich la: "  + ht.getDienTich());
		System.out.println("Chu Vi la: "  + ht.getChuVi());
		
	}
}
