package KUBUS;

import Persistance.*;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author lmao
 */
public class Dashboard extends javax.swing.JFrame {

    private final Timer refreshTimer;
    
    public Dashboard() {

        initComponents();
        tampilanBuku();
        tampilanSkripsi();
        refreshTimer = new Timer(5000, (ActionEvent e) -> {
        });
        refreshTimer.start();

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField21 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Jpanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Home = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        javax.swing.JPanel BukuMenu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonEditDataBuku = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBuku = new javax.swing.JTable();
        jTextFieldCariBuku = new javax.swing.JTextField();
        jButtonCariBuku = new javax.swing.JButton();
        FilterBuku = new javax.swing.JComboBox<>();
        jButtonCetakSearchBuku = new javax.swing.JButton();
        SkripsiMenu1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButtonEditDataSkripsi = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableSkripsi = new javax.swing.JTable();
        FilterSkripsi = new javax.swing.JComboBox<>();
        jTextFieldCariSkripsi = new javax.swing.JTextField();
        jButtonCariSkripsi = new javax.swing.JButton();
        jButtonCariCetakSkripsi = new javax.swing.JButton();
        transaksi = new javax.swing.JTabbedPane();
        PeminjamanBuku = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextFieldKodeBuku1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField17 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        PeminjamanSkripsi = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel33 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jTextFieldKodeBuku2 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField20 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jDateChooser6 = new com.toedter.calendar.JDateChooser();
        jButton11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        Laporan = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jDateChooser7 = new com.toedter.calendar.JDateChooser();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField24 = new javax.swing.JTextField();
        jButton20 = new javax.swing.JButton();
        jDateChooser8 = new com.toedter.calendar.JDateChooser();
        jButton24 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KUBUS");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Jpanel.setBackground(new java.awt.Color(255, 255, 255));
        Jpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(0, 102, 102));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTabbedPane1.setOpaque(true);

        Home.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1065, Short.MAX_VALUE)
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("", new javax.swing.ImageIcon("C:\\Users\\Asus\\Downloads\\ion_home.png"), Home); // NOI18N

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setForeground(new java.awt.Color(0, 153, 153));
        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        BukuMenu.setBackground(new java.awt.Color(255, 255, 255));
        BukuMenu.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                BukuMenuInputMethodTextChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Buku");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Berikut data buku Program Studi Sistem Informasi UINSA");

        jButtonEditDataBuku.setText("Edit Data Buku");
        jButtonEditDataBuku.setDoubleBuffered(true);
        jButtonEditDataBuku.setPreferredSize(new java.awt.Dimension(114, 23));
        jButtonEditDataBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditDataBukuActionPerformed(evt);
            }
        });

        jScrollPane1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jScrollPane1ComponentAdded(evt);
            }
        });
        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });
        jScrollPane1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jScrollPane1ComponentShown(evt);
            }
        });

        jTableBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KODE", "JUDUL", "SUB JUDUL", "PENGARANG", "PENERBIT", "TAHUN", "HALAMAN", "ISBN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableBuku.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTableBukuComponentAdded(evt);
            }
        });
        jTableBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableBuku);
        if (jTableBuku.getColumnModel().getColumnCount() > 0) {
            jTableBuku.getColumnModel().getColumn(0).setResizable(false);
            jTableBuku.getColumnModel().getColumn(1).setResizable(false);
            jTableBuku.getColumnModel().getColumn(2).setResizable(false);
            jTableBuku.getColumnModel().getColumn(3).setResizable(false);
            jTableBuku.getColumnModel().getColumn(4).setResizable(false);
            jTableBuku.getColumnModel().getColumn(5).setResizable(false);
            jTableBuku.getColumnModel().getColumn(6).setResizable(false);
            jTableBuku.getColumnModel().getColumn(7).setResizable(false);
        }

        jTextFieldCariBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCariBukuActionPerformed(evt);
            }
        });
        jTextFieldCariBuku.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCariBukuKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCariBukuKeyTyped(evt);
            }
        });

        jButtonCariBuku.setText("CARI");
        jButtonCariBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCariBukuActionPerformed(evt);
            }
        });

        FilterBuku.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        FilterBuku.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Berdasarkan", "Kode Buku", "Judul", "Subjudul", "Pengarang", "Penerbit", "Tahun Terbit", "Halaman", "ISBN" }));
        FilterBuku.setSelectedItem(jTableBuku);
        FilterBuku.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        FilterBuku.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FilterBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterBukuActionPerformed(evt);
            }
        });

        jButtonCetakSearchBuku.setText("CETAK");
        jButtonCetakSearchBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCetakSearchBukuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BukuMenuLayout = new javax.swing.GroupLayout(BukuMenu);
        BukuMenu.setLayout(BukuMenuLayout);
        BukuMenuLayout.setHorizontalGroup(
            BukuMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BukuMenuLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(BukuMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addGroup(BukuMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(BukuMenuLayout.createSequentialGroup()
                            .addComponent(FilterBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldCariBuku)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonCariBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(BukuMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BukuMenuLayout.createSequentialGroup()
                                .addComponent(jButtonCetakSearchBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonEditDataBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        BukuMenuLayout.setVerticalGroup(
            BukuMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BukuMenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BukuMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCariBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCariBuku)
                    .addComponent(FilterBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BukuMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditDataBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCetakSearchBuku))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Buku   ", new javax.swing.ImageIcon("C:\\Users\\Asus\\Downloads\\wpf_books.png"), BukuMenu); // NOI18N
        BukuMenu.getAccessibleContext().setAccessibleParent(BukuMenu);

        SkripsiMenu1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Skripsi");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Berikut data Skripsi Program Studi Sistem Informasi UINSA");

        jButtonEditDataSkripsi.setText("Edit Data Skripsi");
        jButtonEditDataSkripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditDataSkripsiActionPerformed(evt);
            }
        });

        jTableSkripsi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "KODE", "JUDUL", "PENGARANG", "TAHUN", "HALAMAN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableSkripsi.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTableSkripsiComponentAdded(evt);
            }
        });
        jScrollPane3.setViewportView(jTableSkripsi);
        if (jTableSkripsi.getColumnModel().getColumnCount() > 0) {
            jTableSkripsi.getColumnModel().getColumn(0).setResizable(false);
            jTableSkripsi.getColumnModel().getColumn(1).setResizable(false);
            jTableSkripsi.getColumnModel().getColumn(2).setResizable(false);
            jTableSkripsi.getColumnModel().getColumn(3).setResizable(false);
            jTableSkripsi.getColumnModel().getColumn(4).setResizable(false);
        }

        FilterSkripsi.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        FilterSkripsi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Berdasarkan", "Kode Skripsi", "Judul", "Pengarang", "Tahun", "Halaman" }));
        FilterSkripsi.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        FilterSkripsi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextFieldCariSkripsi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCariSkripsiKeyReleased(evt);
            }
        });

        jButtonCariSkripsi.setText("CARI");

        jButtonCariCetakSkripsi.setText("CETAK");
        jButtonCariCetakSkripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCariCetakSkripsiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SkripsiMenu1Layout = new javax.swing.GroupLayout(SkripsiMenu1);
        SkripsiMenu1.setLayout(SkripsiMenu1Layout);
        SkripsiMenu1Layout.setHorizontalGroup(
            SkripsiMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SkripsiMenu1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(SkripsiMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SkripsiMenu1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SkripsiMenu1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SkripsiMenu1Layout.createSequentialGroup()
                        .addGroup(SkripsiMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(SkripsiMenu1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonCariCetakSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jButtonEditDataSkripsi))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 899, Short.MAX_VALUE)
                            .addGroup(SkripsiMenu1Layout.createSequentialGroup()
                                .addComponent(FilterSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCariSkripsi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCariSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33))))
        );
        SkripsiMenu1Layout.setVerticalGroup(
            SkripsiMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SkripsiMenu1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(12, 12, 12)
                .addGroup(SkripsiMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCariSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCariSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilterSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SkripsiMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditDataSkripsi)
                    .addComponent(jButtonCariCetakSkripsi))
                .addGap(31, 31, 31))
        );

        jTextFieldCariSkripsi.getAccessibleContext().setAccessibleDescription("");

        jTabbedPane2.addTab("Skripsi   ", new javax.swing.ImageIcon("C:\\Users\\Asus\\Downloads\\wpf_books(1).png"), SkripsiMenu1); // NOI18N

        jTabbedPane1.addTab("", new javax.swing.ImageIcon("C:\\Users\\Asus\\Downloads\\material-symbols_inventory-2.png"), jTabbedPane2); // NOI18N

        transaksi.setBackground(new java.awt.Color(255, 255, 255));
        transaksi.setForeground(new java.awt.Color(0, 153, 153));
        transaksi.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        transaksi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        PeminjamanBuku.setBackground(new java.awt.Color(255, 255, 255));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "KODE PINJAM", "KODE BUKU", "NAMA", "NIM", "ANGKATAN", "TANGGAL PINJAM", "TANGGAL KEMBALI"
            }
        ));
        jScrollPane5.setViewportView(jTable3);

        jLabel25.setText("Kode Peminjaman");

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jLabel26.setText("Kode Buku");

        jTextFieldKodeBuku1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldKodeBuku1ActionPerformed(evt);
            }
        });
        jTextFieldKodeBuku1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldKodeBuku1KeyReleased(evt);
            }
        });

        jLabel27.setText("Tanggal Pinjam");

        jLabel28.setText("Tanggal Kembali");

        jLabel29.setText("Nama Lengkap");

        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        jLabel30.setText("NIM");

        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kode Peminjaman", "Kode Buku / Skripsi", "Nama Lengkap", "NIM", "Angkatan" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton14.setText("CARI");

        jLabel31.setText("NIM");

        jLabel32.setText("Tahun Angkatan");

        jButton10.setText("TAMBAH");

        jButton12.setText("UBAH");

        jButton16.setText("HAPUS");

        jButton17.setText("CETAK");

        javax.swing.GroupLayout PeminjamanBukuLayout = new javax.swing.GroupLayout(PeminjamanBuku);
        PeminjamanBuku.setLayout(PeminjamanBukuLayout);
        PeminjamanBukuLayout.setHorizontalGroup(
            PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PeminjamanBukuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PeminjamanBukuLayout.createSequentialGroup()
                        .addComponent(jButton10)
                        .addGap(18, 18, 18)
                        .addComponent(jButton12)
                        .addGap(18, 18, 18)
                        .addComponent(jButton16)
                        .addGap(18, 18, 18)
                        .addComponent(jButton17))
                    .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PeminjamanBukuLayout.createSequentialGroup()
                            .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel25)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel26)
                                .addComponent(jTextFieldKodeBuku1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(33, 33, 33)
                            .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel30)
                                .addComponent(jLabel29)
                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PeminjamanBukuLayout.createSequentialGroup()
                                    .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PeminjamanBukuLayout.createSequentialGroup()
                                            .addComponent(jTextField12)
                                            .addGap(18, 18, 18))
                                        .addGroup(PeminjamanBukuLayout.createSequentialGroup()
                                            .addComponent(jLabel31)
                                            .addGap(159, 159, 159)))
                                    .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel32)
                                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(33, 33, 33)
                            .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel28)
                                .addComponent(jDateChooser3, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                .addComponent(jDateChooser4, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)))
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PeminjamanBukuLayout.createSequentialGroup()
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton14))))
                .addContainerGap())
        );
        PeminjamanBukuLayout.setVerticalGroup(
            PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PeminjamanBukuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PeminjamanBukuLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31)
                        .addGap(28, 28, 28))
                    .addGroup(PeminjamanBukuLayout.createSequentialGroup()
                        .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PeminjamanBukuLayout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PeminjamanBukuLayout.createSequentialGroup()
                                .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel27))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PeminjamanBukuLayout.createSequentialGroup()
                                .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel32))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldKodeBuku1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(53, 53, 53)
                .addGroup(PeminjamanBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton12)
                    .addComponent(jButton16)
                    .addComponent(jButton17))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        transaksi.addTab("Peminjaman Buku", PeminjamanBuku);

        PeminjamanSkripsi.setBackground(new java.awt.Color(255, 255, 255));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "KODE PINJAM", "KODE SKRIPSI", "NAMA", "NIM", "ANGKATAN", "TANGGAL PINJAM", "TANGGAL KEMBALI"
            }
        ));
        jScrollPane6.setViewportView(jTable4);

        jLabel33.setText("Kode Peminjaman");

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jLabel34.setText("Kode Skripsi");

        jTextFieldKodeBuku2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldKodeBuku2ActionPerformed(evt);
            }
        });
        jTextFieldKodeBuku2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldKodeBuku2KeyReleased(evt);
            }
        });

        jLabel35.setText("Tanggal Pinjam");

        jLabel36.setText("Tanggal Kembali");

        jLabel37.setText("Nama Lengkap");

        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });

        jLabel38.setText("NIM");

        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kode Peminjaman", "Kode Buku / Skripsi", "Nama Lengkap", "NIM", "Angkatan" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jButton15.setText("CARI");

        jLabel39.setText("NIM");

        jLabel40.setText("Tahun Angkatan");

        jButton11.setText("TAMBAH");

        jButton13.setText("UBAH");

        jButton18.setText("HAPUS");

        jButton19.setText("CETAK");

        javax.swing.GroupLayout PeminjamanSkripsiLayout = new javax.swing.GroupLayout(PeminjamanSkripsi);
        PeminjamanSkripsi.setLayout(PeminjamanSkripsiLayout);
        PeminjamanSkripsiLayout.setHorizontalGroup(
            PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PeminjamanSkripsiLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PeminjamanSkripsiLayout.createSequentialGroup()
                        .addComponent(jButton11)
                        .addGap(18, 18, 18)
                        .addComponent(jButton13)
                        .addGap(18, 18, 18)
                        .addComponent(jButton18)
                        .addGap(18, 18, 18)
                        .addComponent(jButton19))
                    .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PeminjamanSkripsiLayout.createSequentialGroup()
                            .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel33)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel34)
                                .addComponent(jTextFieldKodeBuku2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(33, 33, 33)
                            .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel38)
                                .addComponent(jLabel37)
                                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PeminjamanSkripsiLayout.createSequentialGroup()
                                    .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PeminjamanSkripsiLayout.createSequentialGroup()
                                            .addComponent(jTextField13)
                                            .addGap(18, 18, 18))
                                        .addGroup(PeminjamanSkripsiLayout.createSequentialGroup()
                                            .addComponent(jLabel39)
                                            .addGap(159, 159, 159)))
                                    .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel40)
                                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(33, 33, 33)
                            .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel36)
                                .addComponent(jDateChooser5, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                .addComponent(jDateChooser6, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)))
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PeminjamanSkripsiLayout.createSequentialGroup()
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton15))))
                .addContainerGap())
        );
        PeminjamanSkripsiLayout.setVerticalGroup(
            PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PeminjamanSkripsiLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PeminjamanSkripsiLayout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39)
                        .addGap(28, 28, 28))
                    .addGroup(PeminjamanSkripsiLayout.createSequentialGroup()
                        .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PeminjamanSkripsiLayout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PeminjamanSkripsiLayout.createSequentialGroup()
                                .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel35))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PeminjamanSkripsiLayout.createSequentialGroup()
                                .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel36)
                                    .addComponent(jLabel40))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldKodeBuku2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jDateChooser6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(53, 53, 53)
                .addGroup(PeminjamanSkripsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton13)
                    .addComponent(jButton18)
                    .addComponent(jButton19))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        transaksi.addTab("Peminjaman Skripsi", PeminjamanSkripsi);

        Laporan.setBackground(new java.awt.Color(255, 255, 255));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "KODE PINJAM", "KODE BUKU", "NAMA", "NIM", "ANGKATAN", "TANGGAL PINJAM", "TANGGAL KEMBALI"
            }
        ));
        jScrollPane7.setViewportView(jTable5);

        jLabel43.setText("Tanggal Pinjam");

        jLabel44.setText("Tanggal Kembali");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kode Peminjaman", "Kode Buku / Skripsi", "Nama Lengkap", "NIM", "Angkatan" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jButton20.setText("CARI");

        jButton24.setText("CETAK");

        javax.swing.GroupLayout LaporanLayout = new javax.swing.GroupLayout(Laporan);
        Laporan.setLayout(LaporanLayout);
        LaporanLayout.setHorizontalGroup(
            LaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LaporanLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(LaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton24)
                    .addGroup(LaporanLayout.createSequentialGroup()
                        .addGroup(LaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(LaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel44)
                            .addComponent(jDateChooser8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(LaporanLayout.createSequentialGroup()
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton20))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        LaporanLayout.setVerticalGroup(
            LaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LaporanLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(LaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(LaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LaporanLayout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(LaporanLayout.createSequentialGroup()
                            .addComponent(jLabel44)
                            .addGap(28, 28, 28))
                        .addComponent(jDateChooser8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton24)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        transaksi.addTab("Laporan", Laporan);

        jTabbedPane1.addTab("", new javax.swing.ImageIcon(getClass().getResource("/KUBUS/grommet-icons_transaction.png")), transaksi); // NOI18N
        transaksi.getAccessibleContext().setAccessibleName("transaksi");

        Jpanel.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 84, -1, -1));
        jTabbedPane1.getAccessibleContext().setAccessibleName("Buku");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Downloads\\Frame 11(2).png")); // NOI18N
        Jpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 66));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("SISTEM INFORMASI UINSA");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Jpanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, -1, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("KUMPULAN BUKU & SKRIPSI");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Jpanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditDataBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditDataBukuActionPerformed
        // TODO add your handling code here:
        DataBuku DataBukuFrame = new DataBuku();
        DataBukuFrame.setVisible(true);
        DataBukuFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonEditDataBukuActionPerformed

    private void jButtonEditDataSkripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditDataSkripsiActionPerformed
        // TODO add your handling code here:
        DataSkripsi DataSkripsiFrame = new DataSkripsi();
        DataSkripsiFrame.setVisible(true);
        DataSkripsiFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButtonEditDataSkripsiActionPerformed

    private void jButtonCariBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCariBukuActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButtonCariBukuActionPerformed

    private void jScrollPane1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jScrollPane1ComponentShown

    }//GEN-LAST:event_jScrollPane1ComponentShown

    private void BukuMenuInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_BukuMenuInputMethodTextChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_BukuMenuInputMethodTextChanged

    private void jScrollPane1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jScrollPane1ComponentAdded

    }//GEN-LAST:event_jScrollPane1ComponentAdded

    private void jTableBukuComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTableBukuComponentAdded
        // TODO add your handling code here:
        // TODO add your handling code here:
        tampilanBuku();
    }//GEN-LAST:event_jTableBukuComponentAdded

    private void jTableSkripsiComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTableSkripsiComponentAdded
        // TODO add your handling code here:
        tampilanSkripsi();
    }//GEN-LAST:event_jTableSkripsiComponentAdded

    private void jButtonCetakSearchBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCetakSearchBukuActionPerformed
        // TODO add your handling code here:
        try {
            String selection = (String) FilterBuku.getSelectedItem();
            String reportPath = "src/Report/reportBuku.jrxml";
            String searchTerm = jTextFieldCariBuku.getText().trim();
            
            
            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT b FROM Buku b WHERE ";

            switch (FilterBuku.getSelectedIndex()) {
                case 1:
                    queryString += "LOWER(b.kodebuku) LIKE LOWER(:searchTerm)";
                    break;
                case 2:
                    queryString += "LOWER(b.judulbuku) LIKE LOWER(:searchTerm)";
                    break;
                case 3:
                    queryString += "LOWER(b.subjudulbuku) LIKE LOWER(:searchTerm)";
                    break;
                case 4:
                    queryString += "LOWER(b.pengarang) LIKE LOWER(:searchTerm)";
                    break;
                case 5:
                    queryString += "LOWER(b.penerbit) LIKE LOWER (:searchTerm)";
                case 6:
                    queryString += "LOWER(b.tahunterbit) LIKE LOWER (:searchTerm)";
                case 7:
                    queryString += "LOWER(b.halaman) LIKE LOWER (:searchTerm)";
                default:
                    throw new IllegalArgumentException("Invalid search criteria selected.");
            }

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Buku> cq = cb.createQuery(Buku.class);
            Root<Buku> bok = cq.from(Buku.class);
            cq.select(bok);

            // Check if WHERE clause is not empty
            if (queryString.endsWith(" WHERE ")) {
                throw new IllegalArgumentException("No search criteria selected.");
            }

            TypedQuery<Buku> q = em.createQuery(cq);
            List<Buku> list = q.getResultList();
            Query query = em.createQuery(queryString);
            query.setParameter("searchTerm", "%" + searchTerm + "%");

            List<Buku> results = query.getResultList();

            List<Object[]> data = new ArrayList<>();
            for (Buku result : results) {
                    Object[] rowData = {
                    result.getKodebuku(),
                    result.getJudulbuku(),
                    result.getSubjudulbuku(),
                    result.getPengarang(),
                    result.getPenerbit(),
                    result.getTahunterbit(),
                    result.getHalaman(),
                    result.getIsbn(),
            };
                data.add(rowData);
            }
            em.getTransaction().commit();
            em.close();
            emf.close();

            Map<String,Object> param = new HashMap<>();
            param.put("queryString", searchTerm);
            param.put("cariBerdasar",selection);
            
            // Membuat sumber data untuk JasperReports dari data hasil pencarian
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(results);

            // Memuat file desain laporan (*.jrxml)
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            JasperPrint print = JasperFillManager.fillReport(jasperReport, param, dataSource);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCetakSearchBukuActionPerformed

    private void jTextFieldCariBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCariBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCariBukuActionPerformed

    private void jButtonCariCetakSkripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCariCetakSkripsiActionPerformed
         try {
            String selection = (String) FilterSkripsi.getSelectedItem();
            String reportPath = "src/Report/reportSkripsi.jrxml";
            String searchTerm = jTextFieldCariSkripsi.getText().trim();
            
            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT s FROM Skripsi s";

            switch (FilterSkripsi.getSelectedIndex()) {
                case 1:
                    queryString += " WHERE LOWER(s.kodeskripsi) LIKE LOWER(:searchTerm)";
                    break;
                case 2:
                    queryString += " WHERE LOWER(s.judulskripsi) LIKE LOWER(:searchTerm)";
                    break;
                case 3:
                    queryString += " WHERE LOWER(s.penulis) LIKE LOWER(:searchTerm)";
                    break;
                case 4:
                    queryString += " WHERE LOWER(s.tahun) LIKE LOWER(:searchTerm)";
                    break;
                case 5:
                    queryString += " WHERE LOWER(s.halaman) LIKE LOWER (:searchTerm)";
                default:
                    throw new IllegalArgumentException("Invalid search criteria selected.");
            }

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Skripsi> cq = cb.createQuery(Skripsi.class);
            Root<Skripsi> Skrip = cq.from(Skripsi.class);
            cq.select(Skrip);

            // Check if WHERE clause is not empty
            if (queryString.endsWith(" WHERE ")) {
                //throw new IllegalArgumentException("No search criteria selected.");
                Query query = em.createQuery("SELECT s FROM Skripsi s");
                List<Skripsi> results = query.getResultList();
        
                JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(results);
            }

            TypedQuery<Skripsi> q = em.createQuery(cq);
            List<Skripsi> list = q.getResultList();
            Query query = em.createQuery(queryString);
            query.setParameter("searchTerm", "%" + searchTerm + "%");

            List<Skripsi> results = query.getResultList();

            // Menyiapkan data untuk laporan
            List<Object[]> data = new ArrayList<>();
            for (Skripsi result : results) {
                    Object[] rowData = {
                    result.getKodeskripsi(),
                    result.getJudulskripsi(),
                    result.getPenulis(),
                    result.getTahun(),
                    result.getHalaman()
            };
                data.add(rowData);
            }

            em.getTransaction().commit();
            em.close();
            emf.close();

            Map<String,Object> param = new HashMap<>();
            param.put("queryString", searchTerm);
            param.put("cariBerdasar",selection);
            
            // Membuat sumber data untuk JasperReports dari data hasil pencarian
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(results);

            // Memuat file desain laporan (*.jrxml)
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            JasperPrint print = JasperFillManager.fillReport(jasperReport, param, dataSource);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCariCetakSkripsiActionPerformed

    private void FilterBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterBukuActionPerformed

    private void jTextFieldCariBukuKeyReleased(java.awt.event.KeyEvent evt) {                                               
        try {
            String selection = (String) FilterBuku.getSelectedItem();
            String searchTerm = jTextFieldCariBuku.getText().trim();

            // Check if a search criteria is selected
            if (selection == null || selection.isEmpty()) {
                throw new IllegalArgumentException("No search criteria selected.");
            }

            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT b FROM Buku b WHERE ";

            switch (FilterBuku.getSelectedIndex()) {
                case 1:
                    queryString += "LOWER(b.kodebuku) LIKE LOWER(:searchTerm)";
                    break;
                case 2:
                    queryString += "LOWER(b.judulbuku) LIKE LOWER(:searchTerm)";
                    break;
                case 3:
                    queryString += "LOWER(b.subjudulbuku) LIKE LOWER(:searchTerm)";
                    break;
                case 4:
                    queryString += "LOWER(b.pengarang) LIKE LOWER(:searchTerm)";
                    break;
                case 5:
                    queryString += "LOWER(b.penerbit) LIKE LOWER (:searchTerm)";
                case 6:
                    queryString += "LOWER(b.tahunterbit) LIKE LOWER (:searchTerm)";
                case 7:
                    queryString += "LOWER(b.halaman) LIKE LOWER (:searchTerm)";
                default:
                    throw new IllegalArgumentException("Invalid search criteria selected.");
            }

            EntityManager em = null;
            // Create and execute the JPA query
            try {

                EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
                em = emf.createEntityManager();

                TypedQuery<Buku> query = em.createQuery(queryString, Buku.class);
                query.setParameter("searchTerm", "%" + searchTerm + "%");

                List<Buku> results = query.getResultList();

                DefaultTableModel dataModel = new DefaultTableModel();

                // Add columns to the model
                dataModel.addColumn("KODE");
                dataModel.addColumn("JUDUL");
                dataModel.addColumn("SUBJUDUL");
                dataModel.addColumn("PENGARANG");
                dataModel.addColumn("PENERBIT");
                dataModel.addColumn("TAHUN");
                dataModel.addColumn("HALAMAN");
                dataModel.addColumn("ISBN");

                // Add rows to the model
                for (Buku result : results) {
                    Object[] rowData = {
                    result.getKodebuku(),
                    result.getJudulbuku(),
                    result.getSubjudulbuku(),
                    result.getPengarang(),
                    result.getPenerbit(),
                    result.getTahunterbit(),
                    result.getHalaman(),
                    result.getIsbn(),
            };
                dataModel.addRow(rowData);
            }

            // Set jTableBuku with the created model
            jTableBuku.setModel(dataModel);

        } catch (IllegalArgumentException ex) {
            // Handle the case where no search criteria selected
            ex.printStackTrace();
        } catch (Exception ex) {
            // Handle other exceptions
            ex.printStackTrace();
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }}
    
    catch (Exception ex) {
    ex.printStackTrace();}
    }                                           

    private void jTextFieldCari1KeyTyped(java.awt.event.KeyEvent evt) {                                         

    }                                              

    private void jTextFieldCariBukuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCariBukuKeyTyped
        
    }//GEN-LAST:event_jTextFieldCariBukuKeyTyped

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void jTableBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBukuMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTableBukuMouseClicked

    private void jTextFieldCariSkripsiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCariSkripsiKeyReleased
        // TODO add your handling code here:
        try {String selection = (String) FilterSkripsi.getSelectedItem();
            String searchTerm = jTextFieldCariSkripsi.getText().trim();

            // Check if a search criteria is selected
            if (selection == null || selection.isEmpty()) {
                throw new IllegalArgumentException("No search criteria selected.");
            }

            // Building the JPA query dynamically based on the selected criteria
                String queryString = "SELECT s FROM Skripsi s WHERE ";
            switch (FilterSkripsi.getSelectedIndex()) {
                case 0:
                    break;
                case 1:
                    queryString += "LOWER(s.kodeskripsi) LIKE LOWER(:searchTerm)";
                    break;
                case 2:
                    queryString += "LOWER(s.judulskripsi) LIKE LOWER(:searchTerm)";
                    break;
                case 3:
                    queryString += "LOWER(s.penulis) LIKE LOWER(:searchTerm)";
                    break;
                case 4:
                    queryString += "LOWER(s.tahun) LIKE LOWER(:searchTerm)";
                    break;
                case 5:
                    queryString += "LOWER(s.halaman) LIKE LOWER (:searchTerm)";
                default:
                    throw new IllegalArgumentException("Invalid search criteria selected.");
            }

            EntityManager em = null;
            // Create and execute the JPA query
            try {

                EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
                em = emf.createEntityManager();

                TypedQuery<Skripsi> query = em.createQuery(queryString, Skripsi.class);
                query.setParameter("searchTerm", "%" + searchTerm + "%");

                List<Skripsi> results = query.getResultList();

                DefaultTableModel dataModel = new DefaultTableModel();

                // Add columns to the model
                dataModel.addColumn("KODE");
                dataModel.addColumn("JUDUL");
                dataModel.addColumn("PENULIS");
                dataModel.addColumn("TAHUN");
                dataModel.addColumn("HALAMAN");

                // Add rows to the model
                for (Skripsi result : results) {
                    Object[] rowData = {
                    result.getKodeskripsi(),
                    result.getJudulskripsi(),
                    result.getPenulis(),
                    result.getTahun(),
                    result.getHalaman()
            };
                dataModel.addRow(rowData);
            }

            // Set tabel skripsi dengan created model
            jTableSkripsi.setModel(dataModel);

        } catch (IllegalArgumentException ex) {
            // Handle the case where no search criteria selected
            ex.printStackTrace();
        } catch (Exception ex) {
            // Handle other exceptions
            ex.printStackTrace();
        } finally {
            if (em != null && em.isOpen()) {
                em.close();
            }
        }}
    
    catch (Exception ex) {
    ex.printStackTrace();}                                        

    
    }//GEN-LAST:event_jTextFieldCariSkripsiKeyReleased

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextFieldKodeBuku1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldKodeBuku1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldKodeBuku1ActionPerformed

    private void jTextFieldKodeBuku1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldKodeBuku1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldKodeBuku1KeyReleased

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextFieldKodeBuku2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldKodeBuku2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldKodeBuku2ActionPerformed

    private void jTextFieldKodeBuku2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldKodeBuku2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldKodeBuku2KeyReleased

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    public static void main(String args[])
            throws Exception {

        String UI = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
        UIManager.setLookAndFeel(UI);
        //new Dashboard().setVisible(true);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Dashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> FilterBuku;
    private javax.swing.JComboBox<String> FilterSkripsi;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel Jpanel;
    private javax.swing.JPanel Laporan;
    private javax.swing.JPanel PeminjamanBuku;
    private javax.swing.JPanel PeminjamanSkripsi;
    private javax.swing.JPanel SkripsiMenu1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButtonCariBuku;
    private javax.swing.JButton jButtonCariCetakSkripsi;
    private javax.swing.JButton jButtonCariSkripsi;
    private javax.swing.JButton jButtonCetakSearchBuku;
    private javax.swing.JButton jButtonEditDataBuku;
    private javax.swing.JButton jButtonEditDataSkripsi;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private com.toedter.calendar.JDateChooser jDateChooser6;
    private com.toedter.calendar.JDateChooser jDateChooser7;
    private com.toedter.calendar.JDateChooser jDateChooser8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTableBuku;
    private javax.swing.JTable jTableSkripsi;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextFieldCariBuku;
    private javax.swing.JTextField jTextFieldCariSkripsi;
    private javax.swing.JTextField jTextFieldKodeBuku1;
    private javax.swing.JTextField jTextFieldKodeBuku2;
    private javax.swing.JTabbedPane transaksi;
    // End of variables declaration//GEN-END:variables

    private void tampilanBuku() {
        DefaultTableModel model = (DefaultTableModel) jTableBuku.getModel();
        model.setRowCount(0);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Buku> cq = cb.createQuery(Buku.class
        );
        Root<Buku> stud = cq.from(Buku.class
        );
        cq.select(stud.get("kodebuku"));

        CriteriaQuery<Buku> select = cq.select(stud);
        TypedQuery<Buku> q = em.createQuery(select);
        List<Buku> list = q.getResultList();

        for (Buku data : list) {
            Object[] baris = new Object[8];
            baris[0] = data.getKodebuku();
            baris[1] = data.getJudulbuku();
            baris[2] = data.getSubjudulbuku();
            baris[3] = data.getPengarang();
            baris[4] = data.getPenerbit();
            baris[5] = data.getTahunterbit();
            baris[6] = data.getHalaman();
            baris[7] = data.getIsbn();

            model.addRow(baris);
        }

        jTableBuku.setModel(model);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    private void tampilanSkripsi() {

        DefaultTableModel model = (DefaultTableModel) jTableSkripsi.getModel();
        model.setRowCount(0);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Skripsi> cq = cb.createQuery(Skripsi.class);
        Root<Skripsi> stud = cq.from(Skripsi.class);
        cq.select(stud.get("kodeskripsi"));

        CriteriaQuery<Skripsi> select = cq.select(stud);
        TypedQuery<Skripsi> q = em.createQuery(select);
        List<Skripsi> list = q.getResultList();

        for (Skripsi data : list) {
            Object[] baris = new Object[5];
            baris[0] = data.getKodeskripsi();
            baris[1] = data.getJudulskripsi();
            baris[2] = data.getPenulis();
            baris[3] = data.getTahun();
            baris[4] = data.getHalaman();

            model.addRow(baris);
        }

        jTableSkripsi.setModel(model);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
    private void fillJudulBuku(JTextField jTextFieldJudulBuku, String kodeBuku) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("KumpulanBukuSkripsiPU");
        EntityManager em = emf.createEntityManager();
        try {
            // Mencari buku berdasarkan kode buku
            TypedQuery<Buku> query = em.createQuery("SELECT b.judulbuku FROM Buku b WHERE b.kodebuku = (:kodebuku)", Buku.class);
            query.setParameter("kodebuku", kodeBuku);
            Buku buku = query.getSingleResult();

            // Mengisi judul buku pada TextField
            if (buku != null) {
                jTextFieldJudulBuku.setText(buku.getJudulbuku());
            } else {
                jTextFieldJudulBuku.setText("Buku tidak ditemukan");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }}
}
