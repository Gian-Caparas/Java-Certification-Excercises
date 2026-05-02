public class Main {
    public static void main(String[] args) {

        // Create employees
        Employee[] employees = {
            new FullTimeEmployee("Gian", 1, 30000),
            new PartTimeEmployee("Alex", 2, 100, 12), // valid
            new PartTimeEmployee("Mark", 3, 100, 5)   // ❌ will throw exception
        };

        // Loop through all employees
        for (Employee emp : employees) {
            System.out.println("\nEmployee: " + emp);

            try {
                double salary = emp.calculateSalary();
                System.out.println("Salary: " + salary);
            } catch (InsufficientHoursException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        //BASIC UNDERSTANDING: SINCE CALCULATE SALARY HAS EXCEPTION: 
        // Employee emp1 = new FullTimeEmployee("Anna", 1, 45000);
        // try{
        //     System.out.println("Salary: " + emp1.calculateSalary());
        // }catch(InsufficientHoursException e){
        //     System.out.println("Error: " + e.getMessage());
        // }
    }
}