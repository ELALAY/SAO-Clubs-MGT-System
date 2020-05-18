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
public class Club {

    /*
    CREATE TABLE Club (
	ClubID INT,
	CName VARCHAR (30) NOT NULL, 
	CDescript VARCHAR (100) NOT NULL, 
	CcreationDate DATE NOT NULL, 
	AdvID INT,
	Balance DOUBLE NOT NULL DEFAULT 4000,
	CPass VARCHAR (20),
	PRIMARY KEY(ClubID),
	CONSTRAINT manages FOREIGN KEY(AdvID) REFERENCES Advisor(AdvID) ON UPDATE CASCADE ON DELETE SET NULL
	); 
     */
    private String ClubID, AdvID, Balance, CName, CDescc, CPass, CCreationDate;

    public Club(String ClubID, String CName, String CDescc, String CCreationDate,
            String AdvID, String Balance, String CPass){
        this.ClubID = ClubID;
        this.AdvID = AdvID;
        this.Balance = Balance;
        this.CName = CName;
        this.CDescc = CDescc;
        this.CPass = CPass;
        this.CCreationDate = CCreationDate;
    }

    public String getClubID() {
        return ClubID;
    }

    public void setClubID(String ClubID) {
        this.ClubID = ClubID;
    }

    public String getAdvID() {
        return AdvID;
    }

    public void setAdvID(String AdvID) {
        this.AdvID = AdvID;
    }

    public String getBalance() {
        return Balance;
    }

    public void setBalance(String Balance) {
        this.Balance = Balance;
    }

    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

    public String getCdescript() {
        return CDescc;
    }

    public void setCdescript(String Cdescript) {
        this.CDescc = Cdescript;
    }

    public String getCPass() {
        return CPass;
    }

    public void setCPass(String CPass) {
        this.CPass = CPass;
    }

    public String getCCreationDate() {
        return CCreationDate;
    }

    public void setCCreationDate(String CCreationDate) {
        this.CCreationDate = CCreationDate;
    }

    
    
}
