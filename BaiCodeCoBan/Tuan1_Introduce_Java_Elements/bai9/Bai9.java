/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9;

import java.util.Scanner;
import java.lang.Math;

public class Bai9 {
    
    public static void main(String[] args) {
        Scanner Nhap = new Scanner(System.in);
        System.out.print("Nhap so giay: ");
        double a = Nhap.nextDouble();
        int gio, phut, giay;
        gio = (int) a / 3600;
        phut = (int) (a % 3600) / 60;
        giay = (int) a - gio * 3600 - phut * 60;
        System.out.println((int)a + " giay = " + gio + ":" + phut + ":" + giay);
    }
    
}
