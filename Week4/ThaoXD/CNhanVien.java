package PPL_Fall2018.Week4.ThaoXD;

public class CNhanVien {
	private String mHo;
	private String mTen;
	private int mSoSP;

	public CNhanVien(String ho, String ten, int soSP) {
		this.mHo = ho;
		this.mTen = ten;
		this.mSoSP = soSP;
	}

	public String getmHo() {
		return mHo;
	}

	public void setmHo(String mHo) {
		this.mHo = mHo;
	}

	public String getmTen() {
		return mTen;
	}

	public void setmTen(String mTen) {
		this.mTen = mTen;
	}

	public int getmSoSP() {
		return mSoSP;
	}

	public void setmSoSP(int mSoSP) {
		if (validateSoSP(mSoSP))
			this.mSoSP = mSoSP;
	}

	public double getLuong() {
		double luong = 0;
		if(mSoSP >= 1 && mSoSP <= 199) {
			luong = 0.5*mSoSP;
		} else if(mSoSP >= 200 && mSoSP <= 399) {
			luong = 0.55*mSoSP;
		} else if (mSoSP >= 400 && mSoSP <=599) {
			luong = 0.6*mSoSP;
		} else if(mSoSP >= 600) {
			luong = 0.65*mSoSP;
		}
		return luong;
	}

	private boolean validateSoSP(int msoSP) {
		if (mSoSP >= 0) {
			return true;
		} else {
			return false;
		}
	}
	

}
