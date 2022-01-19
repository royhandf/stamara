/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Koneksi.Koneksi;

public class Awal {

    protected String name;
    protected String name2;
    protected String password;

    public Statement st;
    public Connection connect;
    public ResultSet rs;

    boolean b;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   public boolean login() {
        try {
            Koneksi koneksi = new Koneksi();
            connect = koneksi.koneksi();
            st = connect.createStatement();
            String sql = "select*from login where name="+"'"+ getName() +"'"+" and password="+"'"+ getPassword() +"'";

            rs = st.executeQuery(sql);

            while (rs.next()) {
                if (getName().equals(rs.getString("name"))
                        && getPassword().equals(rs.getString("password"))) {
                    JOptionPane.showMessageDialog(null, "Welcome\t " + rs.getString("name2"));
                    b = true;
                } else {
                    b = false;
                }
            }

        } catch (Exception e) {
             e.printStackTrace();
        return b;

    }
        return b;
      
}
}

