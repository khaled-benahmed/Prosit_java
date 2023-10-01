public class Zoo {
    Animal[] animals;
    String name;
     String city;
    //Instruction 14 :

    final int nbrCages = 25;
     int nbrAnimal = 0;

    public Zoo(String name ,String city,int nbrCages){
         animals = new Animal[nbrCages];
         this.name = name;
         this.city = city;
     }

    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
    }
    //Instruction 9 :
    @Override
    public String toString() {
        return "Zoo Name: " + name + "\nCity: " + city + "\nNumber of Cages: " + nbrCages;
    }
    //Instruction 10 :
    public boolean addAnimal(Animal animal){

        if (nbrCages>=nbrAnimal && searchAnimal(animal) == -1 ){
        animals[nbrAnimal]= animal;
        nbrAnimal++;
        return true;
        }
            return false;
    }
    public void displayAnimals() {
        System.out.println("Animaux dans le zoo :");
        for (int i = 0; i < nbrAnimal; i++) {
                System.out.println(i + "-> " + animals[i].name);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimal; i++) {
            if ( animals[i].name.equals(animal.name)) {
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
