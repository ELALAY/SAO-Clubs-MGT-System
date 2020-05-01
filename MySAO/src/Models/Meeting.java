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
public class Meeting {
    /*
    CREATE TABLE Meeting (
	MNbr INT NOT NULL, 
	ClubID INT NOT NULL, 
	MDateTime DATETIME NOT NULL, 
	MLocation VARCHAR(10), 
	MMinutes VARCHAR(200), 
	PRIMARY KEY (MNbr, ClubID),77
	CONSTRAINT will_meet_in FOREIGN KEY (MLocation) REFERENCES Location(locID) ON UPDATE CASCADE ON DELETE SET NULL
	); 
    */
    
    private int MNbr, ClubID;
    private String MLocation, MMinutes;
    private Date MDateTime;

    public Meeting(int MNbr, int ClubID, String MLocation, String MMinutes, Date MDateTime) {
        this.MNbr = MNbr;
        this.ClubID = ClubID;
        this.MLocation = MLocation;
        this.MMinutes = MMinutes;
        this.MDateTime = MDateTime;
    }

    public int getMNbr() {
        return MNbr;
    }

    public void setMNbr(int MNbr) {
        this.MNbr = MNbr;
    }

    public int getClubID() {
        return ClubID;
    }

    public void setClubID(int ClubID) {
        this.ClubID = ClubID;
    }

    public String getMLocation() {
        return MLocation;
    }

    public void setMLocation(String MLocation) {
        this.MLocation = MLocation;
    }

    public String getMMinutes() {
        return MMinutes;
    }

    public void setMMinutes(String MMinutes) {
        this.MMinutes = MMinutes;
    }

    public Date getMDateTime() {
        return MDateTime;
    }

    public void setMDateTime(Date MDateTime) {
        this.MDateTime = MDateTime;
    }
    
    public boolean equals(int MNbr){
        return (this.MNbr == MNbr);
    }
}
