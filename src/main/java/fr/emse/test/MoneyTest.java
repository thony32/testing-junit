package fr.emse.test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MoneyTest {
    private Money m12CHF;
    private Money m14CHF;

    @Before
    public void setUp() {
        m12CHF = new Money(12, "CHF");
        m14CHF = new Money(14, "CHF");
    }

    @Test
    public void testSimpleAdd() {
        Money expected = new Money(26, "CHF");
        Money result = m12CHF.add(m14CHF);
        assertEquals(expected, result);
    }

    @Test
    public void testEquals() {
        assertTrue("Les objets monétaires ayant le même montant et la même monnaie doivent être égaux",
                m12CHF.equals(new Money(12, "CHF")));
        assertFalse("Les objets monétaires dont les montants sont différents ne doivent pas être égaux",
                m12CHF.equals(m14CHF));
    }
}
