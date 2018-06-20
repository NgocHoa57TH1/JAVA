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
public class DTO_LOAIMATHANG {
    private String sMaLoaiMH;
    private String sTenLoaiMH;
    
    public DTO_LOAIMATHANG(String MaLoaiMH, String TenLoaiMH){
        this.sMaLoaiMH = MaLoaiMH;
        this.sTenLoaiMH = TenLoaiMH;
    }

    /**
     * @return the sMaLoaiMH
     */
    public String getsMaLoaiMH() {
        return sMaLoaiMH;
    }

    /**
     * @param sMaLoaiMH the sMaLoaiMH to set
     */
    public void setsMaLoaiMH(String sMaLoaiMH) {
        this.sMaLoaiMH = sMaLoaiMH;
    }

    /**
     * @return the sTenLoaiMH
     */
    public String getsTenLoaiMH() {
        return sTenLoaiMH;
    }

    /**
     * @param sTenLoaiMH the sTenLoaiMH to set
     */
    public void setsTenLoaiMH(String sTenLoaiMH) {
        this.sTenLoaiMH = sTenLoaiMH;
    }
}
