package Basics;//Write a program that takes an integer as input and calculates the sum of its digits.

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 123;
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        System.out.println("Sum of Digits in an Integer : " + sum);
    }
}
