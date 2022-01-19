/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Class.Awal;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS 10
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    private Awal aw;
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_pass = new javax.swing.JPasswordField();
        txt_name = new javax.swing.JTextField();
        btn_mini = new javax.swing.JLabel();
        btn_ext = new javax.swing.JLabel();
        btn_start = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_pass.setBorder(null);
        txt_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passActionPerformed(evt);
            }
        });
        getContentPane().add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 402, 220, 30));

        txt_name.setBorder(null);
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 220, 30));

        btn_mini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/minimize.png"))); // NOI18N
        btn_mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_miniMouseClicked(evt);
            }
        });
        getContentPane().add(btn_mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        btn_ext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Vector.png"))); // NOI18N
        btn_ext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_extMouseClicked(evt);
            }
        });
        getContentPane().add(btn_ext, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 30, 30));

        btn_start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Group 21.png"))); // NOI18N
        btn_start.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        getContentPane().add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 480, 130, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Frame 22.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        // TODO add your handling code here:
        aw = new Awal();
        
        String name = (txt_name.getText());
        String pass = txt_pass.getText();
        
        aw.setName(name);
        aw.setPassword(pass);
        
        if (aw.login() == true){
            new Dashboard().setVisible(true);
            dispose();
            
        }else{
            JOptionPane.showMessageDialog(null, "salah pass atau id");
        }
    }//GEN-LAST:event_btn_startActionPerformed

    private void btn_extMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_extMouseClicked
        // TODO add your handling code here:
           System.exit(EXIT_ON_CLOSE);
    }//GEN-LAST:event_btn_extMouseClicked

    private void btn_miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_miniMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btn_miniMouseClicked

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_ext;
    private javax.swing.JLabel btn_mini;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txt_name;
    private javax.swing.JPasswordField txt_pass;
    // End of variables declaration//GEN-END:variables
}
