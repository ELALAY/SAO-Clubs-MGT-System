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

    private int ClubID, AdvID;
    private double Balance;
    private String CNAme, Cdescript, CPass;
    private Date CCreationDate;

    public Club(int ClubID, int AdvID, double Balance, String CNAme, String Cdescript, String CPass, Date CCreationDate) {
        this.ClubID = ClubID;
        this.AdvID = AdvID;
        this.Balance = Balance;
        this.CNAme = CNAme;
        this.Cdescript = Cdescript;
        this.CPass = CPass;
        this.CCreationDate = CCreationDate;
    }

    public int getClubID() {
        return ClubID;
    }

    public void setClubID(int ClubID) {
        this.ClubID = ClubID;
    }

    public int getAdvID() {
        return AdvID;
    }

    public void setAdvID(int AdvID) {
        this.AdvID = AdvID;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public String getCNAme() {
        return CNAme;
    }

    public void setCNAme(String CNAme) {
        this.CNAme = CNAme;
    }

    public String getCdescript() {
        return Cdescript;
    }

    public void setCdescript(String Cdescript) {
        this.Cdescript = Cdescript;
    }

    public String getCPass() {
        return CPass;
    }

    public void setCPass(String CPass) {
        this.CPass = CPass;
    }

    public Date getCCreationDate() {
        return CCreationDate;
    }

    public void setCCreationDate(Date CCreationDate) {
        this.CCreationDate = CCreationDate;
    }
    
    public boolean equals(int ClubID){
        return (this.ClubID == ClubID);
    }
}
