/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.lang.Math;
import java.util.Scanner;

public class Bai7 {

    public static void main(String[] args) {
       Scanner Nhap = new Scanner(System.in);
       System.out.print("nhap so sua lam duoc: ");
       float so_sua = Nhap.nextFloat();
       int so_hop_sua = (int)Math.ceil(so_sua / 3.78);
       System.out.println("so hop sua can: " + so_hop_sua + " hop");
       System.out.println("chi phi dung: " + so_sua * 0.38 + " $");
       System.out.println("loi nhuan la: " + so_hop_sua * 0.27 + " $");
       
    }
    
}
