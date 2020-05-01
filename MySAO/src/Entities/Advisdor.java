/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author hp
 */
public class Advisdor {
    /*
    CREATE TABLE Advisor (
	AdvID INT, 
	AdvFname VARCHAR (20) NOT NULL UNIQUE, 
	AdvLname VARCHAR (20) NOT NULL UNIQUE, 
	AdvExt SMALLINT NOT NULL, 
	AdvPass VARCHAR (20),
	PRIMARY KEY(AdvID)
	);  
    */
    
    private int AdvID, AdvExt;
    private String AdvFname, AdvLname, AdvPass;

    public Advisdor(int AdvID, int AdvExt, String AdvFname, String AdvLname, String AdvPass) {
        this.AdvID = AdvID;
        this.AdvExt = AdvExt;
        this.AdvFname = AdvFname;
        this.AdvLname = AdvLname;
        this.AdvPass = AdvPass;
    }

    public int getAdvID() {
        return AdvID;
    }

    public void setAdvID(int AdvID) {
        this.AdvID = AdvID;
    }

    public int getAdvExt() {
        return AdvExt;
    }

    public void setAdvExt(int AdvExt) {
        this.AdvExt = AdvExt;
    }

    public String getAdvFname() {
        return AdvFname;
    }

    public void setAdvFname(String AdvFname) {
        this.AdvFname = AdvFname;
    }

    public String getAdvLname() {
        return AdvLname;
    }

    public void setAdvLname(String AdvLname) {
        this.AdvLname = AdvLname;
    }

    public String getAdvPass() {
        return AdvPass;
    }

    public void setAdvPass(String AdvPass) {
        this.AdvPass = AdvPass;
    }
    
    public boolean equals(int AdvID){
        return (this.AdvID == AdvID);
    }
    
}
