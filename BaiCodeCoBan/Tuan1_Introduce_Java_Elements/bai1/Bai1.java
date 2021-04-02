package bai1;

import java.util.Scanner;
public class Bai1 {

    public static void main(String[] args) {
       
        Scanner Nhap = new Scanner(System.in);
        int a, b;
        double inch, feet;
       
            System.out.print("Nhap gia tri inch:");
             a = Nhap.nextInt();
            System.out.print("Nhap gia tri feet:");
             b = Nhap.nextInt();
            System.out.println(b + " feet = " + b * 30.48);
            System.out.println(a + " inch = " + a * 2.54);
    }
            
        
    }
    


