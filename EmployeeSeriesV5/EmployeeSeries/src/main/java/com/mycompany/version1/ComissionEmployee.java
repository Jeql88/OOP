/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.version1;

/**
 *
 * @author Josh
 */
public class ComissionEmployee {
    private double totalSales;
    private String empName;
    private int empID;

    public ComissionEmployee(double totalSales, String empName, int empID) {
        this.totalSales = totalSales;
        this.empName = empName;
        this.empID = empID;
    }
    public ComissionEmployee() {
    }
    
    public ComissionEmployee(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
    }
       

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    @Override
    public String toString() {
        return "ComissionEmployee{" + "totalSales=" + totalSales + ", empName=" + empName + ", empID=" + empID + '}';
    }
    public void display(){
        System.out.println(this.toString());
    }
    public double computeSalary(){
        if (this.totalSales < 10000){
            return this.totalSales * 0.05;
        } else if (this.totalSales < 100000){
            return this.totalSales * 0.1;
        } else if (this.totalSales < 1000000){
            return this.totalSales * 0.2;
        } else{
            return this.totalSales * 0.3;
        }
    }
    
}
