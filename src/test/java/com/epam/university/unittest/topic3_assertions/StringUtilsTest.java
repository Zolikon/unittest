package com.epam.university.unittest.topic3_assertions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * Some examples for more specific assertion methods
 * I left the methods with full name intentionally, easier to follow which is in use
 */
public class StringUtilsTest {

    private StringUtils underTest;

    /**
     * setup method, runs before each test
     */
    @Before
    public void setup() {
        underTest = new StringUtils();
    }

    @Test
    public void testAdd() {
        //Given
        //When
        String result = underTest.add("a", "b");
        //Then
        org.junit.Assert.assertThat(result, equalTo("ab"));
    }

    @Test
    public void testAddRandomString() {
        //Given
        String base = "hello";
        //When
        String result = underTest.addRandomString(10, base);
        //Then
        org.junit.Assert.assertThat(result, startsWith(base));
        org.junit.Assert.assertThat(result.length(), equalTo(base.length() + 10));
    }

    /**
     * Example to how much simpler assertion can be with external library
     */
    @Test
    public void testConvert() {
        //Given
        //When
        List<String> result = underTest.convert(Arrays.asList(1, 3, 2));
        //Then
        // testing with junit
        assertTrue(result.size() == 3);
        assertEquals("1",result.get(0));
        assertEquals("3",result.get(1));
        assertEquals("2",result.get(2));

        // testing with 3rd party library(Truth)
        com.google.common.truth.Truth.assertThat(result)
            .containsExactly("1", "3", "2").inOrder();
    }

}