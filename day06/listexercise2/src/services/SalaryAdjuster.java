package services;

import entities.Employee;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SalaryAdjuster {
    public static void applyIncrease(Employee employee, BigDecimal percentage) {
        BigDecimal currentSalary = employee.getSalary();
        BigDecimal increase = currentSalary
                .multiply(percentage)
                .divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);

        employee.setSalary(currentSalary.add(increase));
    }
}
