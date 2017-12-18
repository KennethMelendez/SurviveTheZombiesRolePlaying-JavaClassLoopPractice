/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.zombierpg;

/**
 *
 * @author kmlnd
 */
public class Player {
    
    private String PlayerName;
    private int PlayerHealth;

    
    public Player(){
        
    }
    
    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String PlayerName) {
        this.PlayerName = PlayerName;
    }

    public int getPlayerHealth() {
        return PlayerHealth;
    }

    public void setPlayerHealth(int PlayerHealth) {
        this.PlayerHealth = PlayerHealth;
        if(PlayerHealth <= 0){
            ConsoleIO.Display("You have Died...");
        }
    }
    
    
}
