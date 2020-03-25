package ua.training;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestModel {
    @Test
    public void testRand() {
        Model model = new Model();
        int min = 1;
        int max = 99;
        for (int i = 0; i < 1000000; i++){
            System.out.println(model.rand(min, max));
            assertTrue(model.rand(min, max) >= min && model.rand(min, max) <= max);
        }
    }

}
