/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;

/**
 *
 * @author User
 */
public class Name {
    public String fname;
    public String lname;
    public String mname;
    
    public Name() {}
    
    public Name(String fname, String lname){
        this.fname = fname;
        this.lname = lname;
        this.mname = "";
    }
    
    public Name(String fname, String lname, String MI) {
        this.fname = fname;
        this.lname = lname;
        this.mname = MI;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getMI() {
        return mname;
    }

    public void setMI(String MI) {
        this.mname = MI;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(this.lname).append(", ").append(this.fname);
        if (!this.mname.equals("")) {
            result.append(" ").append(this.mname.charAt(0)).append(".");
        }
        
        return result.toString();
}

    
    public void display(){
        System.out.printf("%s, %s ", this.lname, this.fname);
        if (!this.mname.equals("")){
            System.out.printf(" %c.",this.mname.charAt(0));
        }
        System.out.printf(" - ");
    }

    
    
    
    
    
    
    
    
    
}
