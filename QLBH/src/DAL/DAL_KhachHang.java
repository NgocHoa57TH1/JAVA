/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
/**
 *
 * @author Admin
 */
import DTO.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DAL_KhachHang {
    DBConnect s = new DBConnect();
    Connection conn = s.getConnection();
    public ArrayList<DTO_KhachHang> LoadDsKH() { 
        ArrayList<DTO_KhachHang> dskh = new ArrayList<>();
        try {
            String sql = "SELECT * FROM KhachHang";
            Statement ss = conn.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while(rs.next()){
            String makhach = rs.getString("MaKH");
            String hoten = rs.getString("TenKH");
            String diachi = rs.getString("DiaChi");
            String dienthoai = rs.getString("DienThoai");
            String ghichu = rs.getString("GhiChu");
            DTO_KhachHang kh =  new DTO_KhachHang(makhach, hoten, diachi, dienthoai,ghichu);
            dskh.add(kh);
            }
        } catch (Exception ex) {
        }
         return dskh;
    }
    public void Them(DTO_KhachHang kh){
         try {
            String sql = "{call KHACHHANG_THEM(?, ?, ?, ?, ?)}";
            CallableStatement cs = conn.prepareCall(sql);
            cs.setString(1, kh.getMaKH());
            cs.setString(2, kh.getTenKH());
            cs.setString(3, kh.getDiaChi());
            cs.setString(4, kh.getDienThoai());
            cs.setString(5, kh.getGhiChu());
            cs.execute();
        } catch (Exception e) {
        }
    }
    
    public void Xoa(String ma){
        try {
            String sql = "{call KHACHHANG_XOA(?)}";
            CallableStatement cs  = conn.prepareCall(sql);
            cs.setString(1, ma);
            cs.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DAL_KhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Sua(DTO_KhachHang kh){
        try {
            String sql = "{call KHACHHANG_SUA(?, ?, ?, ?, ?)}";
            CallableStatement cs = conn.prepareCall(sql);
            cs.setString(1, kh.getMaKH());
            cs.setString(2, kh.getTenKH());
            cs.setString(3, kh.getDiaChi());
            cs.setString(4, kh.getDienThoai());
            cs.setString(5, kh.getGhiChu());
            cs.execute();
        } catch (Exception e) {
        }
    }
    
     public boolean getTrungMa(String manhap){
        Boolean ktra = true;
        try {
            String sql = "SELECT MaKH FROM KhachHang";
            Statement ss = conn.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while (rs.next()){
                if (manhap.equals(rs.getString("MaKH")))
                    ktra = true;
                else
                    ktra = false;
                break;
                    
            }
        } catch (Exception e) {
        }
        return ktra;
    }
      public ArrayList<DTO_KhachHang> TimKH(){
        ArrayList<DTO_KhachHang> dskh = new ArrayList<>();
        try {
            String sql = "EXEC KHACHHANG_LOAD";
            Statement ss = conn.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while(rs.next()){
                String makhach = rs.getString("MaKH");
                String hoten = rs.getString("TenKH");
                String diachi = rs.getString("DiaChi");
                String dienthoai = rs.getString("DienThoai");
                String ghichu = rs.getString("GhiChu");
                DTO_KhachHang kh = new DTO_KhachHang(makhach, hoten, diachi, dienthoai,ghichu);
                dskh.add(kh);
            }
            
        } catch (Exception e) {
        }
        return dskh;
    }
}
