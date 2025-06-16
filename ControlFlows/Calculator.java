package ControlFlows;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        double result;
        boolean validOperation = true;

        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;
            case "/":
                if (second == 0) {
                    System.out.println("Error: Division by zero");
                } else {
                    result = first / second;
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid Operator");
                validOperation = false;
        }

        sc.close();
    }
}
