package com.company.interrrface;

public class Pikatchu implements PokemonInterface {


    @Override
    public String pokemonType() {
        return "Electric";
    }

    @Override
    public void pokemonBaseSound() {

    }

    @Override
    public int sleep() {
        return 10;
    }

    @Override
    public int tryToEscape() {
        return 0;
    }

    @Override
    public int attack(int a) {
        return 0;
    }
}
