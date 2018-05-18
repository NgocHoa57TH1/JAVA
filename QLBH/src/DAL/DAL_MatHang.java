/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTO_MatHang;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DAL_MatHang {
    DBConnect s = new DBConnect();
    Connection conn = s.getConnection();
    public ArrayList<DTO_MatHang> LoadDSMH(){
        ArrayList<DTO_MatHang> dsmh = new ArrayList<>();
        try {
            String sql = "SELECT * FROM MatHang";
            Statement ss = conn.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while(rs.next()){
                String ma = rs.getString("MaMH");
                String ten = rs.getString("TenMH");
                String dvt = rs.getString("DVT");
                String dgn = rs.getString("DonGiaNhap");
                String dgb = rs.getString("DonGiaBan");
                String maloai = rs.getString("MaLoaiMH");
                String slt = rs.getString("SoLuongTon");
                DTO_MatHang mh = new DTO_MatHang(ma, ten, dvt, dgn, dgb, maloai, slt);
                dsmh.add(mh);
            }
        } catch (Exception e) {
        }
        
        return dsmh;
 }       
 public boolean getTrungMa(String manhap){
        Boolean ktra = true;
        try {
            String sql = "SELECT MaMH FROM MatHang";
            Statement ss = conn.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while (rs.next()){
                if (manhap.equals(rs.getString("MaMH")))
                    ktra = true;
                else
                    ktra = false;
                break;
                    
            }
        } catch (Exception e) {
        }
        return ktra;
    }
    
    public void ThemMH(DTO_MatHang mh){
        try {
            String sql = "{call  MATHANG_THEM(?, ?, ?, ?, ?, ?, ?)}";
            CallableStatement cs = conn.prepareCall(sql);
            cs.setString(1, mh.getMaMH());
            cs.setString(2, mh.getTenMH());
            cs.setString(3, mh.getDVT());
            cs.setString(4, mh.getSoLuongTon());
            cs.setString(5, mh.getDonGiaNhap());
            cs.setString(6, mh.getDonGiaBan());
            cs.setString(7, mh.getMaLoaiMH());
            cs.execute();
        } catch (Exception e) {
        }
    }
    
    public void XoaMH(String MaMH){
        try {
            String sql = "{call MATHANG_XOA(?)}";
            CallableStatement cs  = conn.prepareCall(sql);
            cs.setString(1, MaMH);
            cs.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DAL_MatHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void SuaMH(DTO_MatHang mh){
        try {
            String sql = "{call MATHANG_SUA(?, ?, ?, ?, ?, ?, ?)}";
            CallableStatement cs = conn.prepareCall(sql);
            cs.setString(1, mh.getMaMH());
            cs.setString(2, mh.getTenMH());
            cs.setString(3, mh.getDVT());
            cs.setString(4, mh.getSoLuongTon());
            cs.setString(5, mh.getDonGiaNhap());
            cs.setString(6, mh.getDonGiaBan());
            cs.setString(7, mh.getMaLoaiMH());
            cs.execute();
        } catch (Exception e) {
        }
    }
    }
    

