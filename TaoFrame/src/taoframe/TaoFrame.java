/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taoframe;

import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author ngochoak57
 */
public class TaoFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frame fr = new Frame(" Bai 1");
        fr.setSize(200,300);
        fr.setLayout(new FlowLayout());
        
        
        fr.addWindowListener(new WindowAdapter() {
            public void windowOpened(WindowEvent e) {}
            public void windowClosing(WindowEvent e) {
            System.exit(0);}


        });
        
        lb1 = new Label("A ");
        fr.add(lb1);
        tfA = new TextField(20);
        fr.add(tfA);
        
        lb2 = new Label("B ");
        fr.add(lb2);
        tfB = new TextField(20);
        fr.add(tfB);
        
        Button bnCong = new Button("+");
        bnCong.addActionListener(new LangNgheCong());
        fr.add(bnCong);
        
        Button bnTru = new Button("-");
        bnTru.addActionListener(new LangNgheTru());
        fr.add(bnTru);
        
        Button bnNhan = new Button("*");
        bnNhan.addActionListener(new LangNgheNhan());
        fr.add(bnNhan);
        
        Button bnChia = new Button("/");
        bnChia.addActionListener(new LangNgheChia());
        fr.add(bnChia);
        
        
        
        
        lb3 = new Label("Ket qua: ");
        fr.add(lb3);
        tfKQ = new TextField(20);
        fr.add(tfKQ);
        
         fr.setVisible(true);
    
 }

         
        static class LangNgheCong  implements ActionListener {
       @Override
       public void actionPerformed(ActionEvent e) {
           // Lấy A
           int a = Integer.parseInt(tfA.getText());
           // Lấy B
           int b = Integer.parseInt(tfB.getText());
           //Tính tổng
           int Tong = a+b;
           // Xuất
           tfKQ.setText(String.valueOf(Tong));
       }
    }  
        static class LangNgheTru  implements ActionListener {
       @Override
       public void actionPerformed(ActionEvent e) {
           // Lấy A
           int a = Integer.parseInt(tfA.getText());
           // Lấy B
           int b = Integer.parseInt(tfB.getText());
           //Tính tổng
           int Tong = a-b;
           // Xuất
           tfKQ.setText(String.valueOf(Tong));
       }
    }  
        
    
    static class LangNgheNhan  implements ActionListener {
       @Override
       public void actionPerformed(ActionEvent e) {
           // Lấy A
           int a = Integer.parseInt(tfA.getText());
           // Lấy B
           int b = Integer.parseInt(tfB.getText());
           //Tính tổng
           int Tong = a*b;
           // Xuất
           tfKQ.setText(String.valueOf(Tong));
       }
    }  
        
    
   static class LangNgheChia  implements ActionListener {
       @Override
       public void actionPerformed(ActionEvent e) {
           // Lấy A
           int a = Integer.parseInt(tfA.getText());
           // Lấy B
           int b = Integer.parseInt(tfB.getText());
           //Tính tổng
           int Tong = a/b;
           // Xuất
           tfKQ.setText(String.valueOf(Tong));
       }
    } 
        static Label lb1,lb2,lb3;
        static TextField tfA,tfB,tfKQ;
}

    

