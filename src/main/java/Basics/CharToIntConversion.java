package Basics;

public class CharToIntConversion {
    public static void main(String[] args) {
        char ch = '5';
        int num = Character.getNumericValue(ch);
        System.out.println("Character to integer: " + num);
    }
}
