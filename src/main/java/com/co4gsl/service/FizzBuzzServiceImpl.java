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
        if (number % 3 == 0)
            return FizzBuzzService.MULTIPLE_OF_3_RESULT;

        return number + "";
    }
}
