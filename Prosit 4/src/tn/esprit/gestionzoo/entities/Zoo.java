package tn.esprit.gestionzoo.entities;
public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    //Instruction 14 :

    final int nbrCages = 25;
    private int nbrAnimal = 0;

    public Zoo(String name ,String city,int nbrCages){
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        setName(name);
    }

    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("tn.esprit.gestionzoo.entities.Zoo Name: " + name);

        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty())
            this.name = name;
        else System.out.println("Le nom de zoo ne peut pas etre vide");
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getNbrAnimal() {
        return nbrAnimal;
    }

    public void setNbrAnimal(int nbrAnimal) {
        this.nbrAnimal = nbrAnimal;
    }

    //Instruction 9 :
    @Override
    public String toString() {
        return " Name: " + name + "\nCity: " + city + "\nNumber of Cages: " + nbrCages;
    }
    //Instruction 10 :
    public boolean addAnimal(Animal animal){

        if (!isZooFull() && searchAnimal(animal) == -1 ){
            animals[nbrAnimal]= animal;
            nbrAnimal++;
            return true;
        }
        return false;
    }
    public void displayAnimals() {
        System.out.println("Animaux dans le zoo :");
        for (int i = 0; i < nbrAnimal; i++) {
            System.out.println(i + "-> " + animals[i].getName());
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimal; i++) {
            if ( animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {
            for (int i = index; i < nbrAnimal - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[nbrAnimal - 1] = null;
            nbrAnimal--;
            return true;
        }
        return false;
    }
    //Instruction 15 :
    public boolean isZooFull() {
        return nbrCages >= nbrAnimal;
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2){
        if (z1.nbrAnimal < z2.nbrAnimal)
            return z2;
        else return z1;
    }
}
