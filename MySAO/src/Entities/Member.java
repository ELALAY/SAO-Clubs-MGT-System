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
public class Member {
    /*
    CREATE TABLE Member (
	StudID INT, 
	ClubId INT, 
	Semester CHAR(3) NOT NULL,
	Year SMALLINT NOT NULL, 
	active TINYINT NOT NULL DEFAULT 0,
	PRIMARY KEY (StudID, ClubId),
	CONSTRAINT belongs_to FOREIGN KEY (StudID) REFERENCES Student (StudID) ON UPDATE CASCADE ON DELETE NO ACTION,
	CONSTRAINT represents FOREIGN KEY (ClubID) REFERENCES Club(ClubID) ON UPDATE CASCADE ON DELETE NO ACTION
	); 
    */
    
    private int StudID, ClubID, Year;
    private String Semester;
    private boolean Acive;

    public Member(int StudID, int ClubID, int Year, String semester, boolean Acive) {
        this.StudID = StudID;
        this.ClubID = ClubID;
        this.Year = Year;
        this.Semester = semester;
        this.Acive = Acive;
    }

    public int getStudID() {
        return StudID;
    }

    public void setStudID(int StudID) {
        this.StudID = StudID;
    }

    public int getClubID() {
        return ClubID;
    }

    public void setClubID(int ClubID) {
        this.ClubID = ClubID;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String semester) {
        this.Semester = semester;
    }

    public boolean isAcive() {
        return Acive;
    }

    public void setAcive(boolean Acive) {
        this.Acive = Acive;
    }
    
    public boolean equals(int StudID, int ClubID, String Semester, int Year) {
        return (this.StudID == StudID
                && this.ClubID == ClubID
                && this.Semester.equals(Semester)
                && this.Year == Year);
    }
    
}
