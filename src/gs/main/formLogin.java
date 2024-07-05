package gs.main;

import gs.component.header;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import koneksi.koneksi;

/**
 *
 * @author Fuji Nur Firdaus
 */
public class formLogin extends javax.swing.JFrame {
private Connection conn = new koneksi().configDB();
    public formLogin() {
        initComponents();
        setBackground(new Color(0,0,0,0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tUser = new javax.swing.JTextField();
        tPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new rojerusan.RSMaterialButtonRectangle();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(822, 478));
        setUndecorated(true);
        getContentPane().setLayout(null);

        tUser.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tUser.setForeground(new java.awt.Color(0, 153, 204));
        tUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 204)));
        getContentPane().add(tUser);
        tUser.setBounds(150, 180, 200, 35);

        tPass.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tPass.setForeground(new java.awt.Color(0, 153, 204));
        tPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 204)));
        getContentPane().add(tPass);
        tPass.setBounds(150, 220, 200, 35);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gs/image/Lock_1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 230, 30, 30);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gs/image/User_2.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 180, 30, 30);

        btnLogin.setBackground(new java.awt.Color(0, 153, 204));
        btnLogin.setText("Login");
        btnLogin.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(110, 300, 250, 50);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LOGIN");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 130, 230, 30);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gs/image/login.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-30, -20, 880, 520);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        String username = tUser.getText();
        try {
            tUser.requestFocus();
            java.sql.Statement stat = conn.createStatement();
            ResultSet result=stat.executeQuery ("select * from tb_user where "
                + "username='" +tUser.getText()+"'");
            if (result.next()) {
                if (tPass.getText().equals(result.getString("password"))){
                    //new menuUtama().show();
                    main mn = new main();
                    mn.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    header.namaOrang.setText(result.getString(2));
                    mn.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(rootPane,"Password Salah");
                    tPass.setText("");
                    tUser.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "User Tidak Ditemukan");
                tUser.setText("");
                tPass.setText("");
                tUser.requestFocus();
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, "Gagal");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField tPass;
    private javax.swing.JTextField tUser;
    // End of variables declaration//GEN-END:variables
}
