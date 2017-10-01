package com.epam.university.unittest.topic2_test_cases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ImprovedCalculatorTest {

    private ImprovedCalculator underTest = new ImprovedCalculator();

    @Test
    public void testInc() {
        //Given
        //When
        int result = underTest.inc(10);
        //Then
        assertEquals("inc value", 11, result);
    }

    /**
     * Testing for exception if we want to check type only
     */
    @Test(expected = IllegalArgumentException.class)
    public void testIncWithInvalidInput(){
        //Given
        //When
        underTest.inc(Integer.MAX_VALUE);
        //Then
        /**
         * No assertion after exception is thrown
         */

    }

}