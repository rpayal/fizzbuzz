package com.co4gsl.service;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rpayal on 17/08/2016.
 */
public class FizzBuzzServiceImpl implements FizzBuzzService {

    @Override
    public String getResult(int number) {
        if (number % 15 == 0)
            return FizzBuzzService.MULTIPLE_OF_3_AND_5_RESULT;
        if (number % 3 == 0)
            return FizzBuzzService.MULTIPLE_OF_3_RESULT;
        if (number % 5 == 0)
            return FizzBuzzService.MULTIPLE_OF_5_RESULT;

        return number + "";
    }

    @Override
    public String getResultForRange(int from, int to) {
        return null;
    }
}
