package com.co4gsl.service;

import java.util.List;

/**
 * Created by rpayal on 17/08/2016.
 */
public interface FizzBuzzService {
    static final String MULTIPLE_OF_3_RESULT = "fizz";
    static final String MULTIPLE_OF_5_RESULT = "buzz";
    static final String MULTIPLE_OF_3_AND_5_RESULT = "fizzbuzz";
    static final String NUMBER_CONTIN_3_RESULT = "lucky";

    /**
     * Return list of string for range of integers.
     * @param from
     * @param to
     * @return
     */
    String getResultForRange(int from, int to);
}
