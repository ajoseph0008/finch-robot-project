package com.hello;

import com.birdbrain.Finch;

public class FinalFinch extends Finch{
    public FinalFinch(String device){
        super(device);
    }
    public void cP1(){
        for(int a = 0; a<7; a++){
        while(getDistance() > 12){
        setMove("F",5,100);
        }
      if(a == 0|| a==1||a==4||a==5||a==9||a==10){
            setTurn("L", 90, 100);
        } else {
            setTurn("R", 90, 100);
        }
        
    }
        setMove("F",20,100);
        setTurn("R",90,100);


}
public void cP2(){
for (int b=0 ; b<3 ; b++){
    while(getDistance() > 12){
        setMove("F", 5, 100);
    }
    if(b == 0){
        setTurn("R", 90, 100);
    } else{
        setTurn("L", 90, 100);
    }


}
}

public void cP3(){
   
}
}