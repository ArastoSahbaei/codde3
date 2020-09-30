package com.company.setters;

public class Character {

    String weaponName;

    public Character(String weaponName) {
        this.weaponName = weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    private void newWeapon(Character goodGuy, String weaponName) {
        goodGuy.setWeaponName(weaponName);
    }

    public void changeCarrierOfWeapon(String newWeapon, Character character){
        character.setWeaponName(newWeapon);
    }

    public static void main(String[] args) {
        Character goodGuy = new Character("Hammer");
        Character evilGuy = new Character("Magic Wand");
        goodGuy.changeCarrierOfWeapon("Excalibur", goodGuy);
    }
}
