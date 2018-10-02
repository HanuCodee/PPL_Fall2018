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
public class NhanVien {
    private String MaNV;
    private int soSP;
    
    public NhanVien(){
        
    }
    
    public NhanVien(String MaNV, int soSP){
        this.MaNV = MaNV;
        this.soSP = soSP;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        this.soSP = soSP;
    }
    
    public boolean coVuotChuan(int soSP) {
        if(soSP>500){
            return true;
        }else{
            return false;
        }
    }
    
    public String getTongKet(int soSP){
        String rt = "Vượt";
        if(soSP>500){
            
            return rt;
        }else{
            return "";
        }
    }
    
    public double getLuong(int soSP){
        int luong;
        if(coVuotChuan(soSP)){
            luong = soSP*30000;
        }else{
            luong = soSP*20000;
        }
        return luong;
    }
    
    public static void XuatTieuDe(){
        
    }
    public String toString(){
        return "Nhân Viên:  "+ MaNV+ "  "+ soSP+ "  "+ getLuong(soSP)+ "     "+ getTongKet(soSP);
    }
}
