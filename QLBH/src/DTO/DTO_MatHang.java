/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Admin
 */
public class DTO_MatHang {
    private String MaMH;
    private String TenMH;
    private String DVT;
    private String DonGiaNhap;
    private String DonGiaBan;
    private String MaLoaiMH;
    
    
     public DTO_MatHang(String MaMH,String TenMH,String DVT,String DonGiaNhap,String DonGiaBan, String MaLoaiMH){
         this.MaMH = MaMH;
         this.TenMH = TenMH;
         this.DVT = DVT;
         this.DonGiaNhap = DonGiaNhap;
         this.DonGiaBan = DonGiaBan;
         this.MaLoaiMH = MaLoaiMH;
     }

    public String getMaMH() {
        return MaMH;
    }

    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

    public String getTenMH() {
        return TenMH;
    }

    public void setTenMH(String TenMH) {
        this.TenMH = TenMH;
    }

    public String getDVT() {
        return DVT;
    }

    public void setDVT(String DVT) {
        this.DVT = DVT;
    }

    public String getDonGiaNhap() {
        return DonGiaNhap;
    }

    public void setDonGiaNhap(String DonGiaNhap) {
        this.DonGiaNhap = DonGiaNhap;
    }

    public String getDonGiaBan() {
        return DonGiaBan;
    }

    public void setDonGiaBan(String DonGiaBan) {
        this.DonGiaBan = DonGiaBan;
    }

    public String getMaLoaiMH() {
        return MaLoaiMH;
    }

    public void setMaLoaiMH(String MaLoaiMH) {
        this.MaLoaiMH = MaLoaiMH;
    }
     
    
}
