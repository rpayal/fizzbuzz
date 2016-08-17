package com.co4gsl.service;

import org.junit.Before;
import org.junit.Test;

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
        String expectedResult = getExpectedResult("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz", 4, 3, 1, 2, 10);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testMultiplesOf3PrintFizz() {
        String result = fizzBuzzService.getResultForRange(6, 6);
        assertEquals(getExpectedResult("fizz", 1, 0, 0, 0, 0), result);
    }

    @Test
    public void testNumberContain3PrintLucky() {
        String result = fizzBuzzService.getResultForRange(3, 3);
        assertEquals(getExpectedResult("lucky", 0, 0, 0, 1, 0), result);
    }

    @Test
    public void testMultiplesOf5PrintBuzz() {
        String result = fizzBuzzService.getResultForRange(25, 25);
        assertEquals(getExpectedResult("buzz", 0, 1, 0, 0, 0), result);
    }

    @Test
    public void testMultiplesOf3and5PrintFizzBuzz() {
        String result = fizzBuzzService.getResultForRange(15, 15);
        assertEquals(getExpectedResult("fizzbuzz", 0, 0, 1, 0, 0), result);
    }

    @Test
    public void testNotMultiplesOf3and5PrintNumber() {
        String number = "14";
        String result = fizzBuzzService.getResultForRange(Integer.parseInt(number), Integer.parseInt(number));
        assertEquals(getExpectedResult("14", 0, 0, 0, 0, 1), result);
    }

    private String getExpectedResult(String prefix, int fizzTot, int buzzTot, int fizzbuzzTot, int luckyTot, int integerTot) {
        return prefix + " \n" +
                " fizz:" + fizzTot + "\n" +
                "buzz:" + buzzTot + "\n" +
                "fizzbuzz:" + fizzbuzzTot + "\n" +
                "lucky:" + luckyTot + "\n" +
                "integer:" + integerTot + "\n";
    }
}
