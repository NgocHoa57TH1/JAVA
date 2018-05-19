/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_bt3;

import java.util.Scanner;

/**
 *
 * @author ngochoak57
 */
public class Lab1_bt3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        System.out.print("Nhap vao do dai canh: ");
        int canh = scanner.nextInt();
        int TheTich = canh * canh * canh;
        // int TheTich = Math.pow(canh,3);
        System.out.printf("the tich khoi lap phuong: %d", TheTich);
    }
    
}
