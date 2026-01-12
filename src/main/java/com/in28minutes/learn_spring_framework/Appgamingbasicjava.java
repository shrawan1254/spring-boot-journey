package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.GameRunner;

public class Appgamingbasicjava {

    public static void main(String[] args) {

        //var MarioGame marioGame = new MarioGame();
        var supercontraGame = new SuperContraGame();
        var gameRunner = new GameRunner(SuperContraGame);
        gameRunner.run();
        
    }
}
