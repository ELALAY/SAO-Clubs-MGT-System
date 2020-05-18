/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class DB_Connect {

    String Conn_url = "jdbc:mysql://localhost/saodb?serverTimezone=UTC";
    String Uid = "root";
    String PW = "marrakec";

    public DB_Connect() {
    }

    public void UpdateQueryExecution(String qry) {

        ResultSet rs = null;
        try {
            Connection conn = DriverManager.getConnection(Conn_url, Uid, PW);
            //System.out.println("connxion dazet");

            Statement stmt = (Statement) conn.createStatement();

            // Result Set get the result of the SQL query
            stmt.executeUpdate(qry);

            JOptionPane.showMessageDialog(null, " Executed successfully!");
            //return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "A problem has occured in connexion to the Database!");
        }

    }

    public ResultSet SearchQueryExecution(String qry) {

        ResultSet rs = null;
        try {
            Connection conn = DriverManager.getConnection(Conn_url, Uid, PW);
            //System.out.println("connxion dazet");

            Statement stmt = (Statement) conn.createStatement();

            // Result Set get the result of the SQL query
            rs = stmt.executeQuery(qry);
            
            JOptionPane.showMessageDialog(null, " Executed successfully!");
            return rs;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "A problem has occured in connexion to the Database!");
        }
        return rs;
    }

}
