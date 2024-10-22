package Basics;

public class LargestOfThree {
    public static void main(String[] args) {
        int a=40;
        int b=25;
        int c=30;
        if(a>b && a>c)
            System.out.println("a is greater");
        else if(b>a && b>c)
            System.out.println("b is greater");
        else
            System.out.println("c is greater");

        int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Largest :"+largest);
    }
}
