public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;
    public Animal(String family ,String name,int age,Boolean isMammal){
        this.family = family;
        this.name = name;
        this.age=age;
        this.isMammal = isMammal;

    }
    //Instruction 9 :
    @Override
    public String toString() {
        return "Animal Name: " + name + "\nFamily: " + family + "\nAge: " + age + "\nIs Mammal: " + isMammal;
    }
}
