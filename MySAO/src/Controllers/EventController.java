/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Entities.Event;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 *
 *
 */
public class EventController {

    Event event;
    DB_Connect mydb;

    public EventController() {
        mydb = new DB_Connect();
    }

    public ResultSet getAllLocations() {
        String qry = "SELECT CONCAT(LocID,', ', LocBldg, ' ', LocRoom) "
                + "as 'Location' FROM Location";

        return mydb.SearchQueryExecution(qry);
    }

    public ResultSet getAllClubs() {
        String qry = "SELECT CONCAT(ClubID, ', ', CName) "
                + "as 'Club' FROM Club";

        return mydb.SearchQueryExecution(qry);

    }

    public void CreateEvent(Event evt) {

        String qry = "INSERT INTO Event VALUES "
                + "("
                + evt.getEvtID() + ", '"
                + evt.getEvtName() + "', '"
                + evt.getEvtDescript() + "', "
                + evt.getEvtBudget() + ", '"
                + evt.getEvtLocation() + "', '"
                + evt.getEvtStart() + "', '"
                + evt.getEvtEnd() + "', "
                + evt.getClubID() + ", "
                + evt.getAdvApproval() + ", "
                + evt.getSAOApproval()
                + ")";
        mydb.UpdateQueryExecution(qry);
    }

    public ResultSet GetAllEvents() {
        String qry = "SELECT * FROM Event";

        return mydb.SearchQueryExecution(qry);
    }

    public ResultSet SearchEvent_ByID(String EvtCode) {
        String qry = "SELECT * FROM Event WHERE EvtID = " + EvtCode;

        return mydb.SearchQueryExecution(qry);
    }

    public ResultSet getUnapprovedEvents() {
        String qry = "SELECT * FROM Event "
                + "WHERE AdvApproval = 0 OR SAOApproval = 0";

        return mydb.SearchQueryExecution(qry);
    }

    public ResultSet SearchEventsInDateRange(String startDate, String endDate) {
        String qry = "SELECT * FROM Event ";

        if (!startDate.isEmpty() && endDate.isEmpty()) {
            qry += "WHERE EvtStart > '" + startDate + "'";
        } else if (!startDate.isEmpty() && !endDate.isEmpty()) {
            qry += "WHERE EvtStart BETWEEN '" + startDate + "' AND '" + endDate + "'";
        } else if (startDate.isEmpty() && endDate.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Empty Date Fields!");
        }
        return null;
    }

    public void DeleteEvent(String EvtID) {
        String qry = "DELETE FROM Event WHERE EvtID = " + EvtID;
        mydb.UpdateQueryExecution(qry);
    }
    
    public void UpdateEvent(Event event){
        String qry = "UPDATE Event "
                + "SET "
                + "EvtID        = " + event.getEvtID() + ", "
                + "EvtName      = '" + event.getEvtName() + "', "
                + "EvtDescript  = '" + event.getEvtDescript() + "', "
                + "EvtBudget    = " + event.getEvtBudget() + ", "
                + "EvtLocation  = '" + event.getEvtLocation() + "', "
                + "EvtStart     = '" + event.getEvtStart() + "', "
                + "EvtEnd       = '" + event.getEvtEnd() + "', "
                + "ClubID       = " + event.getClubID() + ", "
                + "AdvApproval  = " + event.getAdvApproval() + ", "
                + "SAOApproval  = " + event.getSAOApproval()
                + " WHERE EvtID = " + event.getEvtID();
        
        mydb.UpdateQueryExecution(qry);
    }
}
