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
public class RegularAccount extends Account {
    
    RegularAccount(int PIN, double balance, String name){
        
        super(PIN, balance, name);
    
    }

    @Override
    public void penalty(){
        if(this.getBalance() < 50000){
            this.setBalance(this.getBalance() - 1000);
            System.out.println("you penalty 1000 because balance < 50000");
        }
        
    } 
}
