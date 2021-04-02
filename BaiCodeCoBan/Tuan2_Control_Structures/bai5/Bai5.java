/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Bai5 {

    /**
     * @param args the command line arguments
     */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
       String toDay;
       int addNumberDay;
       
       System.out.println("input today:");
       toDay = scanner.nextLine();
       
       Day day = new Day(toDay);
       
       day.printToDay();
       System.out.println("next day: " + day.nextDay(toDay));
       System.out.println("previous day: " + day.previousDay(toDay));
       
       System.out.println("number day want add:" );
       addNumberDay = scanner.nextByte();
       
       System.out.println("day added is:" + day.dayAdded(addNumberDay));
   
    }
    
}
