/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

import java.util.Scanner;
public class Bai10 {

 
    public static void main(String[] args) {
        Scanner Nhap  = new Scanner(System.in);
        float dai_room, rong_room, cao_room;
        float rong_door, cao_door;
        float rong_window, cao_window;
        float rong_bookshelf, cao_bookshelf;
        float chi_phi_son, chi_phi_tham;
        float son, tham;
        System.out.print("Nhap room: \ndai: ");
        dai_room = Nhap.nextFloat();
        System.out.print("Rong: ");
        rong_room = Nhap.nextFloat();
        System.out.print("Cao: ");
        cao_room = Nhap.nextFloat();
        System.out.print("The door: \nRong door: ");
        rong_door = Nhap.nextFloat();
        System.out.print("Dai door: ");
        cao_door = Nhap.nextFloat();
        System.out.print("The window: \nRong window: ");
        rong_window = Nhap.nextFloat();
        System.out.print("Cao window: ");
        cao_window = Nhap.nextFloat();
        System.out.print("The bookshelf: \nRong bookshelf: ");
        rong_bookshelf = Nhap.nextFloat();
        System.out.print("Cao bookshelf: ");
        cao_bookshelf = Nhap.nextFloat();
        System.out.print("Chi phi son / foot: ");
        chi_phi_son = Nhap.nextFloat();
        System.out.print("chi phi tham / foot: ");
        chi_phi_tham = Nhap.nextFloat();
        float dien_tich_room, dien_tich_door, dien_tich_window;
        float dien_tich_floor, dien_tich_bookshelf;
        //dien tich phong
        dien_tich_room = (dai_room + rong_room) * cao_room * 2 + 2 * dai_room * rong_room;
        //dien tich san
        dien_tich_floor = dai_room * rong_room;
        //dien tich cua ra vao
        dien_tich_door = cao_door * rong_door;
        //dien tich cua so
        dien_tich_window = cao_window * rong_window;
        //dien tich bookshelf
        dien_tich_bookshelf = cao_bookshelf * rong_bookshelf;
        float dien_tich_son = (dien_tich_room - dien_tich_door - (dien_tich_window * 2) - dien_tich_bookshelf - dien_tich_floor) ;
		float tong_son = dien_tich_son * chi_phi_son; 
        System.out.println("Tong chi phi son cho nha: " + tong_son);
        float tong_tham = dien_tich_floor * chi_phi_tham;
        System.out.println("Tong chi phi tham: " + tong_tham);
        
        
    }
    
}
