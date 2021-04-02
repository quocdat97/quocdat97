/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;
//import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Bai6 {

    /**
     * @param args the command line arguments
     */
    //static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        Fractions fraction1 = new Fractions(1,2);
        Fractions fraction2 = new Fractions(3,2);
        
        Fractions sum  = new Fractions();
        Fractions difference ;
        Fractions product ;
        Fractions quotient;
        char compare;
        
        sum = fraction1.addFractions(fraction2);
        difference = fraction1.subtractFractions(fraction2);
        product = fraction1.multiplyFractions(fraction2);
        quotient = fraction1.divideFractions(fraction2);
        compare = fraction1.compareFractions(fraction2);
        
        System.out.println("fraction1: " + fraction1.toString() +" fraction2: " + fraction2.toString());
        System.out.println("sum of fraction 1 add fraction 2 is: " + sum.toString());
        System.out.println("difference of fraction 1 subtruct fraction 2 is: " + difference.toString());
        System.out.println("product of fraction 1 multiply fraction 2 is: " + product.toString());
        System.out.println("quotient of fraction 1 divide fraction 2 " + quotient.toString());
        System.out.println(fraction1.toString() +" " + compare+ " " + fraction2.toString());
        
        
        
        
    }
    
}
