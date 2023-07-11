package HomeWork.Seminar3.Core.Personal;

public class Nurse extends MedikalWorker{

    private String category;

    public Nurse(String name, Integer age, String gender, String category) {
        super(name, age, gender);
        this.category = category;
    }
    
    public String toString() {

        return CLASS_NAME + ":" + " name " + name + " age " + age + " gender " + gender + " category " + category;
    }
    
}
