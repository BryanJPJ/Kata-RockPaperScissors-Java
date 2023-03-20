package com.factoriaf5.rps.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FiguresTest {

    private Figures myGame;

    @Test
    public void test_figure() {
        myGame = new Rock();
        assertTrue(myGame instanceof Figures);
    }
    @Test
    
    public void test_figure_ROCK(){
        myGame = new Rock();
        assertTrue(myGame instanceof Rock);
        assertEquals("Rock", myGame.getType());
    }
}
