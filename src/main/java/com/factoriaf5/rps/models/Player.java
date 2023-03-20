package com.factoriaf5.rps.models;

public class Player {
 private String[] figures = {"rock","paper","scissors"};
 private int index = (int) (Math.random()*3);

 public Figures choose(String string){
    if (string == null){
        string = figures[index];
    }
    if (string == "rock") {
        return new Rock();
    }
    if (string == "paper") {
        return new Paper();
    }
    if (string == "scissors") {
        return new Scissors();
    }
    return null;
 }
}
