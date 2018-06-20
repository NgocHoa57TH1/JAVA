/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DAL_KhachHang;
import DAL.LoadComboBox;
import DTO.DTO_KhachHang;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class BLL_KhachHang {
    DAL_KhachHang khDal = new DAL_KhachHang();
    public void LoadDskh (JTable tb){
        Vector tbTieuDe = new Vector();
        Vector tbDong = new Vector();
        tbTieuDe.add("Mã khách hàng");
        tbTieuDe.add("Tên khách hàng");
        tbTieuDe.add("Địa chỉ");
        tbTieuDe.add("Điện thoại");
        tbTieuDe.add("Ghi chú");
        for (DTO_KhachHang kh : khDal.LoadDsKH()){
            Vector v = new Vector();
            v.add(kh.getMaKH());
            v.add(kh.getTenKH());
            v.add(kh.getDiaChi());
            v.add(kh.getDienThoai());
            v.add(kh.getGhiChu());
            tbDong.add(v);
            tb.setModel(new DefaultTableModel(tbDong, tbTieuDe));
    }
    }
    public void ThemKh(DTO_KhachHang kh){
        khDal.Them(kh);
    }
    
    public void XoaKh(String ma){
        khDal.Xoa(ma);
    }
    
    public void SuaKh(DTO_KhachHang kh){
        khDal.Sua(kh);
    }
    
    public Boolean ktraDienThoai(String dt){
        boolean kt = true;
        try {
            int d = Integer.parseInt(dt);
            kt = true;
        } catch (Exception e) {
            kt = false;
        }
        return kt;
    }
    
    public Boolean getTrungMa(String manhap){
        return khDal.getTrungMa(manhap);
    }
    
    public void LoadComboBoxTenKhachHang(JComboBox cbb){
        LoadComboBox lcb = new LoadComboBox();
        lcb.LoadComboBoxTenKhachHang(cbb);
    }
    
    public void TimKh(JTable tb, JComboBox cbb){
        Vector tbTieuDe = new Vector();
        
        Vector tbDong = new Vector();
        tbTieuDe.add("Mã khách hàng");
        tbTieuDe.add("Tên khách hàng");
        tbTieuDe.add("Địa chỉ");
        tbTieuDe.add("Điện thoại");
        for (DTO_KhachHang kh : khDal.TimKH()){
            if (kh.getTenKH().toUpperCase().equals(cbb.getSelectedItem().toString().toUpperCase())){
                Vector v = new Vector();
                v.add(kh.getMaKH());
                v.add(kh.getTenKH());
                v.add(kh.getDiaChi());
                v.add(kh.getDienThoai());
                v.add(kh.getGhiChu());
                tbDong.add(v);
                tb.setModel(new DefaultTableModel(tbDong, tbTieuDe));
            }
            
        }
    }
}
