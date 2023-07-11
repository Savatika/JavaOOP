package HomeWork.Seminar3.Core.drugStore;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
        public static void main(String[] args) {
                Pharmacy pharmacy1 = new Pharmacy(1);
                Component comp1 = new Component("Penicillin", "10 mg", 10);
                Component comp2 = new Component("Spirit", "100 g", 1000);
        
                pharmacy1.addComponent(comp1).addComponent(comp2);
        
                System.out.println(pharmacy1);
        
                for (Component elem : pharmacy1) {
                    System.out.println(elem);
                }
        
                Pharmacy pharmacy2 = new Pharmacy(2);
                Component comp3 = new Component("Penicillin", "10 mg", 3);
                Component comp4 = new Component("Spirit", "100 g", 13);
                pharmacy2.addComponent(comp3).addComponent(comp4);
        
                Pharmacy pharmacy3 = new Pharmacy(3);
                Component comp5 = new Component("Penicillin", "10 mg", 12);
                Component comp6 = new Component("Spirit", "100 g", 100);
                pharmacy3.addComponent(comp5).addComponent(comp6);
        
                Pharmacy pharmacy4 = new Pharmacy(2);
                pharmacy4.addComponent(comp5).addComponent(comp6).addComponent(comp2);
        
        
                List<Pharmacy> nomenclature = new ArrayList<>();
                nomenclature.add(pharmacy3);
                nomenclature.add(pharmacy1);
                nomenclature.add(pharmacy2);
        
                
                System.out.println("----------------------------------------------------------------------------------------------");
                
                HashSet<Pharmacy> result = new HashSet<>();
        
                result.add(pharmacy1);
                result.add(pharmacy2);
                result.add(pharmacy3);
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println();
                Output(result);
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println();
                result.add(pharmacy3);
                Output(result);
                result.add(pharmacy4);
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println();
                Output(result);
        
        }
            
        public static void Output(HashSet<Pharmacy> result) {
                for(var item: result) {
                    System.out.println("id = " + item.getId() + "- " + item.getComponents());
                }
            }
        @Override
        public String toString() {
                return "Main []";
        }
            
    }
    