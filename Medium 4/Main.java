public class Main {
    public static void main(String[] args){
        Animal[] animals = {
            new Dog("Buddy" , 3),
            new Cat("Ming", 2),
            new Parrot("Kiwi", 2)
        };

        for(Animal a: animals){
            System.out.println("\nName: " + a.getName());
            a.eat();
        
            if(a instanceof Soundable){
                System.out.println("Sound: " + ((Soundable)a).makeSound());
            }

            if(a instanceof Trainable){
                Trainable t = (Trainable) a;
                t.learnTrick("Roll");
                t.learnTrick("Jump");

                System.out.println("Tricks: " + t.showTricks());
            }
        }
    }
}
