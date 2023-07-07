package HomeWork.Seminar2.Core.Clients.wild.impl;


import java.time.LocalDate;

import HomeWork.Seminar2.Core.Clients.Runnable;
import HomeWork.Seminar2.Core.Clients.owners.Owner;
import HomeWork.Seminar2.Core.Clients.wild.WildAnimal;

/**
 Одна из реализаций дикого животного
 */
public class WildCat extends WildAnimal implements Runnable {
    public WildCat() {
    }

    public WildCat(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int run() {
        System.out.println("Бегает со скоростью 15 км/ч");
        return 15;
    }

}

