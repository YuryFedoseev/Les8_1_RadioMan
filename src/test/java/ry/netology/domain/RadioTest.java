package ry.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void turnUpTheChanelMaxStation (){
        Radio rad= new Radio();
        rad.turnUpTheChanel(9);
        //rad.turnUpTheChanel();
        //void expected = 0;
        void actual = rad.turnUpTheChanel();
        assertEquals(0, actual);
    }

    @Test
    public void turnDownTheChanel() {
        Radio rad= new Radio();
        rad.turnUpTheChanel(0);
        void actual = rad.turnDownTheChanel();
        assertEquals(9 , actual);
    }


    @Test
    public void setTheChanel (){
        Radio rad= new Radio();
        int theEnteredChanel = 7;
        rad.setTheChanel(9);
        void actual = rad.setTheChanel();
        assertEquals( 0, actual);
    }

    @Test
    public void turnUpTheVoid (){
        Radio rad= new Radio();
        rad.turnUpTheVoid(10);
        //rad.turnUpTheChanel();
        //void expected = 0;
        void actual = rad.turnUpTheVoid();
        assertEquals(10, actual);
    }

    @Test
    public void turnDownTheVoid() {
        Radio rad= new Radio();
        rad.turnDownTheVoid(0);
        void actual = rad.turnDownTheVoid();
        assertEquals(0 , actual);
    }

}