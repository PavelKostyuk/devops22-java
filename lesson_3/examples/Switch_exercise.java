package lesson_3.examples;

import java.util.Scanner;

public class Switch_exercise {

public static void main(String[] args) {  

     String day = "monday";

        switch (day){
        case "monday":{
        System.out.println("Hard work awaits you!");
            break;
        }
        case "tuesday":{
        System.out.println("More work awaits you!");
            break;
        }
        case "wednesday":{
        System.out.println("God job!");
                break;
        }
        case "thursday":{
        System.out.println("A little more!");
            break;
        }
        case "friday":{
        System.out.println("Almost there!");
            break;
        }
        case "saturday":{
        System.out.println("Welcome to weekend!");
            break;
        }
        case "sunday":{
        System.out.println("Beautiful weekend!");
            break;
        }
        default:{
        System.out.println("Looking forward to a Happy Weekend");
        }
    }
}
}







