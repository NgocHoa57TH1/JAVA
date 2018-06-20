/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTO_TAIKHOAN;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class DAL_TAIKHOAN {
    
    DBConnect s = new DBConnect();
    Connection conn = s.getConnection();
    public ArrayList<DTO_TAIKHOAN> LoadDsTk(){
        ArrayList<DTO_TAIKHOAN> dstk = new ArrayList<>();
        try {
            String sql = "EXEC TAIKHOAN_DS";
            Statement ss = conn.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while(rs.next()){
                String taikhoan = rs.getString("TAIKHOAN");
                String matkhau = rs.getString("MATKHAU");
                DTO_TAIKHOAN tk = new DTO_TAIKHOAN(taikhoan, matkhau);
                dstk.add(tk);
            }
            
        } catch (Exception e) {
        }
        return dstk;
    }
    
    public boolean getTrungMa(String taikhoan){
        Boolean ktra = true;
        try {
            String sql = "EXEC TAIKHOAN_DS";
            Statement ss = conn.createStatement();
            ResultSet rs = ss.executeQuery(sql);
            while (rs.next()){
                if (taikhoan.toUpperCase().equals(rs.getString("TAIKHOAN").toUpperCase()))
                    ktra = true;
                else{
                    ktra = false;
                }
                    
                break;
                    
            }
        } catch (Exception e) {
        }
        return ktra;
    }
    
    public Boolean Them(DTO_TAIKHOAN tk){
        boolean ktra = true;
        try {
            String sql = "{call TAIKHOAN_THEM(?, ?)}";
            CallableStatement cs = conn.prepareCall(sql);
            cs.setString(1, tk.getsTAIKHOAN());
            cs.setString(2, tk.getsMATKHAU());
            cs.execute();
        } catch (Exception e) {
            ktra = false;
        }
        return ktra;
    }
    
    public Boolean Xoa(String taikhoan){
        boolean ktra = true;
        try {
            String sql = "{call TAIKHOAN_XOA(?)}";
            CallableStatement cs  = conn.prepareCall(sql);
            cs.setString(1, taikhoan);
            cs.execute();
        } catch (Exception ex) {
            ktra = false;
        }
        return ktra;
    }
    
    public Boolean Sua(DTO_TAIKHOAN tk){
        boolean ktra = true;
        try {
            String sql = "{call TAIKHOAN_SUA(?, ?)}";
            CallableStatement cs = conn.prepareCall(sql);
            cs.setString(1, tk.getsTAIKHOAN());
            cs.setString(2, tk.getsMATKHAU());
            cs.execute();
        } catch (Exception e) {
            ktra = false;
        }
        return ktra;
    }
}
