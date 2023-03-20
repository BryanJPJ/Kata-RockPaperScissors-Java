package com.factoriaf5.rps.models;

public class Scissors extends Figures{
    private String type;
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Scissors() {
        this.type = "Scissors";
    }
    
}
