/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

import java.util.Scanner;
import java.lang.Math;
public class Bai6 {

    public static void main(String[] args) {
       Scanner Nhap = new Scanner(System.in);
       System.out.print("Nhap so thap phan:");
       double a = Nhap.nextDouble();
       System.out.println("so duoc lam tron:" + Math.round(a));
        //Math.ceil mac dinh lam tron len Math.floor() lam tron xuong
    }
    
}
