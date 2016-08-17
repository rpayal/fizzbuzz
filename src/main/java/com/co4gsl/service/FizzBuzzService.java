package com.co4gsl.service;

import java.util.List;

/**
 * Created by rpayal on 17/08/2016.
 */
public interface FizzBuzzService {
    static final String MULTIPLE_OF_3_RESULT = "fizz";
    static final String MULTIPLE_OF_5_RESULT = "buzz";
    static final String MULTIPLE_OF_3_AND_5_RESULT = "fizzbuzz";

    /**
     * Return string result for passed integer.
     *
     * @param i
     * @return
     */
    String getResult(int i);
}
