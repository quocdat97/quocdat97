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
public class Triangle extends Shape{
    
    private float langth;

    Triangle(){}
    Triangle(float width, float langth){
        
        super(width, langth);
        this.langth = langth;

    }
    
     public float getLangth() {
        return langth;
    }

    public void setLangth(float langth) {
        this.langth = langth;
    }
    
    @Override
    public float area(float width, float langth){
        return super.area(width,langth);
    }
 }
