/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author PC
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static int[] sort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++ )
            for(int j = i + 1 ; j < arr.length  ; j++)
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                }
        return arr;                    
    }
    public static int[] stringToInteger(String[] a){
        //conver string to integer
        int[] integer = new int[a.length];
        for(int i =0 ; i < a.length; i++){
            integer[i] = Integer.parseInt(a[i].replace(" ", ""));
        }
        return integer;
    }
    public static void main(String[] args) {
        
        FileReader fileReader = new FileReader("E:\\JaVa\\Bai_Tap_Tuan3\\bai2.txt");
        String stringFile =fileReader.readFile(); 
        String [] arrayString = stringFile.split(",");
        
        int[] arrayInteger = stringToInteger(arrayString);
        int[] sortInputArray = sort(arrayInteger);
        
        for(int g : sortInputArray)
            System.out.print(" " + g );
        
        
        
        int[] rangesArray ={24, 49,74,99,124,149,174,200};
        int elementRangesArray = rangesArray.length;
        int[] scoreNumber = new int[elementRangesArray];
        
        String[] displayScoreArray = {"0-24", "25-49", "50-74","75-99", "100-124", "125-149", "150-174","175-200"};
       
        int j = 0;
        for(int i =0; i < elementRangesArray; i++){
            
            while(sortInputArray[j] <= rangesArray[i]){
                scoreNumber[i] ++; 
                ++ j;
                if(j > sortInputArray.length - 1)
                    break;
            }
         
        }
        
        System.out.println();
        
        for(int i = 0; i < elementRangesArray; i++)
            System.out.println("data of " + displayScoreArray[i] + " = " + scoreNumber[i]);
        
}
}