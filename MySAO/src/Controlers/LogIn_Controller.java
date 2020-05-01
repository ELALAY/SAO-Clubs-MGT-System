/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlers;

import Models.OfficerSAO;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class LogIn_Controller {

    OfficerSAO officerSAO;

    public boolean Login(String SAOID, String SAOPass) {

        String Conn_url = "jdbc:mysql://localhost/saodb?serverTimezone=UTC";
        String Uid = "root";
        String PW = "marrakec";

        try {

            Connection conn = DriverManager.getConnection(Conn_url, Uid, PW);
            //System.out.println("connxion dazet");

            Statement stmt = (Statement) conn.createStatement();
            String qry = "SELECT * FROM OfficerSAO"
                    + "WHERE SAOID = " + SAOID
                    + "AND SAOPass = " + SAOPass;

            // Result Set get the result of the SQL query
            ResultSet rs = stmt.executeQuery(qry);
            
            String temp_pass = "";
            
            while (rs.next()) {
                return true;
                //System.out.println(temp_pass);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LogIn_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

}
