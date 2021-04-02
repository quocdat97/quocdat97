/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

/**
 *
 * @author PC
 */
public class RomanNumeral {
    /**
     * Convert and store the number into decimal.
     */
   
    String romanNumeral;
    float numberDecimal;

    public void setNumberDecimal(float numberDecimal) {
        this.numberDecimal = numberDecimal;
    }

    public String getRomanNumeral() {
        return romanNumeral;
    }

    public void setRomanNumeral(String romanNumeral) {
        this.romanNumeral = romanNumeral;
    }
    
    public float getNumberDecimal(){
        return numberDecimal;
    }
    public RomanNumeral(){}
    
    public RomanNumeral(String romanNumeral){
        this.romanNumeral = romanNumeral;
    }
    
    public float romanToDecimal(String romanNumeral){
      
        char[] romanToArray = romanNumeral.toCharArray();
 
        for(char charRoman : romanToArray){
            switch(charRoman){
        
            case 'I':
                numberDecimal = numberDecimal + 1;
                break;
            case 'V':
                numberDecimal = numberDecimal + 5;
                break;
            case 'X':
                numberDecimal = numberDecimal + 10;
                break;
            case 'L':
                numberDecimal = numberDecimal + 50;
                    break;
            case 'C':
                numberDecimal = numberDecimal + 100;
                break;
            case 'D':
                numberDecimal = numberDecimal + 500;
                break;
            case 'M':
                numberDecimal = numberDecimal + 1000;
                break;
                             }
        }
        setNumberDecimal(numberDecimal);
        return getNumberDecimal();
    }
}
