## ZooManagement (Continued)

### Instruction 35

Create the following interfaces:

- `Carnivore<T>`: Defines the method `void eatMeat(T meat)`
- `Herbivore<T>`: Defines the method `void eatPlant(T plant)`
- `Omnivore<T>`: Inherits from the two previous interfaces and defines the method `void eatPlantAndMeat(T food)`

### Instruction 36

Create the enum `Food` that defines three values (MEAT, PLANT, BOTH).

### Instruction 37

Implement the `Carnivore` interface for the `Aquatic` class, passing the `Food` enumeration as a parameter. Implement the `Omnivore` interface for the `Terrestrial` class, also passing the `Food` enumeration as a parameter. Redefine the necessary methods.

### Instruction 38

In the "main" method, create objects of type `Aquatic`, `Penguin`, and `Terrestrial`, and test the implemented methods.

