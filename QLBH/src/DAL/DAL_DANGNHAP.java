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

/**
 *
 * @author Admin
 */
public class DAL_DANGNHAP {
    public Boolean DangNhap(DTO_TAIKHOAN tk){
        boolean test = true;
        try {
            DBConnect s = new DBConnect();
            Connection conn = s.getConnection();
            
            String sql = "{call DANGNHAP(?, ?)}";
            CallableStatement cs =conn.prepareCall(sql);
            cs.setString(1, tk.getsTAIKHOAN());
            cs.setString(2, tk.getsMATKHAU());
            
            ResultSet rs = cs.executeQuery();
            if (rs.next()){
                test = true;
            }
            else{
                test = false;
            }
            
        } catch (Exception e) {
            test = false;
        }
        return test;
    }
}
