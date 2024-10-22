package Basics;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Value :");
        int n = s.nextInt();

        // Using Ternary
        String value = n%2==0?"Even":"Odd";
        System.out.println(value);

        if (n % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }
}
