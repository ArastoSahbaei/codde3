package com.company;

public class Main {
    String characterName;
    String weaponName;
    static String hammerCarrier = "The Beast";
    static String magicWandCarrier = "Ja'Far";
    static String excaliburCarrier = "";
    int weaponDamage;
    int hp;
    static int hammerMaximumDamage = 60;
    static int hammerMinimumDamage = 40;
    static int hammer = (int) (Math.random() * (hammerMaximumDamage - hammerMinimumDamage) + hammerMinimumDamage);
    static int magicWandMaximumDamage = 100;
    static int magicWandMinimumDamage = 0;
    static int magicWand = (int) (Math.random() * (magicWandMaximumDamage - magicWandMinimumDamage) + magicWandMinimumDamage);
    static int excaliburMaximumDamage = 100;
    static int excaliburMinimumDamage = 50;
    static int excalibur = (int) (Math.random() * (excaliburMaximumDamage - excaliburMinimumDamage) + excaliburMinimumDamage);

    public Main(String characterName, int weaponDamage, int hp, String weaponName) {
        this.characterName = characterName;
        this.weaponName = weaponName;
        this.weaponDamage = weaponDamage;
        this.hp = hp;
    }

    public void setWeapon(String weaponName) {
        this.weaponName = weaponName;
    }

    public void equipExcalibur() {
        weaponName = "Excalibur";
        weaponDamage = excalibur;
        System.out.println("You have equipped " + weaponName);
    }
    public static void changeCarrierOfWeapon(String newWeapon, String characterName){
        switch (newWeapon) {
            case "Hammer":
                if (characterName.equals("The Beast")){
                    hammerCarrier = "The Beast";
                } else if (characterName.equals("Ja'far")) {
                    hammerCarrier = "Ja'far";
                }
            case "Magic Wand":
                if (characterName.equals("The Beast")){
                    magicWandCarrier = "The Beast";
                } else if (characterName.equals("Ja'far")){
                    magicWandCarrier = "Ja'far";
                }
            case "Excalibur":
                if (characterName.equals("The Beast")){
                    excaliburCarrier = "The Beast";
                } else if (characterName.equals("Ja'far")){
                    excaliburCarrier = "Ja'far";
                }
        }
    }

    public static void searchWeapon(String weaponName, String characterName, Object roflmao) {
        System.out.println("Search for: " + weaponName);
        System.out.println(roflmao);
        System.out.println(roflmao);
        System.out.println(roflmao);
        System.out.println(roflmao);
        switch (weaponName) {
            case "Hammer":
                if (characterName.equals(hammerCarrier)){
                    System.out.println(characterName + " carries " + weaponName);
                    break;
                } else System.out.println(hammerCarrier + " carries " + weaponName);
                break;
            case "Magic Wand":
                System.out.println("Ja'far carries Magic Wand");
                break;
            case "Excalibur":
                System.out.println("The Beast carries Excalibur");
                break;
            default:
                System.out.println("No character carries " + weaponName);
                break;
        }
    }

    public static void main(String[] args) {
        Main goodGuy = new Main("The Beast", hammer, 100, "Hammer");
        Main evilGuy = new Main("Ja'far", magicWand, 100, "Magic Wand");
        searchWeapon(goodGuy.weaponName, goodGuy.characterName, goodGuy);
    }

    private static void setWeapon(String mjöjlnir, Main goodGuy) {
    }
}