/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

/**
 *
 * @author PC
 */
public class Day {
    
    
    String day;
    byte valueOfDay;

    
    
    public Day(){}
    
    public Day(String day){
        this.day = day;
    }
    
    public byte getValueOfDay() {
        return this.valueOfDay;
    }

    public void setValueOfDay(byte valueOfDay) {
        this.valueOfDay = valueOfDay;
    }
    public void setDay(String day){
        this.day = day;
    }
    
    public String getDay(){
        return this.day;
    }
    
    public byte convertDayToValue(String day){
        //Think
        
        String[] arrDay = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        
        for(int indexArray = 0; indexArray < 7; indexArray ++ ){
            if(day.equals(arrDay[indexArray])){
                this.valueOfDay = (byte)indexArray ;
                break;
            }
        }
        
         return (byte)this.valueOfDay;
    
    }
    
    public String convertValueToDay(int valueOfDay){
        //think
        
        valueOfDay = valueOfDay % 7;
        if(valueOfDay < 0)//it is Sun
            valueOfDay = 6;
        
        String[] arrDay = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        return arrDay[valueOfDay]; //1 week = 7 day

    }
    
    public String nextDay(String toDay){
        
        byte valueToDay = convertDayToValue(toDay);
        byte valueNextDay = (byte)(valueToDay + 1);
        
        return convertValueToDay(valueNextDay);
    }
    
    public String previousDay(String toDay){
        
        byte valueToDay = convertDayToValue(toDay);
        byte valuePrevious = (byte)(valueToDay - 1);
        
        return convertValueToDay(valuePrevious);
    }
    
    public String dayAdded(int numberDayAdd){
        
        byte valueToDay = convertDayToValue(getDay());
        int valueDayAdded = valueToDay + numberDayAdd;
        
        return convertValueToDay(valueDayAdded);
        
    }
    public void printToDay(){
        System.out.println("today is: "+getDay());
    }
    
 
}
