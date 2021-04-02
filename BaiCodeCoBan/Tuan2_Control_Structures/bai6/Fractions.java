/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

/**
 *
 * @author PC
 */
public class Fractions {
    
    int a;
    int b;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        if(b !=b)
        this.b = b;
        else
            System.out.println("b != 0");
    }
    
    public Fractions(){
        this.a = 0;
        this.b = 1;
    }
    
    public Fractions(int a, int b){
        
        this.a = a;
        this.b = b;
    }
    
    public Fractions addFractions(Fractions fraction){
        
        Fractions result = new Fractions(); //// not writed as Fraction result;
        result.a = (this.a * fraction.b + this.b * fraction.a) ;
        result.b =(this.b * fraction.b);
        return result;
        
    }
    public Fractions subtractFractions(Fractions fraction){
        
        Fractions result = new Fractions();
        result.a = (this.a * fraction.b - this.b * fraction.a) ;
        result.b =(this.b * fraction.b);
        return result;
        
     }
     
    public Fractions multiplyFractions(Fractions fraction){
         
        Fractions result = new Fractions();
        result.a = (this.a * fraction.a) ;
        result.b =(this.b * fraction.b);
        return result;
        
     }
     
    public Fractions divideFractions(Fractions fraction){
        
        Fractions result = new Fractions();
        result.a = (this.a *fraction.b) ;
        result.b =(this.b * fraction.a);
        return result;
        
     }
       
    public char compareFractions(Fractions fraction){
        
        char a;
        Fractions result = new Fractions();
        result.a = (this.a * fraction.b) ;
        result.b =(this.b * fraction.a);
        
        if(result.a > result.b)
            a = '>';
        else if(result.a < result.b )
            a = '<';
        else
            a = '=';
        
        return a;
        
       }
    @Override
    public String toString(){
        
        return this.a +" / " + this.b;
        
     }
}
