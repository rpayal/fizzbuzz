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
    public void testMultiplesOf3PrintFizz() {
        String result = fizzBuzzService.getResult(3);
        assertEquals(FizzBuzzService.MULTIPLE_OF_3_RESULT, result);
    }
}
