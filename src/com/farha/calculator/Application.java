package com.farha.calculator;
// Farha Ahmed Lab 1 
// July 4th 2024

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // Instantiate Scanner for user input
        Scanner userInput = new Scanner(System.in);

        // Infinite loop to keep the calculator running until 'exit' is entered
        while (true) {
            // Prompt the user to enter an operation
            System.out.println("Enter operation (+, -, *, /, !, ^, sqrt, sin, cos, tan, permutations) or 'exit' to quit:");
            String operation = userInput.next();

            // Check if the user wants to exit
            if (operation.equalsIgnoreCase("exit")) {
                System.out.println("Exiting calculator...");
                break;
            }

            // Handle different operations based on user input
            switch (operation.toLowerCase()) {
                case "+":
                    System.out.println("Enter the first number:");
                    double addNum1 = userInput.nextDouble();
                    System.out.println("Enter the second number:");
                    double addNum2 = userInput.nextDouble();
                    System.out.println("Result: " + add(addNum1, addNum2));
                    break;

                case "-":
                    System.out.println("Enter the first number:");
                    double subNum1 = userInput.nextDouble();
                    System.out.println("Enter the second number:");
                    double subNum2 = userInput.nextDouble();
                    System.out.println("Result: " + subtract(subNum1, subNum2));
                    break;

                case "*":
                    System.out.println("Enter the first number:");
                    double mulNum1 = userInput.nextDouble();
                    System.out.println("Enter the second number:");
                    double mulNum2 = userInput.nextDouble();
                    System.out.println("Result: " + multiply(mulNum1, mulNum2));
                    break;

                case "/":
                    System.out.println("Enter the first number:");
                    double divNum1 = userInput.nextDouble();
                    System.out.println("Enter the second number:");
                    double divNum2 = userInput.nextDouble();
                    // Handle division by zero
                    if (divNum2 == 0) {
                        System.out.println("Error: Division by 0 is not allowed");
                    } else {
                        System.out.println("Result: " + divide(divNum1, divNum2));
                    }
                    break;

                case "!":
                    System.out.println("Enter a number:");
                    double numFactorial = userInput.nextDouble();
                    System.out.println("Result: " + factorial(numFactorial));
                    break;

                case "^":
                    System.out.println("Enter the base number:");
                    double base = userInput.nextDouble();
                    System.out.println("Enter the exponent:");
                    double exponent = userInput.nextDouble();
                    System.out.println("Result: " + power(base, exponent));
                    break;

                case "sqrt":
                    System.out.println("Enter a number:");
                    double numSqrt = userInput.nextDouble();
                    System.out.println("Result: " + sqrt(numSqrt));
                    break;

                case "sin":
                    System.out.println("Enter an angle in degrees:");
                    double angleSin = userInput.nextDouble();
                    System.out.println("Result: " + sin(angleSin));
                    break;

                case "cos":
                    System.out.println("Enter an angle in degrees:");
                    double angleCos = userInput.nextDouble();
                    System.out.println("Result: " + cos(angleCos));
                    break;

                case "tan":
                    System.out.println("Enter an angle in degrees:");
                    double angleTan = userInput.nextDouble();
                    System.out.println("Result: " + tan(angleTan));
                    break;

                case "permutations":
                    System.out.println("Enter the first permutation number:");
                    int totalElements = userInput.nextInt();
                    System.out.println("Enter the second permutation number:");
                    int selectedItems = userInput.nextInt();
                    // Validate input for permutation calculation
                    if (selectedItems > totalElements || totalElements < 0 || selectedItems < 0) {
                        System.out.println("Error: Invalid input!");
                    } else {
                        // Calculate permutations using both methods and display results
                        System.out.println("Recursive Result: " + permutationRecursive(totalElements, selectedItems));
                        System.out.println("Iterative Result: " + permutationIterative(totalElements, selectedItems));
                    }
                    break;

                default:
                    // Handle invalid operations
                    System.out.println("Invalid operation.");
                    break;
            }
        }

        // Close the Scanner to free up resources
        userInput.close();
    }

    // Add two numbers
    public static double add(double num1, double num2) {
        return num1 + num2; 
    }

    // Subtract the second number from the first
    public static double subtract(double num1, double num2) {
        return num1 - num2; 
    }

    // Multiply two numbers
    public static double multiply(double num1, double num2) {
        return num1 * num2; 
    }

    // Divide the first number by the second
    public static double divide(double num1, double num2) {
        return num1 / num2; 
    }

    // Calculate the factorial of a number
    public static double factorial(double num) {
        if (num <= 1) {
            return 1; 
        } else {
            return num * factorial(num - 1); 
        }
    }

    // Calculate the power of a base raised to an exponent
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent); // Return the result of base raised to the power of exponent
    }

    // Calculate the square root of a number
    public static double sqrt(double num) {
        return Math.sqrt(num); // Return the square root of the number
    }

    // Calculate the sine of an angle in degrees
    public static double sin(double angleDegrees) {
        return Math.sin(Math.toRadians(angleDegrees)); // Convert angle to radians and return the sine value
    }

    // Calculate the cosine of an angle in degrees
    public static double cos(double angleDegrees) {
        return Math.cos(Math.toRadians(angleDegrees)); // Convert angle to radians and return the cosine value
    }

    // Calculate the tangent of an angle in degrees
    public static double tan(double angleDegrees) {
        return Math.tan(Math.toRadians(angleDegrees)); // Convert angle to radians and return the tangent value
    }

    // Recursive method to calculate the number of permutations
    public static long permutationRecursive(int totalElements, int selectedItems) {
        if (selectedItems == 0) {
            return 1; // Base case: If no items are selected, there's only one way to do nothing
        }
        return totalElements * permutationRecursive(totalElements - 1, selectedItems - 1);
    }

    // Iterative method to calculate the number of permutations
    public static long permutationIterative(int totalElements, int selectedItems) {
        long result = 1;
        for (int i = 0; i < selectedItems; i++) {
            result *= (totalElements - i);
        }
        return result;
    }
}