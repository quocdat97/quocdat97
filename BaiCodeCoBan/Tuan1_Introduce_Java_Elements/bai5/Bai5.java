
package bai5;
import java.lang.Math;
import java.util.Scanner;

public class Bai5 {

    
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("nhap so nguyen:");
        int a = nhap.nextInt();
        String b = Integer.toString(a);
        StringBuilder string = new StringBuilder();
        string.append(b);
        for(int i = 0; i < string.length(); i++)
        {
            System.out.println(string.charAt(i));
        }
        
       /* double c;
        double d, f;
        f = a;
        for(int i = b.length()-1; i >=0; i-- )
        {
            c = Math.pow(10, i);//lay mu theo chuoi
            d = f / c; //chia lấy so nguyen
            System.out.println((int) d);
            f = f - ((int)d * c);
        } */
           
           }
    
}
