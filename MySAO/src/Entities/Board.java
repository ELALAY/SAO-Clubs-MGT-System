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
public class Board {

    /*
    CREATE TABLE Board (
	StudID INT,
	ClubID INT, 
	Semester CHAR(3), 
	Year INT NOT NULL,
	ranking INT NOT NULL, 
	PRIMARY KEY (StudID , ClubID, Semester, Year),
	CONSTRAINT is_in FOREIGN KEY (StudID) REFERENCES Student(StudID) ON UPDATE CASCADE ON DELETE NO ACTION,
	CONSTRAINT is_running FOREIGN KEY (ClubID) REFERENCES Club(ClubID) ON UPDATE CASCADE ON DELETE NO ACTION
	);
     */
    private int StudID, ClubID, year, ranking;
    private String Semester;

    public Board(int StudID, int ClubID, int year, int ranking, String Semester) {
        this.StudID = StudID;
        this.ClubID = ClubID;
        this.year = year;
        this.ranking = ranking;
        this.Semester = Semester;
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
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public boolean equals(int ClubID, int StudID, String Semester, int Year) {
        return this.ClubID == ClubID
                && this.StudID == StudID
                && this.Semester.equals(Semester)
                && this.year == year;
    }
    
}
