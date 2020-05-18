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
 * 
 * public Club(int ClubID, 
 * int AdvID, 
 * double Balance, 
 * String CNAme, 
 * String Cdescript, 
 * String CPass, 
 * Date CCreationDate)
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

    public void UpdateClub(Club club){
        
        String qry = "UPDATE Club "
                + "SET "
                + "ClubID =          " + club.getClubID() + ", "
                + "CName =          '" + club.getCName() + "', "
                + " CDescript =     '" + club.getCdescript() + "', "
                + "CcreationDate =  '" + club.getCCreationDate() + "', "
                + "AdvID =           " + club.getAdvID() + ", "
                + "Balance =         " + club.getBalance() + ", "
                + "CPass =          '" + club.getCPass() + "' "
                + "WHERE ClubID =    " + club.getClubID();
        
        mydb.UpdateQueryExecution(qry);
    }
    
    public void CreateClub(Club club){
        String qry = "INSERT INTO Club VALUES "
                + "("
                + club.getClubID()          + ", '" 
                + club.getCName()           + "', '" 
                + club.getCdescript()       + "', '" 
                + club.getCCreationDate()   + "', " 
                + club.getAdvID()           + ", "
                + "4000.0, '" 
                + club.getCPass()           + "')";
        
        mydb.UpdateQueryExecution(qry);
    }
    
    public void DeleteClub_ByID(String ClubID){
        
        String qry = "DELETE FROM Club WHERE ClubID = " + ClubID;
        mydb.UpdateQueryExecution(qry);
        
    }
    
    public ResultSet getAllAdvisors(){
        
        String qry = "SELECT CONCAT(AdvID, ', ', AdvFname, ' ', AdvLname) "
                + "as 'Advisor' FROM Advisor";
        
        return mydb.SearchQueryExecution(qry);
    }
    
    
}
