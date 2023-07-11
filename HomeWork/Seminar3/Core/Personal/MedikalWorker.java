package HomeWork.Seminar3.Core.Personal;

public abstract class MedikalWorker {
    protected final String CLASS_NAME = "The " + getClass().getSimpleName();


    protected String name;
    protected Integer age;
    protected String gender;
    
    public MedikalWorker(String name, Integer age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
