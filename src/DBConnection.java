
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
public class DBConnection {
    
    static final String jdbc = "jdbc:mysql://localhost:3306/banking_system";
    static final String dbuser = "root";
    static final String dbpass = "04320432";
     
     public static Connection connectDB(){
        try {
            Connection conn = DriverManager.getConnection(jdbc, dbuser, dbpass);
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
     
     }
    
}
