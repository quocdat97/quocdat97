/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1_1;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Bai1_1 {

    /**
     * @param args the command line arguments
     */
    static Scanner scanner = new Scanner(System.in);
    static final int Number_Employee = 5;
    static Employee E = new Employee();
    
    public static void main(String[] args) {
        // TODO code application logic here
       // ArrayList<Employee> employee = new ArrayList<Employee>();
        Measurable[] employee = new Employee[Number_Employee];
        employee[0] = new Employee("dat", 13);
        employee[1] = new Employee("huy", 15);
        employee[2] = new Employee("dat1", 12);
        employee[3] = new Employee("huy1", 10);
        employee[4] = new Employee("huy2", 20);
        
        //System.out.println("Name max salary is: " + E.largestMeasurable(employee));
            //System.out.println("salary: " + employee[i].getSalary());
        
        System.out.println("name max salary is: \n" + employee[0].largestMeasurable(employee));
        System.out.println("average salary is: " + E.average(employee));
                
    }
    
    interface Measurable{
        double getMeasurable();
        String largestMeasurable(Measurable[] a1);
        String toString();
    }
    
    static class Employee implements Measurable{

        private double salary;
        private String name;
        
        Employee(){}
        
        Employee(String name, double salary){
            this.name = name;
            this.salary = salary;
        }
        
        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
        
        
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        
        @Override
        public double getMeasurable() {
            return this.salary;
        }
        
        public double average(Measurable[] employee){
            double sumSalary = 0;
            for(int i = 0; i < employee.length; i++)
                sumSalary += employee[i].getMeasurable();
            return sumSalary / employee.length;
        }
        
        @Override
        public String toString(){
            return "Name: " + this.name + "\nSalary: " + this.salary;
        }
       
        @Override
        public String largestMeasurable(Measurable[] a1) {
            int indexMax = 0;
            double valueMax = a1[0].getMeasurable();
            for(int i = 1; i < a1.length; i++){
                if(valueMax < a1[i].getMeasurable()){
                    valueMax = a1[i].getMeasurable();
                    indexMax = i;
                }
            }
            
            return a1[indexMax].toString();
        }
        
        
    }
}
