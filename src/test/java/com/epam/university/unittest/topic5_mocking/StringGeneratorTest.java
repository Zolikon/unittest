package com.epam.university.unittest.topic5_mocking;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringGeneratorTest {

    private StringGenerator underTest = new StringGenerator();

    @Test
    public void test_CreateString_WithValidLength() {
        //Given

        //When
        String result = underTest.createString(10);
        //Then
        assertEquals("generated string length", 10, result.length());
        for (char character : result.toCharArray()) {
            assertTrue(isLowerLetter(character));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_CreateString_WithNegativeLength() {
        //Given

        //When
        underTest.createString(-1);
        //Then
        // exception is thrown
    }

    /**
     * Checks like this can be excluded to methods, makes it easier to read
     */
    private boolean isLowerLetter(char character) {
        return character >= 'a' && character <= 'z';
    }

}