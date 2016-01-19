package springbook.learningtest.template;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.IOException;

/**
 * Created by dw on 2016. 1. 19..
 */
public class CalcSumTest {
    @Test
    public void sumOfNumbers() throws IOException {
        Calculator calculator = new Calculator();

        int sum = calculator.calcSum(getClass().getClassLoader().getResource("numbers.txt").getPath());
        assertThat(sum, is(10));
    }
}
