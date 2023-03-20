package com.factoriaf5.rps.application;

import static org.junit.Assert.*;

import org.junit.Test;

import com.factoriaf5.rps.models.Player;

public class GameTest {
    Player player = new Player();
    Player player2 = new Player();

    @Test
    public void new_game(){
        Game newGame = new Game(player, player2, "rock", "scissors");
        assertEquals(player, newGame.getPlayer());
        assertEquals(player2, newGame.getPlayer2());
    }
    @Test
    public void player_and_player2_newgame(){
        Game newGame = new Game(player, player2, "rock", "scissors");
        assertEquals("Rock", newGame.getFigure().getType());
        assertEquals("Scissors", newGame.getFigure2().getType());
    }

}
