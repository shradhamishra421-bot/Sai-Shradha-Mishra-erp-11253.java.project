// FullTimeEmployee.java

public class FullTimeEmployee extends Employee {

    private double bonus;
    private double allowance;

    public FullTimeEmployee(int employeeId,
                            String name,
                            double baseSalary,
                            double bonus,
                            double allowance) {

        super(employeeId, name, baseSalary);

        this.bonus = bonus;
        this.allowance = allowance;
    }

    @Override
    public double calculateSalary() {

        return baseSalary + bonus + allowance;
    }

    @Override
    public void displayDetails() {

        super.displayDetails();

        System.out.println("Employee Type : Full-Time");
        System.out.println("Bonus         : Rs. " + bonus);
        System.out.println("Allowance     : Rs. " + allowance);
        System.out.println("----------------------------------");
    }
}