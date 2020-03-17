package com.example;

public class Sport implements Cloneable {

    private String name;
    private int numberOfPlayers;
   
    public Sport(String name, int numberOfPlayers) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfPlayers() {
        return this.numberOfPlayers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }  

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
