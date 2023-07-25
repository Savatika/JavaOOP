public class Animal0 extends Animal{
    private int eyesCount;

    public Animal0(String name, int age, String vaccination, String color, String species, Owner owner,
            int legsCount, int eyesCount) {
        super(name, age, vaccination, color, species, owner, legsCount);
        this.eyesCount = eyesCount;
    }

    public Animal0() {
        this(null,0, null, null, null, null, 0, 0);
    }

    // @Override
    // public String toString() {
        
    //     return"I'm Animal0";
    // }

    public int getEyesCount() {
        return eyesCount;
    }
    
}
