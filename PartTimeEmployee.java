// PartTimeEmployee.java

public class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId,
                            String name,
                            double baseSalary,
                            int hoursWorked,
                            double hourlyRate) {

        super(employeeId, name, baseSalary);

        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {

        double wages = hoursWorked * hourlyRate;

        return baseSalary + wages;
    }

    @Override
    public void displayDetails() {

        super.displayDetails();

        System.out.println("Employee Type : Part-Time");
        System.out.println("Hours Worked  : " + hoursWorked);
        System.out.println("Hourly Rate   : Rs. " + hourlyRate);
        System.out.println("----------------------------------");
    }
}
