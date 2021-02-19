/*
Assignment 6
Description: Sort through an array
Name: Olimpia Aguillon
ID: 918257150
Class: CSC 210-06
Semester: Fall 2020
 */

import java.util.Scanner;
public class ArrayOperations {

    public static void main(String [] args){
        Scanner object= new Scanner(System.in);
        int [] Array = new int[5];
        int choice, num, position;

        while (true){
            System.out.println("Operations");
            System.out.println("1. Initialize Array");
            System.out.println("2. Print Array");
            System.out.println("3. Search a number");
            System.out.println("4. Find the smallest odd number");
            System.out.println("5. Exit"+"\n");
            System.out.println("Enter your choice: ");
            choice= object.nextInt();

            switch (choice){
                case 1:
                    initializeArray(Array,object);
                    break;
                case 2:
                    printArray(Array);
                    break;
                case 3:
                    System.out.println("Enter the number to search ");
                    num=object.nextInt();
                    position=searchNumber(Array, num);
                    if(position != -1){
                        System.out.println("Number "+ num +" is at index: "+ position);
                    }
                    else{
                        System.out.println("Number not found");
                    }
                    break;
                case 4:
                    System.out.println("The smallest odd number is: "+ smallestOddNumber(Array));
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
    public static void initializeArray(int[] array,Scanner object){
        System.out.println("Enter the array values");
        int i =0;
        while(i<5){
            array[i]=object.nextInt();
            i++;
        }
    }

    public static void printArray(int[] integerArray){
        System.out.print("Array - ");
        int j=0;
        while (j<integerArray.length){
            System.out.print(integerArray[j]+"\t");
            j++;
        }
        System.out.println();
    }
    public static int searchNumber(int [] integerArray, int num){
        int k =0;
        while (k<integerArray.length){
            if(integerArray[k]==num){
                return k;
            }
            k++;
        }
        return -1;
    }
    public static int smallestOddNumber(int [] integerArray){
        int min = integerArray[0];
        for(int a = 0; a< integerArray.length; a++){
            if(integerArray[a]%2 ==0 && min>integerArray[a]){
                min = integerArray[a];
            }
        }
        return min;
    }

}
