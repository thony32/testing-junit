package fr.emse.test;

public class Money {
    private int fAmount;
    private String fCurrency;

    public Money(int amount, String currency) {
        this.fAmount = amount;
        this.fCurrency = currency;
    }

    public int amount() {
        return fAmount;
    }

    public String currency() {
        return fCurrency;
    }

    public Money add(Money m) {
        if (!fCurrency.equals(m.fCurrency)) {
            throw new IllegalArgumentException("Currencies do not match");
        }
        return new Money(fAmount + m.fAmount, fCurrency);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Money) {
            Money other = (Money) obj;
            return fAmount == other.fAmount && fCurrency.equals(other.fCurrency);
        }
        return false;
    }
}
