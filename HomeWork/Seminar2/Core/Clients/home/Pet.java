package HomeWork.Seminar2.Core.Clients.home;


import java.time.LocalDate;

import HomeWork.Seminar2.Core.Clients.Animal;
import HomeWork.Seminar2.Core.Clients.Animals;
import HomeWork.Seminar2.Core.Clients.owners.Owner;

/**
 Абстракция домашнего животного
 */
public class Pet extends Animal implements Animals {
    public Pet() {
    }

    public Pet(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }
}
