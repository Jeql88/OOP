/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version7;

import version6.*;
import version5.*;
import version3.*;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class EmployeeRoster {
    ArrayList<Employee> empList = new ArrayList();
    
    public EmployeeRoster(){
        
    }
    
    
    public boolean addEmployee(Employee e) {
        return this.empList.add(e);
    }

    public Employee removeEmployee(int empID) {
    
        
        for (int i = 0; i < empList.size(); ++i){
            if (empList.get(i).getEmpID() == empID){
                return empList.remove(i);
            }
        }
        return null;
    }

    public int countHE() {
        return (int) empList.stream().filter(emp -> emp instanceof HourlyEmployee).count();
    }

    public int countCE() {
        return (int) empList.stream().filter(emp -> emp instanceof ComissionEmployee && !(emp instanceof BasedPlusComissionEmployee)).count();
    }

    public int countBPCE() {
        return (int) empList.stream().filter(emp -> emp instanceof BasedPlusComissionEmployee).count();
    }

    public int countPWE() {
        return (int) empList.stream().filter(emp -> emp instanceof PieceWorkerEmployee).count();
    }

    public void displayHE() {
        empList.stream().filter(emp -> emp instanceof HourlyEmployee).forEach(emp -> ((HourlyEmployee)emp).display());
    }

    public void displayCE() {
        empList.stream().filter(emp -> emp instanceof ComissionEmployee && !(emp instanceof BasedPlusComissionEmployee)).forEach(emp -> ((ComissionEmployee)emp).display());
    }

    public void displayBPCE() {
        empList.stream().filter(emp -> emp instanceof BasedPlusComissionEmployee).forEach(emp -> ((BasedPlusComissionEmployee)emp).display());
    }

    public void displayPWE() {
        empList.stream().filter(emp -> emp instanceof PieceWorkerEmployee).forEach(emp -> ((PieceWorkerEmployee)emp).display());
    }

    public void displayAllEmployee() {
        System.out.printf("%10s|%20s|%15s|%15s|%10s|%30s\n", "ID", "Name", "DateOfBirth", "DateHired", "Salary", "Type of Employee");
        empList.forEach(emp -> {
            System.out.printf("%10s|", emp.getEmpID());
            System.out.printf("%20s|", emp.getEmpName());
            System.out.printf("%15s|", emp.getBirthDate());
            System.out.printf("%15s|", emp.getStartDate());
            
            System.out.printf("%,10.2f|", emp.computeSalary());
            System.out.printf("%30s|\n", emp.getClass().getSimpleName());
        });
        System.out.println();
    }

}
