/*
Assignment 2
Description: Make a program that allows the user to order food and prints out receipt
Name: Olimpia Aguillon
ID: 918257150
Class: CSC 210-06
Semester: Fall 2020
 */

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Display Menu
        System.out.println("Menu\n");
        System.out.println("1.Fries    $5\n2.Burger   $7\n3.Soda     $4\n4.Coffee   $3\n5.Donut    $6\n");
        int price[]={5,7,4,3,6};
        System.out.println("Enter your choice:");
        int choice= in.nextInt();
        float total=0.0f;
        //Determine the price of what item the user input
        switch (choice){
            case 1:
                total=price[0];
                break;
            case 2:
                total=price[1];
                break;
            case 3:
                total=price[2];
                break;
            case 4:
                total=price[3];
                break;
            case 5:
                total=price[4];
                break;
            default:
                System.out.print("Enter valid choice\n");
                break;
        }
        if(total==0.0f)
            return;

        //Calculate tax, tip, and total
        float tax=total;
        tax=total*.05f;
        total += tax;
        System.out.println("Enter tip($):");
        float tip= in.nextInt();
        total += tip;

        //Display the receipt
        System.out.println("Thank you for the order!!\n");
        System.out.println("**Receipt**");
        System.out.println("Burger= $"+price[1]);
        System.out.println("Tax= $"+tax);
        System.out.println("Tip= $"+tip);
        System.out.println("Total Bill= $"+total);

    }
}
