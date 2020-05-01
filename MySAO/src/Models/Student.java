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
public class Student {
    /*
    CREATE TABLE Student (
	StudID INT, 
	SFname VARCHAR(20) NOT NULL UNIQUE, 
	SLname VARCHAR(20) NOT NULL UNIQUE, 
	SPhone INT NOT NULL, 
	SPass VARCHAR(20),
	PRIMARY KEY(StudID)
	); 
    */
    private int StudID;
    private String SFname, SLname, SPhone, SPass;

    public Student(int StudID, String SFname, String SLname, String SPhone, String SPass) {
        this.StudID = StudID;
        this.SFname = SFname;
        this.SLname = SLname;
        this.SPhone = SPhone;
        this.SPass = SPass;
    }

    public int getStudID() {
        return StudID;
    }

    public void setStudID(int StudID) {
        this.StudID = StudID;
    }

    public String getSFname() {
        return SFname;
    }

    public void setSFname(String SFname) {
        this.SFname = SFname;
    }

    public String getSLname() {
        return SLname;
    }

    public void setSLname(String SLname) {
        this.SLname = SLname;
    }

    public String getSPhone() {
        return SPhone;
    }

    public void setSPhone(String SPhone) {
        this.SPhone = SPhone;
    }

    public String getSPass() {
        return SPass;
    }

    public void setSPass(String SPass) {
        this.SPass = SPass;
    }
    
    public boolean equals(int StudID){
       return (this.StudID == StudID); 
    }
    
}
