package tn.esprit.gestionzoo.entities;

public final class Terrestrial extends Animal implements Omnivore<Food>{

    private int nbrLegs;

    public Terrestrial() {

    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", nbrLegs:" + nbrLegs;
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH)
            System.out.println("Terrestrial Animal is eating plant.");
        else
            System.out.println("Terrestrial Animal cannot eat meat!!");

    }
    @Override
    public void eatPlantAndMeat(Food food) {
        System.out.println("Terrestrial animal is eating both plant and meat.");
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH)
            System.out.println("Terrestrial animal is eating meat.");
            else
            System.out.println("Terrestrial animal cannot eat plant.");

    }
}
