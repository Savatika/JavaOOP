package HomeWork.Seminar2.Core.Clients.home.impl;


import java.time.LocalDate;

import HomeWork.Seminar3.Core.Clients.home.Pet;
import HomeWork.Seminar3.Core.Clients.owners.Owner;

/**
 Одна из реализаций домашнего животного
 */
public class Cat extends Pet {
    public Cat() {
    }

    public Cat(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }
}
