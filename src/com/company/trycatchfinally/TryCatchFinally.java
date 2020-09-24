package com.company.trycatchfinally;

public class TryCatchFinally {
    static String[] Characters = {"Hulk", "Wolverine", "Thor", "Groot"};

    static int haha;

    public static void main(String[] args) {


        try {
            System.out.println(haha);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e);
        } finally {
            System.out.println("Always execute this code");
        }


    }

}
