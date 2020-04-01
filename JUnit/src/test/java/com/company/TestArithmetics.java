package com.company;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;


public class TestArithmetics {
    private static Arithmetics a;

    @Rule
    public final ExpectedException exp = ExpectedException.none();

    public Timeout timeout = new Timeout(1000);

    @BeforeClass
    public static void runT() {
        a = new Arithmetics();
    }
    @Ignore
    @Test
    public void testAdd() {
        double res = a.add(3, 7);
        Assert.assertEquals(10.0, res, 0.0);
    }

    @Test
    public void testMult() {
        double res = a.mult(3, 7);
        Assert.assertEquals(21.0, res, 0.0);
    }

    @Test
    public void testDeduct() {
        double res = a.deduct(3, 7);
        Assert.assertEquals(-4.0, res, 0.0);
    }

    @Test
    public void testDiv() {
        Arithmetics a = new Arithmetics();
        double res = a.div(10, 5);
        Assert.assertEquals(2.0, res, 0.0);
    }

    //@Test(expected = Exception.class)
    @Test
    public void testDivException () {
        exp.expect(ArithmeticException.class);
        a.div(10.0, 0.0);

    }

    //@Test(timeout = 1000)
    @Test
    public void testN() {

    }



}