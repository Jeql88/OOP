/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package version2;

//import com.mycompany.version1.*;

/**
 *
 * @author Josh
 */
public class v2main {

    public static void main(String[] args) {
        System.out.println("\nHourly Employee");
        HourlyEmployee jans = new HourlyEmployee(42,100,"jans",101);
        jans.display();
        
        HourlyEmployee jans1 = new HourlyEmployee();
        jans1.setTotalHoursWorked(42);
        jans1.setRatePerHour(100);
        jans1.setEmpName("jans1");
        jans1.setEmpID(101);
        jans1.display();
            
        HourlyEmployee jans2 = new HourlyEmployee("jans2",101);
        jans2.setTotalHoursWorked(42);
        jans2.setRatePerHour(100); 
        jans2.display();
        
        Employee temp_jans = new Employee("jan3",101);
        HourlyEmployee jans3 = new HourlyEmployee(temp_jans);
        jans3.setTotalHoursWorked(42);
        jans3.setRatePerHour(100);
        jans3.display();
        
        Employee temp_jans2 = new Employee("jan4",101);
        HourlyEmployee jans4 = new HourlyEmployee(temp_jans2,42,100);
        jans4.display();
        
        
        System.out.println("\nPiece Worker Employee");
        PieceWorkerEmployee josh = new PieceWorkerEmployee(500,10,"josh",102);
        josh.display();
        
        PieceWorkerEmployee josh1 = new PieceWorkerEmployee();
        josh1.setTotalPiecesFinished(500);
        josh1.setRatePerPiece(10);
        josh1.setEmpName("josh1");
        josh1.setEmpID(102);
        josh1.display();
        
        PieceWorkerEmployee josh2 = new PieceWorkerEmployee("josh2",102);
        josh2.setTotalPiecesFinished(500);
        josh2.setRatePerPiece(10);
        josh2.display();
        
        Employee temp_josh = new Employee("josh3",102);
        PieceWorkerEmployee josh3 = new PieceWorkerEmployee(temp_josh);
        josh3.setTotalPiecesFinished(500);
        josh3.setRatePerPiece(10);
        josh3.display();
        
        Employee temp_josh2 = new Employee("josh4",101);
        PieceWorkerEmployee josh4 = new PieceWorkerEmployee(temp_josh2,500,10);
        josh4.display();
        
        
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
        
        Employee temp_jio = new Employee("jio3",103);
        ComissionEmployee jio3 = new ComissionEmployee(temp_jio);
        jio3.setTotalSales(15000);
        jio3.display();
        
        Employee temp_jio2 = new Employee("jio4",103);
        ComissionEmployee jio4 = new ComissionEmployee(temp_jio2,15000);
        jio4.display();
        
        System.out.println("\nBased Plus Comission Employee");
        
        BasedPlusComissionEmployee dusky = new BasedPlusComissionEmployee("dusky",104,15000,14000);
        dusky.display();
        
        BasedPlusComissionEmployee dusky1 = new BasedPlusComissionEmployee();
        dusky1.setBaseSalary(14000);
        dusky1.setTotalSales(15000);
        dusky1.setEmpName("dusky1");
        dusky1.setEmpID(104);
        dusky1.display();
        
        BasedPlusComissionEmployee dusky2 = new BasedPlusComissionEmployee("dusky2",104);
        dusky2.setBaseSalary(14000);
        dusky2.setTotalSales(15000);
        dusky2.display();
        
        Employee temp_dusky = new Employee("dusky3",104);
        BasedPlusComissionEmployee dusky3 = new BasedPlusComissionEmployee(temp_dusky);
        dusky3.setTotalSales(15000);
        dusky3.setBaseSalary(14000);
        dusky3.display();
        
        Employee temp_dusky2 = new Employee("dusky4",104);
        BasedPlusComissionEmployee dusky4 = new BasedPlusComissionEmployee(temp_dusky2,15000,14000);
        dusky4.display();
        
        ComissionEmployee temp_dusky3 = new ComissionEmployee(15000,"dusky5",104);
        BasedPlusComissionEmployee dusky5 = new BasedPlusComissionEmployee(temp_dusky3);
        dusky5.setBaseSalary(14000);
        dusky5.display();
        
        ComissionEmployee temp_dusky4 = new ComissionEmployee(15000,"dusky6",104);
        BasedPlusComissionEmployee dusky6 = new BasedPlusComissionEmployee(temp_dusky4,15000,14000);
        dusky6.display();
        
        Employee e = new Employee();
    }
}
