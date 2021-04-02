/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;


public class Bai1 {

   
    public static void main(String[] args) {
        
        int row, column, space;
        
        System.out.println("Bai1:");
        //row = 5, column = 1;
        for(row = 5; row > 0; row --)
            System.out.println("*");
 //////////////////////////////////////////////////////////////       
        System.out.println("Bai2:");
        //row = 6, colum = 6;
        for(row = 1; row <= 6; row++){
            
            for(column = 1; column <= 6; column++){
                System.out.print("*");
            }
            System.out.println();
        }
 ///////////////////////////////////////////////////////////////
        System.out.println("Bai3:");
        //row = 6; column =15;
        for(row = 1; row <= 6; row++){
            
            for(column = 15; column > row; column--)
                System.out.print(" ");
            
            for(int star = 0; star < row; star++) {
                System.out.print("*");
                if(row == 1) break;
                System.out.print(" ");
            }
         
            System.out.println();
        }
 /////////////////////////////////////////////////////////////////
        System.out.println("bai 4:");
        for(row = 6; row > 0; row--){
            
            for(column = 15; column > row; column-- )
                System.out.print(" ");
            
            for(int star = row; star > 0; star--){
                System.out.print("*");
                if(row == 1) break;
                System.out.print(" ");
            }
          
            System.out.println();
        }
       
 ///////////////////////////////////////////////////////////////////       
         System.out.println("Bai5:");
         //row = 6, MaxColumn = 6;
         for(row = 0; row <= 6; row++){
             
             for(column = 0; column < row; column++)
                 System.out.print("*");
             
             System.out.println();
         }
 ///////////////////////////////////////////////////////////        
         System.out.println("Bai6:");
         for(row = 0; row <= 6; row++){
             
             for(space = 6; space >= row; space-- )
                 System.out.print(" ");
             for(column = 0; column <= row; column++)
                 System.out.print("*");
             
             System.out.println();
         }
 /////////////////////////////////////////////////////////////////////        
         System.out.println("Bai7:");
         //maxRow = 5, maxColumn=9
         for(row = 5; row > 0; row--){
             
             //in dong dau
             if(row == 5){
                 for(column = 0; column < 9; column++)
                 System.out.print("*");
                 //continue;
             }
             
             else{ 
                  int spaceIn = row;
                 for(space = row; space < 5; space++)
                    System.out.print(" ");
                 
                 System.out.print("*");
                 
                 if(row < 4) spaceIn = row -1;
                 
                 for(int spaceIn1 = spaceIn ; spaceIn1 >=0 ;spaceIn1--){
                    System.out.print(" ");
                    if(spaceIn == 1) break;
                                    }
                    
                 
                 if(row == 1) System.out.print(" ");
                 
                 else
                 System.out.print("*");
             }
             
             System.out.println();
         }
////////////////////////////////////////////////////////////////////         
         System.out.println("bai8:");
         //maxRow = 9; maxColumn = 9
         //chop dau
         for(row = 0; row < 4; row ++)
         {
             for(space = 4; space > row; space--)
                 System.out.print(" ");
             
             System.out.print("*");
             
             if(row != 0){
                 if(row == 3) row++;
                 for(int spaceIn = 0; spaceIn <= row; spaceIn++)
                 {
                     
                     System.out.print(" ");
                     if(row == 1) break;
                 } 
                 
                 System.out.print("*");
             }
             System.out.println();
         }
         
         for(row = 0; row < 7; row++)
         {
             if(row ==0)
                System.out.print("*"); 
             
             System.out.print(" ");
             
             if(row == 6)
                 System.out.print("*");
         }
         
         System.out.println();
         
         //chop nguoc
         
         for(row = 0; row < 4 ;row++){ 
             
             int medium = row;
             for(space  = 0; space <= row; space++)
                 System.out.print(" ");
             System.out.print("*");
             
             if( medium != 0) medium = row + 1;
             
             for(int spaceIn = medium; spaceIn <= 4; spaceIn++){
                 System.out.print(" ");  
                 if(row == 2) break;
             }
             
             if(row != 3)//row = max
                System.out.print("*");
             System.out.println();
         }
            
    }
    
}
