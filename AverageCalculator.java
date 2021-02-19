/*
Assignment 1
Description: Creating a average calculator, knock knock joke, and our own thing
Name: Olimpia Aguillon
ID: 918257150
Class: CSC 210-06
Semester: Fall 2020
 */

import java.util.Scanner;

public class AverageCalculator {
    // Create a Scanner object
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    // Ask user to input 3 different numbers
    System.out.print("Please enter 3 whole numbers: ");
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    int num3 = in.nextInt();
    //Display and compute average
    System.out.println("You entered " + num1 + " " + num2 + " " + num3  + " and the average of them is: " + (num1 + num2 + num3) /3.0);
    }
}

