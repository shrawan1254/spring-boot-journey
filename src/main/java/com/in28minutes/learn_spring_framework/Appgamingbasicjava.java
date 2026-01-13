package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.GameRunner;

public class Appgamingbasicjava {

    public static void main(String[] args) {

        var game = new MarioGame();
        //var gmae = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
        
    }
}
