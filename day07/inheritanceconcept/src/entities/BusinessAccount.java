package entities;

import java.math.BigDecimal;

public final class BusinessAccount extends Account {
    private BigDecimal loanLimit;

    public BusinessAccount() {
        super();
        loanLimit = BigDecimal.ZERO;
    }

    public BusinessAccount(int number, String holder, BigDecimal balance, BigDecimal loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public BigDecimal getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(BigDecimal loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(BigDecimal amount) {
        if (loanLimit.compareTo(amount) >= 0) {
            balance = balance.add(amount.subtract(BigDecimal.valueOf(10)));
        }
    }

    @Override
    public void withdraw(BigDecimal amount) {
        super.withdraw(amount);
        balance = balance.subtract(BigDecimal.valueOf(2));
    }

    @Override
    public String toString() {
        return "BusinessAccount{" +
                "loanLimit=" + loanLimit +
                ", balance=" + balance +
                '}';
    }
}
