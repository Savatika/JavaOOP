import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Agat", 5, "Yes", "Silver", "Dog", new Owner("Dina"), 4);
        System.out.println(animal);
        animal.setAge(8);
        System.out.println(animal.getAge());
        Animal wild = new Animal("Black", "Cat", 4);
        System.out.println(wild.getColor());
        // animal.foo();
        Animal0 animal0 = new Animal0(null, 0, null, null, null, null, 0, 2);
        System.out.println(animal0.getEyesCount());
        System.out.println(animal0);

        Animal cat = new Animal0();
        
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog(null, null, 0));
        animals.add(new Cat(null, null, 0));
        animals.add(cat);
        animals.add(animal);

        System.out.println(animals);

        // for (Animal item : animals) {
        //     if (item instanceof Animal0){
        //         System.out.println(((Animal0)item).getEyesCount());
        //     }
        //     if(item instanceof Cat){
        //         ((Cat)item).FindFood(3);
        //         ((Cat)item).FindFood();
        //     }
        // }
        Cat barsik = new Cat("YElou", null, 0);
        barsik.Hunt(6);
    }
}
