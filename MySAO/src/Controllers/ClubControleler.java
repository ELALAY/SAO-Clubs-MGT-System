/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Entities.Club;
import java.sql.*;

/**
 *
 * @author hp
 */
public class ClubControleler {

    Club club;
    DB_Connect mydb;

    public ClubControleler() {
        mydb = new DB_Connect();
    }

    public ResultSet SearchClub_ByClubID(String ClubID) {
        ResultSet rs;

        String qry = "SELECT * FROM Club WHERE ClubID = " + ClubID;

        rs = mydb.SearchQueryExecution(qry);

        return rs;
    }

    public ResultSet GetAllClubs() {
        ResultSet rs;

        String qry = "SELECT * FROM Club";

        rs = mydb.SearchQueryExecution(qry);

        return rs;
    }

}
