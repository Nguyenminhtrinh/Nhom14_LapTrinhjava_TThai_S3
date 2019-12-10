/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyvattu;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dphuong
 */
public class QLCTHoaDon extends javax.swing.JFrame {

    /**
     * Creates new form QLCTHoaDon
     */
    public QLCTHoaDon() {
       initComponents();
       CTHoaDon.doc();
        CTHoaDon.setIndex(CTHoaDon.lenth() - 1);
        hienThi();
        labHienThi.setText((  CTHoaDon.getIndex() + 1) + "/" +  CTHoaDon.lenth());
    }

     void hienThi() {
        VatTu.doc();
        ArrayList<VatTu> DSSP = VatTu.DSVT;
        HoaDon.Open();
        ArrayList<HoaDon> DSHD = HoaDon.DSHD;
        CTHoaDon PX = CTHoaDon.getPX();
        
           try {
             DefaultComboBoxModel cb = new DefaultComboBoxModel();
             for(HoaDon HD: DSHD){             
                cb.addElement(HD.getSoHD());
                if(HD.getSoHD().equals(PX.getSoHD())){
                    cb.setSelectedItem(HD.getSoHD());
                }
            }
             cbSoHD.setModel(cb);
             DefaultComboBoxModel cb1 = new DefaultComboBoxModel();
            for(VatTu VT: DSSP){             
                cb1.addElement(VT.getMaVT());
                if(VT.getMaVT().equals(PX.getMaVT())){
                    cb1.setSelectedItem(VT.getMaVT());
                }
            }
            cbMaVT.setModel(cb1);
            txtSLBan.setText(PX.getSlBan());
            txtDonGia.setText(PX.getDonGia());
            
            
            
        } catch (Exception ex) {
             DefaultComboBoxModel cb = new DefaultComboBoxModel();
            cb.setSelectedItem("");
            cbSoHD.setModel(cb);
            DefaultComboBoxModel cb1 = new DefaultComboBoxModel();
            cb1.setSelectedItem("");
            cbMaVT.setModel(cb1);
            txtSLBan.setText("");
            txtDonGia.setText("");
            
        }
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSLBan = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        tbnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnSapXep = new javax.swing.JButton();
        tbnThoat = new javax.swing.JButton();
        cbMaVT = new javax.swing.JComboBox<>();
        cbSoHD = new javax.swing.JComboBox<>();
        btnTruoc = new javax.swing.JButton();
        btnSau = new javax.swing.JButton();
        labHienThi = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Số Hóa Đơn");

        jLabel2.setText("Mã Vật Tư");

        jLabel3.setText("Số Lượng Bán");

        jLabel4.setText("Đơn Giá");

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyvattu/them2.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyvattu/delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        tbnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyvattu/update1.png"))); // NOI18N
        tbnUpdate.setText("Update");
        tbnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnUpdateActionPerformed(evt);
            }
        });

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyvattu/reset.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyvattu/save.png"))); // NOI18N
        btnSave.setText("SaveFile");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnSapXep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyvattu/coin.png"))); // NOI18N
        btnSapXep.setText("Tính Tiền");
        btnSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepActionPerformed(evt);
            }
        });

        tbnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyvattu/exit3.png"))); // NOI18N
        tbnThoat.setText("Thoát");
        tbnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnThoatActionPerformed(evt);
            }
        });

        cbMaVT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMaVTActionPerformed(evt);
            }
        });

        cbSoHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSoHDActionPerformed(evt);
            }
        });

        btnTruoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyvattu/left.png"))); // NOI18N
        btnTruoc.setText("Sau");
        btnTruoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTruocActionPerformed(evt);
            }
        });

        btnSau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyvattu/next.png"))); // NOI18N
        btnSau.setText("Trước");
        btnSau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSauActionPerformed(evt);
            }
        });

        labHienThi.setText("0/0");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("CT Hóa Đơn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTruoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tbnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(labHienThi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSapXep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMaVT, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSoHD, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSLBan, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(tbnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbSoHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbMaVT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSLBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThem)
                        .addComponent(btnSave))
                    .addComponent(btnReset))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tbnUpdate)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnXoa)))
                        .addGap(18, 18, 18)
                        .addComponent(tbnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTruoc)
                            .addComponent(labHienThi)
                            .addComponent(btnSau))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSapXep)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
         if ("".equals(txtDonGia.getText()) || "".equals(txtSLBan.getText())) {
            JOptionPane.showMessageDialog(this, "Không được để trống");
            return;
        }
        try {
            CTHoaDon PX = new  CTHoaDon(cbSoHD.getSelectedItem().toString(),cbMaVT.getSelectedItem().toString(),txtSLBan.getText(), txtDonGia.getText());
             CTHoaDon.them(PX);
             CTHoaDon.setIndex(  CTHoaDon.lenth() - 1);
            hienThi();
            labHienThi.setText((  CTHoaDon.getIndex() + 1) + "/" +   CTHoaDon.lenth());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Thông tin không hợp lệ");
        }
       
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
         try{
            CTHoaDon.xoa();
            if(  CTHoaDon.getIndex() >=   CTHoaDon.lenth() - 1){
                  CTHoaDon.setIndex(  CTHoaDon.lenth() - 1);
            }
            hienThi();
             labHienThi.setText((  CTHoaDon.getIndex() + 1) + "/" +  CTHoaDon.lenth());
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Thao tác không hợp lệ");
        }       
       
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tbnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnUpdateActionPerformed
        // TODO add your handling code here:
         CTHoaDon PX = new  CTHoaDon(cbSoHD.getSelectedItem().toString(),cbMaVT.getSelectedItem().toString(),txtSLBan.getText(), txtDonGia.getText());
             CTHoaDon.update(PX);
              CTHoaDon.setIndex(  CTHoaDon.lenth() - 1);
            hienThi();
    }//GEN-LAST:event_tbnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
     CTHoaDon.ghi();
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepActionPerformed
        // TODO add your handling code here:
        int sl = Integer.parseInt(txtSLBan.getText());
        int dg = Integer.parseInt(txtDonGia.getText());
        int tien = sl * dg;
        JOptionPane.showMessageDialog(null,"Thanh Tien :" + tien );
    }//GEN-LAST:event_btnSapXepActionPerformed

    private void tbnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnThoatActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_tbnThoatActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtDonGia.setText(" ");
        txtSLBan.setText(" ");
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnTruocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTruocActionPerformed
        // TODO add your handling code here:
        if(CTHoaDon.getIndex() <= 0){
            JOptionPane.showMessageDialog(this, "Thao tác không hợp lệ");
            return;
        }
        CTHoaDon.setIndex(CTHoaDon.getIndex() - 1);
        hienThi();
       labHienThi.setText((CTHoaDon.getIndex() + 1) + "/" + CTHoaDon.lenth());
    }//GEN-LAST:event_btnTruocActionPerformed

    private void btnSauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSauActionPerformed
        // TODO add your handling code here:
        if(CTHoaDon.getIndex() >= CTHoaDon.lenth() - 1){
            JOptionPane.showMessageDialog(this, "Thao tác không hợp lệ");
            return;
        }
        CTHoaDon.setIndex(CTHoaDon.getIndex() + 1);
        hienThi();
        labHienThi.setText((CTHoaDon.getIndex() + 1) + "/" + CTHoaDon.lenth());
    }//GEN-LAST:event_btnSauActionPerformed

    private void cbMaVTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMaVTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMaVTActionPerformed

    private void cbSoHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSoHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSoHDActionPerformed

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
            java.util.logging.Logger.getLogger(QLCTHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLCTHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLCTHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLCTHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLCTHoaDon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSapXep;
    private javax.swing.JButton btnSau;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTruoc;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbMaVT;
    private javax.swing.JComboBox<String> cbSoHD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labHienThi;
    private javax.swing.JButton tbnThoat;
    private javax.swing.JButton tbnUpdate;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtSLBan;
    // End of variables declaration//GEN-END:variables
}
