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
public class CheckingAccount extends Account {
    CheckingAccount(int PIN, double balance, String name){
        super(PIN, balance, name);
    }
    
    @Override
    public void penalty(){
        if(this.getBalance() < 100000){
            this.setBalance(this.getBalance() - 1000);
            System.out.println("you penalty 1000 because balance < 100000");
        }
    }
    @Override
    public void withdraw(double withdrawNumber){
        
        if(this.getBalance() > withdrawNumber)
            this.setBalance(this.getBalance() - withdrawNumber);
        else
            System.out.println("account not enough");
    }
}
