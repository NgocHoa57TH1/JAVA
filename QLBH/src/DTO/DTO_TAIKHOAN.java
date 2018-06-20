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
public class DTO_TAIKHOAN {
    private String sTAIKHOAN;
    private String sMATKHAU;
    
    public DTO_TAIKHOAN(String tk, String mk){
        this.sTAIKHOAN = tk;
        this.sMATKHAU = mk;
    }

    /**
     * @return the sTAIKHOAN
     */
    public String getsTAIKHOAN() {
        return sTAIKHOAN;
    }

    /**
     * @param sTAIKHOAN the sTAIKHOAN to set
     */
    public void setsTAIKHOAN(String sTAIKHOAN) {
        this.sTAIKHOAN = sTAIKHOAN;
    }

    /**
     * @return the sMATKHAU
     */
    public String getsMATKHAU() {
        return sMATKHAU;
    }

    /**
     * @param sMATKHAU the sMATKHAU to set
     */
    public void setsMATKHAU(String sMATKHAU) {
        this.sMATKHAU = sMATKHAU;
    }

}