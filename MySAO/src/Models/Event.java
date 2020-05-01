/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

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
    
    private int EvtID, ClubID;
    private String EvtName, EvtDescript, EvtLocation;
    private double EvtBudget;
    private Date EvtStart, EvtEnd;
    private boolean AdvApproval, SAOApproval;

    public Event(int EvtID, int ClubID, String EvtName, String EvtDescript, String EvtLocation, double EvtBudget, Date EvtStart, Date EvtEnd, boolean AdvApproval, boolean SAOApproval) {
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

    public int getEvtID() {
        return EvtID;
    }

    public void setEvtID(int EvtID) {
        this.EvtID = EvtID;
    }

    public int getClubID() {
        return ClubID;
    }

    public void setClubID(int ClubID) {
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

    public double getEvtBudget() {
        return EvtBudget;
    }

    public void setEvtBudget(double EvtBudget) {
        this.EvtBudget = EvtBudget;
    }

    public Date getEvtStart() {
        return EvtStart;
    }

    public void setEvtStart(Date EvtStart) {
        this.EvtStart = EvtStart;
    }

    public Date getEvtEnd() {
        return EvtEnd;
    }

    public void setEvtEnd(Date EvtEnd) {
        this.EvtEnd = EvtEnd;
    }

    public boolean isAdvApproval() {
        return AdvApproval;
    }

    public void setAdvApproval(boolean AdvApproval) {
        this.AdvApproval = AdvApproval;
    }

    public boolean isSAOApproval() {
        return SAOApproval;
    }

    public void setSAOApproval(boolean SAOApproval) {
        this.SAOApproval = SAOApproval;
    }
    
    public boolean equals(int EvtID){
        return (this.EvtID == EvtID);
    }
}
