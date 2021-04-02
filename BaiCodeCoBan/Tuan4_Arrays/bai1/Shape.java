/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author PC
 */
public class Shape {
    
    private float width;
    private float height;
    
    public Shape(){}
    public Shape(float width, float height){
        
        this.width = width;
        this.height = height;
        
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    
    public float area(float width, float height){
       
        return width * height;
    }
}
