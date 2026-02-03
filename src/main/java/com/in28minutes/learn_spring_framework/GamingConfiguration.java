package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learn_spring_framework.game.GameConsole;
import com.in28minutes.learn_spring_framework.game.PacManGame;


@Configuration
public class GamingConfiguration {


    @Bean
    public GamingConfiguration game() {
        var game = new PacManGame();
        return game;
    }



        //var game = new MarioGame();
        //var gmae = new SuperContraGame();
        //var game = new PacManGame();
       // var gameRunner = new GameRunner(game);
       // gameRunner.run();




        
        
    
}
