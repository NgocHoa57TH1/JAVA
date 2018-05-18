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
    private String SoLuongTon;
    
    
     public DTO_MatHang(String MaMH,String TenMH,String DVT,String DonGiaNhap,String DonGiaBan, String MaLoaiMH, String SoLuongTon){
         this.MaMH = MaMH;
         this.TenMH = TenMH;
         this.DVT = DVT;
         this.DonGiaNhap = DonGiaNhap;
         this.DonGiaBan = DonGiaBan;
         this.MaLoaiMH = MaLoaiMH;
         this.SoLuongTon = SoLuongTon;
     }

    

    /**
     * @return the MaMH
     */
    public String getMaMH() {
        return MaMH;
    }

    /**
     * @param MaMH the MaMH to set
     */
    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

    /**
     * @return the TenMH
     */
    public String getTenMH() {
        return TenMH;
    }

    /**
     * @param TenMH the TenMH to set
     */
    public void setTenMH(String TenMH) {
        this.TenMH = TenMH;
    }

    /**
     * @return the DVT
     */
    public String getDVT() {
        return DVT;
    }

    /**
     * @param DVT the DVT to set
     */
    public void setDVT(String DVT) {
        this.DVT = DVT;
    }

    /**
     * @return the DonGiaNhap
     */
    public String getDonGiaNhap() {
        return DonGiaNhap;
    }

    /**
     * @param DonGiaNhap the DonGiaNhap to set
     */
    public void setDonGiaNhap(String DonGiaNhap) {
        this.DonGiaNhap = DonGiaNhap;
    }

    /**
     * @return the DonGiaBan
     */
    public String getDonGiaBan() {
        return DonGiaBan;
    }

    /**
     * @param DonGiaBan the DonGiaBan to set
     */
    public void setDonGiaBan(String DonGiaBan) {
        this.DonGiaBan = DonGiaBan;
    }

    /**
     * @return the MaLoaiMH
     */
    public String getMaLoaiMH() {
        return MaLoaiMH;
    }

    /**
     * @param MaLoaiMH the MaLoaiMH to set
     */
    public void setMaLoaiMH(String MaLoaiMH) {
        this.MaLoaiMH = MaLoaiMH;
    }

    /**
     * @return the SoLuongTon
     */
    public String getSoLuongTon() {
        return SoLuongTon;
    }

    /**
     * @param SoLuongTon the SoLuongTon to set
     */
    public void setSoLuongTon(String SoLuongTon) {
        this.SoLuongTon = SoLuongTon;
    }

    
    
}
