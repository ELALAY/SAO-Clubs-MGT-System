/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author hp
 */
public class Location {
    /*
    CREATE TABLE Location( 
	LocID VARCHAR (10), 
	LocName VARCHAR (20), 
	LocRoom SMALLINT, 
	LocBldg VARCHAR (5),
	PRIMARY KEY(LocID)
); 
    */
    
    private int LocRoom;
    private String LocID, LocName, LocBldg;

    public Location(int LocID, int LocRoom, String LocName, String LocBldg) {
        this.LocID.equals(LocID);
        this.LocRoom = LocRoom;
        this.LocName = LocName;
        this.LocBldg = LocBldg;
    }

    public String getLocID() {
        return LocID;
    }

    public void setLocID(String LocID) {
        this.LocID = LocID;
    }

    public int getLocRoom() {
        return LocRoom;
    }

    public void setLocRoom(int LocRoom) {
        this.LocRoom = LocRoom;
    }

    public String getLocName() {
        return LocName;
    }

    public void setLocName(String LocName) {
        this.LocName = LocName;
    }

    public String getLocBldg() {
        return LocBldg;
    }

    public void setLocBldg(String LocBldg) {
        this.LocBldg = LocBldg;
    }
    
    public boolean equals(String LocID){
        return (this.LocID.equals(LocID));
    }
}
