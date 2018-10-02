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
public class BNhanVien {
    private int MaNV;
    private String HoTen;
    private String DiaChi;
    private boolean CBQL;
    
    public BNhanVien(int MaNV, String HoTen, String DiaChi, boolean CBQL){
        this.MaNV = MaNV;
        this.HoTen = HoTen;
        this.DiaChi = DiaChi;
        this.CBQL = CBQL;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public boolean isCBQL() {
        return CBQL;
    }

    public void setCBQL(boolean CBQL) {
        this.CBQL = CBQL;
    }
    
    private String CBQL(boolean CBQL){
        String CB;
        if(CBQL){
            CB = "CBQL";
            
        }else{
            CB = "";
        }
        return CB;
    }
    
    public String toString (){
        return "Nhân viên: "+ MaNV + " "+ HoTen + " "+ DiaChi + " " + CBQL(CBQL);
    }
}
