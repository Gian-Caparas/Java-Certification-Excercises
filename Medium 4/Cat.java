public class Cat extends Animal implements Soundable {

    public Cat(String name, int age){
        super(name, age);
    }

    @Override
    public String makeSound(){
        return "Meow";
    }

    @Override
    public void eat(){
        System.out.println("Cat is eating");
    }
}