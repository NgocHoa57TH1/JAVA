/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vd1_1;

import java.util.ArrayList;

/**
 *
 * @author ngochoak57
 */
public class VD1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList <String> a = new ArrayList<String>();
        a.add("Cuong");
        a.add("Tuan");
        a.add("Phuong");
        a.add("Hanh");
        // in ra so phan tu
        int soPT = a.size();
        System.out.println(" So phan tu cua danh sach:" +soPT);
        //Xoa mot ban trong dah sach
        a.remove("Hanh");
        //Kiem tra phan tu da duoc xoa hay chua
        for (int i=0; i< soPT; i++)
            System.out.println(a.get(i));
        for (Object x: a)
            System.out.println(x.toString());
        // Kiem tra xem co ban Cuong trong danh sach khong?
        boolean coCuong = a.contains("Cuong");
        if (coCuong)
            System.out.print("Co Ban Cuong");
        else System.out.println("Khong co ban Cuong");
    }
    
}
