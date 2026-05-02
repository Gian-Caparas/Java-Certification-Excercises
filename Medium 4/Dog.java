import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal implements Soundable, Trainable{
    private List<String> tricks;

    public Dog(String name, int age){
        super(name, age);
        this.tricks = new ArrayList<>();
    }

    @Override
    public String makeSound(){
        return "Woof!";
    }
    @Override
    public void learnTrick(String trick){
        tricks.add(trick);
    }
    @Override
    public String showTricks(){
        return String.join(",", tricks);
    }
    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }

}
