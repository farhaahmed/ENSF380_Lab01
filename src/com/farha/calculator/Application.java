package com.farha.calculator;
// Farha Ahmed Lab 1 
// July 4th 2024

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        while (true) {
            System.out.println("Enter operation (+, -, *, /, !) or 'exit' to quit:");
            String operation = userInput.next();

            if (operation.equalsIgnoreCase("exit")) {
                System.out.println("Exiting calculator...");
                break;
            }

            switch (operation) {
                case "+":
                    System.out.println("Addition operation:");
                    System.out.print("Enter the first number: ");
                    double addNum1 = userInput.nextDouble();
                    System.out.print("Enter the second number: ");
                    double addNum2 = userInput.nextDouble();
                    System.out.println("Result: " + add(addNum1, addNum2));
                    break;

                case "-":
                    System.out.println("Subtraction operation:");
                    System.out.print("Enter the first number: ");
                    double subNum1 = userInput.nextDouble();
                    System.out.print("Enter the second number: ");
                    double subNum2 = userInput.nextDouble();
                    System.out.println("Result: " + subtract(subNum1, subNum2));
                    break;

                case "*":
                    System.out.println("Multiplication operation:");
                    System.out.print("Enter the first number: ");
                    double mulNum1 = userInput.nextDouble();
                    System.out.print("Enter the second number: ");
                    double mulNum2 = userInput.nextDouble();
                    System.out.println("Result: " + multiply(mulNum1, mulNum2));
                    break;

                case "/":
                    System.out.println("Division operation:");
                    System.out.print("Enter the first number: ");
                    double divNum1 = userInput.nextDouble();
                    System.out.print("Enter the second number: ");
                    double divNum2 = userInput.nextDouble();
                    if (divNum2 == 0) {
                        System.out.println("Error: Division by zero is not allowed");
                    } else {
                        System.out.println("Result: " + divide(divNum1, divNum2));
                    }
                    break;

                case "!":
                    System.out.println("Factorial operation:");
                    System.out.print("Enter a number: ");
                    double numFactorial = userInput.nextDouble();
                    System.out.println("Result: " + factorial(numFactorial));
                    break;

                default:
                    System.out.println("Invalid operation.");
                    break;
            }
        }

        userInput.close();
    }

    public static double add(double num1, double num2) {
        return num1 + num2; // Return the sum of num1 and num2
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2; // Return the difference between num1 and num2
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2; // Return the product of num1 and num2
    }

    public static double divide(double num1, double num2) {
        return num1 / num2; // Return the quotient of num1 and num2
    }

    public static double factorial(double num) {
        if (num <= 1) {
            return 1; // Return 1 for the base case
        } else {
            return num * factorial(num - 1); // Recursively calculate the factorial
        }
    }
}
