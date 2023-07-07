package HomeWork.Seminar2.Core;

import java.util.ArrayList;
import java.util.List;

import HomeWork.Seminar2.Core.Clients.Animal;
import HomeWork.Seminar2.Core.Clients.Flyable;
import HomeWork.Seminar2.Core.Clients.Soundable;



public class VetClinic {

    public static void flyableAnimals(List<Animal> list){
        List<Animal> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Flyable) {
                newList.add(list.get(i)); 
            } 
        }
        System.out.println(newList);
    }
    public static void soundableAnimals(List<Animal> list){
        List<Animal> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Soundable) {
                newList.add(list.get(i)); 
            } 
        }
        System.out.println(newList);
    }


    public static void runnableAnimals(List<Animal> list){
        List<Animal> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Runnable) {
                newList.add(list.get(i)); 
            } 
        }
        System.out.println(newList);
    }
    
}
