package com.company;

public class Main {

    public static void whileLoop() {
        int y = 0;
        while(y < 10) {
            System.out.println("This is a while loop");
            y++;
        }
    }

    public static void forLoop() {
        for(int i = 0; i < 5; i++) {
            System.out.println("This is a for loop");
            i++;
        }
    }

    public static void forEachLoop() {
        String[] families = {"MommaBear", "BabaBear", "BabyBear"};
        for (String family : families) {
            System.out.println(family);
        }
    }

    public static void main(String[] args) {
        whileLoop();
        forLoop();
        forEachLoop();
    }
}
