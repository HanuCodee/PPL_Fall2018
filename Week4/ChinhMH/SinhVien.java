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
public class SinhVien {
    private String Ho;
    private String Ten;
    private int DiemTH;
    private int DiemLT;

    public SinhVien(){
        
    }
    
    public SinhVien(String Ho, String Ten, int DiemTH, int DiemLT){
        this.Ho = Ho;
        this.Ten = Ten;
        this.DiemLT = DiemLT;
        this.DiemTH = DiemTH;
    }

    public String getHo() {
        return Ho;
    }

    public void setHo(String Ho) {
        this.Ho = Ho;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getDiemTH() {
        return DiemTH;
    }

    public void setDiemTH(int DiemTH) {
        this.DiemTH = DiemTH;
    }

    public int getDiemLT() {
        return DiemLT;
    }

    public void setDiemLT(int DiemLT) {
        this.DiemLT = DiemLT;
    }
    
    private double DiemTB(int DiemLT, int DiemTH){
        double DiemTB = (DiemLT+DiemTH)/2;
        return DiemTB;
    }
    
    private String KetQua(double DiemTB){
        String KetQua;
        if(DiemTB<5){
            KetQua = "Tạch";
        }else{
            KetQua = "Pass";
        }
        return KetQua;
    }
    
    public String toString(){
        return "Student: "+ Ho+" "+ Ten+ " điểm trung bình: "+ DiemTB(DiemLT, DiemTH)+ " Ket qua: "+KetQua(DiemTB(DiemLT, DiemTH));
    }
}
