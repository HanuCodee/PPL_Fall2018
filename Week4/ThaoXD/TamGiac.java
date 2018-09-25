package PPL_Fall2018.Week4.ThaoXD;

public class TamGiac {
	private int a;
	private int b;
	private int c;

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
		this.a = v;
	}

	public int getCanhB() {
		return b;
	}

	public void setCanhB(int v) {
		this.b = v;
	}

	public int getCanhC() {
		return c;
	}

	public void setCanhC(int v) {
		this.c = v;
	}

	public boolean laTamGiac() {
		return true;
	}

	public boolean laTamGiac(int a, int b, int c) {
		if (a + b > c || a + c > b || c + b > a) {
			return true;
		} else {
			return false;
		}
	}

	public int getChuVi() {
		return a + b + c;
	}

	public int getDienTich() {
		return (int) Math.sqrt((a + b + c) * (a + b - c) * (b + c - a) * (c + a - b)) / 4;
	}
}
