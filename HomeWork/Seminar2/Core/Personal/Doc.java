package HomeWork.Seminar2.Core.Personal;
import HomeWork.Seminar2.Core.Clients.Animal;
import HomeWork.Seminar2.Core.Clients.Animals;

public class Doc extends MedikalWorker implements Operation {

    private String specialization;


    public Doc(String name, Integer age, String gender, String specialization) {
        super(name, age, gender);
        this.specialization = specialization;
    }


@Override
public String toString() {

    return CLASS_NAME + ":" + " name " + name + " age " + age + " gender " + gender + " spec " + specialization;
}

String getName() {
    return this.name;
}

@Override
public void Operation(Animal who) {
    System.out.println("Доктор " + Doc.this.getName() + " оперировал " + who.getName());
}



}
