package org.example;

public class Main {
    public static void main(String[] args) {
        String finalResult = toBinaryString(6);
        System.out.println(finalResult);
    }

    public static String toBinaryString(int value) {
        if (value == 0) {
            return String.valueOf(0);
        }
        StringBuilder toBinary = new StringBuilder();
        int a;
        while (value != 0) {
            a = value % 2;
            toBinary.append(a);
            value = value / 2;
        }
        return String.valueOf(toBinary.reverse());
    }
}
