package com.factoriaf5.rps.application;

import com.factoriaf5.rps.models.Figures;
import com.factoriaf5.rps.models.Player;

public class Game {
    private Player player;
    private Player player2;
    private Figures figure;
    private Figures figure2;
    private String winner;
    private String displayWinner;

    public Game(Player player, Player player2, String figurePlayer, String figurePlayer2){
        this.player = player;
        this.player2 = player2;
        this.figure = this.player.choose(figurePlayer);
        this.figure2 = this.player2.choose(figurePlayer2);
    
    }
   
    public String FIGHT(String figurePlayer, String figurePlayer2){
        if(this.figure.getType() == "rock"){
            if (this.figure2.getType() == "scissors"){
                setWinner("Player wins!");
            }
            if (this.figure2.getType() == "rock"){
                setWinner("No one wins");
            }
            if (this.figure2.getType()== "paper"){
                setWinner("Player 2 wins!");
            }
        }
        if (this.figure.getType() == "paper") {
            if (this.figure2.getType() == "rock") {
                setWinner("Player win!");
            }
            if (this.figure2.getType() == "paper") {
                setWinner("No one wins");
            }
            if (this.figure2.getType() == "scissors") {
                setWinner("Player2 wins!");
            }
        }

        if (this.figure.getType() == "scissors") {
            if (this.figure2.getType() == "paper") {
                setWinner("Player1 win!");
            }
            if (this.figure2.getType() == "scissors") {
                setWinner("No one wins");
            }
            if (this.figure2.getType() == "rock") {
                setWinner("Player2 wins!");
            }
        }
        setDisplayWinner("Player: " + this.figure.getType() + "\n" + "Player2: " + this.figure2.getType() + "\n" + getWinner());
        return getWinner();
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public Figures getFigure() {
        return figure;
    }

    public void setFigure(Figures figure) {
        this.figure = figure;
    }

    public Figures getFigure2() {
        return figure2;
    }

    public void setFigure2(Figures figure2) {
        this.figure2 = figure2;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getDisplayWinner() {
        return displayWinner;
    }

    public void setDisplayWinner(String displayWinner) {
        this.displayWinner = displayWinner;
    }
    
 
}
