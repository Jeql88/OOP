/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version2;

/**
 *
 * @author User
 */
public class HourlyEmployee extends Employee{
    private float totalHoursWorked;
    private double ratePerHour;
    
    public HourlyEmployee() {}
    
    public HourlyEmployee(Employee e, float totalHoursWorked, double ratePerHour){
        this(totalHoursWorked,ratePerHour,e.getEmpName(),e.getEmpID());
    }
    public HourlyEmployee(Employee e){
        super(e.getEmpName(),e.getEmpID());   
    }
    
    public HourlyEmployee(String empName, int empID) {
        super(empName, empID);
    }
    
    public HourlyEmployee(float totalHoursWorked, double ratePerHour, String empName, int empID) {
        super(empName,empID);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        if (totalHoursWorked > 0){
            this.totalHoursWorked = totalHoursWorked;
        }  
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        if (ratePerHour > 0){
           this.ratePerHour = ratePerHour; 
        }
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
        sb.append(super.toString());
        sb.append("totalHoursWorked=").append(totalHoursWorked);
        sb.append(", ratePerHour=").append(ratePerHour);
        sb.append('}');
        return sb.toString();
    }
    @Override
    public void display(){
        System.out.println(this);
        System.out.println(this.computeSalary());
    }
}
