package fr.emse.test;

import java.util.Vector;

public class MoneyBag {
    private Vector<Money> fMonies = new Vector<Money>();

    public MoneyBag(Money... monies) {
        for (Money m : monies) {
            appendMoney(m);
        }
    }

    private void appendMoney(Money m) {
        for (int i = 0; i < fMonies.size(); i++) {
            Money existing = fMonies.get(i);
            if (existing.currency().equals(m.currency())) {
                fMonies.set(i, existing.add(m));
                return;
            }
        }
        fMonies.add(m);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MoneyBag) {
            MoneyBag other = (MoneyBag) obj;
            return fMonies.equals(other.fMonies); // Simplified for example purposes
        }
        return false;
    }
}
