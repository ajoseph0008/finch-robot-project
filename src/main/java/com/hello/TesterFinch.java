package com.hello;

public class TesterFinch{
    public static void main(String[] args){
        FinalFinch bird = new FinalFinch("A");
        bird.setBeak(0,100,100);
        bird.setTail(1,0,100,100);
        bird.setTail(3,0,0,100);
        bird.setTail(2,0,0,100);
        bird.setTail(4,0,100,100);
        
       // while(bird.getDistance()>10){
       // bird.setMove("F",5,50);
      //  }

        //bird.playNote(60,16);
        //bird.setMove("F",10,99);
        bird.cP1();

        // bird.stopAll();
    }
}