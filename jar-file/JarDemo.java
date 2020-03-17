package net.example;

import com.example.Sport;
import org.example.Player;

public class JarDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
       
        Player player1 = new Player("Rahane", new Sport("cricket", 11));
        Player player2 = new Player("John Doe", new Sport("badminton", 2));

        System.out.println(player1.getName() + " plays " + player1.getSport().getName() + ".");

        System.out.println(player2.getName() + " plays " + player2.getSport().getName() + ".");

    }
}
