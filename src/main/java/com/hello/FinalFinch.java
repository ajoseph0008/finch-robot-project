package com.hello;

import com.birdbrain.Finch;

public class FinalFinch extends Finch{
    public FinalFinch(String device){
        super(device);
    }
    public void cP1(){
        for(int a = 0; a<8; a++){
        while(getDistance()> 10){
        setMove("F",5,99);
        }
        if(a == 0|| a==1||a==4||a==5){
            setTurn("L", 90, 99);
        } else {
            setTurn("R", 90, 99);
        }

       // if(b == 0)
      //  setTurn("L", 90, )
       // }


        
        
        
    }
}
}