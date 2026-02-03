package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.PacManGame;

public class App03GamingSpringBeans {

    public static void main(String[] args) {


        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);

        context.getBean(GamingConsole.class).up();

        //var game = new MarioGame();
        // //var gmae = new SuperContraGame();
        // var game = new PacManGame();
        // var gameRunner = new GameRunner(game);
        // gameRunner.run();




        
        
    }
}
