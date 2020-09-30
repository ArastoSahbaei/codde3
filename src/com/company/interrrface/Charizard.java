package com.company.interrrface;

public class Charizard implements PokemonInterface {


    @Override
    public String pokemonType() {
        return "Fire";
    }

    @Override
    public void pokemonBaseSound() {

    }

    @Override
    public int sleep() {
        return 16;
    }

    @Override
    public int sizeOfPokemon(int height, int width) {
        return height*width;
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
