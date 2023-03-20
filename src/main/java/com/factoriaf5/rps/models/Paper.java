package com.factoriaf5.rps.models;

public class Paper extends Figures {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Paper() {
        this.type = "Paper";
    }

  
}
