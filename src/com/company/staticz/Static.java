package com.company.staticz;

public class Static {
    String characterName = "Groot";
    static String characterName2 = "Rocket Raccoon";

    public static void main(String[] args) {
        Static staticExample = new Static();

        System.out.println(staticExample.characterName);
        System.out.print(characterName2);
    }

}





