/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rakornas;

import kode.total;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import kode.buku;
import kode.koneksi;
import kode.mhs;
import kode.pinjam;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
/**
 *
 * @author muhammad.fadhil
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }
    
    public void ref_mahasiswa(){
        getDataURL dataurl = new getDataURL();
        String nama2 = "";
        DefaultTableModel model = (DefaultTableModel) jTablemahasiswa.getModel();
        JSONParser parser = new JSONParser();

        String url = "http://localhost/perpusjava/?op=viewdata&subop=mahasiswa&subop2=nama&nama="+nama2;
        try {
            model.setRowCount(0);
            String datajson = dataurl.getData(url);
            System.out.println(datajson);

            Object obj=JSONValue.parse(datajson);
            JSONArray array=(JSONArray)obj;

            int banyak = array.size();
            for(int i=0;i<banyak;i++){
                JSONObject data=(JSONObject)array.get(i);
                Object nama = data.get("nama");
                Object npm = data.get("npm");
                Object jenis_kelamin = data.get("jenis_kelamin");
                Object prodi = data.get("prodi");

                Object[] row = {
                    nama,
                    npm,
                    jenis_kelamin,
                    prodi
                };
                model.addRow(row);
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "data tidak ada");
        }

    }                                              

    public void ref_total(){
        getDataURL dataurl = new getDataURL();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        JSONParser parser = new JSONParser();

        String url = "http://localhost/perpusjava/?op=viewttotal&cari=";
        try {
            model.setRowCount(0);
            String datajson = dataurl.getData(url);
            System.out.println(datajson);

            Object obj=JSONValue.parse(datajson);
            JSONArray array=(JSONArray)obj;

            int banyak = array.size();
            for(int i=0;i<banyak;i++){
                JSONObject data=(JSONObject)array.get(i);
                Object npm = data.get("npm");
                Object kd_buku = data.get("kd_buku");
                Object tgl_pinjam = data.get("tgl_pinjam");
                Object tgl_kembali = data.get("tgl_kembali");
                Object lama = data.get("lama");
                Object tgl_pengembalian = data.get("tgl_pengembalian");
                Object denda = data.get("denda");
                Object biaya = data.get("biaya");
                Object total = data.get("total");
                Object[] row = {
                    npm,
                    kd_buku,
                    tgl_pinjam,
                    tgl_kembali,
                    lama,
                    tgl_pengembalian,
                    denda,
                    biaya,
                    total
                };
                model.addRow(row);
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "data tidak ada");
        }
    }
    public void ref_buku(){
        getDataURL dataurl = new getDataURL();
        DefaultTableModel model = (DefaultTableModel) bukuTable.getModel();
        JSONParser parser = new JSONParser();

        String url = "http://localhost/perpusjava/?op=viewdata&subop=buku&subop2=kd_buku&kd_buku=";
        try {
            model.setRowCount(0);
            String datajson = dataurl.getData(url);
            System.out.println(datajson);

            Object obj=JSONValue.parse(datajson);
            JSONArray array=(JSONArray)obj;

            int banyak = array.size();
            for(int i=0;i<banyak;i++){
                JSONObject data=(JSONObject)array.get(i);
                Object kd_buku = data.get("kd_buku");
                Object judul = data.get("judul");
                Object pengarang = data.get("pengarang");
                Object penerbit = data.get("penerbit");
                Object harga = data.get("harga");

                Object[] row = {
                    kd_buku,
                    judul,
                    pengarang,
                    penerbit,
                    harga
                };
                model.addRow(row);
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "data tidak ada");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablemahasiswa = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jk_mhsRadioButton = new javax.swing.JRadioButton();
        nama_mhsRadioButton = new javax.swing.JRadioButton();
        npm_mhsRadioButton = new javax.swing.JRadioButton();
        prodi_mhsRadioButton = new javax.swing.JRadioButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        prodiMaha = new javax.swing.JComboBox();
        jkMaha = new javax.swing.JComboBox();
        npmMaha = new javax.swing.JTextField();
        namaMaha = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        insert_mhsButton = new javax.swing.JButton();
        view_mhsButton = new javax.swing.JButton();
        refresh_mhsButton = new javax.swing.JButton();
        delete_mhsButton = new javax.swing.JButton();
        update_mhsButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        kd_bukuField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        judulField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        hargaField = new javax.swing.JTextField();
        pengarangField = new javax.swing.JTextField();
        penerbitField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        view_BukuButton = new javax.swing.JButton();
        update_bukuButton = new javax.swing.JButton();
        delete_bukuButton = new javax.swing.JButton();
        insert_bukuButton = new javax.swing.JButton();
        refresh_bukuButton = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        judulRadio = new javax.swing.JRadioButton();
        kd_bukuRadio = new javax.swing.JRadioButton();
        penerbitRadio = new javax.swing.JRadioButton();
        pengarangRadio = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        bukuTable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        bln_pinjamField = new javax.swing.JTextField();
        kd_buku_pinjamField = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        thn_batasField = new javax.swing.JTextField();
        tgl_pinjamField = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        tgl_batasField = new javax.swing.JTextField();
        thn_pinjamField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        bln_batasField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        insert_pinjamButton = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        npm_pinjamField = new javax.swing.JTextField();
        delete_pinjamButton = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        NPM_KBLField = new javax.swing.JTextField();
        bln_kblField = new javax.swing.JTextField();
        thn_kblField = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        tgl_kblField = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        delete_kblButton = new javax.swing.JButton();
        insert_kblButton = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jTextField19 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        kode_trfField = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        npm = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        delete_trfButton = new javax.swing.JButton();
        insert_trfButton = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        CARIField = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jTablemahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama", "NPM", "jenis kelamin", "program studi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablemahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablemahasiswaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTablemahasiswa);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Cari Data Berdasarkan"));

        jk_mhsRadioButton.setBackground(new java.awt.Color(51, 51, 51));
        jk_mhsRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        jk_mhsRadioButton.setText("jenis kelamin");
        jk_mhsRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jk_mhsRadioButtonActionPerformed(evt);
            }
        });

        nama_mhsRadioButton.setBackground(new java.awt.Color(51, 51, 51));
        nama_mhsRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        nama_mhsRadioButton.setText("nama");
        nama_mhsRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_mhsRadioButtonActionPerformed(evt);
            }
        });

        npm_mhsRadioButton.setBackground(new java.awt.Color(51, 51, 51));
        npm_mhsRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        npm_mhsRadioButton.setText("npm");
        npm_mhsRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                npm_mhsRadioButtonActionPerformed(evt);
            }
        });

        prodi_mhsRadioButton.setBackground(new java.awt.Color(51, 51, 51));
        prodi_mhsRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        prodi_mhsRadioButton.setText("prodi");
        prodi_mhsRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodi_mhsRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(nama_mhsRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(npm_mhsRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jk_mhsRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prodi_mhsRadioButton)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(nama_mhsRadioButton)
                .addComponent(npm_mhsRadioButton)
                .addComponent(jk_mhsRadioButton)
                .addComponent(prodi_mhsRadioButton))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("nama                           :");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Npm                             :");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("jenis kelamin              :");

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("program studi            :");

        prodiMaha.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "~ Pilih ~", "Manajemen_Informatika", "Teknik_Informatika", "Teknik_Komputer" }));
        prodiMaha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodiMahaActionPerformed(evt);
            }
        });
        prodiMaha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                prodiMahaKeyPressed(evt);
            }
        });

        jkMaha.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "~ pilih ~", "Pria", "Wanita" }));
        jkMaha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jkMahaKeyPressed(evt);
            }
        });

        npmMaha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                npmMahaActionPerformed(evt);
            }
        });
        npmMaha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                npmMahaKeyPressed(evt);
            }
        });

        namaMaha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                namaMahaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(npmMaha, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jkMaha, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaMaha, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addComponent(prodiMaha, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(npmMaha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(namaMaha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jkMaha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(prodiMaha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Tombol"));

        insert_mhsButton.setText("insert");
        insert_mhsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_mhsButtonActionPerformed(evt);
            }
        });
        insert_mhsButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                insert_mhsButtonKeyPressed(evt);
            }
        });

        view_mhsButton.setText("view");
        view_mhsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_mhsButtonActionPerformed(evt);
            }
        });
        view_mhsButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                view_mhsButtonKeyPressed(evt);
            }
        });

        refresh_mhsButton.setText("refresh");
        refresh_mhsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_mhsButtonActionPerformed(evt);
            }
        });
        refresh_mhsButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                refresh_mhsButtonKeyPressed(evt);
            }
        });

        delete_mhsButton.setText("delete");
        delete_mhsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_mhsButtonActionPerformed(evt);
            }
        });
        delete_mhsButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                delete_mhsButtonKeyPressed(evt);
            }
        });

        update_mhsButton.setText("update");
        update_mhsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_mhsButtonActionPerformed(evt);
            }
        });
        update_mhsButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                update_mhsButtonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(insert_mhsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(update_mhsButton)
                .addGap(18, 18, 18)
                .addComponent(delete_mhsButton)
                .addGap(18, 18, 18)
                .addComponent(view_mhsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(refresh_mhsButton)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert_mhsButton)
                    .addComponent(refresh_mhsButton)
                    .addComponent(view_mhsButton)
                    .addComponent(delete_mhsButton)
                    .addComponent(update_mhsButton))
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(513, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Data Mahasiswa", jPanel2);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        kd_bukuField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kd_bukuFieldKeyPressed(evt);
            }
        });

        jLabel14.setText("kd_buku                            :");

        jLabel13.setText("judul                                  :");

        jLabel16.setText("penerbit                            :");

        jLabel17.setText("harga pinjam                    :");

        judulField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                judulFieldKeyPressed(evt);
            }
        });

        jLabel15.setText("pengarang                        :");

        hargaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                hargaFieldKeyPressed(evt);
            }
        });

        pengarangField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pengarangFieldKeyPressed(evt);
            }
        });

        penerbitField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                penerbitFieldKeyPressed(evt);
            }
        });

        jLabel11.setText("per hari");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel16)
                        .addComponent(jLabel15))
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(penerbitField)
                    .addComponent(pengarangField)
                    .addComponent(judulField, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(hargaField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11))
                    .addComponent(kd_bukuField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(kd_bukuField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(judulField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pengarangField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(penerbitField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Tombol"));

        view_BukuButton.setText("view");
        view_BukuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_BukuButtonActionPerformed(evt);
            }
        });
        view_BukuButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                view_BukuButtonKeyPressed(evt);
            }
        });

        update_bukuButton.setText("update");
        update_bukuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_bukuButtonActionPerformed(evt);
            }
        });
        update_bukuButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                update_bukuButtonKeyPressed(evt);
            }
        });

        delete_bukuButton.setText("delete");
        delete_bukuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_bukuButtonActionPerformed(evt);
            }
        });
        delete_bukuButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                delete_bukuButtonKeyPressed(evt);
            }
        });

        insert_bukuButton.setText("insert");
        insert_bukuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_bukuButtonActionPerformed(evt);
            }
        });
        insert_bukuButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                insert_bukuButtonKeyPressed(evt);
            }
        });

        refresh_bukuButton.setText("refresh");
        refresh_bukuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_bukuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insert_bukuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(update_bukuButton, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delete_bukuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(view_BukuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(refresh_bukuButton)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert_bukuButton)
                    .addComponent(update_bukuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete_bukuButton)
                    .addComponent(view_BukuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(refresh_bukuButton))
                .addContainerGap())
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Cari Data Berdasarkan"));

        judulRadio.setBackground(new java.awt.Color(51, 51, 51));
        judulRadio.setForeground(new java.awt.Color(255, 255, 255));
        judulRadio.setText("judul");
        judulRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                judulRadioActionPerformed(evt);
            }
        });

        kd_bukuRadio.setBackground(new java.awt.Color(51, 51, 51));
        kd_bukuRadio.setForeground(new java.awt.Color(255, 255, 255));
        kd_bukuRadio.setText("kd_buku");
        kd_bukuRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kd_bukuRadioActionPerformed(evt);
            }
        });

        penerbitRadio.setBackground(new java.awt.Color(51, 51, 51));
        penerbitRadio.setForeground(new java.awt.Color(255, 255, 255));
        penerbitRadio.setText("penerbit");
        penerbitRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penerbitRadioActionPerformed(evt);
            }
        });

        pengarangRadio.setBackground(new java.awt.Color(51, 51, 51));
        pengarangRadio.setForeground(new java.awt.Color(255, 255, 255));
        pengarangRadio.setText("pengarang");
        pengarangRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengarangRadioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kd_bukuRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(judulRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pengarangRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(penerbitRadio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kd_bukuRadio)
                    .addComponent(judulRadio)
                    .addComponent(pengarangRadio)
                    .addComponent(penerbitRadio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bukuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "kd_buku", "judul", "pengarang", "penerbit", "harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bukuTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bukuTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(bukuTable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(517, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Data Buku", jPanel4);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        bln_pinjamField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bln_pinjamFieldKeyPressed(evt);
            }
        });

        kd_buku_pinjamField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kd_buku_pinjamFieldKeyPressed(evt);
            }
        });

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("TGL");

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Kode                                             :");

        thn_batasField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                thn_batasFieldKeyPressed(evt);
            }
        });

        tgl_pinjamField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tgl_pinjamFieldKeyPressed(evt);
            }
        });

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("THN");

        tgl_batasField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tgl_batasFieldKeyPressed(evt);
            }
        });

        thn_pinjamField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                thn_pinjamFieldKeyPressed(evt);
            }
        });

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Waktu Pinjam                                :");

        bln_batasField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bln_batasFieldKeyPressed(evt);
            }
        });

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Npm                                              : ");

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("TGL");

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("THN");

        insert_pinjamButton.setText("Insert");
        insert_pinjamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_pinjamButtonActionPerformed(evt);
            }
        });
        insert_pinjamButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                insert_pinjamButtonKeyPressed(evt);
            }
        });

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(204, 204, 204));

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("BLN");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Lama Peminjaman                       :");

        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("BLN");

        npm_pinjamField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                npm_pinjamFieldKeyPressed(evt);
            }
        });

        delete_pinjamButton.setText("Delete");
        delete_pinjamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_pinjamButtonActionPerformed(evt);
            }
        });

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("waktu Batas Peminjaman           :");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(npm_pinjamField, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(kd_buku_pinjamField, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(insert_pinjamButton, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(delete_pinjamButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField9))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel33))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tgl_pinjamField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tgl_batasField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bln_batasField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bln_pinjamField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(thn_pinjamField)
                            .addComponent(thn_batasField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(646, 646, 646))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(npm_pinjamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(kd_buku_pinjamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tgl_pinjamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34)
                            .addComponent(bln_pinjamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thn_pinjamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36)
                            .addComponent(jLabel32))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tgl_batasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bln_batasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35)
                            .addComponent(thn_batasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37)
                            .addComponent(jLabel33))))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert_pinjamButton)
                    .addComponent(delete_pinjamButton))
                .addContainerGap(520, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Peminjaman", jPanel6);

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Npm                                  :");

        NPM_KBLField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NPM_KBLFieldKeyPressed(evt);
            }
        });

        bln_kblField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bln_kblFieldKeyPressed(evt);
            }
        });

        thn_kblField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                thn_kblFieldKeyPressed(evt);
            }
        });

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("THN");

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("BLN");

        tgl_kblField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tgl_kblFieldKeyPressed(evt);
            }
        });

        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("TGL");

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Waktu Kembali                  :");

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Denda                               :");

        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Rp");

        jTextField16.setEditable(false);
        jTextField16.setBackground(new java.awt.Color(204, 204, 204));

        delete_kblButton.setText("Delete");
        delete_kblButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_kblButtonActionPerformed(evt);
            }
        });

        insert_kblButton.setText("Insert");
        insert_kblButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_kblButtonActionPerformed(evt);
            }
        });
        insert_kblButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                insert_kblButtonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NPM_KBLField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel38))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel42)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(tgl_kblField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bln_kblField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(thn_kblField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(insert_kblButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_kblButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(729, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(NPM_KBLField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel38)
                    .addComponent(tgl_kblField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(bln_kblField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(thn_kblField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert_kblButton)
                    .addComponent(delete_kblButton))
                .addContainerGap(650, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pengembalian", jPanel7);

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        jPanel14.setBackground(new java.awt.Color(0, 0, 0));

        jTextField19.setEditable(false);
        jTextField19.setBackground(new java.awt.Color(204, 204, 204));

        jLabel31.setBackground(new java.awt.Color(0, 0, 0));
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Total                                  :");

        jTextField18.setEditable(false);
        jTextField18.setBackground(new java.awt.Color(204, 204, 204));

        jLabel44.setBackground(new java.awt.Color(0, 0, 0));
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Biaya                                 :");

        kode_trfField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kode_trfFieldKeyPressed(evt);
            }
        });

        jLabel45.setBackground(new java.awt.Color(0, 0, 0));
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Kode                                 :");

        npm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                npmKeyPressed(evt);
            }
        });

        jLabel51.setBackground(new java.awt.Color(0, 0, 0));
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Npm                                  :");

        delete_trfButton.setText("Delete");
        delete_trfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_trfButtonActionPerformed(evt);
            }
        });

        insert_trfButton.setText("Insert");
        insert_trfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_trfButtonActionPerformed(evt);
            }
        });
        insert_trfButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                insert_trfButtonKeyPressed(evt);
            }
        });

        jLabel52.setBackground(new java.awt.Color(0, 0, 0));
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Rp");

        jLabel53.setBackground(new java.awt.Color(0, 0, 0));
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Rp");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kode_trfField))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(npm, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel52))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel53)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField18)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(insert_trfButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delete_trfButton)
                .addGap(27, 27, 27))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(npm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(kode_trfField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete_trfButton)
                    .addComponent(insert_trfButton))
                .addContainerGap())
        );

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Npm");

        jButton9.setText("Cari");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NPM", "KODE", "Tgl Pinjam", "Tgl Kembali", "Lama", "Tgl Pengembalian", "Denda", "Biaya", "Total"
            }
        ));
        jScrollPane5.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CARIField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9)))))
                .addGap(88, 88, 88))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(CARIField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
        );

        jTabbedPane1.addTab("Total", jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowActivated

    private void jTablemahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablemahasiswaMouseClicked
        // TODO add your handling code here:
        try {
            if (evt.getClickCount() == 2) {
                //npmMaha.enable(false);
                //showData2();
            }
        } catch (Throwable t) {
            JOptionPane.showMessageDialog(null, "Record kosong....");
        }
    }//GEN-LAST:event_jTablemahasiswaMouseClicked

    private void jk_mhsRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jk_mhsRadioButtonActionPerformed
        // TODO add your handling code here:
        getDataURL dataurl = new getDataURL();
        String nama2 = JOptionPane.showInputDialog("Masukkan nama :");
        DefaultTableModel model = (DefaultTableModel) jTablemahasiswa.getModel();
        JSONParser parser = new JSONParser();

        String url = "http://localhost/perpusjava/?op=viewdata&subop=mahasiswa&subop2=jenis_kelamin&jenis_kelamin="+nama2;
        try {
            model.setRowCount(0);
            String datajson = dataurl.getData(url);
            System.out.println(datajson);

            Object obj=JSONValue.parse(datajson);
            JSONArray array=(JSONArray)obj;

            int banyak = array.size();
            for(int i=0;i<banyak;i++){
                JSONObject data=(JSONObject)array.get(i);
                Object nama = data.get("nama");
                Object npm = data.get("npm");
                Object jenis_kelamin = data.get("jenis_kelamin");
                Object prodi = data.get("prodi");

                Object[] row = {
                    nama,
                    npm,
                    jenis_kelamin,
                    prodi
                };
                model.addRow(row);
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "data tidak ada");
        }
    }//GEN-LAST:event_jk_mhsRadioButtonActionPerformed

    private void nama_mhsRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_mhsRadioButtonActionPerformed
        // TODO add your handling code here:
        getDataURL dataurl = new getDataURL();
        String nama2 = JOptionPane.showInputDialog("Masukkan nama :");
        DefaultTableModel model = (DefaultTableModel) jTablemahasiswa.getModel();
        JSONParser parser = new JSONParser();

        String url = "http://localhost/perpusjava/?op=viewdata&subop=mahasiswa&subop2=nama&nama="+nama2;
        try {
            model.setRowCount(0);
            String datajson = dataurl.getData(url);
            System.out.println(datajson);

            Object obj=JSONValue.parse(datajson);
            JSONArray array=(JSONArray)obj;

            int banyak = array.size();
            for(int i=0;i<banyak;i++){
                JSONObject data=(JSONObject)array.get(i);
                Object nama = data.get("nama");
                Object npm = data.get("npm");
                Object jenis_kelamin = data.get("jenis_kelamin");
                Object prodi = data.get("prodi");

                Object[] row = {
                    nama,
                    npm,
                    jenis_kelamin,
                    prodi
                };
                model.addRow(row);
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "data tidak ada");
        }
    }//GEN-LAST:event_nama_mhsRadioButtonActionPerformed

    private void npm_mhsRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_npm_mhsRadioButtonActionPerformed
        // TODO add your handling code here:
        getDataURL dataurl = new getDataURL();
        String nama2 = JOptionPane.showInputDialog("Masukkan nama :");
        DefaultTableModel model = (DefaultTableModel) jTablemahasiswa.getModel();
        JSONParser parser = new JSONParser();

        String url = "http://localhost/perpusjava/?op=viewdata&subop=npm&subop2=nama&npm="+nama2;
        try {
            model.setRowCount(0);
            String datajson = dataurl.getData(url);
            System.out.println(datajson);

            Object obj=JSONValue.parse(datajson);
            JSONArray array=(JSONArray)obj;

            int banyak = array.size();
            for(int i=0;i<banyak;i++){
                JSONObject data=(JSONObject)array.get(i);
                Object nama = data.get("nama");
                Object npm = data.get("npm");
                Object jenis_kelamin = data.get("jenis_kelamin");
                Object prodi = data.get("prodi");

                Object[] row = {
                    nama,
                    npm,
                    jenis_kelamin,
                    prodi
                };
                model.addRow(row);
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "data tidak ada");
        }
    }//GEN-LAST:event_npm_mhsRadioButtonActionPerformed

    private void prodi_mhsRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodi_mhsRadioButtonActionPerformed
        // TODO add your handling code here:
        getDataURL dataurl = new getDataURL();
        String nama2 = JOptionPane.showInputDialog("Masukkan nama :");
        DefaultTableModel model = (DefaultTableModel) jTablemahasiswa.getModel();
        JSONParser parser = new JSONParser();

        String url = "http://localhost/perpusjava/?op=viewdata&subop=mahasiswa&subop2=prodi&prodi="+nama2;
        try {
            model.setRowCount(0);
            String datajson = dataurl.getData(url);
            System.out.println(datajson);

            Object obj=JSONValue.parse(datajson);
            JSONArray array=(JSONArray)obj;

            int banyak = array.size();
            for(int i=0;i<banyak;i++){
                JSONObject data=(JSONObject)array.get(i);
                Object nama = data.get("nama");
                Object npm = data.get("npm");
                Object jenis_kelamin = data.get("jenis_kelamin");
                Object prodi = data.get("prodi");

                Object[] row = {
                    nama,
                    npm,
                    jenis_kelamin,
                    prodi
                };
                model.addRow(row);
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "data tidak ada");
        }
    }//GEN-LAST:event_prodi_mhsRadioButtonActionPerformed

    private void prodiMahaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prodiMahaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            insert_mhsButton.requestFocus();
        }
    }//GEN-LAST:event_prodiMahaKeyPressed

    private void jkMahaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jkMahaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            prodiMaha.requestFocus();
        }
    }//GEN-LAST:event_jkMahaKeyPressed

    private void npmMahaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_npmMahaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_npmMahaActionPerformed

    private void npmMahaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_npmMahaKeyPressed
        if (evt.getKeyCode() == 0x0A) {
            namaMaha.requestFocus();
        }
    }//GEN-LAST:event_npmMahaKeyPressed

    private void namaMahaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaMahaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            jkMaha.requestFocus();
        }
    }//GEN-LAST:event_namaMahaKeyPressed

    private void insert_mhsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_mhsButtonActionPerformed
        // TODO add your handling code here:

        if (npmMaha.getText().equals("") || namaMaha.getText().equals("") || jkMaha.getSelectedItem().equals("") || prodiMaha.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Masih ada yang kosong, tolong lengkapi!");
        } else {

            getDataURL dataurl = new getDataURL();
            
            JSONParser parser = new JSONParser();

            String url = "http://localhost/perpusjava/?op=insert&subop=mahasiswa&npm="+npmMaha.getText()+"&nama="+namaMaha.getText()+"&jenis_kelamin="+jkMaha.getSelectedItem()+"&prodi="+prodiMaha.getSelectedItem().toString();
            try {
                String datajson = dataurl.getData(url);
                JOptionPane.showMessageDialog(null, "Insert Success");
                

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "data tidak ada");
            }
            //            clear2();
            //    clearTable2();
            //   selectData2();
            ref_mahasiswa();
        }
    }//GEN-LAST:event_insert_mhsButtonActionPerformed

    private void insert_mhsButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insert_mhsButtonKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            update_mhsButton.requestFocus();
        }
    }//GEN-LAST:event_insert_mhsButtonKeyPressed

    private void view_mhsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_mhsButtonActionPerformed
        // TODO add your handling code here:
        getDataURL dataurl = new getDataURL();
        String nama2 = "";
        DefaultTableModel model = (DefaultTableModel) jTablemahasiswa.getModel();
        JSONParser parser = new JSONParser();

        String url = "http://localhost/perpusjava/?op=viewdata&subop=mahasiswa&subop2=nama&nama="+nama2;
        try {
            model.setRowCount(0);
            String datajson = dataurl.getData(url);
            System.out.println(datajson);

            Object obj=JSONValue.parse(datajson);
            JSONArray array=(JSONArray)obj;

            int banyak = array.size();
            for(int i=0;i<banyak;i++){
                JSONObject data=(JSONObject)array.get(i);
                Object nama = data.get("nama");
                Object npm = data.get("npm");
                Object jenis_kelamin = data.get("jenis_kelamin");
                Object prodi = data.get("prodi");

                Object[] row = {
                    nama,
                    npm,
                    jenis_kelamin,
                    prodi
                };
                model.addRow(row);
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "data tidak ada");
        }

    }//GEN-LAST:event_view_mhsButtonActionPerformed

    private void view_mhsButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_view_mhsButtonKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            refresh_mhsButton.requestFocus();
        }
    }//GEN-LAST:event_view_mhsButtonKeyPressed

    private void refresh_mhsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_mhsButtonActionPerformed
        // TODO add your handling code here:
        getDataURL dataurl = new getDataURL();
        String nama2 = "";
        DefaultTableModel model = (DefaultTableModel) jTablemahasiswa.getModel();
        JSONParser parser = new JSONParser();

        String url = "http://localhost/perpusjava/?op=viewdata&subop=mahasiswa&subop2=nama&nama="+nama2;
        try {
            model.setRowCount(0);
            String datajson = dataurl.getData(url);
            System.out.println(datajson);

            Object obj=JSONValue.parse(datajson);
            JSONArray array=(JSONArray)obj;

            int banyak = array.size();
            for(int i=0;i<banyak;i++){
                JSONObject data=(JSONObject)array.get(i);
                Object nama = data.get("nama");
                Object npm = data.get("npm");
                Object jenis_kelamin = data.get("jenis_kelamin");
                Object prodi = data.get("prodi");

                Object[] row = {
                    nama,
                    npm,
                    jenis_kelamin,
                    prodi
                };
                model.addRow(row);
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "data tidak ada");
        }
    }//GEN-LAST:event_refresh_mhsButtonActionPerformed

    private void refresh_mhsButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_refresh_mhsButtonKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            nama_mhsRadioButton.requestFocus();
        }
    }//GEN-LAST:event_refresh_mhsButtonKeyPressed

    private void delete_mhsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_mhsButtonActionPerformed
        // TODO add your handling code here:
        try {

            if (npmMaha.getText().equals("") || namaMaha.getText().equals("") || jkMaha.getSelectedItem().equals("") || prodiMaha.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(null, "Masih ada yang kosong, tolong lengkapi!");
            } else {

                getDataURL dataurl = new getDataURL();
                JSONParser parser = new JSONParser();

                String url = "http://localhost/perpusjava/?op=delete&subop=mahasiswa&npm="+npmMaha.getText()+"&nama="+namaMaha.getText()+"&jenis_kelamin="+jkMaha.getSelectedItem()+"&prodi="+prodiMaha.getSelectedItem().toString();
                try {
                    String datajson = dataurl.getData(url);
                    System.out.println(datajson);
                    JOptionPane.showMessageDialog(null, "Insert Success");

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "data tidak ada");
                }

                //                clear2();
                //  clearTable2();
                //  selectData2();
                JOptionPane.showMessageDialog(null, "delete Success");

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_delete_mhsButtonActionPerformed

    private void delete_mhsButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_delete_mhsButtonKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            view_mhsButton.requestFocus();
        }
    }//GEN-LAST:event_delete_mhsButtonKeyPressed

    private void update_mhsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_mhsButtonActionPerformed
        // TODO add your handling code here:
        mhs mhs = new mhs();
        if (npmMaha.getText().equals("") || namaMaha.getText().equals("") || jkMaha.getSelectedItem().equals("") || prodiMaha.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Masih ada yang kosong, tolong lengkapi!");
        } else {
            mhs.setnpm(npmMaha.getText());
            mhs.setnama(namaMaha.getText());
            mhs.setjenis_kelamin(jkMaha.getSelectedItem().toString());
            mhs.setprodi(prodiMaha.getSelectedItem().toString());
            getDataURL dataurl = new getDataURL();
            JSONParser parser = new JSONParser();

            String url = "http://localhost/perpusjava/?op=update&subop=mahasiswa&npm="+npmMaha.getText()+"&nama="+namaMaha.getText()+"&jenis_kelamin="+jkMaha.getSelectedItem()+"&prodi="+prodiMaha.getSelectedItem().toString();
            try {
                String datajson = dataurl.getData(url);
                System.out.println(datajson);
                JOptionPane.showMessageDialog(null, "Insert Success");

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "data tidak ada");
            }
            //            clear2();
            //  clearTable2();
            //  selectData2();

        }
    }//GEN-LAST:event_update_mhsButtonActionPerformed

    private void update_mhsButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_update_mhsButtonKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            delete_mhsButton.requestFocus();
        }
    }//GEN-LAST:event_update_mhsButtonKeyPressed

    private void prodiMahaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodiMahaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodiMahaActionPerformed

    private void kd_bukuFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kd_bukuFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            judulField.requestFocus();
        }
    }//GEN-LAST:event_kd_bukuFieldKeyPressed

    private void judulFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_judulFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            pengarangField.requestFocus();
        }
    }//GEN-LAST:event_judulFieldKeyPressed

    private void hargaFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hargaFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            insert_bukuButton.requestFocus();
        }
    }//GEN-LAST:event_hargaFieldKeyPressed

    private void pengarangFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pengarangFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            penerbitField.requestFocus();
        }
    }//GEN-LAST:event_pengarangFieldKeyPressed

    private void penerbitFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_penerbitFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            hargaField.requestFocus();
        }
    }//GEN-LAST:event_penerbitFieldKeyPressed

    private void view_BukuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_BukuButtonActionPerformed
        // TODO add your handling code here:
        getDataURL dataurl = new getDataURL();
        DefaultTableModel model = (DefaultTableModel) bukuTable.getModel();
        JSONParser parser = new JSONParser();

        String url = "http://localhost/perpusjava/?op=viewdata&subop=buku&subop2=kd_buku&kd_buku=";
        try {
            model.setRowCount(0);
            String datajson = dataurl.getData(url);
            System.out.println(datajson);

            Object obj=JSONValue.parse(datajson);
            JSONArray array=(JSONArray)obj;

            int banyak = array.size();
            for(int i=0;i<banyak;i++){
                JSONObject data=(JSONObject)array.get(i);
                Object kd_buku = data.get("kd_buku");
                Object judul = data.get("judul");
                Object pengarang = data.get("pengarang");
                Object penerbit = data.get("penerbit");
                Object harga = data.get("harga");

                Object[] row = {
                    kd_buku,
                    judul,
                    pengarang,
                    penerbit,
                    harga
                };
                model.addRow(row);
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "data tidak ada");
        }
    }//GEN-LAST:event_view_BukuButtonActionPerformed

    private void view_BukuButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_view_BukuButtonKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            refresh_bukuButton.requestFocus();
        }
    }//GEN-LAST:event_view_BukuButtonKeyPressed

    private void update_bukuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_bukuButtonActionPerformed
        // TODO add your handling code here:
        try {
            kd_bukuField.setEnabled(false);
            judulField.requestFocus();

            buku bk = new buku();

            if (kd_bukuField.getText().equals("") || judulField.getText().equals("") || pengarangField.getText().equals("") || penerbitField.getText().equals("") || hargaField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Masih ada yang kosong, tolong lengkapi!");
            } else {

                getDataURL dataurl = new getDataURL();
                JSONParser parser = new JSONParser();

                String url = "http://localhost/perpusjava/?op=update&subop=Buku&kd_buku="+kd_bukuField.getText()+"&judul="+judulField.getText()+"&pengarang="+pengarangField.getText()+"&penerbit="+penerbitField.getText().toString()+"&harga="+hargaField.getText();
                try {
                    String datajson = dataurl.getData(url);
                    System.out.println(datajson);
                    kd_bukuField.requestFocus();
                    JOptionPane.showMessageDialog(null, "Insert Success");

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "data tidak ada");
                }

            }
        } catch (Throwable t) {
            JOptionPane.showMessageDialog(null, "Update gagal");
        }
    }//GEN-LAST:event_update_bukuButtonActionPerformed

    private void update_bukuButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_update_bukuButtonKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            delete_bukuButton.requestFocus();
        }
    }//GEN-LAST:event_update_bukuButtonKeyPressed

    private void delete_bukuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_bukuButtonActionPerformed
        // TODO add your handling code here:
        try {
            kd_bukuField.setEnabled(false);
            judulField.requestFocus();

            buku bk = new buku();

            if (kd_bukuField.getText().equals("") || judulField.getText().equals("") || pengarangField.getText().equals("") || penerbitField.getText().equals("") || hargaField.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Masih ada yang kosong, tolong lengkapi!");
            } else {
                getDataURL dataurl = new getDataURL();
                JSONParser parser = new JSONParser();

                String url = "http://localhost/perpusjava/?op=delete&subop=Buku&kd_buku="+kd_bukuField.getText()+"&judul="+judulField.getText()+"&pengarang="+pengarangField.getText()+"&penerbit="+penerbitField.getText().toString()+"&harga="+hargaField.getText();
                try {
                    String datajson = dataurl.getData(url);
                    System.out.println(datajson);
                    kd_bukuField.requestFocus();
                    JOptionPane.showMessageDialog(null, "Insert Success");

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "data tidak ada");
                }

            }
        } catch (Throwable t) {
            JOptionPane.showMessageDialog(null, "delete gagal");
        }
    }//GEN-LAST:event_delete_bukuButtonActionPerformed

    private void delete_bukuButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_delete_bukuButtonKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            view_BukuButton.requestFocus();
        }
    }//GEN-LAST:event_delete_bukuButtonKeyPressed

    private void insert_bukuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_bukuButtonActionPerformed
        // TODO add your handling code here:
        if (kd_bukuField.getText().equals("") || judulField.getText().equals("") || pengarangField.getText().equals("") || penerbitField.getText().equals("") || hargaField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Masih ada yang kosong, tolong lengkapi!");
        } else {

            getDataURL dataurl = new getDataURL();
            JSONParser parser = new JSONParser();

            String url = "http://localhost/perpusjava/?op=insert&subop=Buku&kd_buku="+kd_bukuField.getText()+"&judul="+judulField.getText()+"&pengarang="+pengarangField.getText()+"&penerbit="+penerbitField.getText().toString()+"&harga="+hargaField.getText();
            try {
                String datajson = dataurl.getData(url);
                System.out.println(datajson);
                kd_bukuField.requestFocus();
                JOptionPane.showMessageDialog(null, "Insert Success");
                ref_buku();

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "data tidak ada");
            }

            //clear();
            //clearTable();
            //selectData();

        }
    }//GEN-LAST:event_insert_bukuButtonActionPerformed

    private void insert_bukuButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insert_bukuButtonKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            update_bukuButton.requestFocus();
        }
    }//GEN-LAST:event_insert_bukuButtonKeyPressed

    private void refresh_bukuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_bukuButtonActionPerformed
        // TODO add your handling code here:
        //clear();
        //clearTable();
        //setDisabledKomponen2();
        bukuTable.setEnabled(true);
        //status = 1;
        kd_bukuField.setEnabled(true);
        kd_bukuField.requestFocus();
    }//GEN-LAST:event_refresh_bukuButtonActionPerformed

    private void judulRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_judulRadioActionPerformed
        // TODO add your handling code here:
        getDataURL dataurl = new getDataURL();
        String nama2 = JOptionPane.showInputDialog("Masukkan Judul Buku :");
        DefaultTableModel model = (DefaultTableModel) bukuTable.getModel();
        JSONParser parser = new JSONParser();

        String url = "http://localhost/perpusjava/?op=viewdata&subop=buku&subop2=judul&judul="+nama2;
        try {
            model.setRowCount(0);
            String datajson = dataurl.getData(url);
            System.out.println(datajson);

            Object obj=JSONValue.parse(datajson);
            JSONArray array=(JSONArray)obj;

            int banyak = array.size();
            for(int i=0;i<banyak;i++){
                JSONObject data=(JSONObject)array.get(i);
                Object kd_buku = data.get("kd_buku");
                Object judul = data.get("judul");
                Object pengarang = data.get("pengarang");
                Object penerbit = data.get("penerbit");
                Object harga = data.get("harga");

                Object[] row = {
                    kd_buku,
                    judul,
                    pengarang,
                    penerbit,
                    harga
                };
                model.addRow(row);
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "data tidak ada");
        }
    }//GEN-LAST:event_judulRadioActionPerformed

    private void kd_bukuRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kd_bukuRadioActionPerformed
        // TODO add your handling code here:

        getDataURL dataurl = new getDataURL();
        String nama2 = JOptionPane.showInputDialog("Masukkan Kode Buku :");
        DefaultTableModel model = (DefaultTableModel) bukuTable.getModel();
        JSONParser parser = new JSONParser();

        String url = "http://localhost/perpusjava/?op=viewdata&subop=buku&subop2=kd_buku&kd_buku="+nama2;
        try {
            model.setRowCount(0);
            String datajson = dataurl.getData(url);
            System.out.println(datajson);

            Object obj=JSONValue.parse(datajson);
            JSONArray array=(JSONArray)obj;

            int banyak = array.size();
            for(int i=0;i<banyak;i++){
                JSONObject data=(JSONObject)array.get(i);
                Object kd_buku = data.get("kd_buku");
                Object judul = data.get("judul");
                Object pengarang = data.get("pengarang");
                Object penerbit = data.get("penerbit");
                Object harga = data.get("harga");

                Object[] row = {
                    kd_buku,
                    judul,
                    pengarang,
                    penerbit,
                    harga
                };
                model.addRow(row);
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "data tidak ada");
        }

    }//GEN-LAST:event_kd_bukuRadioActionPerformed

    private void penerbitRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penerbitRadioActionPerformed
        // TODO add your handling code here:
        getDataURL dataurl = new getDataURL();
        String nama2 = JOptionPane.showInputDialog("Masukkan Penerbit :");
        DefaultTableModel model = (DefaultTableModel) bukuTable.getModel();
        JSONParser parser = new JSONParser();

        String url = "http://localhost/perpusjava/?op=viewdata&subop=buku&subop2=penerbit&penerbit="+nama2;
        try {
            model.setRowCount(0);
            String datajson = dataurl.getData(url);
            System.out.println(datajson);

            Object obj=JSONValue.parse(datajson);
            JSONArray array=(JSONArray)obj;

            int banyak = array.size();
            for(int i=0;i<banyak;i++){
                JSONObject data=(JSONObject)array.get(i);
                Object kd_buku = data.get("kd_buku");
                Object judul = data.get("judul");
                Object pengarang = data.get("pengarang");
                Object penerbit = data.get("penerbit");
                Object harga = data.get("harga");

                Object[] row = {
                    kd_buku,
                    judul,
                    pengarang,
                    penerbit,
                    harga
                };
                model.addRow(row);
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "data tidak ada");
        }
    }//GEN-LAST:event_penerbitRadioActionPerformed

    private void pengarangRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengarangRadioActionPerformed
        // TODO add your handling code here:
        getDataURL dataurl = new getDataURL();
        String nama2 = JOptionPane.showInputDialog("Masukkan Pengarang :");
        DefaultTableModel model = (DefaultTableModel) bukuTable.getModel();
        JSONParser parser = new JSONParser();

        String url = "http://localhost/perpusjava/?op=viewdata&subop=buku&subop2=pengarang&pengarang="+nama2;
        try {
            model.setRowCount(0);
            String datajson = dataurl.getData(url);
            System.out.println(datajson);

            Object obj=JSONValue.parse(datajson);
            JSONArray array=(JSONArray)obj;

            int banyak = array.size();
            for(int i=0;i<banyak;i++){
                JSONObject data=(JSONObject)array.get(i);
                Object kd_buku = data.get("kd_buku");
                Object judul = data.get("judul");
                Object pengarang = data.get("pengarang");
                Object penerbit = data.get("penerbit");
                Object harga = data.get("harga");

                Object[] row = {
                    kd_buku,
                    judul,
                    pengarang,
                    penerbit,
                    harga
                };
                model.addRow(row);
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "data tidak ada");
        }
    }//GEN-LAST:event_pengarangRadioActionPerformed

    private void bukuTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bukuTableMouseClicked
        // TODO add your handling code here:
        try {
            if (evt.getClickCount() == 2) {
                //                showData();
            }
        } catch (Throwable t) {
            JOptionPane.showMessageDialog(null, "Record kosong....");
        }
    }//GEN-LAST:event_bukuTableMouseClicked

    private void bln_pinjamFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bln_pinjamFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            thn_pinjamField.requestFocus();
        }
    }//GEN-LAST:event_bln_pinjamFieldKeyPressed

    private void kd_buku_pinjamFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kd_buku_pinjamFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            tgl_pinjamField.requestFocus();
        }
    }//GEN-LAST:event_kd_buku_pinjamFieldKeyPressed

    private void thn_batasFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_thn_batasFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            insert_pinjamButton.requestFocus();
        }
    }//GEN-LAST:event_thn_batasFieldKeyPressed

    private void tgl_pinjamFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tgl_pinjamFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            bln_pinjamField.requestFocus();
        }
    }//GEN-LAST:event_tgl_pinjamFieldKeyPressed

    private void tgl_batasFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tgl_batasFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            bln_batasField.requestFocus();
        }
    }//GEN-LAST:event_tgl_batasFieldKeyPressed

    private void thn_pinjamFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_thn_pinjamFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            tgl_batasField.requestFocus();
        }
    }//GEN-LAST:event_thn_pinjamFieldKeyPressed

    private void bln_batasFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bln_batasFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            thn_batasField.requestFocus();
        }
    }//GEN-LAST:event_bln_batasFieldKeyPressed

    private void insert_pinjamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_pinjamButtonActionPerformed
        // TODO add your handling code here:
        if (npm_pinjamField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lengkapi data");
        } else {
            try {
                pinjam pem = new pinjam();
                pem.setNPM(npm_pinjamField.getText());
                pem.setKode(kd_buku_pinjamField.getText());
                pem.setTgl_p(Integer.parseInt(tgl_pinjamField.getText()));
                pem.setBln_p(Integer.parseInt(bln_pinjamField.getText()));
                pem.setTh_p(Integer.parseInt(thn_pinjamField.getText()));
                pem.setTgl_k(Integer.parseInt(tgl_batasField.getText()));
                pem.setBln_k(Integer.parseInt(bln_batasField.getText()));
                pem.setTh_k(Integer.parseInt(thn_batasField.getText()));
                String tgl_p = String.valueOf(Integer.parseInt(tgl_pinjamField.getText()))+"-"+String.valueOf(Integer.parseInt(bln_pinjamField.getText()))+"-"
                +String.valueOf(Integer.parseInt(thn_pinjamField.getText()));
                String tgl_k = String.valueOf(Integer.parseInt(tgl_batasField.getText()))+"-"+String.valueOf(Integer.parseInt(bln_batasField.getText()))+"-"
                +String.valueOf(Integer.parseInt(thn_batasField.getText()));

                jTextField9.setText(String.valueOf(pem.lama()) + " hari");
                getDataURL dataurl = new getDataURL();
                JSONParser parser = new JSONParser();
                String url = "http://localhost/perpusjava/?op=insert&subop=Peminjaman&npm="+npm_pinjamField.getText()+"&kode="+kd_buku_pinjamField.getText()+"&tgl_p="+pengarangField.getText()+"&tgl_k="+penerbitField.getText()+"&lama="+pem.lama();
                String url2 = "http://localhost/perpusjava/?op=insert&subop=Sementara&npm="+npm_pinjamField.getText()+"&sem="+pem.sem();
                try {
                    String datajson = dataurl.getData(url);
                    String datajson2 = dataurl.getData(url2);
                    System.out.println(datajson);
                    System.out.println(datajson2);
                    kd_bukuField.requestFocus();
                    JOptionPane.showMessageDialog(null, "Insert Success");

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "data tidak ada");
                }

                JOptionPane.showMessageDialog(null, "Insert Success");

            } catch (Throwable t) {
                JOptionPane.showMessageDialog(null, t);
            }
        }
    }//GEN-LAST:event_insert_pinjamButtonActionPerformed

    private void insert_pinjamButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insert_pinjamButtonKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            delete_pinjamButton.requestFocus();
        }
    }//GEN-LAST:event_insert_pinjamButtonKeyPressed

    private void npm_pinjamFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_npm_pinjamFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            kd_buku_pinjamField.requestFocus();
        }
    }//GEN-LAST:event_npm_pinjamFieldKeyPressed

    private void delete_pinjamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_pinjamButtonActionPerformed
        // TODO add your handling code here:

        try {
            pinjam pem = new pinjam();
            pem.setNPM(npm_pinjamField.getText());
            pem.setKode(kd_buku_pinjamField.getText());
            pem.setTgl_p(Integer.parseInt(tgl_pinjamField.getText()));
            pem.setBln_p(Integer.parseInt(bln_pinjamField.getText()));
            pem.setTh_p(Integer.parseInt(thn_pinjamField.getText()));
            pem.setTgl_k(Integer.parseInt(tgl_batasField.getText()));
            pem.setBln_k(Integer.parseInt(bln_batasField.getText()));
            pem.setTh_k(Integer.parseInt(thn_batasField.getText()));
            String tgl_p = String.valueOf(Integer.parseInt(tgl_pinjamField.getText()))+"-"+String.valueOf(Integer.parseInt(bln_pinjamField.getText()))+"-"
            +String.valueOf(Integer.parseInt(thn_pinjamField.getText()));
            String tgl_k = String.valueOf(Integer.parseInt(tgl_batasField.getText()))+"-"+String.valueOf(Integer.parseInt(bln_batasField.getText()))+"-"
            +String.valueOf(Integer.parseInt(thn_batasField.getText()));

            jTextField9.setText(String.valueOf(pem.lama()) + " hari");
            getDataURL dataurl = new getDataURL();
            JSONParser parser = new JSONParser();
            String url = "http://localhost/perpusjava/?op=delete&subop=Peminjaman&npm="+npm_pinjamField.getText();
            String url2 = "http://localhost/perpusjava/?op=delete&subop=Sementara&npm="+npm_pinjamField.getText();
            try {
                String datajson = dataurl.getData(url);
                String datajson2 = dataurl.getData(url2);
                System.out.println(datajson);
                System.out.println(datajson2);
                kd_bukuField.requestFocus();
                JOptionPane.showMessageDialog(null, "Insert Success");

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "data tidak ada");
            }

            JOptionPane.showMessageDialog(null, "Insert Success");

        } catch (Throwable t) {
            JOptionPane.showMessageDialog(null, t);
        }
    }//GEN-LAST:event_delete_pinjamButtonActionPerformed

    private void NPM_KBLFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NPM_KBLFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            tgl_kblField.requestFocus();
        }
    }//GEN-LAST:event_NPM_KBLFieldKeyPressed

    private void bln_kblFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bln_kblFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            thn_kblField.requestFocus();
        }
    }//GEN-LAST:event_bln_kblFieldKeyPressed

    private void thn_kblFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_thn_kblFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            insert_kblButton.requestFocus();
        }
    }//GEN-LAST:event_thn_kblFieldKeyPressed

    private void tgl_kblFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tgl_kblFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            bln_kblField.requestFocus();
        }
    }//GEN-LAST:event_tgl_kblFieldKeyPressed

    private void delete_kblButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_kblButtonActionPerformed
        // TODO add your handling code here:
        try {
            pinjam p = new pinjam();
            p.setNPM(NPM_KBLField.getText());
            p.setTgl_k1(Integer.parseInt(tgl_kblField.getText()));
            p.setBln_k1(Integer.parseInt(bln_kblField.getText()));
            p.setTh_k1(Integer.parseInt(thn_kblField.getText()));
            jTextField16.setText(String.valueOf(p.denda()));

            try {
                pinjam pem = new pinjam();
                pem.setNPM(NPM_KBLField.getText());

                pem.setTgl_k(Integer.parseInt(tgl_kblField.getText()));
                pem.setBln_k(Integer.parseInt(bln_kblField.getText()));
                pem.setTh_k(Integer.parseInt(thn_kblField.getText()));

                getDataURL dataurl = new getDataURL();
                JSONParser parser = new JSONParser();
                String url = "http://localhost/perpusjava/?op=delete&subop=Kembali&npm="+NPM_KBLField.getText();
                try {
                    String datajson = dataurl.getData(url);
                    System.out.println(datajson);
                    kd_bukuField.requestFocus();
                    JOptionPane.showMessageDialog(null, "Insert Success");

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "data tidak ada");
                }

                JOptionPane.showMessageDialog(null, "Delete Success");

            } catch (Throwable t) {
                JOptionPane.showMessageDialog(null, t);
            }

        } catch (Throwable t) {
            JOptionPane.showMessageDialog(null, t);
        }
    }//GEN-LAST:event_delete_kblButtonActionPerformed

    private void insert_kblButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_kblButtonActionPerformed
        // TODO add your handling code here:
        try {
            pinjam p = new pinjam();
            p.setNPM(NPM_KBLField.getText());
            p.setTgl_k1(Integer.parseInt(tgl_kblField.getText()));
            p.setBln_k1(Integer.parseInt(bln_kblField.getText()));
            p.setTh_k1(Integer.parseInt(thn_kblField.getText()));
            jTextField16.setText(String.valueOf(p.denda()));

            try {
                pinjam pem = new pinjam();
                pem.setNPM(NPM_KBLField.getText());

                pem.setTgl_k(Integer.parseInt(tgl_kblField.getText()));
                pem.setBln_k(Integer.parseInt(bln_kblField.getText()));
                pem.setTh_k(Integer.parseInt(thn_kblField.getText()));

                getDataURL dataurl = new getDataURL();
                JSONParser parser = new JSONParser();
                String url = "http://localhost/perpusjava/?op=insert&subop=Kembali&npm="+NPM_KBLField.getText()+"&tgl_k="+tgl_kblField.getText()+"-"+bln_kblField.getText()+"-"+thn_kblField.getText()+"-"+"&denda="+p.denda();
                try {
                    String datajson = dataurl.getData(url);
                    System.out.println(datajson);
                    kd_bukuField.requestFocus();
                    JOptionPane.showMessageDialog(null, "Insert Success");

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "data tidak ada");
                }

                JOptionPane.showMessageDialog(null, "Insert Success");

            } catch (Throwable t) {
                JOptionPane.showMessageDialog(null, t);
            }

        } catch (Throwable t) {
            JOptionPane.showMessageDialog(null, t);
        }
    }//GEN-LAST:event_insert_kblButtonActionPerformed

    private void insert_kblButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insert_kblButtonKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            delete_kblButton.requestFocus();
        }
    }//GEN-LAST:event_insert_kblButtonKeyPressed

    private void kode_trfFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kode_trfFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            insert_trfButton.requestFocus();
        }
    }//GEN-LAST:event_kode_trfFieldKeyPressed

    private void npmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_npmKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            kode_trfField.requestFocus();
        }
    }//GEN-LAST:event_npmKeyPressed

    private void delete_trfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_trfButtonActionPerformed
        // TODO add your handling code here:

        try {
            total t = new total();
            t.setNPM(String.valueOf(npm.getText()));
            t.setkd_buku(String.valueOf(kode_trfField.getText()));
            jTextField18.setText(String.valueOf(t.biaya()));
            jTextField19.setText(String.valueOf(t.total()));
            getDataURL dataurl = new getDataURL();
            JSONParser parser = new JSONParser();
            String url = "http://localhost/perpusjava/?op=delete&subop=Total&npm="+npm.getText();
            try {
                String datajson = dataurl.getData(url);
                System.out.println(datajson);
                kd_bukuField.requestFocus();
                JOptionPane.showMessageDialog(null, "Insert Success");

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "data tidak ada");
            }
            JOptionPane.showMessageDialog(null, "Insert Success");

        } catch (Throwable e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_delete_trfButtonActionPerformed

    private void insert_trfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_trfButtonActionPerformed
        // TODO add your handling code here:
        if (npm.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lengkapi data");
        } else {
            try {
                total t = new total();
                t.setNPM(String.valueOf(npm.getText()));
                t.setkd_buku(String.valueOf(kode_trfField.getText()));
                jTextField18.setText(String.valueOf(t.biaya()));
                jTextField19.setText(String.valueOf(t.total()));
                getDataURL dataurl = new getDataURL();
                JSONParser parser = new JSONParser();
                String url = "http://localhost/perpusjava/?op=insert&subop=Total&npm="+npm.getText()+"&kd_buku="+kode_trfField.getText()+"&biaya="+t.biaya()+"&total="+t.total();
                try {
                    String datajson = dataurl.getData(url);
                    System.out.println(datajson);
                    kd_bukuField.requestFocus();
                    JOptionPane.showMessageDialog(null, "Insert Success");

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "data tidak ada");
                }
                JOptionPane.showMessageDialog(null, "Insert Success");

            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_insert_trfButtonActionPerformed

    private void insert_trfButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insert_trfButtonKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 0x0A) {
            delete_kblButton.requestFocus();
        }
    }//GEN-LAST:event_insert_trfButtonKeyPressed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        getDataURL dataurl = new getDataURL();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        JSONParser parser = new JSONParser();

        String url = "http://localhost/perpusjava/?op=viewttotal&cari="+CARIField.getText();
        try {
            model.setRowCount(0);
            String datajson = dataurl.getData(url);
            System.out.println(datajson);

            Object obj=JSONValue.parse(datajson);
            JSONArray array=(JSONArray)obj;

            int banyak = array.size();
            for(int i=0;i<banyak;i++){
                JSONObject data=(JSONObject)array.get(i);
                Object npm = data.get("npm");
                Object kd_buku = data.get("kd_buku");
                Object tgl_pinjam = data.get("tgl_pinjam");
                Object tgl_kembali = data.get("tgl_kembali");
                Object lama = data.get("lama");
                Object tgl_pengembalian = data.get("tgl_pengembalian");
                Object denda = data.get("denda");
                Object biaya = data.get("biaya");
                Object total = data.get("total");
                Object[] row = {
                    npm,
                    kd_buku,
                    tgl_pinjam,
                    tgl_kembali,
                    lama,
                    tgl_pengembalian,
                    denda,
                    biaya,
                    total
                };
                model.addRow(row);
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "data tidak ada");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CARIField;
    private javax.swing.JTextField NPM_KBLField;
    private javax.swing.JTextField bln_batasField;
    private javax.swing.JTextField bln_kblField;
    private javax.swing.JTextField bln_pinjamField;
    private javax.swing.JTable bukuTable;
    private javax.swing.JButton delete_bukuButton;
    private javax.swing.JButton delete_kblButton;
    private javax.swing.JButton delete_mhsButton;
    private javax.swing.JButton delete_pinjamButton;
    private javax.swing.JButton delete_trfButton;
    private javax.swing.JTextField hargaField;
    private javax.swing.JButton insert_bukuButton;
    private javax.swing.JButton insert_kblButton;
    private javax.swing.JButton insert_mhsButton;
    private javax.swing.JButton insert_pinjamButton;
    private javax.swing.JButton insert_trfButton;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
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
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTablemahasiswa;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JComboBox jkMaha;
    private javax.swing.JRadioButton jk_mhsRadioButton;
    private javax.swing.JTextField judulField;
    private javax.swing.JRadioButton judulRadio;
    private javax.swing.JTextField kd_bukuField;
    private javax.swing.JRadioButton kd_bukuRadio;
    private javax.swing.JTextField kd_buku_pinjamField;
    private javax.swing.JTextField kode_trfField;
    private javax.swing.JTextField namaMaha;
    private javax.swing.JRadioButton nama_mhsRadioButton;
    private javax.swing.JTextField npm;
    private javax.swing.JTextField npmMaha;
    private javax.swing.JRadioButton npm_mhsRadioButton;
    private javax.swing.JTextField npm_pinjamField;
    private javax.swing.JTextField penerbitField;
    private javax.swing.JRadioButton penerbitRadio;
    private javax.swing.JTextField pengarangField;
    private javax.swing.JRadioButton pengarangRadio;
    private javax.swing.JComboBox prodiMaha;
    private javax.swing.JRadioButton prodi_mhsRadioButton;
    private javax.swing.JButton refresh_bukuButton;
    private javax.swing.JButton refresh_mhsButton;
    private javax.swing.JTextField tgl_batasField;
    private javax.swing.JTextField tgl_kblField;
    private javax.swing.JTextField tgl_pinjamField;
    private javax.swing.JTextField thn_batasField;
    private javax.swing.JTextField thn_kblField;
    private javax.swing.JTextField thn_pinjamField;
    private javax.swing.JButton update_bukuButton;
    private javax.swing.JButton update_mhsButton;
    private javax.swing.JButton view_BukuButton;
    private javax.swing.JButton view_mhsButton;
    // End of variables declaration//GEN-END:variables
}
