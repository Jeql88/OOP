/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.version1;

/**
 *
 * @author Josh
 */
public class EmployeeSeries {

    public static void main(String[] args) {
        System.out.println("\nHourly Employee");
        HourlyEmployee jans = new HourlyEmployee(42,100,"jans",101);
        System.out.println(jans.computeSalary());
        jans.display();
        
        HourlyEmployee jans1 = new HourlyEmployee();
        jans1.setTotalHoursWorked(42);
        jans1.setRatePerHour(100);
        jans1.setEmpName("jans1");
        jans1.setEmpID(101);
        System.out.println(jans1.computeSalary());
        jans1.display();
            
        HourlyEmployee jans2 = new HourlyEmployee("jans2",101);
        jans2.setTotalHoursWorked(42);
        jans2.setRatePerHour(100); 
        System.out.println(jans2.computeSalary());
        jans2.display();
        
        
        System.out.println("\nPiece Worker Employee");
        PieceWorkerEmployee josh = new PieceWorkerEmployee(500,10,"josh",102);
        System.out.println(josh.computeSalary());
        josh.display();
        
        PieceWorkerEmployee josh1 = new PieceWorkerEmployee();
        josh1.setTotalPiecesFinished(500);
        josh1.setRatePerPiece(10);
        josh1.setEmpName("josh1");
        josh1.setEmpID(102);
        System.out.println(josh1.computeSalary());
        josh1.display();
        
        PieceWorkerEmployee josh2 = new PieceWorkerEmployee("josh2",102);
        josh2.setTotalPiecesFinished(500);
        josh2.setRatePerPiece(10);
        System.out.println(josh2.computeSalary());
        josh2.display();
        
        
        System.out.println("\nComission Employee");
        
        ComissionEmployee jio = new ComissionEmployee(15000,"jio",103);
        System.out.println(jio.computeSalary());
        jio.display();
        
        ComissionEmployee jio1 = new ComissionEmployee();
        jio1.setEmpName("jio1");
        jio1.setEmpID(103);
        jio1.setTotalSales(15000);  
        System.out.println(jio1.computeSalary());
        jio1.display();
        
        ComissionEmployee jio2 = new ComissionEmployee("jio2",103);
        jio2.setTotalSales(15000);  
        System.out.println(jio2.computeSalary());
        jio2.display();
        
        System.out.println("\nBased Plus Comission Employee");
        
        BasedPlusCommissionEmployee dusky = new BasedPlusCommissionEmployee(15000,14000 ,"dusky",104);
        System.out.println(dusky.computeSalary());
        dusky.display();
        
        BasedPlusCommissionEmployee dusky1 = new BasedPlusCommissionEmployee();
        dusky1.setBaseSalary(14000);
        dusky1.setTotalSales(15000);
        dusky1.setEmpName("dusky1");
        dusky1.setEmpID(104);
        System.out.println(dusky1.computeSalary());
        dusky1.display();
        
        BasedPlusCommissionEmployee dusky2 = new BasedPlusCommissionEmployee("dusky2",104);
        dusky2.setBaseSalary(14000);
        dusky2.setTotalSales(15000);
        System.out.println(dusky2.computeSalary());
        dusky2.display();
    }
}
