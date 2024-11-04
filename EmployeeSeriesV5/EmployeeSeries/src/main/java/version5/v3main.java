/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package version5;

//import com.mycompany.version1.*;

import version3.*;
//import com.mycompany.version1.*;

//import com.mycompany.version1.*;

/**
 *
 * @author Josh
 */
public class v3main {

    public static void main(String[] args) {
        HourlyEmployee jio = new HourlyEmployee(new Name("dusky","saballa"),new MyDate(2004,8,5), new MyDate(2024,9,15), 101, 150, 40);
        PieceWorkerEmployee jansen = new PieceWorkerEmployee(new Name("jansen","choi","kai"),new MyDate(2004,8,5), new MyDate(2024,9,15), 102, 15000, 40);
        ComissionEmployee josh = new ComissionEmployee(new Name("josh","lui","que"),new MyDate(2004,5,5), new MyDate(2024,9,15), 103, 15000);
        BasedPlusComissionEmployee dusky = new BasedPlusComissionEmployee(new Name("dusky","saballa","ethan"),new MyDate(2004,5,5), new MyDate(2024,9,15), 104, 15000,14000);
        jio.display();
        jansen.display();
        josh.display();
        dusky.display();
        
        EmployeeRoster emplist = new EmployeeRoster();
        emplist.addEmployee(jio);
        emplist.addEmployee(jansen);
        emplist.addEmployee(josh);
        emplist.addEmployee(dusky);
        
        System.out.printf("Count of CE: %d\n",emplist.countCE());
        System.out.printf("Count of PWE: %d\n",emplist.countPWE());
        System.out.printf("Count of BPCE: %d\n",emplist.countBPCE());
        System.out.printf("Count of HE: %d\n",emplist.countHE());
        
        emplist.displayAllEmployee();
        
        emplist.removeEmployee(102);
        emplist.displayAllEmployee();
        
        
    }
}
