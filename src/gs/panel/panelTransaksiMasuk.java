
package gs.panel;

import gs.component.dataObat;
import gs.dialog.jdialogObat;
import gs.dialog.jdialogSupplier;
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
public class panelTransaksiMasuk extends javax.swing.JPanel {
public final Connection conn = new koneksi().configDB(); //memanggil koneksi
private DefaultTableModel tabmode; //membuat table mode
    public panelTransaksiMasuk() {
        initComponents();
        dataTableIn();
         btnHapus.setVisible(false);
        btnBatal.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        tampilPanel = new javax.swing.JPanel();
        scrollPaneWin111 = new gs.scroll.win11.ScrollPaneWin11();
        tableIn = new gs.component.Table();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tKeterangan = new javax.swing.JTextArea();
        tNamaSupplier = new javax.swing.JTextField();
        tkodeObat = new javax.swing.JTextField();
        tJumlah = new javax.swing.JTextField();
        btnTambah2 = new rojerusan.RSMaterialButtonRectangle();
        kodeMasuk = new javax.swing.JLabel();
        tnamaObat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnTambah3 = new rojerusan.RSMaterialButtonRectangle();
        tglMasuk = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.CardLayout());

        tampilPanel.setBackground(new java.awt.Color(255, 255, 255));

        scrollPaneWin111.setBorder(null);
        scrollPaneWin111.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        tableIn.setModel(new javax.swing.table.DefaultTableModel(
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
        tableIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableInMouseClicked(evt);
            }
        });
        scrollPaneWin111.setViewportView(tableIn);

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
        jLabel12.setText("Form Tampil Transaksi Obat Masuk");

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
                    .addComponent(scrollPaneWin111, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
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
                .addComponent(scrollPaneWin111, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(tampilPanel, "card2");

        tambahPanel.setBackground(new java.awt.Color(255, 255, 255));

        judul.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        judul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judul.setText("Form Tambah Transaksi Obat Masuk");

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
        jLabel2.setText("Kode Masuk");
        jLabel2.setPreferredSize(new java.awt.Dimension(62, 20));

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel3.setText("Kode Obat");

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel4.setText("Supplier");

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel5.setText("Jumlah");

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel6.setText("Keterangan");

        tKeterangan.setColumns(20);
        tKeterangan.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tKeterangan.setRows(5);
        jScrollPane1.setViewportView(tKeterangan);

        tNamaSupplier.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tNamaSupplier.setPreferredSize(new java.awt.Dimension(7, 20));
        tNamaSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNamaSupplierActionPerformed(evt);
            }
        });

        tkodeObat.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tkodeObat.setPreferredSize(new java.awt.Dimension(7, 20));
        tkodeObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tkodeObatActionPerformed(evt);
            }
        });

        tJumlah.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tJumlah.setPreferredSize(new java.awt.Dimension(7, 20));
        tJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tJumlahActionPerformed(evt);
            }
        });

        btnTambah2.setBackground(new java.awt.Color(38, 80, 115));
        btnTambah2.setText("PILIH");
        btnTambah2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnTambah2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah2ActionPerformed(evt);
            }
        });

        kodeMasuk.setFont(new java.awt.Font("Poppins", 2, 12)); // NOI18N

        tnamaObat.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tnamaObat.setPreferredSize(new java.awt.Dimension(7, 20));
        tnamaObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnamaObatActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel8.setText("Nama Obat");

        btnTambah3.setBackground(new java.awt.Color(38, 80, 115));
        btnTambah3.setText("PILIH");
        btnTambah3.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnTambah3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah3ActionPerformed(evt);
            }
        });

        tglMasuk.setFont(new java.awt.Font("Poppins", 2, 12)); // NOI18N

        javax.swing.GroupLayout tambahPanelLayout = new javax.swing.GroupLayout(tambahPanel);
        tambahPanel.setLayout(tambahPanelLayout);
        tambahPanelLayout.setHorizontalGroup(
            tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambahPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tambahPanelLayout.createSequentialGroup()
                        .addComponent(judul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tambahPanelLayout.createSequentialGroup()
                        .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                            .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tambahPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tnamaObat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(kodeMasuk, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tkodeObat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tNamaSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tJumlah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)))
                            .addGroup(tambahPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(tglMasuk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTambah2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTambah3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(tambahPanelLayout.createSequentialGroup()
                        .addComponent(btnTambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                    .addComponent(tglMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kodeMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tkodeObat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnTambah2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tnamaObat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNamaSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnTambah3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tambahPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        mainPanel.add(tambahPanel, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 857, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableInMouseClicked
        if (btnTambah.getText().equals("TAMBAH")){
            btnTambah.setText("UBAH");

            btnBatal.setVisible(true);
            btnHapus.setVisible(true);
        }
    }//GEN-LAST:event_tableInMouseClicked

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        tJumlah.requestFocus();
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(tambahPanel);
        mainPanel.repaint();
        mainPanel.revalidate();

        btnTambah1.setText("SIMPAN");

        if (btnTambah.getText().equals("UBAH")){
            judul.setText("Form Ubah Data Transaksi Masuk");
            ubahDataTabel();
        } else if (btnTambah.getText().equals("TAMBAH")){
            judul.setText("Form Tambah Data Transaksi Masuk");
            SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd"); // Atur format tanggal yang diinginkan
            String tanggalNow = fm.format(new Date());
            tglMasuk.setText(tanggalNow);
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
        String sqlPencarian = "select * from tb_obat_masuk where id_obatMasuk like '%"+btnCari.getText()+"%' or nama_obat like '%"+btnCari.getText()+"%' or supplier like '%"+btnCari.getText()+"%'or keterangan like '%"+btnCari.getText()+"%'";
        pencarian(sqlPencarian);
        lebarKolom();
    }//GEN-LAST:event_btnCariKeyTyped

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
        dataTableIn();
    }//GEN-LAST:event_btnBatal1ActionPerformed

    private void tNamaSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNamaSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNamaSupplierActionPerformed

    private void tkodeObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tkodeObatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tkodeObatActionPerformed

    private void tJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tJumlahActionPerformed

    private void btnTambah2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah2ActionPerformed
        jdialogObat dialog = new jdialogObat(null, true);
        dialog.setVisible(true);

        tkodeObat.setText(dialog.mo.getKode_obat());
        tnamaObat.setText(dialog.mo.getNama_obat());
    }//GEN-LAST:event_btnTambah2ActionPerformed

    private void tnamaObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnamaObatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnamaObatActionPerformed

    private void btnTambah3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah3ActionPerformed
        jdialogSupplier dialog = new jdialogSupplier(null, true);
        dialog.setVisible(true);

        tNamaSupplier.setText(dialog.ms.getNama_supplier());
    }//GEN-LAST:event_btnTambah3ActionPerformed

    private void ubahDataTabel() {
        tambahPanel.setVisible(false);
        tampilPanel.setVisible(false);
       
        int bar = tableIn.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        String e = tabmode.getValueAt(bar, 4).toString();
        String f = tabmode.getValueAt(bar, 5).toString();
        String g = tabmode.getValueAt(bar, 6).toString();
        String h = tabmode.getValueAt(bar, 7).toString();
       

        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        Date dateValue = null;
        try{
            dateValue = date.parse((String)tableIn.getValueAt(bar, 1));
        } catch (ParseException ex){
            Logger.getLogger(dataObat.class.getName()).log(Level.SEVERE, null, ex);
        }

        tglMasuk.setText(b);
        kodeMasuk.setText(c);
        tkodeObat.setText(d);
        tnamaObat.setText(e);
        tNamaSupplier.setText(f);
        tJumlah.setText(g);
        tKeterangan.setText(h);
        
        
        
       
        btnTambah1.setText("PERBAHARUI");
        btnBatal1.setVisible(true);
    }

    private void dataTableIn() {
        Object[] Baris = {"No","Tanggal","Kode Obat Masuk","Kode Obat","Nama Obat","Supplier Obat","Jumlah","Keterangan"};
        tabmode = new DefaultTableModel(null, Baris);
        tableIn.setModel(tabmode);
        String sql = "select * from tb_obat_masuk order by id_obatmasuk asc";
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String tanggal = hasil.getString("tanggal");
                String a = hasil.getString("id_obatMasuk");
                String b = hasil.getString("kode_obat");
                String c = hasil.getString("nama_obat");
                String d = hasil.getString("supplier");
                String jumlah = hasil.getString("jumlah");
                String keterangan = hasil.getString("keterangan");
                String[] data = {"",tanggal,a,b,c,d,jumlah,keterangan};
                tabmode.addRow(data);
                noTable();
                lebarKolom();
            }
        } catch (Exception e){
        }
    }
    
    private void noTable() {
       int Baris = tabmode.getRowCount();
        for (int a=0; a<Baris; a++)
        {
            String nomor = String.valueOf(a+1);
            tabmode.setValueAt(nomor +".",a,0);
        }
    }

    private void resetForm() {
         btnHapus.setVisible(false);
        btnTambah.setText("TAMBAH");
        tglMasuk.setText("");
        kodeMasuk.setText("");
        tkodeObat.setText("");
        tnamaObat.setText("");
        tNamaSupplier.setText("");
        tJumlah.setText("");
        tKeterangan.setText("");
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
        
        String sql = "SELECT RIGHT (id_obatMasuk,3) AS Nomor FROM tb_obat_masuk WHERE id_obatMasuk LIKE 'IN" +no+"%' ORDER BY id_obatMasuk DESC LIMIT 1";
        
        try {
            st =conn.prepareStatement(sql);
            rs = st.executeQuery();
            
            if (rs.next()){
                int nomor = Integer.parseInt(rs.getString("Nomor"));
                nomor++;
                urutan = "IN" + no + String.format("%03d", nomor);
                kodeMasuk.setText(urutan);
            } else{
                urutan = "IN" +no + "001";
                kodeMasuk.setText(urutan);
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
     public void lebarKolom(){
        TableColumn column;
        tableIn.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        column = tableIn.getColumnModel().getColumn(0);
        column.setPreferredWidth(30);
        column = tableIn.getColumnModel().getColumn(1);
        column.setPreferredWidth(100);
        column = tableIn.getColumnModel().getColumn(2);
        column.setPreferredWidth(150);
        column = tableIn.getColumnModel().getColumn(3);
        column.setPreferredWidth(100);
        column = tableIn.getColumnModel().getColumn(4);
        column.setPreferredWidth(250);
        column = tableIn.getColumnModel().getColumn(5);
        column.setPreferredWidth(200);
        column = tableIn.getColumnModel().getColumn(6);
        column.setPreferredWidth(80);
        column = tableIn.getColumnModel().getColumn(7);
        column.setPreferredWidth(300);
    }
     
      private void perbaruiData() {
        String sql = "UPDATE tb_obat_masuk SET tanggal=?,kode_obat=?,nama_obat=?,supplier=?,jumlah=?,keterangan=? WHERE id_obatMasuk='"+kodeMasuk.getText()+"'";
        String tampilan = "dd-MM-yyyy";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(fm.format(new Date()));
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, tanggal.toString());
            stat.setString(2, tkodeObat.getText());
            stat.setString(3, tnamaObat.getText());
            stat.setString(4, tNamaSupplier.getText());
            stat.setString(5, tJumlah.getText());
            stat.setString(6, tKeterangan.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            
            //            String refresh = "select * from tb_barang";
            
            resetForm();
            dataTableIn();
            tNamaSupplier.requestFocus();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah "+e);
        }
    }
      
      private void simpanData() {
      if(kodeMasuk.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Kode Masuk tidak boleh kosong");
        } else if (tkodeObat.getText().equals("")){
            JOptionPane.showMessageDialog(null, "kode Obat masuk tidak boleh kosong");
        } else if (tnamaObat.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nama Obat Masuk tidak boleh kosong");
        } else if (tNamaSupplier.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nama Supplier obat tidak boleh kosong");
        }else if (tJumlah.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Jumlah Obat Masuk tidak boleh kosong");
        }
        
        else {
        String sql = "insert into tb_obat_masuk values (?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, tglMasuk.getText());
            stat.setString(2, kodeMasuk.getText());
            stat.setString(3, tkodeObat.getText());
            stat.setString(4, tnamaObat.getText());
            stat.setString(5, tNamaSupplier.getText());
            stat.setString(6, tJumlah.getText());
            stat.setString(7, tKeterangan.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan");
            //            String refresh = "select * from tb_barang";
            resetForm();
            dataTableIn();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan"+e);
        }
        }
    }
      
      private void pencarian(String sqlPencarian) {
         Object[] Baris = {"No","Tanggal","Kode Obat Masuk","Kode Obat","Nama Obat","Supplier Obat","Jumlah","Keterangan"};
        tabmode = new DefaultTableModel(null, Baris);
        tableIn.setModel(tabmode);
        int brs = tableIn.getRowCount();
        for (int i = 0; 1 < brs; i++){
            tabmode.removeRow(1);
        }
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sqlPencarian);
            while (hasil.next()){
                String tanggal = hasil.getString("tanggal");
                String a = hasil.getString("id_obatMasuk");
                String b = hasil.getString("kode_obat");
                String c = hasil.getString("nama_obat");
                String d = hasil.getString("supplier");
                String jumlah = hasil.getString("jumlah");
                String keterangan = hasil.getString("keterangan");
                String[] data = {"",tanggal,a,b,c,d,jumlah,keterangan};
                tabmode.addRow(data);
                noTable();
                lebarKolom();
            }
        } catch (Exception e){
        }
    }
      
      private void hapusData() {
        int bar = tableIn.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        String e = tabmode.getValueAt(bar, 4).toString();
        String f = tabmode.getValueAt(bar, 5).toString();
        String g = tabmode.getValueAt(bar, 6).toString();

        int ok = JOptionPane.showConfirmDialog (null," Apakah Anda Yakin Ingin "
            + "Menghapus Data","Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
        if (ok==0){
            String sql="delete from tb_obat_masuk where id_obatMasuk='"+c+"'";
            try {
                PreparedStatement stat=conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus");
               
                dataTableIn();
                lebarKolom();
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Data Gagal Dihapus"+ex);
            }
        } 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnBatal;
    private rojerusan.RSMaterialButtonRectangle btnBatal1;
    private javax.swing.JTextField btnCari;
    private rojerusan.RSMaterialButtonRectangle btnHapus;
    private rojerusan.RSMaterialButtonRectangle btnTambah;
    private rojerusan.RSMaterialButtonRectangle btnTambah1;
    private rojerusan.RSMaterialButtonRectangle btnTambah2;
    private rojerusan.RSMaterialButtonRectangle btnTambah3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel kodeMasuk;
    private javax.swing.JPanel mainPanel;
    private gs.scroll.win11.ScrollPaneWin11 scrollPaneWin111;
    public javax.swing.JTextField tJumlah;
    private javax.swing.JTextArea tKeterangan;
    public javax.swing.JTextField tNamaSupplier;
    private gs.component.Table tableIn;
    private javax.swing.JPanel tambahPanel;
    private javax.swing.JPanel tampilPanel;
    private javax.swing.JLabel tglMasuk;
    private javax.swing.JTextField tkodeObat;
    public javax.swing.JTextField tnamaObat;
    // End of variables declaration//GEN-END:variables
}
