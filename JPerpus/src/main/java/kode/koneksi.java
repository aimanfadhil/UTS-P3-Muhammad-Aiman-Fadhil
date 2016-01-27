/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author User23
 */
public class koneksi {

    private String user = "root";
    private String pass = "";
    private Statement stmt = null;
    private Connection con = null;
    private ResultSet rs = null;

    public koneksi() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage(), "JDBC Driver Error", JOptionPane.WARNING_MESSAGE);
        }

        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/db_lat", user, pass);
            stmt = (Statement) con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage(), "Connection Error ", JOptionPane.WARNING_MESSAGE);
        }
    }

    public ResultSet getData(String SQLString){
        try {
            rs=stmt.executeQuery(SQLString);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,""+e.getMessage(), "Communication error ", JOptionPane.WARNING_MESSAGE);
        }
        return rs;
    }

    public void Query(String SQLString){
        try {
            stmt.executeUpdate(SQLString);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,""+e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
    }
}
