/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_bt4;

import java.util.Scanner;

/**
 *
 * @author ngochoak57
 */
public class Lab1_bt4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        System.out.print("Nhap vao he so a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap vao he so b: ");
        int b = scanner.nextInt();
        System.out.print("Nhap vao he so c: ");
        int c = scanner.nextInt();
        float Delta = (float) (Math.pow(b,2)-4*a*c);
        float kq = (float) Math.sqrt(Delta);
        System.out.printf(" Ket qua: %f", kq);
    }
    
}
