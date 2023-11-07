package edu.fra.uas.hello;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class rechner {
    @Autowired
    private String message;
    private double[] grade = new double[6];
    
    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public double calculator(){
        Scanner scan = new Scanner(System.in);
        double summe = 0;
        for(int i = 0; i <= grade.length; i++){
        grade[i] = scan.nextDouble();
        summe += grade[i];
        }
        scan.close();
        double durschnitt = summe / grade.length;

        return durschnitt;
    }

}
