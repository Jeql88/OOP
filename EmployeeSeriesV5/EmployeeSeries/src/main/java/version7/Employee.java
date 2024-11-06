/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version7;

import version6.*;
import version5.*;
import version3.*;

/**
 *
 * @author User
 */
public abstract class Employee implements EmployeeInterface {
    public Name empName;
    public int empID;
    public MyDate birthDate;
    public MyDate startDate;

    public Employee() {
    }
    
    public Employee(Name empName, int empID) {
        this.empName = new Name(empName.fname,empName.lname,empName.mname);
        this.empID = empID;
    }

    public Employee(Name empName, MyDate birthDate, MyDate startDate, int empID) {
        this(empName,empID);
        this.birthDate = new MyDate(birthDate.getYear(),birthDate.getMonth(),birthDate.getDay());
        this.startDate = new MyDate(startDate.getYear(),startDate.getMonth(),startDate.getDay());
    }

    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(MyDate birthDate) {
        this.birthDate = birthDate;
    }

    public MyDate getStartDate() {
        return startDate;
    }

    public void setStartDate(MyDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("empName: ").append(empName);
        sb.append("\nempID=").append(empID);
        sb.append("\nbirthDate=").append(birthDate);
        sb.append("\nstartDate=").append(startDate);
        
        return sb.toString();
    }
    
    public void display(){
        this.empName.display();
        System.out.printf("Birth Date: ");
        this.birthDate.display();
        System.out.printf("  Start Date: ");
        this.startDate.display();
        
    }
    
 
    
    
    
            
}
