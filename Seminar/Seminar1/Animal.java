public class Animal {
    private String name;
    private int age;
    private String vaccination;
    private String color;
    private String species;
    private Owner owner;
    private int legsCount;

    public Animal(String name, int age, String vaccination, String color, String species, Owner owner, int legsCount) {
        this.name = name;
        this.age = age;
        this.vaccination = vaccination;
        this.color = color;
        this.species = species;
        this.owner = owner;
        this.legsCount = legsCount;
        
    }

    public Animal(String color, String species, int legsCount) {
        this(null, 0, null, "Black", "Kit", null, 4);
    }

    public int getAge() {
        int count = 0;
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // public static void foo(){
    //     System.out.println("I'm Foo");
    // }

    @Override
    public String toString() {
        return String.format("Animal: {name = %s; owner = %s}", name, owner);
    }

}
