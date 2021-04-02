/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

/**
 *
 * @author PC
 */
public class Employee extends Person{
    
    private double annualSalary ;
    private int idEmployee;
    private String insuranceNumber;
    
     public Employee(){}
    
    public Employee(String name, double annualSalary, int idEmployee, String insuranceNumber){
        
        super(name);
        this.annualSalary = annualSalary;
        this.idEmployee = idEmployee;
        this.insuranceNumber = insuranceNumber;
    }
    
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }   
}
