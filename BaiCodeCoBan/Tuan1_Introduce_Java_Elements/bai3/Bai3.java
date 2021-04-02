
package bai3;


import java.util.Scanner;
import java.lang.Math;
public class Bai3 {

   
    public static void main(String[] args) {
        Scanner Nhap = new Scanner(System.in);
        System.out.print("Nhap ba canh tam giac:");
        int a , b, c;
        double s , cv;
        a = Nhap.nextInt();
        b = Nhap.nextInt();
        c = Nhap.nextInt();
        cv = (a + b + c) / 2;
        s = Math.sqrt(cv * (cv - a) * (cv - b) * (cv - c));
        System.out.println("Dien tich tam giac la:"+ s +"  " + cv);
        
        
        
    }
    
}
