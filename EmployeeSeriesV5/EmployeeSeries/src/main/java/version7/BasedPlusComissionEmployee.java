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
public class BasedPlusComissionEmployee extends ComissionEmployee{
    private double baseSalary;
   
    
    public BasedPlusComissionEmployee() {}
    
    public BasedPlusComissionEmployee(Name empName, int empID) {
        super(empName,empID);
    }
    public BasedPlusComissionEmployee(Name empName, MyDate birthDate, MyDate startDate, int empID) {
        super(empName,birthDate,startDate,empID);
    }
    public BasedPlusComissionEmployee(Name empName, MyDate birthDate, MyDate startDate, int empID,  double baseSalary, double totalSales) {
        super(empName,birthDate,startDate,empID,totalSales);
        this.baseSalary = baseSalary;
    }
   
    public BasedPlusComissionEmployee(ComissionEmployee e, double baseSalary){
        this(e.getEmpName(),e.getBirthDate(),e.getStartDate(), e.getEmpID(), e.getTotalSales(),baseSalary);
    }
    
    public BasedPlusComissionEmployee(ComissionEmployee e){
        super(e.getEmpName(),e.getBirthDate(),e.getStartDate(), e.getEmpID(), e.getTotalSales());
    }   

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    @Override
    public double computeSalary(){
        return super.computeSalary() + this.baseSalary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BasedPlusComissionEmployee{");
        sb.append("baseSalary=").append(baseSalary);
        sb.append('}');
        return sb.toString();
    }
    
    @Override
    public void display(){
        this.empName.display();
        System.out.printf("Birth Date: ");
        this.birthDate.display();
        System.out.printf("  Start Date: ");
        this.startDate.display();
        System.out.printf("  Salary:  %f\n",computeSalary());
    }
    
}

