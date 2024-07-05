
package gs.dialog;

import gs.modelTabel.modelSupplier;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import koneksi.koneksi;

/**
 *
 * @author Fuji Nur Firdaus
 */
public class jdialogSupplier extends javax.swing.JDialog {
public final Connection conn = new koneksi().configDB();
private DefaultTableModel tabmode;
public modelSupplier ms = new modelSupplier();
    public jdialogSupplier(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadDataSupplier();
        lebarKolom();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        scrollPaneWin111 = new gs.scroll.win11.ScrollPaneWin11();
        tableSup = new gs.component.Table();
        btnCari = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(45, 149, 150));

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PILIH SALAH SATU SUPPPLIER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        tableSup.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tableSup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSupMouseClicked(evt);
            }
        });
        scrollPaneWin111.setViewportView(tableSup);

        btnCari.setFont(new java.awt.Font("Poppins", 2, 14)); // NOI18N
        btnCari.setForeground(new java.awt.Color(153, 153, 153));
        btnCari.setText("Cari Disini ...");
        btnCari.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        btnCari.setOpaque(false);
        btnCari.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnCariFocusGained(evt);
            }
        });
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        btnCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnCariKeyTyped(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gs/image/Search Folder.png"))); // NOI18N

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(btnCari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(scrollPaneWin111, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCari, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(scrollPaneWin111, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableSupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSupMouseClicked
        int row = tableSup.getSelectedRow();

        ms.setKode_supplier(tableSup.getModel().getValueAt(row, 1).toString());
        ms.setNama_supplier(tableSup.getModel().getValueAt(row, 2).toString());
        dispose();
    }//GEN-LAST:event_tableSupMouseClicked

    private void btnCariFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnCariFocusGained
        btnCari.setText("");
    }//GEN-LAST:event_btnCariFocusGained

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnCariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCariKeyTyped
        String sqlPencarian = "select * from tb_gudang where nama_gudang like '%"+btnCari.getText()+"%'";
        pencarian(sqlPencarian);
    }//GEN-LAST:event_btnCariKeyTyped

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
            java.util.logging.Logger.getLogger(jdialogSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdialogSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdialogSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdialogSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdialogSupplier dialog = new jdialogSupplier(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField btnCari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainPanel;
    private gs.scroll.win11.ScrollPaneWin11 scrollPaneWin111;
    private gs.component.Table tableSup;
    // End of variables declaration//GEN-END:variables

    private void pencarian(String sqlPencarian) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void loadDataSupplier() {
       Object[] Baris = {"No","Kode Supplier","Nama Supplier"};
        tabmode = new DefaultTableModel(null, Baris);
        tableSup.setModel(tabmode);
        String sql = "SELECT * FROM tb_supplier ORDER BY kode_supplier ASC;";
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String a = hasil.getString("kode_supplier");
                String b = hasil.getString("nama_supplier");
                String[] data = {"",a,b};
                tabmode.addRow(data);
                noTable();
            }
        } catch (Exception e){
        }
    }

    private void lebarKolom() {
         TableColumn column;
         tableSup.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        column = tableSup.getColumnModel().getColumn(0);
        column.setPreferredWidth(80);
        column = tableSup.getColumnModel().getColumn(1);
        column.setPreferredWidth(100);
        column = tableSup.getColumnModel().getColumn(2);
        column.setPreferredWidth(300);
    }
    
    private void noTable() {
        
       int Baris = tabmode.getRowCount();
        for (int a=0; a<Baris; a++)
        {
            String nomor = String.valueOf(a+1);
            tabmode.setValueAt(nomor +".",a,0);
        }
    }
}
