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
public class DTO_PhongBan {
    private String MaPB;
    private String TenPB;
    
    public DTO_PhongBan ( String MaPB,String TenPB){
        this.MaPB = MaPB;
        this.TenPB = TenPB;
        
    }

    public String getMaPB() {
        return MaPB;
    }

    public void setMaPB(String MaPB) {
        this.MaPB = MaPB;
    }

    public String getTenPB() {
        return TenPB;
    }

    public void setTenPB(String TenPB) {
        this.TenPB = TenPB;
    }
}
