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
public class OfficerSAO {
    /*
    CREATE TABLE OfficerSAO ( 
	SAOID INT, 
	SAOFname VARCHAR (20) NOT NULL, 
	SAOLname VARCHAR (20) NOT NULL, 
	SAOExt SMALLINT NOT NULL, 
	SAOPass VARCHAR (20),
	PRIMARY KEY(SAOID)
	);
    */
    
    private int SAOID, SAOExt;
    private String SAOFname, SAOLname, SAOPass;

    public OfficerSAO(int SAOID, int SAOExt, String SAOFname, String SAOLname, String SAOPass) {
        this.SAOID = SAOID;
        this.SAOExt = SAOExt;
        this.SAOFname = SAOFname;
        this.SAOLname = SAOLname;
        this.SAOPass = SAOPass;
    }

    public int getSAOID() {
        return SAOID;
    }

    public void setSAOID(int SAOID) {
        this.SAOID = SAOID;
    }

    public int getSAOExt() {
        return SAOExt;
    }

    public void setSAOExt(int SAOExt) {
        this.SAOExt = SAOExt;
    }

    public String getSAOFname() {
        return SAOFname;
    }

    public void setSAOFname(String SAOFname) {
        this.SAOFname = SAOFname;
    }

    public String getSAOLname() {
        return SAOLname;
    }

    public void setSAOLname(String SAOLname) {
        this.SAOLname = SAOLname;
    }

    public String getSAOPass() {
        return SAOPass;
    }

    public void setSAOPass(String SAOPass) {
        this.SAOPass = SAOPass;
    }
    
    public boolean equals(int SAOID){
        return (this.SAOID == SAOID);
    }
}
