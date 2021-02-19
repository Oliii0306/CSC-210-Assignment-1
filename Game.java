/*
Assignment 3
Description: Create a dice game
Name: Olimpia Aguillon
ID: 918257150
Class: CSC 210-06
Semester: Fall 2020
 */

import java.util.Scanner;

public class Game {
    public static void main(String[] args){

        int number = 16;
        Scanner input= new Scanner(System.in);

        int sum = 0;
        while(sum != number) {
            if (sum != 0) {
                System.out.println("Better Luck Next Time!!"+"\n");
            }
            System.out.println("** Press (1) to roll the dice**");
            int guess = input.nextInt();
            int dice1 = (int) (Math.random() * 10) + 1;
            int dice2 = (int) (Math.random() * 10) + 1;
            sum = dice1 + dice2;
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2+"\n");
        }
        System.out.println("Jackpot!!");
    }
}
