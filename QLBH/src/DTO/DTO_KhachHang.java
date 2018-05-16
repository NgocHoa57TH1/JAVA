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
public class DTO_KhachHang {
    private String MaKH;
    private String TenKH;
    private String DiaChi;
    private String DienThoai;
    private String GhiChu;
    
    
     public DTO_KhachHang(String MaKH,String TenKH,String DiaChi,String DienThoai,String GhiChu){
         this.MaKH = MaKH;
         this.TenKH = TenKH;
         this.DiaChi = DiaChi;
         this.DienThoai = DienThoai;
         this.GhiChu = GhiChu;
     }

    /**
     * @return the MaKH
     */
    public String getMaKH() {
        return MaKH;
    }

    /**
     * @param MaKH the MaKH to set
     */
    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    /**
     * @return the TenKH
     */
    public String getTenKH() {
        return TenKH;
    }

    /**
     * @param TenKH the TenKH to set
     */
    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    /**
     * @return the DiaChi
     */
    public String getDiaChi() {
        return DiaChi;
    }

    /**
     * @param DiaChi the DiaChi to set
     */
    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    /**
     * @return the DienThoai
     */
    public String getDienThoai() {
        return DienThoai;
    }

    /**
     * @param DienThoai the DienThoai to set
     */
    public void setDienThoai(String DienThoai) {
        this.DienThoai = DienThoai;
    }

    /**
     * @return the GhiChu
     */
    public String getGhiChu() {
        return GhiChu;
    }

    /**
     * @param GhiChu the GhiChu to set
     */
    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

      
}
   
