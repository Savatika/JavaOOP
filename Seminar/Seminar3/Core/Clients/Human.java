package HomeWork.Seminar2.Core.Clients;


/**
 Абстракция человека
 */
public class Human extends Animal { // todo на семинаре, в учебных целях, сделать extends Animal
    private final String fullName;

    public Human(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
