package HomeWork.Seminar2.Core.Clients.home.impl;

import java.time.LocalDate;

import HomeWork.Seminar3.Core.Clients.Runnable;
import HomeWork.Seminar3.Core.Clients.home.Pet;
import HomeWork.Seminar3.Core.Clients.owners.Owner;

public class Rat extends Pet implements Runnable{
    public Rat(){

    }

    public Rat(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner){
        super(id, name, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int run(){
        System.out.println(CLASS_NAME+" скорость бега: 4 км/ч");
        return 12;
    }
}
