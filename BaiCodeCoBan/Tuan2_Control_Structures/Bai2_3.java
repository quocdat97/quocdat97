/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2_3;

/**
 *
 * @author PC
 */
import java.util.Scanner;
public class Bai2_3 {

    public static boolean isPalindrome(int number){
        //check a palindrome
        boolean valueReturn = false;
        int temporaryVariable = number;
        int surplus;
        int newNumber = 0;
        
        while(temporaryVariable > 0){
            
            surplus = temporaryVariable %10;
            newNumber= (newNumber * 10) + surplus;
            temporaryVariable = temporaryVariable / 10;
            
        }
        
        if( number == newNumber)
            valueReturn = true;
        return valueReturn;
    }
    
    public static boolean checkPrimeNumber(int number){
        
        boolean valueReturn = false;
        
        if(number % 2 != 0)
            valueReturn = true;
        return valueReturn;
    }
    
    public static Scanner scanner = new Scanner(System.in); 
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int aNumber;
        
        System.out.println("input number:");
        aNumber = scanner.nextInt();
        if(aNumber > 0)
            
            if(checkPrimeNumber(aNumber)){
                
                if(isPalindrome(aNumber))
                    System.out.println("it is number palindrome");
                else
                    System.out.println("it is prime but it not number palindrome");
            
            }
            
            else
                System.out.println("it not a prime number");
        
        else
            System.out.println("it not positive integer");
    }
    
}
