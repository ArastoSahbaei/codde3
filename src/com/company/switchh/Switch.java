package com.company.switchh;

public class Switch {

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
        searchForSuperHero("Thor");
    }
}
