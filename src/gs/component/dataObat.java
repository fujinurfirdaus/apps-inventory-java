
package gs.component;


import gs.dialog.dialogKategori;
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
public class dataObat extends javax.swing.JPanel {
    
    public final Connection conn = new koneksi().configDB();

    private DefaultTableModel tabmode;

    public dataObat() {
        initComponents();
        btnHapus.setVisible(false);
        btnBatal.setVisible(false);
        tableObat.requestFocus();
        tNama.requestFocus();
        dataTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        panelTampil = new javax.swing.JPanel();
        scrollPaneWin111 = new gs.scroll.win11.ScrollPaneWin11();
        tableObat = new gs.component.Table();
        btnTambah = new rojerusan.RSMaterialButtonRectangle();
        btnHapus = new rojerusan.RSMaterialButtonRectangle();
        btnBatal = new rojerusan.RSMaterialButtonRectangle();
        btnCari = new javax.swing.JTextField();
        fsdfd = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panelTambah = new javax.swing.JPanel();
        judul = new javax.swing.JLabel();
        btnTambah1 = new rojerusan.RSMaterialButtonRectangle();
        btnBatal1 = new rojerusan.RSMaterialButtonRectangle();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbxSatuan = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tKeterangan = new javax.swing.JTextArea();
        tKategori = new javax.swing.JTextField();
        tNama = new javax.swing.JTextField();
        tJumlah = new javax.swing.JTextField();
        btnTambah2 = new rojerusan.RSMaterialButtonRectangle();
        btnPilihTanggal = new com.toedter.calendar.JDateChooser();
        kodeObat = new javax.swing.JLabel();
        tkodeKategori = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        mainPanel.setLayout(new java.awt.CardLayout());

        panelTampil.setBackground(new java.awt.Color(255, 255, 255));

        scrollPaneWin111.setBorder(null);
        scrollPaneWin111.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        tableObat.setModel(new javax.swing.table.DefaultTableModel(
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
        tableObat.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableObat.setSelectionBackground(new java.awt.Color(45, 149, 150));
        tableObat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableObatMouseClicked(evt);
            }
        });
        scrollPaneWin111.setViewportView(tableObat);

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

        fsdfd.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        fsdfd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fsdfd.setText("Form Tampil Obat");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gs/image/Search Folder.png"))); // NOI18N

        javax.swing.GroupLayout panelTampilLayout = new javax.swing.GroupLayout(panelTampil);
        panelTampil.setLayout(panelTampilLayout);
        panelTampilLayout.setHorizontalGroup(
            panelTampilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTampilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTampilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneWin111, javax.swing.GroupLayout.DEFAULT_SIZE, 943, Short.MAX_VALUE)
                    .addGroup(panelTampilLayout.createSequentialGroup()
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addGap(6, 6, 6))
                    .addComponent(fsdfd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelTampilLayout.setVerticalGroup(
            panelTampilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTampilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fsdfd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTampilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCari, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelTampilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneWin111, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(panelTampil, "card2");

        panelTambah.setBackground(new java.awt.Color(255, 255, 255));

        judul.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        judul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judul.setText("Form Tambah Barang");

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
        jLabel2.setText("Kode Obat");
        jLabel2.setPreferredSize(new java.awt.Dimension(62, 20));

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel3.setText("Nama Obat");

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel4.setText("Nama Kategori");

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel5.setText("Jumlah");

        jLabel6.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel6.setText("Keterangan");

        jLabel7.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel7.setText("Satuan");

        cbxSatuan.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        cbxSatuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Satuan --", "Capsule", "Cream (g)", "Drops (ml)", "Dry Syrup", "Expectoran", "Injection ", "Syrup (ml)", "Syrup (ml)", "Solution (", "Lozenge", "Inhaler (m", " " }));
        cbxSatuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSatuanActionPerformed(evt);
            }
        });

        tKeterangan.setColumns(20);
        tKeterangan.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tKeterangan.setRows(5);
        jScrollPane1.setViewportView(tKeterangan);

        tKategori.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tKategori.setPreferredSize(new java.awt.Dimension(7, 20));
        tKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tKategoriActionPerformed(evt);
            }
        });

        tNama.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tNama.setPreferredSize(new java.awt.Dimension(7, 20));
        tNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNamaActionPerformed(evt);
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

        kodeObat.setFont(new java.awt.Font("Poppins", 2, 12)); // NOI18N

        tkodeKategori.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tkodeKategori.setPreferredSize(new java.awt.Dimension(7, 20));
        tkodeKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tkodeKategoriActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jLabel8.setText("Kode Kategori");

        javax.swing.GroupLayout panelTambahLayout = new javax.swing.GroupLayout(panelTambah);
        panelTambah.setLayout(panelTambahLayout);
        panelTambahLayout.setHorizontalGroup(
            panelTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTambahLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTambahLayout.createSequentialGroup()
                        .addComponent(judul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTambahLayout.createSequentialGroup()
                        .addGroup(panelTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTambahLayout.createSequentialGroup()
                                .addGroup(panelTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tkodeKategori, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(kodeObat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelTambahLayout.createSequentialGroup()
                                        .addComponent(cbxSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(518, 518, 518))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
                                    .addComponent(tKategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tJumlah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTambah2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelTambahLayout.createSequentialGroup()
                                .addComponent(btnPilihTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(panelTambahLayout.createSequentialGroup()
                        .addComponent(btnTambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelTambahLayout.setVerticalGroup(
            panelTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTambahLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPilihTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kodeObat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tkodeKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        mainPanel.add(panelTambah, "card3");

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCariFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnCariFocusGained
        btnCari.setText("");
    }//GEN-LAST:event_btnCariFocusGained

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        btnTambah.setText("TAMBAH");
        btnHapus.setVisible(false);
        btnBatal.setVisible(false);
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        hapusData();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        btnPilihTanggal.requestFocus();
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        mainPanel.add(panelTambah);
        mainPanel.repaint();
        mainPanel.revalidate();

        btnTambah1.setText("SIMPAN");
        

        if (btnTambah.getText().equals("UBAH")){
            judul.setText("Form Ubah Data Obat");
            ubahDataTabel();
        } else if (btnTambah.getText().equals("TAMBAH")){
            judul.setText("Form Tambah Data Obat");
            idAuto();
        }
        
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnBatal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatal1ActionPerformed
        mainPanel.removeAll();
        mainPanel.add(panelTampil);
        mainPanel.repaint();
        mainPanel.revalidate();
        resetForm();
        btnBatal.setVisible(false);
        dataTable();
    }//GEN-LAST:event_btnBatal1ActionPerformed

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

    private void tKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tKategoriActionPerformed

    private void tNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNamaActionPerformed

    private void tJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tJumlahActionPerformed

    private void btnTambah2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah2ActionPerformed
        dialogKategori dialog = new dialogKategori(null, true);
        dialog.setVisible(true);
        
        tkodeKategori.setText(dialog.mk.getKode_kategori());
        tKategori.setText(dialog.mk.getNama_kategori());

    }//GEN-LAST:event_btnTambah2ActionPerformed

    private void btnPilihTanggalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnPilihTanggalKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPilihTanggalKeyPressed

    private void btnPilihTanggalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPilihTanggalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPilihTanggalMouseClicked

    private void tableObatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableObatMouseClicked
       if (btnTambah.getText().equals("TAMBAH")){
            btnTambah.setText("UBAH");

            btnBatal.setVisible(true);
            btnHapus.setVisible(true);
        }
    }//GEN-LAST:event_tableObatMouseClicked

    private void tkodeKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tkodeKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tkodeKategoriActionPerformed

    private void btnCariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCariKeyTyped
        String sqlPencarian = "select * from tb_obat where kode_obat like '%"+btnCari.getText()+"%' or nama_obat like '%"+btnCari.getText()+"%' or nama_kategori like '%"+btnCari.getText()+"%'or kode_kategori like '%"+btnCari.getText()+"%'";
        pencarian(sqlPencarian);
        lebarKolom();
        
    }//GEN-LAST:event_btnCariKeyTyped

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCariActionPerformed

    private void cbxSatuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSatuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSatuanActionPerformed
    
    
    public void dataTable(){
        Object[] Baris = {"No","Tanggal","Kode Obat","Nama Obat","Kode kategori","Nama Kategori","Jumlah","Satuan","Keterangan"};
        tabmode = new DefaultTableModel(null, Baris);
        tableObat.setModel(tabmode);
        String sql = "select * from tb_obat order by kode_obat asc";
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String tanggal = hasil.getString("tanggal");
                String kode_obat = hasil.getString("kode_obat");
                String nama_obat = hasil.getString("nama_obat");
                String kode_kategori = hasil.getString("kode_kategori");
                String nama_kategori = hasil.getString("nama_kategori");
                String jumlah = hasil.getString("jumlah");
                String satuan = hasil.getString("satuan");
                String keterangan = hasil.getString("keterangan");
                String[] data = {"",tanggal,kode_obat,nama_obat,kode_kategori,nama_kategori,jumlah,satuan,keterangan};
                tabmode.addRow(data);
                noTable();
                lebarKolom();
            }
        } catch (Exception e){
        }
        
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btnBatal;
    private rojerusan.RSMaterialButtonRectangle btnBatal1;
    private javax.swing.JTextField btnCari;
    private rojerusan.RSMaterialButtonRectangle btnHapus;
    private com.toedter.calendar.JDateChooser btnPilihTanggal;
    private rojerusan.RSMaterialButtonRectangle btnTambah;
    private rojerusan.RSMaterialButtonRectangle btnTambah1;
    private rojerusan.RSMaterialButtonRectangle btnTambah2;
    private javax.swing.JComboBox<String> cbxSatuan;
    private javax.swing.JLabel fsdfd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel kodeObat;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelTambah;
    private javax.swing.JPanel panelTampil;
    private gs.scroll.win11.ScrollPaneWin11 scrollPaneWin111;
    public javax.swing.JTextField tJumlah;
    public javax.swing.JTextField tKategori;
    private javax.swing.JTextArea tKeterangan;
    private javax.swing.JTextField tNama;
    private gs.component.Table tableObat;
    public javax.swing.JTextField tkodeKategori;
    // End of variables declaration//GEN-END:variables

    private void noTable() {
       int Baris = tabmode.getRowCount();
        for (int a=0; a<Baris; a++)
        {
            String nomor = String.valueOf(a+1);
            tabmode.setValueAt(nomor +".",a,0);
        }
    }

    private void simpanData() {
      if(kodeObat.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Kode Obat tidak boleh kosong");
        } else if (tNama.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nama Obat tidak boleh kosong");
        } else if (tKategori.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nama Kategori tidak boleh kosong");
        } else if (tJumlah.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Jumlah Kategori tidak boleh kosong");
        }else if (cbxSatuan.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null, "satuan tidak boleh kosong");
        }
        
        else {
        String sql = "insert into tb_obat values (?,?,?,?,?,?,?,?)";
        String tampilan = "dd-MM-yyyy";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(fm.format(btnPilihTanggal.getDate()));
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, tanggal.toString());
            stat.setString(2, kodeObat.getText());
            stat.setString(3, tNama.getText());
            stat.setString(4, tkodeKategori.getText());
            stat.setString(5, tKategori.getText());
            stat.setString(6, tJumlah.getText());
            String valueSatuan = cbxSatuan.getSelectedItem().toString();
            stat.setString(7, valueSatuan);
            stat.setString(8, tKeterangan.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan");
            //            String refresh = "select * from tb_barang";
            resetForm();
            dataTable();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan"+e);
        }
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
        
        String sql = "SELECT RIGHT (kode_obat,3) AS Nomor FROM tb_obat WHERE kode_obat LIKE 'OB" +no+"%' ORDER BY kode_obat DESC LIMIT 1";
        
        try {
            st =conn.prepareStatement(sql);
            rs = st.executeQuery();
            
            if (rs.next()){
                int nomor = Integer.parseInt(rs.getString("Nomor"));
                nomor++;
                urutan = "OB" + no + String.format("%03d", nomor);
                kodeObat.setText(urutan);
            } else{
                urutan = "OB" +no + "001";
                kodeObat.setText(urutan);
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    

    private void ubahDataTabel() {
        panelTampil.setVisible(false);
        panelTambah.setVisible(false);
        
        
        fsdfd.setText("Perbaharui Data Obat");
        
        int bar = tableObat.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        String e = tabmode.getValueAt(bar, 4).toString();
        String f = tabmode.getValueAt(bar, 5).toString();
        String g = tabmode.getValueAt(bar, 6).toString();
        String h = tabmode.getValueAt(bar, 7).toString();
        String i = tabmode.getValueAt(bar, 8).toString();

        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        Date dateValue = null;
        try{
            dateValue = date.parse((String)tableObat.getValueAt(bar, 1));
        } catch (ParseException ex){
            Logger.getLogger(dataObat.class.getName()).log(Level.SEVERE, null, ex);
        }

        btnPilihTanggal.setDate(dateValue);
        kodeObat.setText(c);
        tNama.setText(d);
        tkodeKategori.setText(e);
        tKategori.setText(f);
        tJumlah.setText(g);
        // Clear the JComboBox before adding the new item
        cbxSatuan.removeAllItems();
    // Add the item to the JComboBox
        cbxSatuan.addItem(h);
    // Optionally, set the selected item to the newly added item
        cbxSatuan.setSelectedItem(h);
        tKeterangan.setText(i);
        
       
        btnTambah1.setText("PERBAHARUI");
        btnBatal1.setVisible(true);
    }

    private void perbaruiData() {
         String sql = "UPDATE tb_obat SET tanggal=?,kode_obat=?,nama_obat=?,kode_kategori=?,nama_kategori=?,jumlah=?,satuan=?,keterangan=? WHERE kode_obat='"+kodeObat.getText()+"'";
        String tampilan = "dd-MM-yyyy";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(fm.format(btnPilihTanggal.getDate()));
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, tanggal.toString());
            stat.setString(2, kodeObat.getText());
            stat.setString(3, tNama.getText());
            stat.setString(4, tkodeKategori.getText());
            stat.setString(5, tKategori.getText());
            stat.setString(6, tJumlah.getText());
            String valueSatuan = cbxSatuan.getSelectedItem().toString();
            stat.setString(7, valueSatuan);
            stat.setString(8, tKeterangan.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            
            //            String refresh = "select * from tb_barang";
            
            resetForm();
            dataTable();
            tNama.requestFocus();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah "+e);
        }
    }

    private void resetForm() {
        btnHapus.setVisible(false);
        btnTambah.setText("TAMBAH");
        fsdfd.setText("Form Tampil Obat");
        btnPilihTanggal.setDate(null);
        kodeObat.setText("");
        tNama.setText("");
        tkodeKategori.setText("");
        tKategori.setText("");
        tJumlah.setText("");
        cbxSatuan.setSelectedItem(null);
        tKeterangan.setText("");
    }
    
    public modelDataObat mdo = new modelDataObat();
    private void hapusData() {
      int bar = tableObat.getSelectedRow();
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
            String sql="delete from tb_obat where kode_obat='"+c+"'";
            try {
                PreparedStatement stat=conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data Berhasil Dihapus");
               
                dataTable();
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Data Gagal Dihapus"+ex);
            }
        } 
    }
    

    private void pencarian(String sql) {
        Object[] Baris = {"No","Tanggal","Kode Obat","Nama Obat","Kode Ktgr","Nama Ktgr","Jumlah","Satuan","Keterangan"};
        tabmode = new DefaultTableModel(null, Baris);
        tableObat.setModel(tabmode);
        int brs = tableObat.getRowCount();
        for (int i = 0; 1 < brs; i++){
            tabmode.removeRow(1);
        }
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String tanggal = hasil.getString("tanggal");
                String kode_obat = hasil.getString("kode_obat");
                String nama_obat = hasil.getString("nama_obat");
                String kode_kategori = hasil.getString("kode_kategori");
                String nama_kategori = hasil.getString("nama_kategori");
                String jumlah = hasil.getString("jumlah");
                String satuan = hasil.getString("satuan");
                String keterangan = hasil.getString("keterangan");
                String[] data = {"",tanggal,kode_obat,nama_obat,kode_kategori,nama_kategori,jumlah,satuan,keterangan};
                tabmode.addRow(data);
                noTable();
                lebarKolom();
            }
        } catch (Exception e){
        }
    }
    
    public void lebarKolom(){
        TableColumn column;
        tableObat.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        column = tableObat.getColumnModel().getColumn(0);
        column.setPreferredWidth(30);
        column = tableObat.getColumnModel().getColumn(1);
        column.setPreferredWidth(80);
        column = tableObat.getColumnModel().getColumn(2);
        column.setPreferredWidth(80);
        column = tableObat.getColumnModel().getColumn(3);
        column.setPreferredWidth(200);
        column = tableObat.getColumnModel().getColumn(4);
        column.setPreferredWidth(100);
        column = tableObat.getColumnModel().getColumn(5);
        column.setPreferredWidth(170);
        column = tableObat.getColumnModel().getColumn(6);
        column.setPreferredWidth(70);
        column = tableObat.getColumnModel().getColumn(7);
        column.setPreferredWidth(70);
        column = tableObat.getColumnModel().getColumn(8);
        column.setPreferredWidth(350);
    }
}
