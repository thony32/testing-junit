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
        assertTrue("Money objects with the same amount and currency should be equal",
                m12CHF.equals(new Money(12, "CHF")));
        assertFalse("Money objects with different amounts should not be equal",
                m12CHF.equals(m14CHF));
    }
}
