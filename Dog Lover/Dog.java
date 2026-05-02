public class Dog{
    private String breed;
    private char gender;
    private String color;

    public Dog(char gender, String color){
        this.gender = gender;
        this.color = color;
        this.breed = "Golden Retriever";
    }
    //GETTER METHODS

    public String getBreed(){return  breed;}
    public char getGender(){return gender;}
    public String getColor(){return color;}

    //SETTER METHODS
    public void setGender(char gender){this.gender = gender;}
    public void setColor(String color){this.color = color;}

    public void bark(int n){
        for(int i=0; i<n; i++){
            System.out.println("Woof!");
        }
    }

    public String toString(){
        if(Character.toLowerCase(gender) == 'm'){
            return "My male, " + color + " "  + breed;
        }else{
            return "My female, " + color + " " + breed;
        }
    }
}