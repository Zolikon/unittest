package com.epam.university.unittest.topic3_assertions;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StringUtils {

    public String add(String a, String b) {
        return a + b;
    }

    public String randomString(int length, String base) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(base);
        for (int i = 0; i < length; i++) {
            char letter = (char) ('a' + random.nextInt(26));
            stringBuilder.append(letter);
        }
        return stringBuilder.toString();
    }

    public List<String> convert(List<Integer> list){
        return list.stream().map(String::valueOf).collect(Collectors.toList());
    }

}
