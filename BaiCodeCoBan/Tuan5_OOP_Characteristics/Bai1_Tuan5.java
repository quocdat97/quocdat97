/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1_tuan5;
import java.lang.RuntimeException;
import java.util.Scanner;



/**
 *
 * @author PC
 */
public class Bai1_Tuan5 {

    /**
     * @param args the command line arguments
     */
    public static final String[] MONTH ={"january", "February", "March", "April"
                    , "May", "june", "july", "August", "september", "October"
                    , "November", "December"};
					
    public static boolean checkYearNhuan(int year){
        if(year % 400 == 0)
            return true;
        if(year % 4 == 0 && year % 100 != 0)
            return true;
        return false;
		
    }
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
		
        String useEnter;
        int day, month, year;
		
        while(true){
        System.out.println("input month-day-year:");
        useEnter = scanner.nextLine();
        String[] b = useEnter.split("-");
		
        try{
            day = Integer.parseInt(b[1]);
            month = Integer.parseInt(b[0]);
            year = Integer.parseInt(b[2]);
        }
		
        catch(RuntimeException e){
            throw new NumberFormatException("enter reset");
          
        }
            if( month <= 12 && month > 0){
                if(checkYearNhuan(year) && month == 2 && day > 29)
                    throw new NumberFormatException("not day");
                else if( month == 2 && day > 28)
                    throw new NumberFormatException("not day");
                else if(month % 2 != 0 && day > 31 && month <=7)
                    throw new NumberFormatException("not day");
                else if(month % 2 == 0 && day > 30 && month <=7)
                    throw new NumberFormatException("not day");
                else if(month % 2 != 0 && day > 30 && month >7)
                    throw new NumberFormatException("not day");
                else if(month % 2 == 0 && day > 31 && month >7)
                    throw new NumberFormatException("not day");
                else{
                    System.out.println("your birth day: " + MONTH[month - 1]+ " " + day + "," +year);
                    break;
                }
            }
			
            else
                throw new NumberFormatException("not month");
        }
    }
}
