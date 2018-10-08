package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// prompt the user for a number
        //print that number down to one
        //if divisible by 5=copy
        //if divisible by 7=copy
        //if divisible by 5 and 7=copycat
        //otherwise print the number
        Scanner Keyboard= new Scanner(System.in);

        System.out.println("Enter a number");
        int num1= Keyboard.nextInt();
        //we always have to put keyboard.nextline after we input an entry
        Keyboard.nextLine();
        //if divisible by 5=copy
        if (num1 % 5 ==0){
            System.out.println("Copy");
        }
        //if divisible by 7=copy
        if (num1 % 7 ==0){
            System.out.println("Cat");
        }
        //if divisible by 5 and 7=copycat
        if ((num1 % 5 ==0) && (num1 % 7 ==0)){
            System.out.println("CopyCat");
        }






    }
}
