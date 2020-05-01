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
public class Attendance {
    /*
    CREATE TABLE Attendance (
	MNbr INT NOT NULL,
	ClubID INT,
	StudID INT,
	Semester CHAR(3) NOT NULL,
	Year SMALLINT NOT NULL,
	PRIMARY KEY (MNbr, ClubID, StudID),
	CONSTRAINT is_present FOREIGN KEY (StudID) REFERENCES Member(StudID) ON UPDATE CASCADE ON DELETE NO ACTION,
	CONSTRAINT part_of FOREIGN KEY (ClubID) REFERENCES Member(ClubID) ON UPDATE CASCADE ON DELETE NO ACTION,
	CONSTRAINT comes_from FOREIGN KEY(MNbr, ClubID) REFERENCES Meeting(MNbr, ClubID) ON UPDATE CASCADE ON DELETE CASCADE
	); 
    */
    
    private int MNbr, ClubID, Year, StudID;
    private String Semester;

    public Attendance(int MNbr, int ClubID, int Year, int StudID, String Semester) {
        this.MNbr = MNbr;
        this.ClubID = ClubID;
        this.Year = Year;
        this.StudID = StudID;
        this.Semester = Semester;
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

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public int getStudID() {
        return StudID;
    }

    public void setStudID(int StudID) {
        this.StudID = StudID;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }
    
    public boolean equals(int MNbre, int ClubID, int StudID){
        return (this.MNbr == MNbre
                && this.ClubID == ClubID
                && this.StudID == StudID);
    }
}
