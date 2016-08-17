package com.co4gsl.service;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by rpayal on 17/08/2016.
 */
public class FizzBuzzServiceImplTest {
    private FizzBuzzService fizzBuzzService;

    @Before
    public void setup() {
        fizzBuzzService = new FizzBuzzServiceImpl();
    }

    @Test
    public void testResultForRange() {
        String result = fizzBuzzService.getResultForRange(1, 20);
        String expectedResult = "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz";
        assertEquals(expectedResult, result);
    }

    @Test
    public void testMultiplesOf3PrintFizz() {
        String result = fizzBuzzService.getResult(3);
        assertEquals(FizzBuzzService.MULTIPLE_OF_3_RESULT, result);
    }

    @Test
    public void testMultiplesOf5PrintBuzz() {
        String result = fizzBuzzService.getResult(25);
        assertEquals(FizzBuzzService.MULTIPLE_OF_5_RESULT, result);
    }

    @Test
    public void testMultiplesOf3and5PrintFizzBuzz() {
        String result = fizzBuzzService.getResult(15);
        assertEquals(FizzBuzzService.MULTIPLE_OF_3_AND_5_RESULT, result);
    }

    @Test
    public void testNotMultiplesOf3and5PrintNumber() {
        String number = "14";
        String result = fizzBuzzService.getResult(Integer.parseInt(number));
        assertEquals(number, result);
    }
}
