package com.epam.university.unittest.topic2_test_cases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    private Calculator underTest = new Calculator();

    @Test
    public void testInc() {
        //Given
        //When
        int result = underTest.inc(10);
        //Then
        assertEquals("inc value", 11, result);
    }

}