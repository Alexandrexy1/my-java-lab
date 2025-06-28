package entities;

import java.math.BigDecimal;

public final class SavingsAccount extends Account{
    private BigDecimal interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(int number, String holder, BigDecimal balance, BigDecimal interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance = balance.add(balance.multiply(interestRate));
    }

    @Override
    public void withdraw(BigDecimal amount) {
        balance = balance.subtract(amount);
    }
}
