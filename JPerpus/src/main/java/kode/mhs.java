/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kode;

import kode.koneksi;

/**
 *
 * @author User23
 */
public class mhs {

    private String nama;
    private String npm;
    private String jenis_kelamin;
    private String prodi;

    public mhs() {
    }

    public String getjenis_kelamin() {
        return jenis_kelamin;
    }

    public void setjenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getnpm() {
        return npm;
    }

    public void setnpm(String npm) {
        this.npm = npm;
    }

    public String getnama() {
        return nama;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public String getprodi() {
        return prodi;
    }

    public void setprodi(String prodi) {
        this.prodi = prodi;
    }

    public void updatemahasiswa() {
        koneksi kon = new koneksi();
        String s = "update mahasiswa set npm ='" + this.npm + "',nama = '" + this.nama + "',jenis_kelamin='" + this.jenis_kelamin + "',prodi='" + this.prodi + "'where npm = '" + this.npm + "'";
        kon.Query(s);
    }

    public void deletemahasiswa() {
        koneksi kon = new koneksi();
        String s = " delete from mahasiswa where npm ='" + this.npm + "'";
        kon.Query(s);
    }

    public void insertmahasiswa() {
        koneksi kon = new koneksi();
        String s = "insert into mahasiswa values ('" + this.npm + "','" + this.nama + "','" + this.jenis_kelamin + "','" + this.prodi + "');";
        kon.Query(s);
    }
}
