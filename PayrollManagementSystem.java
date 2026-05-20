// PayrollManagementSystem.java

import java.util.ArrayList;
import java.util.Scanner;

public class PayrollManagementSystem {

    static ArrayList<Employee> employeeList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n===== PAYROLL MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Full-Time Employee");
            System.out.println("2. Add Part-Time Employee");
            System.out.println("3. Display Employees");
            System.out.println("4. Show Salaries");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    addFullTimeEmployee();
                    break;

                case 2:
                    addPartTimeEmployee();
                    break;

                case 3:
                    displayEmployees();
                    break;

                case 4:
                    showSalaries();
                    break;

                case 5:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);
    }

    static void addFullTimeEmployee() {

        System.out.print("Enter ID: ");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Base Salary: ");
        double baseSalary = scanner.nextDouble();

        System.out.print("Enter Bonus: ");
        double bonus = scanner.nextDouble();

        System.out.print("Enter Allowance: ");
        double allowance = scanner.nextDouble();

        FullTimeEmployee emp = new FullTimeEmployee(
                id,
                name,
                baseSalary,
                bonus,
                allowance
        );

        employeeList.add(emp);

        System.out.println("Full-Time Employee Added.");
    }

    static void addPartTimeEmployee() {

        System.out.print("Enter ID: ");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Base Salary: ");
        double baseSalary = scanner.nextDouble();

        System.out.print("Enter Hours Worked: ");
        int hours = scanner.nextInt();

        System.out.print("Enter Hourly Rate: ");
        double rate = scanner.nextDouble();

        PartTimeEmployee emp = new PartTimeEmployee(
                id,
                name,
                baseSalary,
                hours,
                rate
        );

        employeeList.add(emp);

        System.out.println("Part-Time Employee Added.");
    }

    static void displayEmployees() {

        if (employeeList.isEmpty()) {

            System.out.println("No Employees Found.");
            return;
        }

        for (Employee emp : employeeList) {
            emp.displayDetails();
        }
    }

    static void showSalaries() {

        if (employeeList.isEmpty()) {

            System.out.println("No Employees Found.");
            return;
        }

        for (Employee emp : employeeList) {

            System.out.println(
                    emp.getName() +
                    " Salary = Rs. " +
                    emp.calculateSalary()
            );
        }
    }
}