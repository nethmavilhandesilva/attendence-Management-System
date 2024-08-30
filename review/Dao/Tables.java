/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Sadini Kavindya
 */
public class Tables {

    public static void main(String[] args) throws SQLException {
        Connection con = null;
        Statement st = null;
        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();

            if (!tableExists(st, "userdetails")) {
                st.executeUpdate("CREATE TABLE userdetails(id INT AUTO_INCREMENT PRIMARY KEY,name VARCHAR(255)not null,gender VARCHAR(50)not null,email VARCHAR(255)not null,contract VARCHAR(20) not null,address VARCHAR(500) not null,state VARCHAR(100) not null,country VARCHAR(100)not null,uniqueregid VARCHAR(100)not null,imagename VARCHAR(100));");
            }
            if (!tableExists(st, "userattendance")) {
                st.executeUpdate("CREATE TABLE userattendence(userid INT NOT NULL, date DATE NOT NULL,checkin DATETIME,checkout DATETIME,workduration VARCHAR(100));");
            }
            JOptionPane.showMessageDialog(null, "Tables Checked/Created Successfully");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
                if (st != null) {
                    st.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    private static boolean tableExists(Statement st, String tableName) throws Exception {
        ResultSet resultSet = st.executeQuery("SHOW TABLES LIKE'" + tableName + "'");
        return resultSet.next();

    }

}
