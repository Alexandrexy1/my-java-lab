package application;


import entities.Account;
import entities.BusinessAccount;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BusinessAccount account = new BusinessAccount();
        account.loan(BigDecimal.valueOf(1000));
        // Eu usei bastante BigDecimal, estou me adaptando e vendo onde usar
    }
}