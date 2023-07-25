import java.util.Arrays;

public class Cat extends Animal {

    public Cat(String color, String species, int legsCount) {
        super(color, species, legsCount);
        //TODO Auto-generated constructor stub
    }
    
    private void FindFood(){
        System.out.println("Cat find food");
    }

    private void FindFood(Integer ... args){
        System.out.println("Cat find food, count = "+ Arrays.toString(args));
    }

    private void WakeUp(){
        System.out.println("Cat wake up!");
    }

    private void Sleep(){
        System.out.println("Cat slep!");
    }

    private void Eat(){
        System.out.println("Cat eat!");
    }

    public void Hunt(Integer ... args){
        WakeUp();
        FindFood(args);
        Eat();
        Sleep();
    }
}
 