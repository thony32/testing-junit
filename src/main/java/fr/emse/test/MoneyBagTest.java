package fr.emse.test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MoneyBagTest {
    private Money f12CHF;
    private Money f7USD;
    private MoneyBag fMB1;
    private MoneyBag fMB2;

    @Before
    public void setUp() {
        f12CHF = new Money(12, "CHF");
        f7USD = new Money(7, "USD");
        fMB1 = new MoneyBag(f12CHF, f7USD);
        Money f14CHF = new Money(14, "CHF");
        Money f21USD = new Money(21, "USD");
        fMB2 = new MoneyBag(f14CHF, f21USD);
    }

    @Test
    public void testBagEquals() {
        assertFalse("Different MoneyBags should not be equal", fMB1.equals(fMB2));
        assertEquals("Un MoneyBag doit être égal à lui-même", fMB1, fMB1);
    }
}
