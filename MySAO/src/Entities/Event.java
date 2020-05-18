/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Date;

/**
 *
 * @author hp
 */
public class Event {
    /*
    CREATE TABLE Event (
	EvtID INT, 
	EvtName VARCHAR (40) NOT NULL, 
	EvtDescript VARCHAR (200) NOT NULL, 
	EvtBudget DOUBLE NOT NULL DEFAULT 0.00, 
	EvtLocation VARCHAR(10), 
	EvtStart DATETIME NOT NULL, 
	EvtEnd DATETIME NOT NULL, 
	ClubID INT,
	AdvApproval TINYINT DEFAULT 0,
	SAOApproval TINYINT DEFAULT 0,
	PRIMARY KEY(EvtID),
	CONSTRAINT takes_place_in FOREIGN KEY (EvtLocation) REFERENCES Location (LocID) ON UPDATE CASCADE ON DELETE SET NULL,
	CONSTRAINT created_by FOREIGN KEY (ClubID) REFERENCES Club (ClubID) ON UPDATE CASCADE ON DELETE NO ACTION
	); 
    */
    
    private String EvtID, ClubID, EvtName, EvtDescript, EvtLocation;
    private String EvtBudget, Date, EvtStart, EvtEnd, AdvApproval, SAOApproval;

    public Event(String EvtID, String EvtName, String EvtDescript, String EvtBudget,
            String EvtLocation,  String EvtStart, String EvtEnd, String ClubID,
            String AdvApproval, String SAOApproval) {
        this.EvtID = EvtID;
        this.ClubID = ClubID;
        this.EvtName = EvtName;
        this.EvtDescript = EvtDescript;
        this.EvtLocation = EvtLocation;
        this.EvtBudget = EvtBudget;
        this.EvtStart = EvtStart;
        this.EvtEnd = EvtEnd;
        this.AdvApproval = AdvApproval;
        this.SAOApproval = SAOApproval;
    }

    public String getEvtID() {
        return EvtID;
    }

    public void setEvtID(String EvtID) {
        this.EvtID = EvtID;
    }

    public String getClubID() {
        return ClubID;
    }

    public void setClubID(String ClubID) {
        this.ClubID = ClubID;
    }

    public String getEvtName() {
        return EvtName;
    }

    public void setEvtName(String EvtName) {
        this.EvtName = EvtName;
    }

    public String getEvtDescript() {
        return EvtDescript;
    }

    public void setEvtDescript(String EvtDescript) {
        this.EvtDescript = EvtDescript;
    }

    public String getEvtLocation() {
        return EvtLocation;
    }

    public void setEvtLocation(String EvtLocation) {
        this.EvtLocation = EvtLocation;
    }

    public String getEvtBudget() {
        return EvtBudget;
    }

    public void setEvtBudget(String EvtBudget) {
        this.EvtBudget = EvtBudget;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getEvtStart() {
        return EvtStart;
    }

    public void setEvtStart(String EvtStart) {
        this.EvtStart = EvtStart;
    }

    public String getEvtEnd() {
        return EvtEnd;
    }

    public void setEvtEnd(String EvtEnd) {
        this.EvtEnd = EvtEnd;
    }

    public String getAdvApproval() {
        return AdvApproval;
    }

    public void setAdvApproval(String AdvApproval) {
        this.AdvApproval = AdvApproval;
    }

    public String getSAOApproval() {
        return SAOApproval;
    }

    public void setSAOApproval(String SAOApproval) {
        this.SAOApproval = SAOApproval;
    }

}
