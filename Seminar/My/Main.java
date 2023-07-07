package Seminar.My;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Max", 32, "Yes", "Silver", "Mammal", "Vasa", 2);
        Animal animal1 = new Animal("Black",  "Dog", 4); 
        System.out.println(animal.getAge());
        animal.setAge(2);
        System.out.println(animal.getAge());
        System.out.println(animal);
    
        AnimalNew animalNew = new AnimalNew(null, null, null, null, null, null, null);
        animalNew.getAge();
        System.out.println(animalNew);
    }
}
