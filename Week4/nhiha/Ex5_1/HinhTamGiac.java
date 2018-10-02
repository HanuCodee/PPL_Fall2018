package Ex5_1;

public class HinhTamGiac {
	private int ma;
	private int mb;
	private int mc;

	public HinhTamGiac(int ma, int mb, int mc) {
		if (laTamGiac(ma, mb, mc)) {
			this.ma = ma;
			this.mb = mb;
			this.mc = mc;
		}
	}

	public int getCanhA() {
		return ma;
	}

	public void setCanhA(int a) {
		this.ma = a;
	}

	public int getCanhB() {
		return mb;
	}

	public void setCanhB(int b) {
		this.mb = b;
	}

	public int getCanhC() {
		return mc;
	}

	public void setCanhC(int c) {
		this.mc = c;
	}

	public boolean laTamGiac(int ma, int mb, int mc) {
		if(ma < 0 && mb < 0 && mc < 0) {
			return false;
		}else {
		return true;
		}
	}

	public int getChuVi() {
		return ma + mb + mc;
	}

	public double getDienTich(int p) {
		p = this.getChuVi();
		return Math.sqrt(p * (p - ma) * (p - mb) * (p - mc));
	}
}
