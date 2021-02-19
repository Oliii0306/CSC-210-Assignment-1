/*
Assignment 3
Description: Display a number triangle using a nested loop
Name: Olimpia Aguillon
ID: 918257150
Class: CSC 210-06
Semester: Fall 2020
 */

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        for (int i = 1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}