/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DAL_TAIKHOAN;
import DTO.DTO_TAIKHOAN;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class BLL_TAIKHOAN {
    DAL_TAIKHOAN tkDal = new DAL_TAIKHOAN();
    public void LoadDsTk(JTable tb){
        Vector tbTieuDe = new Vector();
        Vector tbDong = new Vector();
        tbTieuDe.add("Tài khoản");
        tbTieuDe.add("Mật khẩu");
        for (DTO_TAIKHOAN tk : tkDal.LoadDsTk()){
            Vector v = new Vector();
            v.add(tk.getsTAIKHOAN());
            v.add(tk.getsMATKHAU());
            tbDong.add(v);
            tb.setModel(new DefaultTableModel(tbDong, tbTieuDe));
        }
    }
    
    public Boolean getTrungMa(String taikhoan){
        return tkDal.getTrungMa(taikhoan);
    }
    
    public Boolean ThemTk(DTO_TAIKHOAN tk){
        return tkDal.Them(tk);
    }
    
    public Boolean XoaTk(String taikhoan){
        return tkDal.Xoa(taikhoan);
    }
    
    public Boolean SuaTk(DTO_TAIKHOAN tk){
        return tkDal.Sua(tk);
    }
}
