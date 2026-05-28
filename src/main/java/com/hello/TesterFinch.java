package com.hello;

public class TesterFinch{
    public static void main(String[] args){
        FinalFinch bird = new FinalFinch("A");
        bird.setBeak(0,100,100);
        bird.setTail(1,0,100,100);
        bird.setTail(3,0,0,100);
        bird.setTail(2,0,0,100);
        bird.setTail(4,0,100,100);
        bird.playNote(60,16);
        bird.setMove("F",100,99);
    }
}