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
public class test {

    public static void main(String[] args) {

        CNhanVien cn = new CNhanVien("A", "", 8);
        CNhanVien cn2 = new CNhanVien("B", "C", 6);
        
        System.out.println("NV2 "+cn.getLuong(cn.getmSoSP()));
        System.out.println("NV1 "+cn2.getLuong(cn2.getmSoSP()));
        
        if(cn.nhieuHon(cn2)){
            System.out.println("NV1 co so san pham lon hon NV2 la: "+(cn.getmSoSP() - cn2.getmSoSP()));
        }else{
            System.out.println("NV1 co so san pham it hon NV2 la: "+ (cn2.getmSoSP() - cn.getmSoSP()));
        }
    }
}
