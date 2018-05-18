/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DAL_MatHang;
import DAL.LoadComboBox;
import DTO.DTO_MatHang;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class BLL_MatHang {
    DAL_MatHang mhDAL = new DAL_MatHang();
    public void LoadDSMH(JTable tb){
        Vector tbTieuDe = new Vector();
        Vector tbDong = new Vector();
        tbTieuDe.add("Mã MH");
        tbTieuDe.add("Tên MH");
        tbTieuDe.add("Đơn vị tính");
        tbTieuDe.add("Đon giá nhập");
        tbTieuDe.add("Đơn giá bán");
        tbTieuDe.add("Mã loại mặt hàng");
        tbTieuDe.add("Số lượng tồn");
        for (DTO_MatHang x : mhDAL.LoadDSMH()){
            Vector v = new Vector();
            v.add(x.getMaMH());
            v.add(x.getTenMH());
            v.add(x.getDVT());
            v.add(x.getDonGiaNhap());
            v.add(x.getDonGiaBan());
            v.add(x.getMaLoaiMH());
            v.add(x.getSoLuongTon());
            tbDong.add(v);
            tb.setModel(new DefaultTableModel(tbDong, tbTieuDe));
        }
       mhDAL.LoadDSMH();
    }
     public void LoadCbbMaLoai(JComboBox cbb){
        LoadComboBox lcb = new LoadComboBox();
        lcb.LoadComboBoxMaLoai(cbb);
    }
    
    public void ThemMH(DTO_MatHang mh){
        mhDAL.ThemMH(mh);
    }
    
    public void XoaMH(String MaMH){
        mhDAL.XoaMH(MaMH);
    }
    
    public void SuaMH(DTO_MatHang mh){
        mhDAL.SuaMH(mh);
    }
    
    public boolean getTrungMa(String manhap){
        return mhDAL.getTrungMa(manhap);
    }
}
