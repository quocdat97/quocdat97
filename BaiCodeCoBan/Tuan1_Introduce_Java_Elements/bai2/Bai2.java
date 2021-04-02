
package bai2;

import java.util.Scanner;
public class Bai2 {

    public static void main(String[] args) {
        Scanner Nhap = new Scanner(System.in);
        System.out.print("Gia nhap vao:");
        int gia_nhap = Nhap.nextInt();
        double gia_ban = gia_nhap + (gia_nhap * 0.8) - (gia_nhap * 0.1);
        System.out.println( "gia ban la:" + gia_ban);
    }
    
}
