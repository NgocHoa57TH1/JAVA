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
public class DTO_NHATKIBAN {
    private String sMaMH;
    private String sMaKH;
    private String sNgayBan;
    
    public DTO_NHATKIBAN(String MaMH, String MaKH, String NgayBan){
        this.sMaMH = MaMH;
        this.sMaKH = MaKH;
        this.sNgayBan = NgayBan;
    }

    /**
     * @return the sMaMH
     */
    public String getsMaMH() {
        return sMaMH;
    }

    /**
     * @param sMaMH the sMaMH to set
     */
    public void setsMaMH(String sMaMH) {
        this.sMaMH = sMaMH;
    }

    /**
     * @return the sMaKH
     */
    public String getsMaKH() {
        return sMaKH;
    }

    /**
     * @param sMaKH the sMaKH to set
     */
    public void setsMaKH(String sMaKH) {
        this.sMaKH = sMaKH;
    }

    /**
     * @return the sNgayBan
     */
    public String getsNgayBan() {
        return sNgayBan;
    }

    /**
     * @param sNgayBan the sNgayBan to set
     */
    public void setsNgayBan(String sNgayBan) {
        this.sNgayBan = sNgayBan;
    }
}
