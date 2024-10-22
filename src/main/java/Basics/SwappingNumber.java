package Basics;//Write a Java program to swap two numbers without using a third variable.

public class SwappingNumber {
    public static void main(String[] args) {
        System.out.println("Swapping Two Numbers Without a Temporary Variable");
        int a = 15;
        int b = 10;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
    }
}
