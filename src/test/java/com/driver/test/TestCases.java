package com.driver.test;

import com.driver.A;
import com.driver.B;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCases {

    @Test
    public void testMethodOverriding() {
        A obj = new B();
        assertEquals("Method is overridden in Extended class B", obj.meth());
    }
}
