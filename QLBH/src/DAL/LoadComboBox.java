/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author Admin
 */
public class LoadComboBox {
    
    /*public void LoadComboBoxDisplay(JComboBox cbb, String sql, String b){
        try {
            DBConnect s = new DBConnect();
            Connection conn = s.getConnection();
            Statement ss = conn.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while(rs.next()){
                cbb.addItem(rs.getString(b));
            }
        } catch (Exception e) {
        }
    }
    public void LoadComboBox(JComboBox cbb, String sql, String b){
        try {
            DBConnect s = new DBConnect();
            Connection conn = s.getConnection();
            Statement ss = conn.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while(rs.next()){
                cbb.addItem(rs.getString(b));
            }
        } catch (Exception e) {
        }
    }
     public void LoadComboBoxMaLoai(JComboBox cbb){
        cbb.removeAllItems();
        String sql = "SELECT * FROM MatHang";
        String b = "MaLoaiMH";
        LoadComboBox(cbb, sql, b);
    }
     
     public void LoadComboBoxTenKhachHang(JComboBox cbb){
        cbb.removeAllItems();
        String sql = "SELECT TenKH FROM KhachHang GROUP BY TenKH";
        String b = "TenKH";
        LoadComboBoxDisplay(cbb, sql, b);
    }*/
     public void LoadComboBoxDisplay(JComboBox cbb, String sql, String b){
        try {
            DBConnect s = new DBConnect();
            Connection conn = s.getConnection();
            Statement ss = conn.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while(rs.next()){
                cbb.addItem(rs.getString(b));
            }
        } catch (Exception e) {
        }
    }
    
    public ArrayList<String> LoadComboBoxValue(String sql, String b){
        ArrayList<String> value = new  ArrayList<>();
        try {
            DBConnect s = new DBConnect();
            Connection conn = s.getConnection();
            Statement ss = conn.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while(rs.next()){
                value.add(rs.getString(b));
            }
        } catch (Exception e) {
        }
        return value;
    }
    
    public void LoadComboBoxTenKhachHang(JComboBox cbb){
        cbb.removeAllItems();
        String sql = "SELECT TenKH FROM KhachHang GROUP BY TenKH";
        String b = "TenKH";
        LoadComboBoxDisplay(cbb, sql, b);
    }
    
    public ArrayList<String> LoadMaLoai(){
        String sql = "SELECT * FROM LoaiMatHang";
        String b = "MaLoaiMH";
        return LoadComboBoxValue(sql, b);
    }
    
    public void LoadComboBoxMaLoai(JComboBox cbb){
        cbb.removeAllItems();
        String sql = "SELECT * FROM MatHang";
        String b = "TenLoaiMH";
        LoadComboBoxDisplay(cbb, sql, b);
    }
    
    public String getValueComboBoxTenLoai(JComboBox cbbdp){
        return LoadMaLoai().get(cbbdp.getSelectedIndex());
    }
}
