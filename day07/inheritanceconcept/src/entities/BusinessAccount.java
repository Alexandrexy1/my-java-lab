package entities;

import java.math.BigDecimal;

public class BusinessAccount extends Account {
    private BigDecimal loanLimit;

    public BusinessAccount() {
        super();
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
            balance.add(amount.subtract(BigDecimal.valueOf(10)));
        }
    }

    @Override
    public String toString() {
        return "BusinessAccount{" +
                "loanLimit=" + loanLimit +
                ", balance=" + balance +
                '}';
    }
}
