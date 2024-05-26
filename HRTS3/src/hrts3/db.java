package hrts3;


import java.sql.*;
import javax.swing.*;



public class db {
    Connection con = null;
    public static Connection java_db() {
        try {
            Class.forName("org.sqlite.JDBC");
            String sql = "jdbc:sqlite:db.sqlite";
            Connection con = DriverManager.getConnection(sql);
            return con;
        } catch (Exception e){
            return null;
        }
    }
}
