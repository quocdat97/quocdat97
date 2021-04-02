/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2_tuan5;

import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Bai2_tuan5 {

    /**
     * @param args the command line arguments
     */
	 
    public static Scanner scanner = new Scanner(System.in);
    public static int[] HOUR_PM= {13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,12}; 
	
    public static void main(String[] args) {
		
        String hour,typeHour;
        int valueHour=0;
        
        System.out.println("enter hour type 12 - hour(1-AM): ");
        hour = scanner.nextLine();
        
        try{
        String[] sHour = hour.split("-");
        typeHour = sHour[1].replace(" ", "");
        valueHour = Integer.parseInt(sHour[0]);
         
         if(valueHour < 0 || valueHour >12)
             throw new NumberFormatException("hour not");
         else if(valueHour == 0)
			 
             System.out.println("hour is: "+ valueHour);
			 
         else{
			 
             if(typeHour.equalsIgnoreCase("AM"))
                 System.out.println("type 24-hour is: " + valueHour + " hour");
			 
             else if(typeHour.equalsIgnoreCase("PM"))
                 System.out.println("type 24-hour is: " + HOUR_PM[valueHour- 1] + " hour");
			 
             else 
                 throw new NumberFormatException("hour not");
             
         }
         
         }
		 
        catch(RuntimeException e){
            throw new ArrayIndexOutOfBoundsException("not \'-\'");
			
        }
        
      System.out.println();
    }
    
}
