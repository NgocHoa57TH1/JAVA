/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PL;

import BLL.BLL_TAIKHOAN;
import javax.swing.JOptionPane;
import COMMON.MD5;
import DTO.DTO_TAIKHOAN;
import javax.swing.table.TableModel;

/**
 *
 * @author Admin
 */
public class PL_QLTK extends javax.swing.JFrame {
        BLL_TAIKHOAN tkBll = new BLL_TAIKHOAN();
    /**
     * Creates new form PL_QLTK
     */
    public PL_QLTK() {
        initComponents();
        tkBll.LoadDsTk(tbTK);
    }
     public void Clear_ALL(){
        txtTK.setText("");
        txtMK.setText("");
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTK = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtTK = new javax.swing.JTextField();
        txtMK = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bntThem = new javax.swing.JButton();
        bntXoa = new javax.swing.JButton();
        bntSua = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbTK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTKMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTK);

        jLabel1.setText("TÀI KHOẢN");

        jLabel2.setText("MẬT KHẨU");

        bntThem.setText("THÊM");
        bntThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntThemActionPerformed(evt);
            }
        });

        bntXoa.setText("XÓA");
        bntXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntXoaActionPerformed(evt);
            }
        });

        bntSua.setText("SỬA");
        bntSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSuaActionPerformed(evt);
            }
        });

        jButton5.setText("ĐÓNG");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTK)
                            .addComponent(txtMK, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bntThem)
                        .addGap(36, 36, 36)
                        .addComponent(bntXoa)
                        .addGap(41, 41, 41)
                        .addComponent(bntSua)
                        .addGap(32, 32, 32)
                        .addComponent(jButton5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntThem)
                    .addComponent(bntXoa)
                    .addComponent(bntSua)
                    .addComponent(jButton5))
                .addGap(0, 59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void bntThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntThemActionPerformed
        // TODO add your handling code here:
        if (txtTK.getText().equals("") || txtMK.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập dữ liệu đủ");
        }
        else{
            try {
                if (tkBll.getTrungMa(txtTK.getText())){
                    JOptionPane.showMessageDialog(null, "Tài khoản bị trùng.");
                }
                else{
                    MD5 md5 = new MD5();
                    String taikhoan = txtTK.getText();
                    String matkhau = md5.MD5(txtMK.getText());
                    DTO_TAIKHOAN tk = new DTO_TAIKHOAN(taikhoan, matkhau);
                    if (tkBll.ThemTk(tk)){
                        tkBll.LoadDsTk(tbTK);
                        Clear_ALL();
                        JOptionPane.showMessageDialog(null, "Thêm thành công.");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Thêm không thành công.");
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Lỗi");
            }
        }
    }//GEN-LAST:event_bntThemActionPerformed

    private void bntXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntXoaActionPerformed
        // TODO add your handling code here:
        int iDongDaChon = tbTK.getSelectedRow();
        if (iDongDaChon == -1){
            JOptionPane.showMessageDialog(null, "Mời chọn 1 tài khoản.");
        }
        else{
            try {
                if(JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa tài khoản: \"" + txtTK.getText() + "\" không?", "Thông Báo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                    try {
                        if (tkBll.XoaTk(txtTK.getText())){
                            tkBll.LoadDsTk(tbTK);
                            Clear_ALL();
                            JOptionPane.showMessageDialog(null, "Xóa thành công.");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Xóa không thành công.");
                        }
                    } catch (Exception e) {
                    }
                }
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_bntXoaActionPerformed

    private void bntSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSuaActionPerformed
        // TODO add your handling code here:
         int iDongDaChon = tbTK.getSelectedRow();
        if (iDongDaChon == -1){
            JOptionPane.showMessageDialog(null, "Mời chọn 1 tài khoản.");
        }
        else{
            if (txtMK.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Bạn chưa nhập dữ liệu đủ");
            }
            else{
                try {
                    if (tkBll.getTrungMa(txtTK.getText())){
                        MD5 md5 = new MD5();
                        String taikhoan = txtTK.getText();
                        String matkhau = md5.MD5(txtMK.getText());
                        DTO_TAIKHOAN tk = new DTO_TAIKHOAN(taikhoan, matkhau);
                        if (tkBll.SuaTk(tk)){
                            tkBll.LoadDsTk(tbTK);
                            Clear_ALL();
                            JOptionPane.showMessageDialog(null, "Sửa thành công.");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Sửa không thành công.");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Tài khoản không tồn tại.");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Lỗi");
                }
            }
        }
        
    }//GEN-LAST:event_bntSuaActionPerformed

    private void tbTKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTKMouseClicked
        // TODO add your handling code here:
        int iDongDaChon = tbTK.getSelectedRow();
        TableModel model = tbTK.getModel();
        txtTK.setText(model.getValueAt(iDongDaChon, 0).toString());
        txtMK.setText(model.getValueAt(iDongDaChon, 1).toString());
    }//GEN-LAST:event_tbTKMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PL_QLTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PL_QLTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PL_QLTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PL_QLTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PL_QLTK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntSua;
    private javax.swing.JButton bntThem;
    private javax.swing.JButton bntXoa;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbTK;
    private javax.swing.JTextField txtMK;
    private javax.swing.JTextField txtTK;
    // End of variables declaration//GEN-END:variables

}
