public class InsufficientHoursException extends Exception {

    public InsufficientHoursException(String message){
        super(message);
    }

    public InsufficientHoursException(String message, int hoursWorked){
        super(message + " Hours worked: " + hoursWorked);
    }
}