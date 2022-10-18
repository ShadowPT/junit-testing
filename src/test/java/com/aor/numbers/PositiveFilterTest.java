package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PositiveFilterTest {

    private Integer number1;
    private Integer number2;

    @Test
    public void test_positive(){
        this.number1 = 56465165;
        this.number2 = -6512132;

        PositiveFilter filter = new PositiveFilter();

        Assertions.assertTrue(filter.accept(number1));
        Assertions.assertFalse(filter.accept(number2));
    }

    @Test
    public void test_negative(){
        this.number1 = 56465165;
        this.number2 = -6512132;

        PositiveFilter filter = new PositiveFilter();

        Assertions.assertTrue(filter.accept(number1));
        Assertions.assertFalse(filter.accept(number2));
    }

    @Test
    public void test_min(){
        this.number1 = Integer.MIN_VALUE;

        PositiveFilter filter = new PositiveFilter();

        Assertions.assertFalse(filter.accept(number1));
    }

    @Test
    public void test_max(){
        this.number1 = Integer.MAX_VALUE;

        PositiveFilter filter = new PositiveFilter();

        Assertions.assertTrue(filter.accept(number1));
    }

    @Test
    public void test_zero(){
        this.number1 = 0;

        PositiveFilter filter = new PositiveFilter();

        Assertions.assertTrue(filter.accept(number1));
    }
}
