package application;

import entities.Employee;
import services.SalaryAdjuster;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int quantity = sc.nextInt();

        for (int i = 0; i < quantity; i++) {
            System.out.println("Employee #" + (i + 1) + ":");

            long id;

            while (true) {
                System.out.print("Id: ");
                long idInput = sc.nextLong();
                sc.nextLine();

                boolean idExists = employees.stream()
                        .anyMatch(emp -> emp.getId() == idInput);

                if (idExists) {
                    System.out.println("Id already exists. Try again.");
                } else {
                    id = idInput;
                    break;
                }
            }

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            BigDecimal salary = BigDecimal.valueOf(sc.nextDouble());
            employees.add(new Employee(id, name, salary));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        long id;

        while (true) {
            long idInput = sc.nextLong();

            boolean idExists = employees.stream().anyMatch(emp -> emp.getId() == idInput);

            if (idExists) {
                System.out.println("Id doesnt exists. Try again.");
            } else {
                id = idInput;
                break;
            }
        }

        System.out.print("Enter the percentage: ");
        BigDecimal percentage = sc.nextBigDecimal();

        Employee emp = employees.stream()
                .filter(x -> x.getId() == id)
                .findFirst().orElse(null);


        SalaryAdjuster.applyIncrease(emp, percentage);

        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }
}
