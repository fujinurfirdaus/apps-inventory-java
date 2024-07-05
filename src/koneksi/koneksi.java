
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Fuji Nur Firdaus
 */
public class koneksi {
    private static Connection con;
    public static Connection configDB(){
        try {
            String url = "jdbc:mysql://localhost:3306/gudangSehat";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection(url, user, pass);
            
        } catch (Exception e) {
            System.err.println("KOneksi gagal __");
        }
        
        return con;
    }
}
