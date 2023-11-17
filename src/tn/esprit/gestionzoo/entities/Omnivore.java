package tn.esprit.gestionzoo.entities;

interface Omnivore<T> extends Carnivore<T> , Herbivore<T> {
    void eatPlantAndMeat(T food);
}
