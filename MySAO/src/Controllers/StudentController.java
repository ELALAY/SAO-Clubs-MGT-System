/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Entities.Student;
import java.sql.ResultSet;

/**
 *
 * @author hp
 */
public class StudentController {

    Student student;
    DB_Connect mydb;

    public StudentController() {
        mydb = new DB_Connect();
    }

    public ResultSet getMembersOfClub(String ClubID) {
        String qry = "SELECT StudID, SFname, SLname, SPhone, Spass, CName, CDescript, Semester, Year "
                + "FROM Student NATURAL JOIN Member NATURAL JOIN Club WHERE ClubID = " + ClubID;
        
        return mydb.SearchQueryExecution(qry);
    }

    public ResultSet getAllMembersOfClubs() {
        String qry = "SELECT StudID, SFname, SLname, SPhone, Spass, CName, CDescript, Semester, Year "
                + "FROM Student NATURAL JOIN Member NATURAL JOIN Club";

        return mydb.SearchQueryExecution(qry);
    
    }
}
