/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author PC
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static final int SIZE = 50;
    public static void main(String[] args) {
        // TODO code application logic here
        double[] array = new double[SIZE];
        for(int i = 0; i < SIZE; i++){
            if(i < 25)
                array[i] = i * i;
            else
                array[i] = i * i * i;
        }
        for(int i= 1; i <= SIZE; i++){
            System.out.print(array[i-1]+ " ");
            if(i % 10 == 0)
                System.out.println();
    }
            
    }
    
}
