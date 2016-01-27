/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kode;
import java.sql.ResultSet;
/**
 *
 * @author Tiatin
 */
public class pinjam {
    private String npm;
    private String kode;
    int tgl_p,bln_p,th_p;
    int utgl_p,ubln_p,uth_p;
    int tgl_k,bln_k,th_k;
    int utgl_k,ubln_k,uth_k;
    int tgl_k1,bln_k1,th_k1;
    int utgl_k1,ubln_k1,uth_k1;
    public pinjam(){
    }
    public String getNPM(){
    return npm;
    }
    public String getKode(){
    return kode;
    }
    public int getTgl_p(){
    return tgl_p;
    }
    public int getBln_p(){
    return bln_p;
    }
    public int getTh_p(){
    return th_p;
    }
    public int getTgl_k(){
    return tgl_k;
    }
    public int getBln_k(){
    return bln_k;
    }
    public int getTh_k(){
    return th_k;
    }
    public int getTgl_k1(){
    return tgl_k1;
    }
    public int getBln_k1(){
    return bln_k1;
    }
    public int getTh_k1(){
    return th_k1;
    }
    public void setNPM(String npm){
    this.npm=npm;
    }
    public void setKode(String kode){
    this.kode=kode;
    }
    public void setTgl_p(int tgl_p){
    this.tgl_p=tgl_p;
    }
    public void setBln_p(int bln_p){
    this.bln_p=bln_p;
    }
    public void setTh_p(int th_p){
    this.th_p=th_p;
    }
    public void setTgl_k(int tgl_k){
    this.tgl_k=tgl_k;
    }
    public void setBln_k(int bln_k){
    this.bln_k=bln_k;
    }
    public void setTh_k(int th_k){
    this.th_k=th_k;
    }
    public void setTgl_k1(int tgl_k1){
    this.tgl_k1=tgl_k1;
    }
    public void setBln_k1(int bln_k1){
    this.bln_k1=bln_k1;
    }
    public void setTh_k1(int th_k1){
    this.th_k1=th_k1;
    }

    //update
    public int ugetTgl_p(){
    return utgl_p;
    }
    public int ugetBln_p(){
    return ubln_p;
    }
    public int ugetTh_p(){
    return uth_p;
    }
    public int ugetTgl_k(){
    return utgl_k;
    }
    public int ugetBln_k(){
    return ubln_k;
    }
    public int ugetTh_k(){
    return uth_k;
    }
    public int ugetTgl_k1(){
    return utgl_k1;
    }
    public int ugetBln_k1(){
    return ubln_k1;
    }
    public int ugetTh_k1(){
    return uth_k1;
    }

    public void usetTgl_p(int utgl_p){
    this.utgl_p=utgl_p;
    }
    public void usetBln_p(int ubln_p){
    this.ubln_p=ubln_p;
    }
    public void usetTh_p(int uth_p){
    this.uth_p=uth_p;
    }
    public void usetTgl_k(int utgl_k){
    this.utgl_k=utgl_k;
    }
    public void usetBln_k(int ubln_k){
    this.ubln_k=ubln_k;
    }
    public void usetTh_k(int uth_k){
    this.uth_k=uth_k;
    }
    public void usetTgl_k1(int utgl_k1){
    this.utgl_k1=utgl_k1;
    }
    public void usetBln_k1(int ubln_k1){
    this.ubln_k1=ubln_k1;
    }
    public void usetTh_k1(int uth_k1){
    this.uth_k1=uth_k1;
    }
    public int ulama(){
        int lama = (((uth_k*365)-(uth_p*365))+((ubln_k*30)-(ubln_p*30))+(utgl_k-utgl_p));
        return lama;
    }
    public int usem(){
    int s=((uth_k*365)+(ubln_k*30)+utgl_k);
    return s;
    }
    public int udenda(){
        koneksi kon = new koneksi();
         ResultSet rs = null;
        int d = 0;
         try{
            rs=kon.getData("select * from sementara where npm='"+String.valueOf(this.npm+"'"));
            while(rs.next()){
             int x=Integer.parseInt(rs.getString("tgl_kembali"))-((uth_k1*365)+(ubln_k1*30)+(utgl_k1));

             d= 1000*x;

            }
            rs.close();
        }catch(Exception e){

        }
        return d*-1;
    }
    //closeupdate

    public int lama(){
        int lama = (((th_k*365)-(th_p*365))+((bln_k*30)-(bln_p*30))+(tgl_k-tgl_p));
        return lama;
    }
    public int sem(){
    int s=((th_k*365)+(bln_k*30)+tgl_k);
    return s;
    }
    public int denda(){
        koneksi kon = new koneksi();
         ResultSet rs = null;
        int d = 0;
         try{
            rs=kon.getData("select * from sementara where npm='"+String.valueOf(this.npm+"'"));
            while(rs.next()){
             int x=Integer.parseInt(rs.getString("tgl_kembali"))-((th_k1*365)+(bln_k1*30)+(tgl_k1));

             d= 1000*x;

            }
            rs.close();
        }catch(Exception e){

        }
        return d*-1;
    }



      public void insertPeminjaman(){
        koneksi kon=new koneksi();
        String s = "insert into t_peminjaman values ('"+this.npm+"','"+this.kode+"','"+String.valueOf(this.tgl_p)+"-"+String.valueOf(this.bln_p)+"-"
                    +String.valueOf(this.th_p)+"','"+String.valueOf(this.tgl_k)+"-"+String.valueOf(this.bln_k)+"-"
                    +String.valueOf(this.th_k)+"',"+lama()+")";
        kon.Query(s);
    }
      public void insertSementara(){
      koneksi kon = new koneksi();
      String s = "insert into sementara values('"+this.npm+"',"+sem()+")";
      kon.Query(s);
      }
      public void insertKembali(){
        koneksi kon = new koneksi();
        String s = "insert into t_kembali values('"+this.npm+"','"+String.valueOf(this.tgl_k1)+"-"+String.valueOf(this.bln_k1)+"-"
                    +String.valueOf(this.th_k1)+"',"+denda()+")";
      kon.Query(s);
      }
      public void deletePeminjaman(){
      koneksi kon = new koneksi();
      String s = "delete from t_peminjaman where npm='"+this.npm+"'";
      kon.Query(s);
      }
      public void deleteSementara(){
      koneksi kon = new koneksi();
      String s = "delete from t_peminjaman where npm='"+this.npm+"'";
      kon.Query(s);
      }
      public void deleteKembali(){
      koneksi kon = new koneksi();
      String s = "delete from t_peminjaman where npm='"+this.npm+"'";
      kon.Query(s);
      }
      public void updatePeminjaman(){
        koneksi kon = new koneksi();
          String s = "update t_peminjaman set kode='"+this.kode+"',tgl_pinjam='"
              +String.valueOf(this.utgl_p)+"-"+String.valueOf(this.ubln_p)+"-"+String.valueOf(this.uth_p)+"',tgl_kembali='"
              +String.valueOf(this.utgl_k)+"-"+String.valueOf(this.ubln_k)+"-"+String.valueOf(this.uth_k)+"',lama="+ulama()+" where npm='"+this.npm+"'";
      kon.Query(s);
      }
      public void updateSementara(){
      koneksi kon = new koneksi();
      String s = "update sementara set tgl_kembali="+usem()+" where npm='"+this.npm+"'";
      kon.Query(s);
      }
      public void updateKembali(){
      koneksi kon = new koneksi();
      String s = "update t_kembali set tgl_pengembalian='"
              +String.valueOf(this.utgl_k1)+"-"+String.valueOf(this.ubln_k1)+"-"+String.valueOf(this.uth_k1)+"denda="+udenda()
              +" where npm='"+this.npm+"'";
      }
}
