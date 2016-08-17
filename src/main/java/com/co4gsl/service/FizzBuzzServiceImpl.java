package com.co4gsl.service;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rpayal on 17/08/2016.
 */
public class FizzBuzzServiceImpl implements FizzBuzzService {

    @Override
    public String getResultForRange(int from, int to) {
        List<String> result = new ArrayList<String>();
        for (int i = from; i <= to; i++) {
            result.add(getResult(i));
        }
        return StringUtils.join(result, " ");
    }

    /**
     * Return corresponding result for a passed number.
     *
     * @param number
     * @return
     */
    private String getResult(int number) {
        if (Integer.toString(number).contains("3"))
            return FizzBuzzService.NUMBER_CONTIN_3_RESULT;
        if (number % 15 == 0)
            return FizzBuzzService.MULTIPLE_OF_3_AND_5_RESULT;
        if (number % 3 == 0)
            return FizzBuzzService.MULTIPLE_OF_3_RESULT;
        if (number % 5 == 0)
            return FizzBuzzService.MULTIPLE_OF_5_RESULT;

        return number + "";
    }
}
