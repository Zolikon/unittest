package com.epam.university.unittest.topic2_test_cases;

public class ImprovedCalculator {

    public int inc(int a) {
        checkArgument(a);
        return a++;
    }

    /**
     * How should we test this?
     * @param a
     */
    private void checkArgument(int a){
        if(a>Integer.MAX_VALUE-1){
            throw new IllegalArgumentException("number is too high");
        }
    }

}
