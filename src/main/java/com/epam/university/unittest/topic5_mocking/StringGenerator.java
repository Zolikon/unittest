package com.epam.university.unittest.topic5_mocking;

import java.util.Random;

public class StringGenerator {

    private Random random = new Random();

    public String createString(int length) {
        if (length < 0) {
            throw new IllegalArgumentException("invalid value for length");
        }
        String result = "";
        for (int i = 0; i < length; i++) {
            result += (char) (random.nextInt(26) + 'a');
        }
        return result;
    }

}
