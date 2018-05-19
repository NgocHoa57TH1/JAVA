/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_bt1;

import java.util.Scanner;

/**
 *
 * @author ngochoak57
 */
public class Lab1_bt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        System.out.print("Ho va ten: ");
        String hoTen = scanner.nextLine();
        System.out.print(" Diem TB: ");
        double diemTB = scanner.nextDouble();
        System.out.printf("%s: %f diem", hoTen,diemTB);
    }
    
}
