package com.company.interrrface;

public class Main {

    public static void main(String[] args) {
        Pikatchu pikatchu = new Pikatchu();
        Charizard charizard = new Charizard();

        pikatchu.pokemonBaseSound();
        charizard.sleep();
        System.out.println(charizard.pokemonType());
        System.out.println(pikatchu.pokemonType());

    }

}
