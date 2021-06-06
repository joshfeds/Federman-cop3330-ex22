package oop.exercise;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Federman
 */
public class Exercise22
{
    static Scanner input = new Scanner(System.in);

    public static boolean testEqual(int one, int two, int three){
        if(one == two || one == three || two == three)
            return true;
        else
            return false;
    }
    public static void findMax(int number1, int number2, int number3, int max){
        if(number1 > max)
            max = number1;
        if(number2 > max)
            max = number2;
        if(number3 > max)
            max = number3;
        System.out.print("The largest number is " + max);
    }
    public static void main( String[] args ) {
        int number1;
        int number2;
        int number3;
        int max = Integer.MIN_VALUE;

        System.out.print("Enter the first number: ");
        number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        number2 = input.nextInt();
        System.out.print("Enter the third number: ");
        number3 = input.nextInt();

        boolean equal = testEqual(number1, number2, number3);
        if(equal)
            return;

        findMax(number1,number2,number3,max);
    }
}
