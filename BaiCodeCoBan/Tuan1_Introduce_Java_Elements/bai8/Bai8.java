/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;
import java.util.Scanner;
import java.lang.Math;

public class Bai8 {

   
    public static void main(String[] args) {
       Scanner Nhap = new Scanner(System.in);
       System.out.print("Nhap so pound/bao: ");
       float a = Nhap.nextFloat();
       // 1 tan = 1000 kg, 1 pound = 0.45359237kg
       System.out.println("so bao cua 1 tan gao: " + Math.ceil(1000 / (0.45359237 * a)) + " bao");
    }
    
}
