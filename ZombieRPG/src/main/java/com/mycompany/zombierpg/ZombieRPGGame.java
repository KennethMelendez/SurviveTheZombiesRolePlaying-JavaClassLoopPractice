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

import java.util.Random;
public class ZombieRPGGame {
    public void Run(){
        
        Player MainPlayer = new Player();
        int HealthBar = 745;
        int SafeZoneSteps = 50;
        
        ConsoleIO.Display("We haff to get to the Choppah!!!");
        String name = ConsoleIO.PromptUser("What is your name civilian?");
        ConsoleIO.Display("What is your name?");
        MainPlayer.setPlayerName(name);
        MainPlayer.setPlayerHealth(HealthBar);
        ConsoleIO.Display(name + " is confronted by Zombies....He runs..");
        ConsoleIO.Display("You have " + HealthBar + " Health");
        
  
            
           while(SafeZoneSteps >= 0 || HealthBar >= 0){
                
                SafeZoneSteps--;
                
                if(SafeZoneSteps == 0){
                    break;
                } else if (HealthBar <= 0){
                    break;
                }
                
                HealthBar = HealthBar - playerDamage();
                MainPlayer.setPlayerHealth(HealthBar);
               
                
                ConsoleIO.Display("---------------------------------");
                ConsoleIO.Display(name + " encountered Zombies!!");
                ConsoleIO.Display(name + " took damage!!!");
                

                ConsoleIO.Display("You have " + HealthBar + " Health");
                ConsoleIO.Display("You have " + SafeZoneSteps + " Steps to go!!");
                ConsoleIO.Display("---------------------------------");
           }

           resultsScreen(SafeZoneSteps,HealthBar);
           
    }
    
    
    
    public static int playerDamage(){
        Random randomizer = new Random();
        int damage = randomizer.nextInt(32);
        return damage;
    }
    
    public static void resultsScreen(int SafeZoneSteps, int HealthBar){
            if(SafeZoneSteps == 0 && HealthBar > 0){
                    ConsoleIO.Display("You Survived!!!");
                    ConsoleIO.Display("You had " + HealthBar + " health remaining!");
            } else if (HealthBar == 0){
                    ConsoleIO.Display("Nice try...You died");
            } else if (HealthBar < 0){
                    ConsoleIO.Display("Zombies Overkilled You...");
            }
           ConsoleIO.Display("Steps Remaining " + SafeZoneSteps);
    }
    
}
