package com.epam.university.unittest.topic5_mocking;

public class RandomReverser {

    private StringGenerator stringGenerator;

    public RandomReverser(StringGenerator stringGenerator) {
        this.stringGenerator = stringGenerator;
    }

    public String reverse(int length) {
        String reverse = stringGenerator.createString(length);
        return new StringBuilder(reverse).reverse().toString();
    }

}
