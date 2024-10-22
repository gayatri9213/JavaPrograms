package Basics;

import java.util.Scanner;

public class SumNaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += i;
            i++;
        }
        System.out.println("Sum of natural numbers up to " + num + " is: " + sum);
    }
}
