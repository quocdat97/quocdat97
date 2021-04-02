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
public class AccountCD extends Account{
    
    AccountCD(int PIN, double balance, String name){
        super(PIN, balance, name);
    }
    
    @Override
    public void interest(){
        
        double interat = ((15/12) / 100) * this.getBalance();
        System.out.println("interat paid monthly is: " + interat);
        this.setBalance(this.getBalance() + ((15/12) / 100) * interat);
    }
    
}
