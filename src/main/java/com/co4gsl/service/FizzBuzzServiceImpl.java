package com.co4gsl.service;

import org.apache.commons.lang.StringUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by rpayal on 17/08/2016.
 */
public class FizzBuzzServiceImpl implements FizzBuzzService {

    @Override
    public String getResultForRange(int from, int to) {
        List<String> result = IntStream.rangeClosed(from, to)
                .mapToObj(i -> getResult(i))
                .collect(Collectors.toList());

        result.add("\n");
        result.add(getStatistics(result));
        return StringUtils.join(result, " ");
    }

    /**
     * Return appropriate result string based on passed number
     * if multiple of 3 then {@link FizzBuzzService.MULTIPLE_OF_3_RESULT}
     * if multiple of 5 then {@link FizzBuzzService.MULTIPLE_OF_5_RESULT}
     * if multiple of 3 & 5 then {@link FizzBuzzService.MULTIPLE_OF_3_AND_5_RESULT}
     * if number contain 3 then {@link FizzBuzzService.NUMBER_CONTAINING_3_RESULT}
     * else return number
     * *
     *
     * @param number
     * @return
     */
    private String getResult(int number) {
        if (Integer.toString(number).contains("3"))
            return FizzBuzzService.NUMBER_CONTAINING_3_RESULT;
        if (number % 15 == 0)
            return FizzBuzzService.MULTIPLE_OF_3_AND_5_RESULT;
        if (number % 3 == 0)
            return FizzBuzzService.MULTIPLE_OF_3_RESULT;
        if (number % 5 == 0)
            return FizzBuzzService.MULTIPLE_OF_5_RESULT;

        return number + "";
    }

    /**
     * Return statistics
     *
     * @param result
     * @return
     */
    private String getStatistics(List<String> result) {
        StringBuilder sb = new StringBuilder();
        int fizzTotal = Collections.frequency(result, FizzBuzzService.MULTIPLE_OF_3_RESULT);
        sb.append(FizzBuzzService.MULTIPLE_OF_3_RESULT + ":" + fizzTotal + "\n");
        int buzzTotal = Collections.frequency(result, FizzBuzzService.MULTIPLE_OF_5_RESULT);
        sb.append(FizzBuzzService.MULTIPLE_OF_5_RESULT + ":" + buzzTotal + "\n");
        int fizzbuzzTotal = Collections.frequency(result, FizzBuzzService.MULTIPLE_OF_3_AND_5_RESULT);
        sb.append(FizzBuzzService.MULTIPLE_OF_3_AND_5_RESULT + ":" + fizzbuzzTotal + "\n");
        int luckTotal = Collections.frequency(result, FizzBuzzService.NUMBER_CONTAINING_3_RESULT);
        sb.append(FizzBuzzService.NUMBER_CONTAINING_3_RESULT + ":" + luckTotal + "\n");

        sb.append("integer" + ":" + (result.size() - (fizzTotal + buzzTotal + fizzbuzzTotal + luckTotal) - 1) + "\n");
        return sb.toString();
    }

}
