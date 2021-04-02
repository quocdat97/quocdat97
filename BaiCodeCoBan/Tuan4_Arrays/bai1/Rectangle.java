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
public class Rectangle extends Shape{
    
    private float base;
    
    Rectangle(){}
    Rectangle(float base, float hieght){
        super(base,hieght);
        this.base = base;
    }
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }
    
    @Override
    public float area(float base, float hieght){
        return super.area(base,hieght);
    }
    
}
