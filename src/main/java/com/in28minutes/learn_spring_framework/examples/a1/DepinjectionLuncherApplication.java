package com.in28minutes.learn_spring_framework.examples.a1;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass{

    @Autowired
    Dependency1 dependency1;
    @Autowired
    Dependency2 dependency2;

    public String toString(){
        return "Using Dependency1: "+dependency1+" and Dependency2: "+dependency2;
    }

}@Component
class Dependency1{

}@Component
class Dependency2{

}

@Configuration
@ComponentScan
public class DepinjectionLuncherApplication {
    
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(DepinjectionLuncherApplication.class)){

            Arrays.stream(context.getBeanDefinitionNames())
            .forEach(System.out::println);

            System.out.println(context.getBean(YourBusinessClass.class));

        }
    }
}
