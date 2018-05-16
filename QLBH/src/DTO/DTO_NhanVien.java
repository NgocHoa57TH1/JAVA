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
public class DTO_NhanVien {
    private String MaNV;
    private String HoNV;
    private String TenNV;
    private String GioiTinh;
    private String NgaySinh;
    private String Diachi;
    private String Luong;
    private String MaPB;
    
    
      public DTO_NhanVien(String MaNV,String HoNV, String TenNV,String GioiTinh,String NgaySinh,String Diachi, String Luong, String MaPB){
         this.MaNV = MaNV;
         this.HoNV = HoNV;
         this.TenNV = TenNV;
         this.GioiTinh = GioiTinh;
         this.NgaySinh = NgaySinh;
         this.Diachi = Diachi ;
         this.Luong = Luong;
         this.MaPB = MaPB;
     }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getHoNV() {
        return HoNV;
    }

    public void setHoNV(String HoNV) {
        this.HoNV = HoNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getLuong() {
        return Luong;
    }

    public void setLuong(String Luong) {
        this.Luong = Luong;
    }

    public String getMaPB() {
        return MaPB;
    }

    public void setMaPB(String MaPB) {
        this.MaPB = MaPB;
    }
      
      

}
