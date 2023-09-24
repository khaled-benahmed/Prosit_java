# Prosit-2
# Instructions for GitHub Repository README

## Zoo and Animal Classes

To continue our program, the project manager has requested you to create two classes named "Zoo" and "Animal" as follows:

### Animal Class

The "Animal" class contains the following attributes:

- String family
- String name
- int age
- boolean isMammal

### Zoo Class

The "Zoo" class contains the following attributes:

- Animal [] animals
- String name
- String city
- int nbrCages

Now, create two objects in the main class, one animal (lion) and one zoo (myZoo), and assign values to their attributes. Please note that the zoo can contain a maximum of 25 animals.

## Constructors

As you may have noticed, initializing the attributes of an animal or zoo object in the main method is done on multiple lines. Your manager has requested you to change this by using parameterized constructors. To do this, add the following constructors to the "Zoo" and "Animal" classes:

```java
public Animal(String family, String name, int age, boolean isMammal) {
    this.family = family;
    this.name = name;
    this.age = age;
    this.isMammal = isMammal;
}

public Zoo(String name, String city, int nbrCages) {
    animals = new Animal[nbrCages];
    this.name = name;
    this.city = city;
    this.nbrCages = nbrCages;
}
```

## Main Method

### Instruction 7

Resolve the previous issue and create animals using the parameterized constructor.

### Instruction 8

Create the "displayZoo()" method in the "Zoo" class to display the values of a zoo's attributes (name, city, and nbrCages), and invoke it in the "main" method for the zoo you created. After displaying the information using this method, try to directly print the zoo using these two instructions:

```java
System.out.println(myZoo);
System.out.println(myZoo.toString());
```

Take note of any observations.

### Instruction 9

Ensure that the information is displayed correctly with these two instructions. Once resolved, do the same for the "Animal" class.

### Instruction 10

Create the "boolean addAnimal(Animal animal)" method in the "Zoo" class, which allows you to add an animal to the "animals" array and returns true if the addition is successful. Keep track of the number of animals. Test the method in the main class by adding more animals than there is space in the zoo (invoke the method multiple times), and note your observations.

### Instruction 11

Add a method in the "Zoo" class that displays the animals in a zoo and use it in the main class. Add an "int searchAnimal(Animal animal)" method that searches for an animal by its name in the zoo and returns the index of the animal if found; otherwise, return "-1". In the main class, add an animal to a zoo and test the search method by looking for it. What does the method return? Now, create another identical animal and search for it in the zoo. What do you notice?

### Instruction 12

Resolve the issue from the previous instruction and retest the search functionality. Implement the following conditions:

- Allow adding an animal only once (an animal is unique) to a zoo.
- Restrict exceeding the maximum number of animals in a zoo.

### Instruction 13

Create the "boolean removeAnimal(Animal animal)" method in the "Zoo" class, which allows you to remove an animal and returns the success of the removal.

Make sure to apply these changes to meet the conditions mentioned above:

- Add an animal only once to a zoo.
- Restrict exceeding the maximum number of animals in a zoo.

