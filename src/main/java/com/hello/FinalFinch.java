package com.hello;

import com.birdbrain.Finch;

public class FinalFinch extends Finch{
    public FinalFinch(String device){
        super(device);
    }
    public void cP1(){
        for(int a = 0; a<4; a++){
        setMove("F",60,100);
      if(a == 0|| a==2){
            setTurn("L", 90, 100);
            while(getDistance()>8){
                setMove("F", 4,100);
            }
            setTurn("L", 90, 100);
        } else {
            setTurn("R", 90, 100);
            while(getDistance()>8){
                setMove("F", 4,100);
            }
            setTurn("R", 90, 100);
        }
        
    }

        


}
public void cP2(){
for (int b=0 ; b<3 ; b++){
    while(getDistance() > 10){
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
   for (int b=0 ; b<8 ; b++){
    while(getDistance() > 10){
        setMove("F", 5, 100);
    }
        setTurn("R", 90, 100);
}

}
}
