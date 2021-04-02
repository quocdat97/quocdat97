/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author PC
 */
public class Account {
    
    private int PIN;
    private double balance;
    private String name;
    
    Account(){}
    Account(int PIN, double balance, String name){
        this.PIN = PIN;
        this.balance = balance;
        this.name = name;
    }
    
    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        //Deposit an amount.
        this.balance = balance;
    }
    
    public boolean checkPIN(int PIN){
        return this.PIN == PIN;
    }
    
    public void withdraw(double withdrawNumber){
        
        if(this.balance > withdrawNumber)
        this.balance = this.balance - withdrawNumber;
        else
            System.out.println("account not enough");
    }
    
    public void fees(){
        
        if(this.balance < 10d){
            System.out.println("fee is: " + this.balance * (10/100));
            this.balance = this.balance - this.balance * (10/100);
        }
        else
            this.balance = this.balance - 10;
    }
    
    public void interest(){
        
        double interat = ((7/12) / 100) * this.balance;
        System.out.println("interat paid monthly is: " + interat);
        this.balance = this.balance + ((7/12) / 100) * interat;
    }
    
    public void penalty(){
        
    } 
    @Override
    public String toString(){
        return "PIN: " + PIN 
                + "\nBalance: " + this.balance 
                + "\nName: " + this.name;
    }
    /**
     * Create the account.
•	Deposit an amount.
•	Withdraw an amount.
•	Access the balance.
•	Access the name.
•	Check the validity of the PIN.
•	Compute the fees.
•	Compute the interest.
     */
}
