package tn.esprit.gestionzoo.entities;

public non-sealed class Aquatic extends Animal implements Carnivore<Food>{

    protected String habitat;

    public Aquatic() {

    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)return true;
        if(getClass()!= obj.getClass()) return false;
        Aquatic aquatic = (Aquatic)obj;
        return getName().equals(aquatic.getName()) && getAge() == aquatic.getAge() && habitat.equals(aquatic.habitat);
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat:" + habitat;
    }

    @Override
    public void eatMeat(Food meat) {

        if (meat == Food.MEAT || meat == Food.BOTH)
            System.out.println("Aquatic Animal is eating meat.");
        else
            System.out.println("Aquatic Animal cannot eat plant!!");

    }


}
