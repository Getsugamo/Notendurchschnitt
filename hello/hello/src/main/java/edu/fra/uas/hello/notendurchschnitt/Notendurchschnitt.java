package edu.fra.uas.hello.notendurchschnitt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import edu.fra.uas.hello.rechner;

@SpringBootApplication
public class Notendurchschnitt {
    
    @Autowired
    private rechner rechner;
     public static void main(String[] args) {
        SpringApplication.run(Notendurchschnitt.class, args);
    }
    
    
    @Bean
    CommandLineRunner init() {
        CommandLineRunner action = new CommandLineRunner() {

            @Override
            public void run(String... args) throws Exception {
            rechner.setMessage("Geben sie ihre Noten an: ");
            System.out.println(rechner.getMessage());
            rechner.calculator();
            }
        };
        return action;
    }
}
