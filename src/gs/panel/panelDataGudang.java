
package gs.panel;

import gs.component.dataObat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import koneksi.koneksi;

/**
 *
 * @author Fuji Nur Firdaus
 */
public class panelDataGudang extends javax.swing.JPanel {
public final Connection conn = new koneksi().configDB(); //memanggil koneksi
private DefaultTableModel tabmode; //membuat table mode
    
    public panelDataGudang() {
        initComponents();
        dataGudang();
        btnHapus.setVisible(false);
        btnBatal.setVisible(false);
        lebarKolom();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        tampilPanel = new javax.swing.JPanel();
        scrollPaneWin111 = new gs.scroll.win11.ScrollPaneWin11();
        tableGudang = new gs.component.Table();
        btnTambah = new rojerusan.RSMaterialButtonRectangle();
        btnHapus = new rojerusan.RSMaterialButtonRectangle();
        btnBatal = new rojerusan.RSMaterialButtonRectangle();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnCari = new javax.swing.JTextField();
        tambahPanel = new javax.swing.JPanel();
        judul = new javax.swing.JLabel();
        btnTambah1 = new rojerusan.RSMaterialButtonRectangle();
        btnBatal1 = new rojerusan.RSMaterialButtonRectangle();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ketGud = new javax.swing.JTextArea();
        namaGud = new javax.swing.JTextField();
        btnPilihTanggal = new com.toedter.calendar.JDateChooser();
        kodeGud = new javax.swing.JLabel();
        alamatGud = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.CardLayout());

        tampilPanel.setBackground(new java.awt.Color(255, 255, 255));

        scrollPaneWin111.setBorder(null);
        scrollPaneWin111.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        tableGudang.setModel(new javax.swing.table.DefaultTableModel(
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
        tableGudang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableGudangMouseClicked(evt);
            }
        });
        scrollPaneWin111.setViewportView(tableGudang);

        btnTambah.setBackground(new java.awt.Color(38, 80, 115));
        btnTambah.setText("TAMBAH");
        btnTambah.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(204, 0, 0));
        btnHapus.setText("HAPUS");
        btnHapus.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnBatal.setBackground(new java.awt.Color(255, 204, 0));
        btnBatal.setText("BATAL");
        btnBatal.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Form Tampil Gudang");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gs/image/Search Folder.png"))); // NOI18N

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

        javax.swing.GroupLayout tampilPanelLayout = new javax.swing.GroupLayout(tampilPanel);
        tampilPanel.setLayout(tampilPanelLayout);
        tampilPanelLayout.setHorizontalGroup(
            tampilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tampilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneWin111, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
                    .addGroup(tampilPanelLayout.createSequentialGroup()
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        tampilPanelLayout.setVerticalGroup(
            tampilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(tampilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tampilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCari, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addComponent(scrollPaneWin111, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(tampilPanel, "card2");

        tambahPanel.setBackground(new java.awt.Color(255, 255, 255));

        judul.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        judul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judul.setText("Form Tambah Data Gudang");

        btnTambah1.setBackground(new java.awt.Color(38, 80, 115));
        btnTambah1.setText("TAMBAH");
        btnTambah1.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnTambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah1ActionPerformed(evt);
            }
        });

        btnBatal1.setBackground(new java.awt.Color(255, 204, 0));
        btnBatal1.setText("Batal");
        btnBatal1.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnBatal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatal1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel1.setText("Tanggal");
        jLabel1.setPreferredSize(new java.awt.Dimension(49, 20));

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel2.setText("Kode Gudang");
        jLabel2.setPreferredSize(new java.awt.Dimension(62, 20));

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel3.setText("Nama Gudang");

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel6.setText("Keterangan");

        ketGud.setColumns(20);
        ketGud.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        ketGud.setRows(5);
        jScrollPane1.setViewportView(ketGud);

        namaGud.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        namaGud.setPreferredSize(new java.awt.Dimension(7, 20));
        namaGud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaGudActionPerformed(evt);
            }
        });

        btnPilihTanggal.setBackground(new java.awt.Color(255, 255, 255));
        btnPilihTanggal.setToolTipText("Pilih Tanggal");
        btnPilihTanggal.setDateFormatString("dd-MM-yyyy");
        btnPilihTanggal.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnPilihTanggal.setMaximumSize(new java.awt.Dimension(2147400000, 2147400000));
        btnPilihTanggal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPilihTanggalMouseClicked(evt);
            }
        });
        btnPilihTanggal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnPilihTanggalKeyPressed(evt);
            }
        });

        kodeGud.setFont(new java.awt.Font("Poppins", 2, 12)); // NOI18N

        alamatGud.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        alamatGud.setPreferredSize(new java.awt.Dimension(7, 20));
        alamatGud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatGudActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel8.setText("Alamat");

        javax.swing.GroupLayout tambahPanelLayout = new javax.swing.GroupLayout(tambahPanel);
        tambahPanel.setLayout(tambahPanelLayout);
        tambahPanelLayout.setHorizontalGroup(
            tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambahPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tambahPanelLayout.createSequentialGroup()
                        .addComponent(judul, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tambahPanelLayout.createSequentialGroup()
                        .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tambahPanelLayout.createSequentialGroup()
                                .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(alamatGud, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(kodeGud, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(namaGud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE))
                                .addGap(87, 87, 87))
                            .addGroup(tambahPanelLayout.createSequentialGroup()
                                .addComponent(btnPilihTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(tambahPanelLayout.createSequentialGroup()
                        .addComponent(btnTambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        tambahPanelLayout.setVerticalGroup(
            tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambahPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPilihTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kodeGud, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaGud, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alamatGud, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        mainPanel.add(tambahPanel, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
       btnPilihTanggal.requestFocus();
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(tambahPanel);
        mainPanel.repaint();
        mainPanel.revalidate();

        btnTambah1.setText("SIMPAN");
        

        if (btnTambah.getText().equals("UBAH")){
            judul.setText("Form Ubah Data Gudang");
            ubahDataTabel();
        } else if (btnTambah.getText().equals("TAMBAH")){
            judul.setText("Form Tambah Data Gudang");
            idAuto();
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        hapusData();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        btnTambah.setText("TAMBAH");
        btnHapus.setVisible(false);
        btnBatal.setVisible(false);
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnCariFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnCariFocusGained
        btnCari.setText("");
    }//GEN-LAST:event_btnCariFocusGained

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnCariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCariKeyTyped
        String sqlPencarian = "select * from tb_gudang where kode_gudang like '%"+btnCari.getText()+"%' or nama_gudang like '%"+btnCari.getText()+"%' or alamat like '%"+btnCari.getText()+"%'or keterangan like '%"+btnCari.getText()+"%'";
        pencarian(sqlPencarian);
        lebarKolom();
        

    }//GEN-LAST:event_btnCariKeyTyped

    private void tableGudangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableGudangMouseClicked
         if (btnTambah.getText().equals("TAMBAH")){
            btnTambah.setText("UBAH");

            btnBatal.setVisible(true);
            btnHapus.setVisible(true);
        }
    }//GEN-LAST:event_tableGudangMouseClicked

    private void btnTambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah1ActionPerformed
        if (btnTambah1.getText().equals("TAMBAH")){
            btnTambah1.setText("SIMPAN");
            idAuto();
        }
        else if (btnTambah1.getText().equals("SIMPAN"))
        {
            simpanData();
        }
        else if (btnTambah1.getText().equals("PERBAHARUI"))
        {
            perbaruiData();
        }
    }//GEN-LAST:event_btnTambah1ActionPerformed

    private void btnBatal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatal1ActionPerformed
        mainPanel.removeAll();
        mainPanel.add(tampilPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
        resetForm();
        btnBatal.setVisible(false);
        dataGudang();
        lebarKolom();
    }//GEN-LAST:event_btnBatal1ActionPerformed

    private void namaGudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaGudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaGudActionPerformed

    private void btnPilihTanggalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPilihTanggalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPilihTanggalMouseClicked

    private void btnPilihTanggalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnPilihTanggalKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPilihTanggalKeyPressed

    private void alamatGudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatGudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatGudActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField alamatGud;
    private rojerusan.RSMaterialButtonRectangle btnBatal;
    private rojerusan.RSMaterialButtonRectangle btnBatal1;
    private javax.swing.JTextField btnCari;
    private rojerusan.RSMaterialButtonRectangle btnHapus;
    private com.toedter.calendar.JDateChooser btnPilihTanggal;
    private rojerusan.RSMaterialButtonRectangle btnTambah;
    private rojerusan.RSMaterialButtonRectangle btnTambah1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel judul;
    private javax.swing.JTextArea ketGud;
    private javax.swing.JLabel kodeGud;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField namaGud;
    private gs.scroll.win11.ScrollPaneWin11 scrollPaneWin111;
    private gs.component.Table tableGudang;
    private javax.swing.JPanel tambahPanel;
    private javax.swing.JPanel tampilPanel;
    // End of variables declaration//GEN-END:variables


    private void noTable() {
        int Baris = tabmode.getRowCount();
        for (int a=0; a<Baris; a++)
        {
            String nomor = String.valueOf(a+1);
            tabmode.setValueAt(nomor +".",a,0);
        }
    }

    private void lebarKolom() {
      TableColumn column;
        tableGudang.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        column = tableGudang.getColumnModel().getColumn(0);
        column.setPreferredWidth(80);
        column = tableGudang.getColumnModel().getColumn(1);
        column.setPreferredWidth(100);
        column = tableGudang.getColumnModel().getColumn(2);
        column.setPreferredWidth(100);
        column = tableGudang.getColumnModel().getColumn(3);
        column.setPreferredWidth(250);
        column = tableGudang.getColumnModel().getColumn(4);
        column.setPreferredWidth(350);
        column = tableGudang.getColumnModel().getColumn(5);
        column.setPreferredWidth(300);
    }

    private void dataGudang() {
        Object[] Baris = {"No","Tanggal","Kode Gudang","Nama Gudang","Alamat","Keterangan"};
        tabmode = new DefaultTableModel(null, Baris);
        tableGudang.setModel(tabmode);
        String sql = "SELECT * FROM tb_gudang ORDER BY kode_gudang ASC;";
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String tanggal = hasil.getString("tanggal");
                String a = hasil.getString("kode_gudang");
                String b = hasil.getString("nama_gudang");
                String c = hasil.getString("alamat");
                String d = hasil.getString("keterangan");
                String[] data = {"",tanggal,a,b,c,d};
                tabmode.addRow(data);
                noTable();
            }
        } catch (Exception e){
        }
    }

    private void idAuto() {
       PreparedStatement st = null;
       ResultSet rs = null;
       String urutan = null;
       
       Date now = new Date();
        SimpleDateFormat tanggal = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat noformat = new SimpleDateFormat("yyMM");
        String tgl = tanggal.format(now);
        String no = noformat.format(now);
        
        String sql = "SELECT RIGHT (kode_gudang,3) AS Nomor FROM tb_gudang WHERE kode_gudang LIKE 'GUD" +no+"%' ORDER BY kode_gudang DESC LIMIT 1";
        
        try {
            st =conn.prepareStatement(sql);
            rs = st.executeQuery();
            
            if (rs.next()){
                int nomor = Integer.parseInt(rs.getString("Nomor"));
                nomor++;
                urutan = "GUD" + no + String.format("%03d", nomor);
                kodeGud.setText(urutan);
            } else{
                urutan = "GUD" +no + "001";
                kodeGud.setText(urutan);
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void pencarian(String sqlPencarian) {
        Object[] Baris = {"No","Tanggal","Kode Gudang","Nama Gudang","Alamat","Keterangan"};
        tabmode = new DefaultTableModel(null, Baris);
        tableGudang.setModel(tabmode);
        int brs = tableGudang.getRowCount();
        for (int i = 0; 1 < brs; i++){
            tabmode.removeRow(1);
        }
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sqlPencarian);
            while (hasil.next()){
                String tanggal = hasil.getString("tanggal");
                String kode_gudang = hasil.getString("kode_gudang");
                String nama_gundang = hasil.getString("nama_gudang");
                String alamat = hasil.getString("alamat");
                String keterangan = hasil.getString("keterangan");
                String[] data = {"",tanggal,kode_gudang,nama_gundang,alamat,keterangan};
                tabmode.addRow(data);
                noTable();
                lebarKolom();
            }
        } catch (Exception e){
        }
    }

    private void simpanData() {
       if(kodeGud.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Kode Gudang tidak boleh kosong");
        } else if (namaGud.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nama Gudang tidak boleh kosong");
        } else if (alamatGud.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Alamat Gudang tidak boleh kosong");
        }
        
        else {
        String sql = "insert into tb_gudang values (?,?,?,?,?)";
        String tampilan = "dd-MM-yyyy";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(fm.format(btnPilihTanggal.getDate()));
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, tanggal.toString());
            stat.setString(2, kodeGud.getText());
            stat.setString(3, namaGud.getText());
            stat.setString(4, alamatGud.getText());
            stat.setString(5, ketGud.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan");
            resetForm();
            dataGudang();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan"+e);
        }
        }
    }

    private void perbaruiData() {
         String sql = "UPDATE tb_gudang SET tanggal=?,kode_gudang=?,nama_gudang=?,alamat=?,keterangan=? WHERE kode_gudang='"+kodeGud.getText()+"'";
        String tampilan = "dd-MM-yyyy";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(fm.format(btnPilihTanggal.getDate()));
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, tanggal.toString());
            stat.setString(2, kodeGud.getText());
            stat.setString(3, namaGud.getText());
            stat.setString(4, alamatGud.getText());
            stat.setString(5, ketGud.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            
            //            String refresh = "select * from tb_barang";
            
            resetForm();
            dataGudang();
            namaGud.requestFocus();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah "+e);
        }
    }

    private void resetForm() {
        btnHapus.setVisible(false);
        btnTambah.setText("TAMBAH");
        btnPilihTanggal.setDate(null);
        kodeGud.setText("");
        namaGud.setText("");
        alamatGud.setText("");
        ketGud.setText("");
        btnCari.setText("");
    }

    private void ubahDataTabel() {
       tambahPanel.setVisible(false);
        tambahPanel.setVisible(false);
        
        int bar = tableGudang.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        String e = tabmode.getValueAt(bar, 4).toString();
        String f = tabmode.getValueAt(bar, 5).toString();

        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        Date dateValue = null;
        try{
            dateValue = date.parse((String)tableGudang.getValueAt(bar, 1));
        } catch (ParseException ex){
            Logger.getLogger(dataObat.class.getName()).log(Level.SEVERE, null, ex);
        }

        btnPilihTanggal.setDate(dateValue);
        kodeGud.setText(c);
        namaGud.setText(d);
        alamatGud.setText(e);
        ketGud.setText(f);
        btnTambah1.setText("PERBAHARUI");
        btnBatal1.setVisible(true);
    }

    private void hapusData() {
      int bar = tableGudang.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        String e = tabmode.getValueAt(bar, 4).toString();
        String f = tabmode.getValueAt(bar, 5).toString();
        int ok = JOptionPane.showConfirmDialog (null," Apakah Anda Yakin Ingin "
            + "Menghapus Data","Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
        if (ok==0){
            String sql="delete from tb_gudang where kode_gudang='"+c+"'";
            try {
                PreparedStatement stat=conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus");
               
                dataGudang();
                lebarKolom();
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Data Gagal Dihapus"+ex);
            }
        } 
    }
}
