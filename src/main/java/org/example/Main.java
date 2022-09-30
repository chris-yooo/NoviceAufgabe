package org.example;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your name");
        String input = scanner.nextLine();
        sayHello(input);

    }


    public static String namePrint(String name) {
        return name;
    }

    public static String namePrint5(String name) {
        String result = "";
        for(int i=1 ; i<=5; i++){
            result = result + name +"\n";
        }
        System.out.println(result);
        return result;
    }

    public static boolean isBiggerThan0(int number) {
        return number > 0;
    }

    public static int square(int number) {
        return number*number;
    }

    public static String sayHello(String input) {

        System.out.println( "Hello "+ input);
        return "Hello "+ input;
    }
}