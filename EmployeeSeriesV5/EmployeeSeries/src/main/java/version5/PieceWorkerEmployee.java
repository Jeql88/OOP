/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package version5;

import version3.*;

/**
 *
 * @author User
 */
public class PieceWorkerEmployee extends Employee {
    private int totalPiecesFinished;
    private double ratePerPiece;
    
    public PieceWorkerEmployee() {
    }
    
    public PieceWorkerEmployee(Name empName, int empID) {
        super(empName,empID);
    }
    public PieceWorkerEmployee(Name empName, MyDate birthDate, MyDate startDate, int empID) {
        super(empName,birthDate,startDate,empID);
    }
    public PieceWorkerEmployee(Name empName, MyDate birthDate, MyDate startDate, int empID, int totalPiecesFinished, double ratePerPiece) {
        this(empName,birthDate,startDate,empID);
        this.totalPiecesFinished=  totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
    
    public double computeSalary(){
        return (this.totalPiecesFinished * this.ratePerPiece) + ((this.totalPiecesFinished/100) * (this.ratePerPiece * 10));   
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PieceWorkerEmployee{");
        sb.append("totalPiecesFinished=").append(totalPiecesFinished);
        sb.append(", ratePerPiece=").append(ratePerPiece);
        sb.append('}');
        return sb.toString();
    }
    
    @Override
    public void display(){
        super.display();
        System.out.printf("  Salary:  %f\n",computeSalary());
    }
}
