package org.zhavoronkov;

import org.junit.jupiter.api.Test;
import org.zhavoronkov.traingle.Calculation;
import org.zhavoronkov.traingle.MyException;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Unit test for simple App.
 */
public class TriangleTest {

    @Test
    void TriangleOKTest() throws MyException {
        Calculation calculation = new Calculation();
        assertEquals(50, calculation.formula(10, 10));
    }

    @Test
    void TriangleNotOKTest() throws MyException {
        Calculation calculation = new Calculation();
        assertEquals(75, calculation.formula(10, 15), "Не 75");
    }

    @Test
    void TriangleNullSideTest() throws MyException {
        Calculation calculation = new Calculation();
        assertEquals(0, calculation.formula(10, 0), "Не 0");
    }
}
