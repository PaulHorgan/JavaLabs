package com.qa;


import org.junit.jupiter.api.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BlackjackTest {
    Blackjack blackjack = new Blackjack();

    @Test
    public void handOnewin(){
        int One = 21;
        int Two = 19;
        assertEquals (One, blackjack.play(One,Two));
    }
    @Test
    public void handTwowin(){
        int One = 20;
        int Two = 21;
        assertEquals (Two, blackjack.play(One,Two));
    }
    @Test
    public void handTwoBust(){
        int One = 20;
        int Two = 29;
        assertEquals (One, blackjack.play(One,Two));
    }

    @Test
    public void handOneBust(){
        int One = 29;
        int Two = 20;
        assertEquals (Two, blackjack.play(One,Two));
    }

    @Test
    public void bothBust(){
        int One = 29;
        int Two = 29;
        assertEquals (2, blackjack.play(One,Two));
    }

    @Test
    public void bothTooLow(){
        int One = 1;
        int Two = 1;
        assertEquals (1, blackjack.play(One,Two));
    }

    @Test
    public void oneTooLow(){
        int One = 1;
        int Two = 21;
        assertEquals (1, blackjack.play(One,Two));
    }

    @Test
    public void twoTooLow(){
        int One = 11;
        int Two = 1;
        assertEquals (1, blackjack.play(One,Two));
    }
    @Test
    public void draw(){
        int One = 11;
        int Two = 11;
        assertEquals(0, blackjack.play(One, Two));
    }
}


