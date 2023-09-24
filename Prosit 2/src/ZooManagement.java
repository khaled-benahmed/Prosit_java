//Instruction 3
import java.util.Scanner;

public class ZooManagement {

    public static void main(String[] args) {
        /*ZooManagement zm = new ZooManagement();
        System.out.println(zm.zooName + " comporte " + zm.nbrCages);*/


       /* System.out.println("-------------------------------------------------------------");
        //Instruction 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le nombre de cages souhaité:");
        int nbrCagesSaisie = sc.nextInt();
        ZooManagement zm1 = new ZooManagement();
        zm1.nbrCages = nbrCagesSaisie;
        //Etape optionelle
        zm1.zooName = "notMyZoo";
        System.out.println(zm1.zooName + " comporte " + zm1.nbrCages);*/

        //Instruction 5

       // Animal lion = new Animal();
       // Zoo myZoo = new Zoo();

        //Instruction 6 :
        //Que remarquez-vous au niveau de la méthode main ?
        /*Je remarque au niveau de la méthode main que j'obtiendrai une erreur de compilation.
         En effet, les classes "Animal" et "Zoo" ne possèdent pas de constructeurs par défaut
          (constructeurs sans paramètres) car j'ai déjà défini des constructeurs paramétrés dans ces classes.*/

        //Instruction 7 :
        Animal lion = new Animal("Félin", "Lion", 5, true);
        Zoo myZoo = new Zoo("Belvédère", "Tunis", 10);
        //Instruction 8 :

        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        //Je remarque que les deux instructions affichent le même résultat, qui est le nom de la classe suivi de l'adresse mémoire de l'objet.Zoo@eed1f14

        // Créez des animaux
        Animal elephant = new Animal("Mammifère", "Éléphant", 10, true);
        Animal snake = new Animal("Reptile", "Serpent", 3, false);

        // Ajoutez les animaux au zoo et affichez le résultat
        System.out.println("Ajout de Lion : " + myZoo.addAnimal(lion)); // Ajout réussi
        System.out.println("Ajout d'Éléphant : " + myZoo.addAnimal(elephant)); // Ajout réussi
        System.out.println("Ajout de Serpent : " + myZoo.addAnimal(snake)); // Ajout échoué
        /*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
        at Zoo.addAnimal(Zoo.java:26)
        at ZooManagement.main(ZooManagement.java:51)*/

        //Instruction 11 :

        // Affichez les animaux du zoo
        myZoo.displayAnimals();
       // Cherchez l'animal lion dans le zoo et affichez l'indice
        Animal lion1 = new Animal(null, "Lion", 0, false);
        int index = myZoo.searchAnimal(lion1);
        System.out.println("Indice de l'animal trouvé : " + index); //  afficher 0

        // Créez un autre animal identique au premier (même nom)
        Animal lion2 = new Animal("Félin", "Lion", 4, true);

        // Cherchez l'animal "Lion" dans le zoo à nouveau
        int index2 = myZoo.searchAnimal(lion2);
        System.out.println("Indice de l'animal trouvé : " + index2); //  afficher 0 également

        //Instruction 13 :
        System.out.println("Suppression. de Lion : " + myZoo.removeAnimal(lion)); // Suppression réussi
        // Affichez les animaux du zoo
        myZoo.displayAnimals();
    }
}