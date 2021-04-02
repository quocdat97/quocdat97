/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;
/**
 *
 * @author PC
 */
public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static int[] arrayPoint(String[] arrayStudent){
        int[] arrayPoint = new int[arrayStudent.length - 1];
        for(int i = 1; i < arrayStudent.length; i++){
            for(int j= 9; j < arrayStudent[1].length(); j++){
                if(arrayStudent[i].charAt(j) == arrayStudent[0].charAt(j-9) )
                    arrayPoint[i-1] += 2;
                else if((arrayStudent[i].charAt(j)!= ' '))
                    arrayPoint[i-1] -= 1;
            }
        }
        return arrayPoint;
    }
    public static float[] scoreByScale(String[] arrayStudent){
        float[] arrayScale = new float[arrayStudent.length - 1];
        for(int i = 1; i < arrayStudent.length; i++){
            for(int j= 9; j < arrayStudent[1].length(); j++){
                if(arrayStudent[i].charAt(j) == arrayStudent[0].charAt(j-9) )
                    arrayScale[i-1] += 1;
            }
        
            arrayScale[i-1]= (arrayScale[i-1] / 20) * 100;
        }
        return arrayScale;
    }
    public static char convertTypeGrade(float a){
        int i ;
        char[] arrayCharGrade = {'F', 'D', 'C', 'B', 'A'};
        float[] b ={59.99f,69.99f,79.99f,89.99f,100};
        for( i= 0; i < b.length; i++ )
            if(a <= b[i])
                break;
        return arrayCharGrade[i];
    }
    public static char[] arrayTypeGrade(float[] a){
        
        char[] b = new char[a.length];
        for(int i = 0; i < a.length; i++)
            b[i] = convertTypeGrade(a[i]);
        return b;
            
    }
    public static void main(String[] args) {
        // TODO code application logic here
        FileReader fileReader = new FileReader("E:\\JaVa\\Bai_Tap_Tuan3\\bai3.txt");
        String fileString = fileReader.readFile();
       // System.out.println();
        
        String[] arrayStudent = fileString.split("\\n");
        int[] arrayPoint = arrayPoint(arrayStudent);
        
        float[] arrayTypeScale = scoreByScale(arrayStudent);
        char[] arrayGrade = arrayTypeGrade(arrayTypeScale);
        
       System.out.println("\t " + arrayStudent[0]);
        
        for(int i = 1; i < arrayStudent.length ; i++)
            System.out.println(arrayStudent[i] + " score: " + arrayPoint[i-1]+" grade: " + arrayGrade[i-1]);
    }
}
