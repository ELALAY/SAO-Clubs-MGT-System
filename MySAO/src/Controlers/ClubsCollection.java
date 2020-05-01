/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlers;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class ClubsCollection {

    String Conn_url = "jdbc:mysql://localhost/saodb?serverTimezone=UTC";
    String Uid = "root";
    String PW = "marrakec";

    public void DisplayClubInformation(int ClubID) {
           
    }

    public ResultSet DisplayAllClubs(String ClubID) {
        try {
            Connection conn = DriverManager.getConnection(Conn_url, Uid, PW);

            Statement stmt = conn.createStatement();
            String qry = "SELECT ClubID, CName, CDescript, Balance FROM Club";

            //String VendCode = VendCode_TextField.getText();
            if (!ClubID.equals("")) {
                qry += " WHERE ClubID = " + ClubID;
            }

            // Result Set get the result of the SQL query
            ResultSet rs = stmt.executeQuery(qry);

            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(ClubsCollection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
