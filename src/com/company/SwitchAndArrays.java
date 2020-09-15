package com.company;

import java.util.ArrayList;

public class SwitchAndArrays {
    static String[] Characters = {"Hulk", "Wolverine", "Thor", "Groot"};
    static int[] randomNumbers = new int[4];
    static ArrayList<String> programmingLanguages = new ArrayList();

    public static void searchForSuperHero(String superHero) {
        switch(superHero) {
            case "Hercules": System.out.println("Hercules was found");
                break;

            case "Achilles": System.out.println("Achilles was found");
                break;

            default:
                System.out.println("Unfortunately, we could not find the superhero you were looking for");
                break;
        }
    }

    public static void main(String[] args) {
        /* ADDING VALUES TO THE LIMITED ARRAY */
        randomNumbers[0] = 1;
        randomNumbers[1] = 3;
        randomNumbers[2] = 3;
        randomNumbers[3] = 7;

        /* GET ONE CHARACTER FROM INDEX */
        System.out.println(Characters[1]);
        /* GET LENGTH OF ARRAY */
        System.out.println(Characters.length);


        /* ADDING VALUES TO THE ARRAYLIST */
        programmingLanguages.add("JavaScript");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("Haskell");
        programmingLanguages.add("Ruby On Rails");
        programmingLanguages.add("GO Lang");

        /* DISPLAY THE ARRAYLIST */
        System.out.println(programmingLanguages);
        /* INSTEAD OF LENGTH WE USE .size  */
        System.out.println(programmingLanguages.size());
        /* CHANGE VALUE OF INDEX */
        programmingLanguages.set(0, "ScriptJava");
        /* GET ITEM WITH INDEX */
        System.out.println(programmingLanguages.get(0));
        /* REMOVE ITEM WITH INDEX */
        programmingLanguages.remove(0);
        /* GET INDEX WITH VALUE */
        System.out.println(programmingLanguages.indexOf("Python"));

        searchForSuperHero("Thor");
    }
}
