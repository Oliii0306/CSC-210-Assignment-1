/*
Assignment 9
Description: Pick two elements from an integer array
Name: Olimpia Aguillon
ID: 918257150
Class: CSC 210-06
Semester: Fall 2020
 */
import java.util.Scanner;
public class Operation {
    public static void main(String [] args){
        int N=5;
        int arr[]= new int[N];
        Scanner sc= new Scanner(System.in);

            System.out.println("Enter 5 elements:" );
            for(int i =0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter index 1: ");
        int index1=sc.nextInt();
        System.out.println("Enter index 2: ");
        int index2=sc.nextInt();

        try {
            int value1 = arr[index1];
            int value2 = arr[index2];
            int result = value1 / value2;
            System.out.println("Result: " + result);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("End of program");
        }
    }
}
