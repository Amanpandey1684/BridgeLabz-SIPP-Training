package ControlFlows;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            int i = 2;
            while (i <= number / 2) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is Not a Prime Number");
        }

        sc.close();
    }
}
