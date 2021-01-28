package com.tts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Ask the user for 5 numbers
        Scanner scanner = new Scanner(System.in);
        int [] a = new int[5];
        System.out.println("Please enter 5 numbers");

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        double sum = 0;
        int product = 1;
        int min = a[0], max = a[0];

        // Finding the largest and smallest values
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
        }
        // Finding the sum and the product of the numbers
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            product = product * a[i];
        }
        System.out.println("The largest number is " + max);
        System.out.println("The smallest number is " + min);
        System.out.println("The total sum of numbers is " + sum);
        System.out.println("The product of numbers is: " + product);
    }
}