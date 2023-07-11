package HomeWork.Seminar3.Core.Clients.wild.impl;


import java.time.LocalDate;

import HomeWork.Seminar3.Core.Clients.Flyable;
import HomeWork.Seminar3.Core.Clients.Runnable;
import HomeWork.Seminar3.Core.Clients.owners.Owner;
import HomeWork.Seminar3.Core.Clients.wild.WildAnimal;



public class Duck extends WildAnimal implements Flyable, Runnable {
    public Duck() {
    }

    public Duck(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int fly() {
        System.out.println(CLASS_NAME + " летит со скоростью: 5 км/ч");
        return 5;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + " ходит со скоростью: 3 км/ч");
        return 3;
    }

}

