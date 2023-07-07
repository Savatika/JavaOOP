package HomeWork.Seminar2.Core.Clients.home.impl;

import java.time.LocalDate;

import HomeWork.Seminar2.Core.Clients.Animals;
import HomeWork.Seminar2.Core.Clients.Runnable;
import HomeWork.Seminar2.Core.Clients.Soundable;
import HomeWork.Seminar2.Core.Clients.home.Pet;
import HomeWork.Seminar2.Core.Clients.owners.Owner;

/**
 Одна из реализаций домашнего животного
 */
public class Dog extends Pet implements Soundable, Runnable {
    public Animals getName;

    public Dog() {
    }

    public Dog(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int sound(){
        System.out.println(CLASS_NAME + " гавкает с громкостью: 30 дБ");
        return 30;
    } 
    
    @Override
    public int run() {
        System.out.println(CLASS_NAME + " бегает со скоростью: 20 км/ч");
        return 20;
    }
}

