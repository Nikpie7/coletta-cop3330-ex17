/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        int sex;
        while(true){
            System.out.print( "Enter a 1 is you are male or a 2 if you are female: " );
            try {
                sex = Integer.parseInt( scan.nextLine() );
                break;
            }
            catch(Exception e) {
                System.out.println("Invalid input!");
                continue;
            }
        }

        int A;
        while(true){
            System.out.print( "How many ounces of alcohol did you have? " );
            try {
                A = Integer.parseInt( scan.nextLine() );
                break;
            }
            catch(Exception e) {
                System.out.println("Invalid input!");
                continue;
            }
        }

        int W;
        while(true){
            System.out.print( "What is your weight, in pounds? " );
            try {
                W = Integer.parseInt( scan.nextLine() );
                break;
            }
            catch(Exception e) {
                System.out.println("Invalid input!");
                continue;
            }
        }

        int H;
        while(true){
            System.out.print( "How many hours has it been since your last drink? " );
            try {
                H = Integer.parseInt( scan.nextLine() );
                break;
            }
            catch(Exception e) {
                System.out.println("Invalid input!");
                continue;
            }
        }

        double r = ( sex == 1 ? 0.73 : 0.66 );
        double BAC = ((A * 5.14 / W * r)) - (0.015 * H);
        String output = ( BAC >= 0.08 ? "It is not legal for you to drive." : "It is legal for you to drive." );

        System.out.println( "\nYour BAC is " + String.format("%.6f", BAC));
        System.out.println( output );
    }
}
