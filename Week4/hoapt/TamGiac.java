package day4;
import hoa.inputInt;
public class TamGiac {
	private int ma;
	private int mb;
	private int mc;
	public static void main(String[] args) {
		TamGiac tg = new TamGiac();
		System.out.println("Enter ma, mb, mc: ");
		tg.ma = inputInt.enterInt();
		tg.mb = inputInt.enterInt();
		tg.mc = inputInt.enterInt();
		
		if (tg.laTamGiac()) {
		double chuVi = tg.getChuVi();
		double dienTich= tg.getDienTich();
		System.out.println("Chu vi: "+ chuVi);
		System.out.println("Diện tích: "+ dienTich);
		}
		
	}
	public TamGiac() {
		ma = mb = mc = 0;
		
	}
	public TamGiac(int a, int b, int c) {
		
		this.ma = a;
		this.mb = b;
		this.mc = c;
		
		
	}
	public int getCanhA() {
		
		return ma;
	}
	public void setCanhA(int a) {
		if(validateA(ma)){
		this.ma = a;
		}
		
	}
	public int getCanhB() {
		return mb;
	}
	public void setCanhB(int b) {
		if(validateB(mb)) {
		this.mb = b;
		}
	}
	public int getCanhC() {
		return mc;
	}
	public void setCanhC(int c) {
		if(validateC(mc)) {
			this.mc = c;	
		}
		
	}
	public boolean laTamGiac() {
		
		return (ma+mc>mb && ma+mb>mc && mc+mb>ma);
	}
	public boolean laTamGiac(int a, int b, int c) {
		if( a +b > c || a + c > b || b + c >a) {
			return true;
			
		}else
			return false;
	}
	private boolean validateA(int a){
		if(a <= 0) {
			System.out.println("Not valid");
			return false;
		}else {
			return true;
		}
		
	}
	private boolean validateB(int b) {
		if(b <= 0) {
			System.out.println("Not valid");
			return false;
		}else {
			return true;
		}
	}
	private boolean validateC(int c) {
		if(c <= 0) {
			System.out.println("Not valid");
			return false;
		}else {
			return true;
		}
	}
	public int getChuVi() {
		return ( ma + mb + mc);
	}
	public double getDienTich(){
		 float p = (ma+mb+mc)/2;
		 float s = (float) Math.sqrt(p*(p-ma)*(p-mb)*(p-mc));
		 return s;
		
	}
	

}
