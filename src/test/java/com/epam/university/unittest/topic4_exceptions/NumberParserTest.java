package com.epam.university.unittest.topic4_exceptions;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.isA;

import org.junit.Test;

/**
 * exception testing
 */
public class NumberParserTest {

    private NumberParser underTest = new NumberParser();

    @Test
    public void test_ParsePositiveNumber_WithValidStringNumber(){
        //Given
        //When
        int result = underTest.parsePositiveNumber("13");
        //Then
        assertEquals("valid string parsing",13,result);
    }

    /**
     * we didn't really test which exception we get
     */
    @Test(expected = RuntimeException.class)
    public void test_ParsePositiveNumber_WithInvalidStringNumber(){
        //Given
        //When
        underTest.parsePositiveNumber("not a number");
        //Then
    }

    @Test
    public void test_ParsePositiveNumber_WithInvalidStringNumber_Improved(){
        //Given
        //When
        try{
            underTest.parsePositiveNumber("not a number");
            // without fail here the test will pass even if there is no exception
            fail("no exception is thrown");
        } catch (Exception exc){
            //Then
            assertThat(exc, instanceOf(RuntimeException.class));
            assertThat(exc.getMessage(),containsString("invalid"));
        }
    }

    @Test
    public void test_ParsePositiveNumber_WithNegativeStringNumber(){
        //Given
        //When
        try{
            underTest.parsePositiveNumber("-1");
            fail("no exception is thrown");
        } catch (Exception exc){
            //Then
            assertThat(exc, instanceOf(RuntimeException.class));
            assertThat(exc.getMessage(),containsString("negative"));
        }
    }



}