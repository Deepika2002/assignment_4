package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OEPTest {

    @Test
    public void testOdd() {
        OEP oep = new OEP();
        assertEquals("ODD", oep.play(9));
    }

    @Test
    public void testEven() {
        OEP oep = new OEP();
        assertEquals("EVEN", oep.play(4));
    }

    @Test
    public void testPrime() {
        OEP oep = new OEP();
        assertEquals("PRIME", oep.play(3)); // 3 is both ODD and PRIME, but per requirement, PRIME takes precedence.
    }
}



    

