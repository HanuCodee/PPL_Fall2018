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

public class HinhTamGiac {
    
    private double ma;
    private double mb;
    private double mc;
    public HinhTamGiac(){
        
    }
    
    public HinhTamGiac(double ma, double mb, double mc){
        if(LaTamGiac()){
            this.ma = ma;
            this.mb = mb;
            this.mc = mc;            
        }else{
            System.out.println("Invalid");
        }

    }

    public double getMa() {
        return ma;
    }

    public void setMa(double ma) {
        this.ma = ma;
    }

    public double getMb() {
        return mb;
    }

    public void setMb(double mb) {
        this.mb = mb;
    }

    public double getMc() {
        return mc;
    }

    public void setMc(double mc) {
        this.mc = mc;
    }
    
    public boolean LaTamGiac(){
        if(this.ma+this.mb > this.mc || this.ma+this.mc > this.mb || this.mb+this.mc > this.ma){
            return true;
        }else{
            return false;
        }
    }
    public double ChuVi(){
        double chuvi = ma + mb+ mc;
        return chuvi;
    }
    public double DienTich(){
        double dientich;
        double p = (ma+mb+mc)/2;
        dientich = Math.sqrt(p*(p-ma)*(p-mb)*(p-mc));
        return dientich;
    }
}
