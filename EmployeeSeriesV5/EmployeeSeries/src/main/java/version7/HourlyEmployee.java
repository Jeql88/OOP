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
public class HourlyEmployee extends Employee{
    private float totalHoursWorked;
    private double ratePerHour;
    
    public HourlyEmployee() {}
    
    public HourlyEmployee(Name empName, int empID) {
        super(empName,empID);
    }
    public HourlyEmployee(Name empName, MyDate birthDate, MyDate startDate, int empID) {
        super(empName,birthDate,startDate,empID);
    }
    public HourlyEmployee(Name empName, MyDate birthDate, MyDate startDate, int empID, float totalHoursWorked, double ratePerHour) {
        this(empName,birthDate,startDate,empID);
        this.totalHoursWorked =  totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    

    public double computeSalary(){
        if (this.totalHoursWorked <= 40){
            return this.totalHoursWorked * this.ratePerHour;
        } else{
            return 40 * this.ratePerHour + ((this.totalHoursWorked - 40) * this.ratePerHour * 1.5);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HourlyEmployee{");
        sb.append("totalHoursWorked=").append(totalHoursWorked);
        sb.append(", ratePerHour=").append(ratePerHour);
        sb.append('}');
        return sb.toString();
    }
    
    @Override
    public void display(){
        super.display();
        System.out.printf("  Salary:  %f\n",computeSalary());
    }
    
    
    
    
}
