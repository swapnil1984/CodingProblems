package com.swapnil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int number= 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        number = scanner.nextInt();

        if(number % 3 == 0 && number % 5 == 0){
            System.out.println("FizzBuzz");
        }
        else if (number % 5 == 0){
            System.out.println("Fizz");
        }
        else if(number % 3 == 0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(number);
        }
        scanner.close();
    }
}
