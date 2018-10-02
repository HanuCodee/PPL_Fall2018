/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author Chinh
 */
public class CNhanVien {
    private String mHo;
    private String mTen;
    private int mSoSP;
    
    public CNhanVien(String mHo, String mTen, int mSoSP){
        this.mHo = mHo;
        this.mTen = mTen;
        this.mSoSP = mSoSP;
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
        this.mSoSP = mSoSP;
    }

    public double getLuong(int mSoSP){
        double HeSo;
        if(1<=mSoSP && mSoSP >= 199){
            HeSo = 0.5;
        }else if(200<=mSoSP && mSoSP > 399){
            HeSo = 0.55;
        }else if(400<=mSoSP&& mSoSP > 599){
            HeSo = 0.6;
        }else{
            HeSo = 0.65;
        }
        //return HeSo;
        double Luong= mSoSP*HeSo;
        return Luong;
    }
    
    public boolean nhieuHon(CNhanVien nv2){
        if(mSoSP> nv2.getmSoSP()){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "Nhan vien: "+ mHo+ " "+ mTen + " "+ getLuong(mSoSP);
    }
    
}
