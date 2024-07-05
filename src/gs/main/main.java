
package gs.main;

import gs.component.dataObat;
import gs.component.formHome;
//import gs.component.kategoriObat;
import gs.menu.MenuEvent;
import gs.panel.panelAnggota;
import gs.panel.panelDataGudang;
import gs.panel.panelDataSupplier;
import gs.panel.panelKategori;
import gs.panel.panelPengguna;
import gs.panel.panelPerusahaan;
import gs.panel.panelTransaksiKeluar;
import gs.panel.panelTransaksiMasuk;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.util.HashMap;
import javax.security.auth.spi.LoginModule;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import koneksi.koneksi;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JRViewer;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author Fuji Nur Firdaus
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        showForm(new formHome());
        
        menu1.setEvent(new MenuEvent() {
            @Override
            public void selected(int index, int subIndex) {
                if (index == 0) {
                    showForm(new formHome());
                    //menu master barang
                } else if (index == 1){
                    if (subIndex == 1) {
                        showForm(new dataObat());
                    } else if (subIndex == 2) {
                        showForm(new panelDataSupplier());
                    }else if (subIndex == 3) {
                        showForm(new panelDataGudang());
                    }else if (subIndex == 4){
                        showForm(new panelKategori());
                    }
                    // menu transaksi
                } else if (index == 2){
                    if (subIndex == 1){
                        showForm(new panelTransaksiMasuk());
                    } else if (subIndex == 2){
                        showForm(new panelTransaksiKeluar());
                    }
                    //menu laporan
                } else if (index == 3){
                    if (subIndex == 1){
                       tampilLaporanMasuk();
                    }else if (subIndex == 2){
                        tampilLaporanKeluar();
                    }else if (subIndex == 3){
                        tampilLaporanStok();
                    }else if (subIndex == 4){
                        tampilLaporanSupplier();
                    }
                    
                    //menu tentang
                } else if (index == 4){
                    if (subIndex == 1){
                        showForm(new panelPerusahaan());
                    }else if (subIndex == 2){
                        showForm(new panelAnggota());
                    }
                } else if (index == 5){
                    showForm(new panelPengguna());
                    
                }
                
                else if (index == 6) {
                    dispose();
                    formLogin fl = new formLogin();
                 fl.setVisible(true);
                    
                    
            }
                
                else {
                    showForm(new formHome());
                }
            }

            private void tampilLaporanStok() {
                try {
                       String reportPath = "src/gs/laporan/laporanStok.jasper";
                       Connection conn = new koneksi().configDB();

                       HashMap<String, Object> parameters = new HashMap<>();
                       JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
//                       JasperViewer viewer = new JasperViewer(print, false);
//                       viewer.setVisible(true);
                        JRViewer jr=new JRViewer(print); 
                        body.removeAll();
                        body.setLayout(new BorderLayout());
                        body.repaint();
                        body.add(jr);
                        body.revalidate();

                   } catch (Exception e) {
                       JOptionPane.showMessageDialog(null,"Error menampilkan Laporan " + e);
                   }
            }

            private void tampilLaporanSupplier() {
               try {
                       String reportPath = "src/gs/laporan/laporanSupplier.jasper";
                       Connection conn = new koneksi().configDB();

                       HashMap<String, Object> parameters = new HashMap<>();
                       JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
//                       JasperViewer viewer = new JasperViewer(print, false);
//                       viewer.setVisible(true);
                        JRViewer jr=new JRViewer(print); 
                        body.removeAll();
                        body.setLayout(new BorderLayout());
                        body.repaint();
                        body.add(jr);
                        body.revalidate();

                   } catch (Exception e) {
                       JOptionPane.showMessageDialog(null,"Error menampilkan Laporan " + e);
                   }
            }
            private void tampilLaporanMasuk() {
                try {
                       String reportPath = "src/gs/laporan/laporanMasuk.jasper";
                       Connection conn = new koneksi().configDB();

                       HashMap<String, Object> parameters = new HashMap<>();
                       JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
//                       JasperViewer viewer = new JasperViewer(print, false);
//                       viewer.setVisible(true);
                           JRViewer jr=new JRViewer(print); 
                        body.removeAll();
                        body.setLayout(new BorderLayout());
                        body.repaint();
                        body.add(jr);
                        body.revalidate();

                   } catch (Exception e) {
                       JOptionPane.showMessageDialog(null,"Error menampilkan Laporan " + e);
                   }
            }
            
            private void tampilLaporanKeluar() {
                try {
                       String reportPath = "src/gs/laporan/laporanKeluar.jasper";
                       Connection conn = new koneksi().configDB();

                       HashMap<String, Object> parameters = new HashMap<>();
                       JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
//                       JasperViewer viewer = new JasperViewer(print, false);
//                       viewer.setVisible(true);
                        JRViewer jr=new JRViewer(print); 
                        body.removeAll();
                        body.setLayout(new BorderLayout());
                        body.repaint();
                        body.add(jr);
                        body.revalidate();

                   } catch (Exception e) {
                       JOptionPane.showMessageDialog(null,"Error menampilkan Laporan " + e);
                   }
            }
        });
        
    }
    
    
    private void showForm(Component com) {
        body.removeAll();
        body.add(com);
        body.repaint();
        body.revalidate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header1 = new gs.component.header();
        menu1 = new gs.menu.Menu();
        body = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(header1, java.awt.BorderLayout.PAGE_START);

        menu1.setPreferredSize(new java.awt.Dimension(200, 263));
        jPanel1.add(menu1, java.awt.BorderLayout.LINE_START);

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new java.awt.CardLayout());
        jPanel1.add(body, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private gs.component.header header1;
    private javax.swing.JPanel jPanel1;
    private gs.menu.Menu menu1;
    // End of variables declaration//GEN-END:variables

    
}
