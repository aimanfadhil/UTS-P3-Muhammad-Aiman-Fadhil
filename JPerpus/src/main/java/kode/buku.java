/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kode;

import java.sql.ResultSet;

/**
 *
 * @author Elsya
 */
public class buku {

    private String kd_buku;
    private String judul;
    private String pengarang;
    private String penerbit;
    private String harga;

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKd_buku() {
        return kd_buku;
    }

    public void setKd_buku(String kd_buku) {
        this.kd_buku = kd_buku;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void insertBuku() {
        koneksi kon = new koneksi();
        String s = "insert into buku values ('" + this.kd_buku + "','" + this.judul + "','" + this.pengarang + "','" + this.penerbit + "','" + this.harga + "');";
        kon.Query(s);
    }

    public void updateBuku() {
        koneksi kon = new koneksi();
        String s = "update buku set kd_buku ='" + this.kd_buku + "',judul = '" + this.judul + "',pengarang='" + this.pengarang + "',penerbit='" + this.penerbit + "'where kd_buku = '" + this.kd_buku + "'";
        kon.Query(s);
    }

    public void deleteBuku() {
        koneksi kon = new koneksi();
        String s = " delete from buku where kd_buku ='" + this.kd_buku + "'";
        kon.Query(s);
    }

    public ResultSet getBuku() {
        ResultSet rs = null;
        koneksi kon = new koneksi();
        String s = "insert into buku values ('" + this.kd_buku + "','" + this.judul + "','" + this.pengarang + "','" + this.penerbit + "','" + this.harga + "');";
        kon.Query(s);
        return rs;
    }
}
