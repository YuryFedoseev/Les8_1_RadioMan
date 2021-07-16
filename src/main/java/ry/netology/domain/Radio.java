package ry.netology.domain;

public class Radio {
    private int radioStation  ;
    private int minRadio = 0;
    private int maxRadio = 9;
    private int volume  ;
    private int maxVolume = 10;
    private int minVolume = 0;
    public int theEnteredChanel;


    public void setTheChanel(int theEnteredChanel){
        this.theEnteredChanel = radioStation;
        if ((theEnteredChanel <= maxRadio) && (theEnteredChanel >= minRadio) ){

            radioStation = theEnteredChanel;
            //return radioStation;
        }
        else {theEnteredChanel = radioStation;}
        return ;

    }
    public void turnUpTheChanel(int radioStation){
        this.radioStation = radioStation;
        if (radioStation == maxRadio){
            radioStation = minRadio;
           //return radioStation;
        }
        else {radioStation = radioStation + 1;}
        return ;

    }

    public void turnDownTheChanel(int radioStation){
        this.radioStation = radioStation;
        if (radioStation == minRadio){
            radioStation = maxRadio;
            //return radioStation;
        }
        else {radioStation = radioStation - 1;}
        return ;

    }

    public void turnUpTheVoid(int volume){
        this.volume = volume;
        if (volume != maxVolume){
            volume = volume +1;
            //return radioStation;
        }
        return ;

    }

    public void turnDownTheVoid(int volume){
        this.volume = volume;
        if (volume != minVolume){
            volume = volume -1;
            //return radioStation;
        }
        return ;

    }


}

