package com.factoriaf5.rps.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PlayerTest {
    private Player player1;
public PlayerTest(){
    this.player1 = new Player();
}
@Test
public void test_PLAYER1(){
    Figures Player1rock = player1.choose("rock");
    assertTrue(Player1rock instanceof Rock);
    assertEquals("Rock", Player1rock.getType());
}

    }

