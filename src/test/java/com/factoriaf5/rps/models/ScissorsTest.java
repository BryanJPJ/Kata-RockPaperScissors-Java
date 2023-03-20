package com.factoriaf5.rps.models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ScissorsTest {
    @Test
    public void ScissorsTesting(){
        Scissors s = new Scissors();
        assertEquals( "Scissors", s.getType());
    }
}
