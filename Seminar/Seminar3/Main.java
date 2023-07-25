// package Seminar.Seminar3;

// import java.time.LocalDate;
// import java.util.ArrayList;
// import java.util.List;

// import HomeWork.Seminar3.Core.VetClinic;
// import HomeWork.Seminar3.Core.Clients.Animal;
// import HomeWork.Seminar3.Core.Clients.home.impl.Dog;
// import HomeWork.Seminar3.Core.Clients.home.impl.Rat;
// import HomeWork.Seminar3.Core.Clients.owners.Owner;
// import HomeWork.Seminar3.Core.Clients.wild.impl.Duck;
// import HomeWork.Seminar3.Core.Clients.wild.impl.WildCat;
// import HomeWork.Seminar3.Core.Personal.Doc;
// import HomeWork.Seminar3.Core.Personal.Nurse;

// /**
//  Небольшая шпаргалка по синтаксису java:

//  1) Названия классов в java - существительные с большой буквы верблюжьей нотацией: CamelCase;
//  2) названия методов - отглагольные, с маленькой буквы, верблюжьей нотацией: getUserById;
//  3) Названия переменных - существительные с маленькой буквы, верблюжьей нотацией: maxCount;
//  4) названия пакетов в java существительные, всегда с маленькой буквы и в одно слово;
//  -! Если логика классов внутри пакета не позволяет назвать все в одно существительное, надо вложить один пакет в другой.
//  */
// public class Main {
//     public static void main(String[] args) {
//         Dog dog =
//                 new Dog(2, "Butcher", 4, LocalDate.of(2022, 4,13), new Owner("Ivanov Ivan"));

//         //homeCat.hunt();
//         //wildCat.hunt();
//         Doc doctor1 = new Doc("Dima", 32, "male", "hirurg");
//         doctor1.Operation(dog);
//         Nurse nurse1 = new Nurse("Anna", 33, "female", "first");
//         // nurse1.TakingTests(dog);
//         Duck duck1 = new Duck(002, 2, LocalDate.of(2023, 7, 16), null);
//         Rat rat = new Rat(2, "Larisa", 4, null, null);

//         System.out.println("--------------------------------");

//         dog.sound();
//         duck1.fly();
//         duck1.run();
//         rat.run();
//         List<Animal> list1 = new ArrayList<>();
//         list1.add(dog);
//         list1.add(rat);
//         list1.add(duck1);

//         System.out.println("--------------------------------");

//     }
// }

