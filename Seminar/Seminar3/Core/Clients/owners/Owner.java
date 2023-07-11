package HomeWork.Seminar2.Core.Clients.owners;

import java.util.ArrayList;
import java.util.List;

import HomeWork.Seminar3.Core.Clients.Animal;
import HomeWork.Seminar3.Core.Clients.Human;

/**
 Хозяин животного, пациента клиники
 */
public class Owner extends Human {

    private final List<Animal> pets; //питомцы, которых человек принес в клинику

    public Owner(String fullName) {
        super(fullName);
        this.pets = new ArrayList<>();
    }

    public List<Animal> getPets() {
        return pets;
    }
}

