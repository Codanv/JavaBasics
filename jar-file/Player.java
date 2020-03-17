package org.example;

import com.example.Sport;

public class Player implements Cloneable {

    private String name;
    private Sport sport;

    public Player(String name, Sport sport) throws CloneNotSupportedException {
        this.name = name;
        this.sport = (Sport) sport.clone();
    }
 
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sport getSport() throws CloneNotSupportedException {
        return (Sport) this.sport.clone();
    }

    public void setSport(Sport sport) throws CloneNotSupportedException {
        this.sport = (Sport) sport.clone();
    }
   
    public Object clone() throws CloneNotSupportedException {
        Player player = (Player) super.clone();
        player.sport = (Sport) this.sport.clone();

        return player;
    }
}
