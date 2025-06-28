package application;


import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BusinessAccount account = new BusinessAccount();
        account.loan(BigDecimal.valueOf(1000));
        // Eu usei bastante BigDecimal, estou me adaptando e vendo onde usar

        Account bacc1 = new BusinessAccount(1001,
                "Alex", BigDecimal.valueOf(0.0), BigDecimal.valueOf(500));

        if (bacc1 instanceof SavingsAccount) {
            SavingsAccount bacc2 = (SavingsAccount) bacc1;
            System.out.println("Sou um SavingsAccount!");
        }

        if (bacc1 instanceof  BusinessAccount) {
            BusinessAccount bacc2 = (BusinessAccount) bacc1;
            System.out.println("Sou um BusinessAccount");
        }

    }
}