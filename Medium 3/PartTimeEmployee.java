import javax.naming.InsufficientResourcesException;

public class PartTimeEmployee extends Employee{
    private double hourlyRate;
    private int hoursWorked;
    private static final int MIN_HOURS = 10;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked){
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() throws InsufficientHoursException {
        if(hoursWorked < MIN_HOURS){
            throw new InsufficientHoursException("Not enough hours!", hoursWorked);
        }
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString(){
        return super.toString() + " Rate: " + hourlyRate + " Hours: " + hoursWorked;
    }
}