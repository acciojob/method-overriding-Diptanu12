package com.driver.test;

import com.driver.B;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCases {
    @Test
    public void testMeth() {
        B obj = new B();
        String result = obj.meth();
        assertEquals("Method is overridden in Extended class B", result);
    }
}
