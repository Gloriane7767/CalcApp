//package com.calculator; // This defines the package (folder) where the file is stored

import java.util.Scanner; //This imports Scanner, which helps us get input from the users

//
public class Calculator { //This defines the calculator class, which contains our program
    public static void main(String[] args) {// The main method is where the program starts running.
        Scanner scanner = new Scanner(System.in); // Creates a Scanner object to take input from the user.

        while (true) {// This starts a loop
            // Get user input
            System.out.println("Enter first number: ");// Ask user for the first number
            double num1 = scanner.nextDouble(); // Read the number and store it in `num1`.

            System.out.println( " Enter an operator (+, -, *, /): ");// Ask for an operator.
            char operator = scanner.next().charAt(0);// Read the first character of the input.

            System.out.println(" Enter second number: ");  // Ask for the second number.
            double num2 = scanner.nextDouble();  // Read the second number and store it in `num2`.


