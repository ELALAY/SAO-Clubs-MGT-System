/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Entities.Event;
import java.sql.ResultSet;

/**
 *
 * @author hp
 * 
 *  
 */
public class EventController {
    Event event;
    DB_Connect mydb;
    
    public EventController(){
        mydb = new DB_Connect();
    }
    
    public ResultSet getAllLocations(){        
        String qry = "SELECT CONCAT(LocID,', ', LocBldg, ' ', LocRoom) "
                + "as 'Location' FROM Location";
        
        return mydb.SearchQueryExecution(qry);
    }
    
    public ResultSet getAllClubs(){        
        String qry = "SELECT CONCAT(ClubID, ', ', CName) "
                + "as 'Club' FROM Club";
        
        return mydb.SearchQueryExecution(qry);
        
    }
    
    public void CreateEvent(Event evt){
        
        String qry = "INSERT INTO Event VALUES "
                + "("
                + evt.getEvtID()            + ", '" 
                + evt.getEvtName()          + "', '" 
                + evt.getEvtDescript()      + "', "
                + evt.getEvtBudget()        + ", '" 
                + evt.getEvtLocation()      + "', '" 
                + evt.getEvtStart()         + "', '" 
                + evt.getEvtEnd()           + "', "
                + evt.getClubID()           + ", " 
                + evt.getAdvApproval()      + ", " 
                + evt.getSAOApproval()
                + ")";
        mydb.UpdateQueryExecution(qry);
    }
    
}
