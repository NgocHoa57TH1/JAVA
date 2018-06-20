/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DAL_DANGNHAP;
import DTO.DTO_TAIKHOAN;

/**
 *
 * @author Admin
 */
public class BLL_DANGNHAP {
     DAL_DANGNHAP dnDal = new DAL_DANGNHAP();
    public boolean DangNhap(DTO_TAIKHOAN tk){
        return dnDal.DangNhap(tk);
    }
}
