package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuadraticEquationSolvingTest {
    @Test
    public void testDiscriminant() {
        assertEquals(1.0, QuadraticEquationSolving.discriminant(1, -5, 6), 0.0001);
        assertEquals(0.0, QuadraticEquationSolving.discriminant(1, 2, 1), 0.0001);
        assertEquals(-8.0, QuadraticEquationSolving.discriminant(1, 2, 3), 0.0001);
    }

    @Test
    public void testTwoRoots(){
        double[] expected = {3.0, 2.0}; //ожидаемые корни
        double[] actual = QuadraticEquationSolving.calculation(1,-5,6); //актуальные корни
        assertArrayEquals(expected, actual, 0.0001);
    }

    @Test
    public void testOneRoot(){
        double[] expected = {-1.0};
        double[] actual = QuadraticEquationSolving.calculation(1, 2, 1);
        assertArrayEquals(expected, actual, 0.0001);
    }

    @Test
    public void testNoRoots(){
        double[] expected = {};
        double[] actual = QuadraticEquationSolving.calculation(1, 2, 3);
    }
}

