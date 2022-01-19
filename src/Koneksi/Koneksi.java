/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Koneksi {
    private static Connection connect;
    
    public static Connection koneksi() {
        connect = null;
        try {
            //Memanggil Driver JDBC
            Class.forName("com.mysql.jdbc.Driver");
            
            //Membangun koneksi dengan database servernya
            String url = "jdbc:mysql://localhost:3306/dbstamara";
            String user = "root"; //Nama User
            String pwd = ""; //Password
            connect = DriverManager.getConnection(url, user, pwd);

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return connect;
    }
}