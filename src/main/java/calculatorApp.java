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

            // Perform calculation
            double result;  // A variable to store the result.

            switch (operator) { // This checks which operator the user entered.
                case '+':
                    result =num1 + num2; // If "+", add the numbers.
                    break;
                case '-':
                    result = num1-num2; //If "-", subtract the numbers.
                    break;
                case '*':
                    result = num1 * num2; // If "*", multiply the numbers.
                    break;
                case '/':
                    if (num2 != 0) { // if num2 is not equal to zero, perform the division
                        result = num1/num2;
                    } else {// else print out the message and continue the loop
                        System.out.println("Error: Division by zero is not allowed.");
                        continue; //Restart the loop without showing a result
                    }
                    break;
                default:
                    System.out.println("Invalid operator. Please try again");// If the operator is wrong.
                    continue; // Restart the loop without showing a result.
            }


