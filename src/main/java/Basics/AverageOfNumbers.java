package Basics;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Value of n :");
        int n = s.nextInt();
        int sum = 0;

        System.out.println("Enter " + n + " numbers");
        for (int i = 0; i < n; i++) {
            sum += s.nextDouble();
        }

        int average = sum / n;

        System.out.println("Average of N Numbers : " + average);

    }
}
