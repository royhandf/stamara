/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Class.dataHash;
import Class.hashTable;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    private hashTable hash;
    private dataHash data;
    private int maxSize, key;
    private DefaultTableModel tabel;

    public Register() {
        initComponents();
        maxSize = 20;
        hash = new hashTable(maxSize);
        jPanel1.setBackground(new Color(0, 0, 0, 0));
        txtNama.setBackground(new Color(0, 0, 0, 0));
        txtTujuan.setBackground(new Color(0, 0, 0, 0));
        txtKTP.setBackground(new Color(0, 0, 0, 0));
        txtCari.setBackground(new Color(0, 0, 0, 0));
    }

    private void resetData() {
        txtNama.setText("");
        txtKTP.setText("");
        txtTujuan.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        txtNama = new javax.swing.JTextField();
        txtTujuan = new javax.swing.JTextField();
        txtKTP = new javax.swing.JTextField();
        txtCari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelUser = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDelete.setContentAreaFilled(false);
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 548, 95, 32));

        btnAdd.setBackground(new java.awt.Color(0, 0, 0));
        btnAdd.setContentAreaFilled(false);
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 545, 75, 35));

        btnCari.setBackground(new java.awt.Color(51, 51, 51));
        btnCari.setForeground(new java.awt.Color(255, 255, 255));
        btnCari.setText("Cari");
        btnCari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        jPanel1.add(btnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, 80, 50));

        btn_back.setBackground(new java.awt.Color(51, 51, 51));
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 620, 90, 40));

        txtNama.setBorder(null);
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        jPanel1.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 200, 30));

        txtTujuan.setBorder(null);
        jPanel1.add(txtTujuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 442, 210, 30));

        txtKTP.setBorder(null);
        jPanel1.add(txtKTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 542, 210, 30));

        txtCari.setBorder(null);
        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });
        jPanel1.add(txtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 282, 200, 30));

        tabelUser.setBackground(new java.awt.Color(255, 204, 102));
        tabelUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Tujuan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelUser);
        if (tabelUser.getColumnModel().getColumnCount() > 0) {
            tabelUser.getColumnModel().getColumn(0).setResizable(false);
            tabelUser.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 390, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/WhatsApp Image 2021-12-22 at 22.20.12.jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String ktp = txtKTP.getText();
        String nama = txtNama.getText();
        String tujuan = txtTujuan.getText();

        tabel = (DefaultTableModel) tabelUser.getModel();

        if (ktp.equals("") && nama.equals("") && tujuan.equals("")) {
            JOptionPane.showMessageDialog(null, "Harap Diisi", "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            hash.insert(Integer.parseInt(ktp), nama, tujuan);
            tabel.addRow(new Object[]{
                nama,
                tujuan
            });
        }
//        tabelUser.setModel(new DefaultTableModel(null, new String[] {"Nama", "Tujuan"}));
//        DefaultTableModel tabel = (DefaultTableModel) tabelUser.getModel();
//        for (int i = 0; i < 10; i++) {
//            
//        }

        resetData();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        System.out.print("Enter key value to find: ");
        key = Integer.parseInt(txtCari.getText());
        data = hash.find(key);
        if (data != null) {
            JOptionPane.showMessageDialog(null, "No. KTP\t\t:" + data.getKey() + "\n" + "Nama\t\t: " + data.getNama() + "\n" + "Tujuan\t\t: " + data.getTujuan(),
                    "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.out.println("Couldn't find: " + key);
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel tabel = (DefaultTableModel) tabelUser.getModel();
        int baris = tabelUser.getSelectedRow();
        if (baris >= -1) {
            int ok = JOptionPane.showConfirmDialog(null, "Data Akan Dihapus?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (ok == JOptionPane.YES_OPTION) {
                tabel.removeRow(key);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        new Dashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btn_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelUser;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtKTP;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTujuan;
    // End of variables declaration//GEN-END:variables
}
