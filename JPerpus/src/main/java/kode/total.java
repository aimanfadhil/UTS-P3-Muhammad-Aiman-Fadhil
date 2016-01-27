/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kode;
import java.sql.ResultSet;
/**
 *
 * @author User23
 */
public class total {
    buku b = new buku();
    pinjam p = new pinjam();
    private String npm;
    private String kd_buku;

    public String getNPM(){
    return npm;
    }

    public void setNPM(String npm){
    this.npm=npm;
    }
    public String getKd_buku(){
    return kd_buku;
    }

    public void setkd_buku(String kd_buku){
    this.kd_buku=kd_buku;
    }

    public int harga(){

        koneksi kon = new koneksi();
         ResultSet rs = null;


        int a = 0;
         try{
            rs=kon.getData("select * from buku where kd_buku='"+String.valueOf(this.kd_buku)+"'");
            
            while(rs.next()){
 
              a=Integer.parseInt(rs.getString("harga"));
                


            }
            rs.close();
        }catch(Exception e){

        }
        return a;
    }
    public int lama(){
        koneksi kon = new koneksi();
         ResultSet rs = null;
         

        int x = 0;
         try{
            rs=kon.getData("select * from t_peminjaman where npm='"+String.valueOf(this.npm)+"'");

            while(rs.next()){

              x=Integer.parseInt(rs.getString("lama"));



            }
            rs.close();
        }catch(Exception e){

        }
        return x;
    }
    public int biaya(){
        int s=harga()*lama();
        return s;
    }
    public int total(){
        int t=0;
        koneksi kon = new koneksi();
        ResultSet rs = null;
        try{
            rs=kon.getData("select * from t_kembali where npm='"+String.valueOf(this.npm)+"'");
            while(rs.next()){
            t=Integer.parseInt(rs.getString("denda"))+biaya();
            }

        }
        catch(Exception e){
        }
        return t;
    }
    public void insertTotal(){
        koneksi kon = new koneksi();
        String s = "insert into t_total values('"+this.npm+"','"+this.kd_buku+"',"+biaya()+","+total()+")";
        kon.Query(s);
    }
    public void deleteTotal(){
        koneksi kon = new koneksi();
        String s = "delete from t_total where npm='"+this.npm+"'";
        kon.Query(s);
    }
}
