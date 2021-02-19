/*
Assignment 5
Description: Validate user's password 
Name: Olimpia Aguillon
ID: 918257150
Class: CSC 210-06
Semester: Fall 2020
 */

import java.util.Scanner;
public class Validation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the password to validate: ");
        String users_password = in.nextLine();

        if (isValidPassword(users_password) == true) {
            System.out.println("Password: " + users_password + " is VALID ");
        } else {
            System.out.println("Password: " + users_password + " is INVALID");

        }
    }

    public static boolean isValidPassword(String Password) {
    boolean isUpperCase, isLowerCase, isDigit, isSpecialChar;
    isUpperCase= isLowerCase = isDigit = isSpecialChar = false;
    for(int character = 0; character< Password.length(); character++){
        if(Character.isUpperCase(Password.charAt(character))){
            isUpperCase= true;
        }
        if(Character.isLowerCase(Password.charAt(character))){
            isLowerCase= true;
        }
        if(Character.isDigit(Password.charAt(character))) {
            isDigit = true;
        }else{
                isSpecialChar = true;
        }
        if(isDigit== true && isLowerCase ==true && isSpecialChar == true && isUpperCase== true){
            return true;
        }
    }
    return false;
    }
}