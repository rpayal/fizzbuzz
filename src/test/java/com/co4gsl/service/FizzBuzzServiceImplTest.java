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
        String expectedResult = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz";
        assertEquals(expectedResult, result);
    }

    @Test
    public void testMultiplesOf3PrintFizz() {
        String result = fizzBuzzService.getResultForRange(6, 6);
        assertEquals(FizzBuzzService.MULTIPLE_OF_3_RESULT, result);
    }

    @Test
    public void testNumberContain3PrintLucky() {
        String result = fizzBuzzService.getResultForRange(3, 3);
        assertEquals(FizzBuzzService.NUMBER_CONTIN_3_RESULT, result);
    }

    @Test
    public void testMultiplesOf5PrintBuzz() {
        String result = fizzBuzzService.getResultForRange(25, 25);
        assertEquals(FizzBuzzService.MULTIPLE_OF_5_RESULT, result);
    }

    @Test
    public void testMultiplesOf3and5PrintFizzBuzz() {
        String result = fizzBuzzService.getResultForRange(15, 15);
        assertEquals(FizzBuzzService.MULTIPLE_OF_3_AND_5_RESULT, result);
    }

    @Test
    public void testNotMultiplesOf3and5PrintNumber() {
        String number = "14";
        String result = fizzBuzzService.getResultForRange(Integer.parseInt(number), Integer.parseInt(number));
        assertEquals(number, result);
    }
}
