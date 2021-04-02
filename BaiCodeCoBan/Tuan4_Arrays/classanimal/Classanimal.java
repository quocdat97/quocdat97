/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classanimal;

import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class Classanimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("fish difault");
        //Fish d = new Fish ();
        //d.eat();
        //d.setName("dat");
        //System.out.println("name fish is: " + d.getName());
        //d.walk();
        //Animal a = new Fish ();
        //a.walk();
        //a.eat();
        //Animal e = new Spider ();
        //e.eat();
        Pet p = new Cat ();
        p.play();
        ((Cat)p).setName("dat");
        System.out.println(p.getName());
       // Cat c = new Cat("Fluffy");
        //System.out.println(c.getName());
        //c.play();
        
      
    }

   
}
abstract class Animal {

        protected int legs;

        public int getLegs() {
            return legs;
        }

        public void setLegs(int legs) {
            this.legs = legs;
        }

        protected Animal() {
        }

        protected Animal(int legs) {

            this.legs = legs;
        }

        abstract void eat();

        public void walk(){}

    }

interface Pet {

        String getName();

        void setName(String name);

        void play();
    }

class Fish extends Animal implements Pet {

        private String name;

        public Fish(String name) {

            super();
            this.name = name;
            //System.out.println("fish not leg");
        }

        public Fish() {
             System.out.println("fish not leg");
        }

        @Override
        void eat() {
            System.out.println("fish eat");
        }

        @Override
        public String getName() {
            return this.name;
        }

        @Override
        public void setName(String name) {
            this.name = name;
        }

        @Override
        public void walk() {
            System.out.println("fish not walk");
        }

        @Override
        public void play() {

        }

    }

class Cat extends Animal implements Pet {

        private String name;
        public Cat(){
            System.out.println("cat has four legs");
        }
        public Cat(String name){
         super(4);
         this.name = name;
         System.out.println("cat has four legs");
         }

        

        @Override
        void eat() {

            System.out.println("cat eat");
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public void setName(String name) {
            this.name = name;
        }

        @Override
        public void play() {
            System.out.println("cat play");
        }

    }
class Spider extends Animal{
        
        Spider(){}
        Spider(int legs){
            
            super(legs);
        }
        
        @Override
        void eat() {
            System.out.println("Spider eat");
        }
        
    }
    
