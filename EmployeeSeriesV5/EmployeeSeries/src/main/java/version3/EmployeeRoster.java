/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version3;

/**
 *
 * @author User
 */
public class EmployeeRoster {

    int count;
    int max;
    Employee[] empList;
    
    public EmployeeRoster(int max){
        this.max = max;
        this.count = 0;
        empList = new Employee[max];
    }
    public EmployeeRoster(){
        this.max = 20;
        this.count = 0;
        empList = new Employee[max];
    }
    
    public boolean addEmployee(Employee e) {
        if (count < max) {
            empList[count++] = e;
            return true;
        }
        return false;
    }

    public Employee removeEmployee(int empID) {
        for (int i = 0; i < count; ++i) {
            if (empList[i].getEmpID() == empID) {
                Employee temp = empList[i];
                for (int k = i; k < count - 1; ++k) {
                    empList[k] = empList[k + 1];
                }
                count--;
                return temp;
            }
        }
        return null;
    }

    public int countHE() {
        int countof = 0;
        for (int i = 0; i < count; ++i) {
            if (empList[i] instanceof HourlyEmployee) {
                countof++;
            }
        }
        return countof;
    }

    public int countCE() {
        int countof = 0;
        for (int i = 0; i < count; ++i) {

            if (empList[i] instanceof BasedPlusComissionEmployee) {

            } else {
                if (empList[i] instanceof ComissionEmployee) {
                    countof++;
                }
            }
        }
        return countof;
    }

    public int countBPCE() {
        int countof = 0;
        for (int i = 0; i < count; ++i) {
            if (empList[i] instanceof BasedPlusComissionEmployee) {
                countof++;
            }
        }
        return countof;
    }

    public int countPWE() {
        int countof = 0;
        for (int i = 0; i < count; ++i) {
            if (empList[i] instanceof PieceWorkerEmployee) {
                countof++;
            }
        }
        return countof;
    }

    public void displayHE() {
        for (int i = 0; i < count; ++i) {
            if (!(empList[i] instanceof HourlyEmployee)) {
            } else {
                ((HourlyEmployee) empList[i]).display();
            }
        }
    }

    public void displayCE() {
        for (int i = 0; i < count; ++i) {
            if (empList[i] instanceof BasedPlusComissionEmployee) {

            } else {
                if (empList[i] instanceof ComissionEmployee) {
                    ((ComissionEmployee) empList[i]).display();
                } else {
                }
            }
        }
    }

    public void displayBPCE() {
        for (int i = 0; i < count; ++i) {
            if (!(empList[i] instanceof BasedPlusComissionEmployee)) {
            } else {
                ((BasedPlusComissionEmployee) empList[i]).display();
            }
        }
    }

    public void displayPWE() {
        for (int i = 0; i < count; ++i) {
            if (!(empList[i] instanceof PieceWorkerEmployee)) {
            } else {
                ((PieceWorkerEmployee) empList[i]).display();
            }
        }
    }

    public void displayAllEmployee() {
        System.out.printf("%10s|%20s|%15s|%15s|%10s|%30s\n", "ID", "Name", "DateOfBirth", "DateHired", "Salary", "Type of Employee");
        for (int i = 0; i < count; ++i) {
            System.out.printf("%10s|", empList[i].getEmpID());
            System.out.printf("%20s|", empList[i].getEmpName());
            System.out.printf("%15s|", empList[i].getBirthDate());
            System.out.printf("%15s|", empList[i].getStartDate());
            if (empList[i] instanceof BasedPlusComissionEmployee) {
                System.out.printf("%,10.2f|", ((BasedPlusComissionEmployee) empList[i]).computeSalary());
            } else if (empList[i] instanceof ComissionEmployee) {
                System.out.printf("%,10.2f|", ((ComissionEmployee) empList[i]).computeSalary());
            } else if (empList[i] instanceof PieceWorkerEmployee) {
                System.out.printf("%,10.2f|", ((PieceWorkerEmployee) empList[i]).computeSalary());
            } else if (empList[i] instanceof HourlyEmployee) {
                System.out.printf("%,10.2f|", ((HourlyEmployee) empList[i]).computeSalary());
            }
            System.out.printf("%30s|\n", empList[i].getClass().getSimpleName());
        }
        System.out.println();
    }

}
