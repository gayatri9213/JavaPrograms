package Basics;

public class ConvertIntegerAndString {
    public static void main(String[] args) {
        int num = 100;
        String strNum =Integer.toString(num);
        System.out.println("Integer to String: "+strNum);

        int intNum = Integer.parseInt(strNum);
        System.out.println("String to Integer: " + intNum);
    }
}
