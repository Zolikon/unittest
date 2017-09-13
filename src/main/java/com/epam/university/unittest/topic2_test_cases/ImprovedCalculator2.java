package com.epam.university.unittest.topic2_test_cases;

public class ImprovedCalculator2 {

    /**
     * What should we do with this field?
     */
    private final long baseValue;

    public ImprovedCalculator2(int baseValue) {
        this.baseValue = baseValue;
    }

    public long add(int value) {
        return baseValue + value;
    }
}
