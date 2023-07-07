package Seminar.My;

private class Animal {
    private String name;
    private Integer age;
    private String vactination;
    private String color;
    private String species;
    private String owner;
    private Integer legsCount;

    public Animal (String name, Integer age, String vactination, String color, String species, String owner, Integer legsCount){
        this.name = name;
        this.age = age;
        this.vactination = vactination;
        this.color = color;
        this.species = species;
        this.owner = owner;
        this.legsCount = legsCount;
    }

    public Animal (String color, String species, Integer legsCount){
        this(null, null, null, "White", "Cat", null, 4);
    }
    
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
    @Override    
    public String toString() {
            return String.format("Animal: {name = %s, owner = %s}", name, owner);
    }

}