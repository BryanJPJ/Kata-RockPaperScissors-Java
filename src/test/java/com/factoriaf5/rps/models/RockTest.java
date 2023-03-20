package com.factoriaf5.rps.models;

import static org.junit.Assert.*;

import org.junit.Test;

public class RockTest {
    
    @Test
    public void rockTest() {
        Rock a = new Rock();
        assertEquals("Rock", a.getType());

    }
}
