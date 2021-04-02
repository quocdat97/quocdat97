/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        String romanNumeral;
        byte request ;
        
        System.out.println("input a roman numeral:");
        romanNumeral = scanner.next();
        
        romanNumeral = romanNumeral.toUpperCase(); 
        
        RomanNumeral roman = new RomanNumeral(romanNumeral);
       
         
        
       System.out.println("do you want display? enter:\n\t 1 is roman numeral. \n\t 2 is number decimal.");
       request = scanner.nextByte();
       
       switch(request){
            
       case 1:
            System.out.println(romanNumeral);
            break;
             
       case 2:
            roman.romanToDecimal(romanNumeral);
            System.out.println(roman.getNumberDecimal());
            break;
           
       default:
            System.out.println("you check request enter");
             
                
    }
    }
    
}
