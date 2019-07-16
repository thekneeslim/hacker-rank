package com.experiment;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PlusMinusTest {

    @Test
    public void shouldReturnResults() {
        List<Integer> integers = Arrays.asList(-4, 3, -9, 0, 4, 1);
        PlusMinus plusMinus = new PlusMinus();
        assertEquals(Arrays.asList("0.500000", "0.333333", "0.166667"), plusMinus.execute(integers));
    }
}