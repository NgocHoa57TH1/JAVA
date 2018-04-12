/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_bt2;

import java.util.Scanner;

/**
 *
 * @author ngochoak57
 */
public class Lab1_bt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        System.out.print("Nhap chieu dai: ");
        int CD = scanner.nextInt();
        System.out.print("Nhap chieu rong: ");
        int CR = scanner.nextInt();
        int ChuVi = (CD+CR)*2;
        int DienTich = CD*CR;
        int CanhMin = Math.min(CD,CR);
        System.out.printf("chu vi hinh chu nhat: %d", ChuVi);
        System.out.printf("\n dien tich hinh chu nhat: %d", DienTich);
        System.out.printf("\n canh nho : %d", CanhMin);
    }
    
}
