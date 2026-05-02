public abstract class Employee{
    protected String name;
    protected int id;

    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary() throws InsufficientHoursException;
    public String getName(){return name;}
    public int getId(){return id;}
    public String toString(){return name + " " +  id;}
}