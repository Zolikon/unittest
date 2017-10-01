package com.epam.university.unittest.topic5_mocking;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * mock testing
 * remember we need to mock out external dependencies(except core java)
 */
public class RandomReverserTest {

    private RandomReverser underTest;

    private StringGenerator stringGeneratorMock;

    @Before
    public void setup() {
        stringGeneratorMock = mock(StringGenerator.class);
        underTest = new RandomReverser(stringGeneratorMock);
    }

    @Test
    public void test_Reverse() {
        //Given
        when(stringGeneratorMock.createString(10)).thenReturn("abcde");
        //When
        String result = underTest.reverse(10);
        //Then
        assertEquals("edcba", result);
        // we can also verify begavior, but do this only if it's critical behavior
        verify(stringGeneratorMock,times(1)).createString(10);
    }

    @Test
    public void test_Reverse_WithZeroLength() {
        //Given
        // example for mock accepting any ints, bad practice, try to be specific
        when(stringGeneratorMock.createString(anyInt())).thenReturn("");
        //When
        String result = underTest.reverse(0);
        //Then
        assertEquals("", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Reverse_WithNegativeLength() {
        //Given
        when(stringGeneratorMock.createString(-1)).thenThrow(new IllegalArgumentException());
        //When
        underTest.reverse(-1);
        //Then
        // excpetion is thrown
    }

}