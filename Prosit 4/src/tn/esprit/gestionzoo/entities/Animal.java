package tn.esprit.gestionzoo.entities;

public sealed class Animal permits Aquatic, Terrestrial {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal() {
    }

    public Animal(String family ,String name,int age,Boolean isMammal){
        this.family = family;
        this.name = name;
        setAge(age);
        this.isMammal = isMammal;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;

    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if (age >=0)
            this.age = age;
        else System.out.println("Un animal ne peut pas avoir un âge négatif");
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    //Instruction 9 :
    @Override
    public String toString() {
        return "Animal Name: " + name + "\nFamily: " + family + "\nAge: " + age + "\nIs Mammal: " + isMammal;
    }
}
