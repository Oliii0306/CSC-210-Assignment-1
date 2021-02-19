/*
Assignment 1
Description: Creating a average calculator, knock knock joke, and our own thing
Name: Olimpia Aguillon
ID: 918257150
Class: CSC 210-06
Semester: Fall 2020
 */

import java.util.Scanner;

public class Joke {
    //Create scanner object
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str, str1;
    //Display knock knock wait for respond
        System.out.println("Knock, Knock ");
        str = in.nextLine();
    //Display Annie wait for respond
        System.out.println("Annie");
        str1 = in.nextLine();
    //Display joke
        System.out.println("Annie thing you can do I can do better!");
    }
}

