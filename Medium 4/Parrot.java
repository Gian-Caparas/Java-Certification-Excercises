import java.util.ArrayList;
import java.util.List;

public class Parrot extends Animal implements Soundable, Trainable{
    private List<String>tricks;

    public Parrot(String name, int age){
        super(name, age);
        this.tricks = new ArrayList<>();
    }

    @Override
    public String makeSound(){
        if(tricks.isEmpty()){
            return "Squawk";
        }
        return tricks.get(tricks.size() - 1); // last trick
    }

    @Override
    public void learnTrick(String trick){
        tricks.add(trick);
    }

    @Override
    public String showTricks(){
        return String.join("," , tricks);
    }

    @Override
    public void eat(){
        System.out.println("Parrot is eating");
    }
}