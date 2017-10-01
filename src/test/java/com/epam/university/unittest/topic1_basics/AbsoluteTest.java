package com.epam.university.unittest.topic1_basics;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test goes into test/java folder in the same package as the tested class
 * <p>
 * Test class name should be tested class name + 'Test'
 */
public class AbsoluteTest {

    private Absolute underTest = new Absolute();

    /**
     * Test naming should follow some convention, should indicate what we are testing.
     */
    @Test
    public void testAbsWithPositiveNumber() {
        //Given
        //When
        int result = underTest.abs(1);
        //Then
        Assert.assertEquals("absolute value", 1, result);
    }

    @Test
    public void testAbsWithNegativeNumber() {
        //Given
        //When
        int result = underTest.abs(-1);
        //Then
        /**
         * it's a good practice to give assertion messages, in case of fail
         * Especially if there are more assertions in one test
         */
        Assert.assertEquals("absolute value", 1, result);
    }

}