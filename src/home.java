
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
        setMaximumSize(new java.awt.Dimension(1538, 870));
        setMinimumSize(new java.awt.Dimension(1538, 870));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(241, 248, 224));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/veterans.png"))); // NOI18N
        jButton1.setText("Add Veteran details");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(175, 198, 175), new java.awt.Color(80, 84, 70)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 250, -1));

        jButton2.setBackground(new java.awt.Color(241, 248, 224));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pension.png"))); // NOI18N
        jButton2.setText("Pension details");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(175, 198, 175), new java.awt.Color(80, 84, 70)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 250, -1));

        jButton3.setBackground(new java.awt.Color(241, 248, 224));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/payment.png"))); // NOI18N
        jButton3.setText(" Add Payment details");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(175, 198, 175), new java.awt.Color(80, 84, 70)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 250, -1));

        jButton4.setBackground(new java.awt.Color(241, 248, 224));
        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transaction.png"))); // NOI18N
        jButton4.setText("View Transaction details");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(175, 198, 175), new java.awt.Color(80, 84, 70)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 250, -1));

        jButton5.setBackground(new java.awt.Color(241, 248, 224));
        jButton5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        jButton5.setText("Update Veteran");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(175, 198, 175), new java.awt.Color(80, 84, 70)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 250, -1));

        jButton6.setBackground(new java.awt.Color(241, 248, 224));
        jButton6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nominee.png"))); // NOI18N
        jButton6.setText("Add Nominee Details");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(175, 198, 175), new java.awt.Color(80, 84, 70)));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 250, -1));

        jButton7.setBackground(new java.awt.Color(241, 248, 224));
        jButton7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jButton7.setText("    Logout");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(175, 198, 175), new java.awt.Color(80, 84, 70)));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 250, -1));

        jButton8.setBackground(new java.awt.Color(241, 248, 224));
        jButton8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton8.setText("Close");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(175, 198, 175), new java.awt.Color(80, 84, 70)));
        jButton8.setMaximumSize(new java.awt.Dimension(151, 59));
        jButton8.setMinimumSize(new java.awt.Dimension(151, 59));
        jButton8.setPreferredSize(new java.awt.Dimension(151, 59));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 760, 250, -1));

        jButton9.setBackground(new java.awt.Color(241, 248, 224));
        jButton9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/details.png"))); // NOI18N
        jButton9.setText("View Veteran details");
        jButton9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(175, 198, 175), new java.awt.Color(80, 84, 70)));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 250, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 870));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Veteran_details().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Pension_details().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to logout?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            setVisible(false);
            new login().setVisible(true);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to close the application?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new Nominee_details().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        new Full_details().setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new UpdateVeteran().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new Payment().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new Transaction().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
