package com.company.ternaryoperator;

public class Ternary {

    static int number = 1337;
    static double number2 = 13.37;
    static int result = number > number2 ? 1338 : 1339;

    public static void main(String[] args) {
        System.out.println(result);
    }
}
