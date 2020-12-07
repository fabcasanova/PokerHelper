package com.phatsmalone.calculations;

public class PlayerInformation {

    private String playerName, playerNotes, position;
    private double handRange;

    //Define null constuctor.
    public PlayerInformation(){

        this.playerName = "";
        this.playerNotes = "";
        this.handRange = 100.00;
        this.position = "bb";

    }

    //Define constructor with attributes(For updates).
    public PlayerInformation(String playerName, String position, double handRange,
                             String playerNotes){
        this.playerName = playerName;
        this.playerNotes = playerNotes;
        this.handRange = handRange;
        this.position = position;
    }

    //Set player's name. It can be any player on the table
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayername(){

        return playerName;
    }

    public void setPlayerNotes(String playerNotes){

        this.playerNotes = playerNotes;
    }

    public String getPlayerNotes(){

        return playerNotes;
    }

    public void setPosition(String position){

        this.position = position;
    }

    public String getPosition(){

        return position;
    }

    public void setHandRange(double handRange){

        this.handRange = handRange;
    }

    public double getHandRange(){

        return handRange;
    }
}
