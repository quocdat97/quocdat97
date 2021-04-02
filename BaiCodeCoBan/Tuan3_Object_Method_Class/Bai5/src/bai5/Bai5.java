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
    public static Scanner scanner = new Scanner(System.in);
    public static String chooseSeat(String[] arrayString,int indexRow, int indexCloumn){
        
        char[] arraySeating = stringToArrayChar(arrayString,indexRow);
        
        arraySeating[indexCloumn] = 'X';
        String newString = arraySeating[0]+"";
        
        for(int i = 1; i < arraySeating.length; i++){
            
            newString = newString + " " +arraySeating[i];
        }
        return newString;
    }
    public static char[] stringToArrayChar(String[] arrayString, int indexString){
    
        String a = arrayString[indexString].replaceAll("\\s", "");
        char[] arraySeating = a.toCharArray();
        return arraySeating;
    }
    public static void displaySeating(String[] arrayString, int typeClass){
        System.out.println("\tA B C D E F");
        int a = 0,n = arrayString.length ;
        if(typeClass == 1){
            a = 0;
            n = 2;
        }
        else if(typeClass == 2){
            a = 2;
            n = 7;
        }
        else if(typeClass == 3){
            a = 7;
            n = 13;
        }
       
        for(int i = a; i < n; i++){
            if(i < 9)
                System.out.println("Row 0" + (i + 1)+"  " + arrayString[i]);
            else
                System.out.println("Row " + (i + 1)+"  " + arrayString[i]);
        }
    }
 
    public static int convertCharToInteger(char a){
        a = Character.toUpperCase(a);
        char[] convert = {'A', 'B', 'C', 'D', 'E', 'F'};
        int index = 7;
        for(int i = 0; i< convert.length; i++){
            if(a == convert[i]){
                
                index = i ; 
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        FileReader fileReader = new FileReader("E:\\JaVa\\Bai_Tap_Tuan3\\bai5.txt");
        //System.out.println(fileReader.readFile());
        String stringFile = fileReader.readFile();
        String[] arrayString = stringFile.split("\\n");
        
        
         while(true){
            displaySeating(arrayString,0);
            System.out.println("Enter 1: choose first class");
            System.out.println("Enter 2: choose business class");
            System.out.println("Enter 3: choose economy class");
            System.out.println("Enter 4: To exit");
            int number = scanner.nextInt();
                switch(number){
                    case 1:
                        
                        while(true){
                            displaySeating(arrayString,1);
                            
                            System.out.println("choose seating first class: * is seat available; X is seat has been assigned");
                            System.out.println("choose number row seat: ");
                            
                            int numberRow = scanner.nextInt();
                            numberRow = numberRow - 1;
                            
                            System.out.println("choose alphabe seat: ");
                            char nameAlphabe = scanner.next().charAt(0);
                            int  numberAlphabe = convertCharToInteger(nameAlphabe);
                            
                            char[] arrayStringNumber = stringToArrayChar(arrayString, numberRow);
                            if(numberRow < 2 && numberRow >= 0 && numberAlphabe < 6 && arrayStringNumber[numberAlphabe] == '*')
                                arrayString[numberRow ] = chooseSeat(arrayString, numberRow , numberAlphabe);
                            else
                                System.out.println("Check choose seat");
                            System.out.println("Enter 0: To exit");
                            System.out.println("Enter 1: Continue");
                            int exit = scanner.nextInt();
                            if(exit == 0)
                                
                                break;
                            
                        }
                    break;
                    case 2:
                        while(true){
                            displaySeating(arrayString,2);
                            
                            System.out.println("choose seating business class: * is seat available; X is seat has been assigned");
                            System.out.println("choose number row seat: ");
                            
                            int numberRow = scanner.nextInt();
                            numberRow = numberRow - 1;
                            
                            System.out.println("choose alphabe seat: ");
                            char nameAlphabe = scanner.next().charAt(0);
                            int  numberAlphabe = convertCharToInteger(nameAlphabe);
                            
                            char[] arrayStringNumber = stringToArrayChar(arrayString, numberRow);
                            if(numberRow < 7 && numberRow >= 2 && numberAlphabe < 6 && arrayStringNumber[numberAlphabe] == '*')
                                arrayString[numberRow ] = chooseSeat(arrayString, numberRow , numberAlphabe);
                            else
                                System.out.println("Check choose seat");
                            System.out.println("Enter 0: To exit");
                            System.out.println("Enter 1: Continue");
                            int exit = scanner.nextInt();
                            if(exit == 0)
                                break;
                            
                        }
                    break;
                    case 3:
                        while(true){
                            displaySeating(arrayString,3);
                            
                            System.out.println("choose seating economy class: * is seat available; X is seat has been assigned");
                            System.out.println("choose number row seat: ");
                            
                            int numberRow = scanner.nextInt();
                            numberRow = numberRow - 1;
                            
                            System.out.println("choose alphabe seat: ");
                            char nameAlphabe = scanner.next().charAt(0);
                            int  numberAlphabe = convertCharToInteger(nameAlphabe);
                            
                            char[] arrayStringNumber = stringToArrayChar(arrayString, numberRow);
                            if(numberRow < 13 && numberRow >= 7 && numberAlphabe < 6 && arrayStringNumber[numberAlphabe] == '*')
                                arrayString[numberRow ] = chooseSeat(arrayString, numberRow , numberAlphabe);
                            else
                                System.out.println("Check choose seat");
                            System.out.println("Enter 0: To exit");
                            System.out.println("Enter 1: Continue");
                            int exit = scanner.nextInt();
                            if(exit == 0)
                                break;
                        }
                    break;
                    case 4:
                        return;
                }
        }
        }
    }
    

