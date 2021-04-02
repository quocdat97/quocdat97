/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;
import java.util.Scanner;

public class Method {

    public static float outputFraction(float firstNumber, float secondNumber){
        //display fraction
        float ketqua =0;
        if(firstNumber == 0)
            System.out.println("the second number cannot be divided by the first number because the first\n" +
                             "number is 0");
        else
        {
           // System.out.println(firstNumber + " / " + secondNumber);
            ketqua = firstNumber /secondNumber;
            //System.out.println(ketqua);
        }
        return ketqua;
        }
        
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float firstNumber, secondNumber,ketqua;
        
        System.out.println("input first number:");
            firstNumber = input.nextFloat();
        System.out.println("input second number:");
            secondNumber = input.nextFloat();
        //outputFraction(firstNumber, secondNumber);
            ketqua = outputFraction(firstNumber,secondNumber);
        System.out.println("ket qua: " + ketqua);
        }
    
}
