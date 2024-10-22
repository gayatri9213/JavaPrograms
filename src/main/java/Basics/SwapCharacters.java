package Basics;

public class SwapCharacters {
    public static void main(String[] args) {
        char a = 'A';
        char b = 'B';

        a = (char) (a + b);
        b = (char) (a - b);
        a = (char) (a - b);
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
