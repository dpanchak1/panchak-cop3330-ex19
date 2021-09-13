/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 David Panchak
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        double height=0;
        double weight=0;
        Scanner input=new Scanner(System.in);
        while (true) {
            System.out.print("What is your height? ");
            try {
                height = Double.parseDouble(input.next());
                break;
            } catch (NumberFormatException ignore) {
                System.out.printf("Invalid input%n");
            }
        }

        while (true) {
            System.out.print("What is your weight? ");
            try {
                weight = Double.parseDouble(input.next());
                break;
            } catch (NumberFormatException ignore) {
                System.out.printf("Invalid input%n");
            }
        }


        double bmi=((weight/(height*height))*703);

        System.out.printf("Your BMI is %.01f.%n",bmi);
        if(bmi>=18.5 && bmi<=25)
        {
            System.out.print("You are within the ideal weight range.");
        }
        else
        {
            System.out.print("You are overweight. You should see your doctor.");
        }
    }
}
