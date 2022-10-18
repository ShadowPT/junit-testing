package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.lang.model.type.ArrayType;
import java.util.Arrays;
import java.util.List;

public class DivisibleFilterTest {

    private Integer number1;
    private Integer number2;

    @Test
    public void test_positive(){
        this.number1 = 2132654;
        this.number2 = 5619843;

        DivisibleFilter filter = new DivisibleFilter(2);

        Assertions.assertTrue(filter.accept(number1));
        Assertions.assertFalse(filter.accept(number2));
    }

    @Test
    public void test_negative(){
        this.number1 = -2132654;
        this.number2 = -5619843;

        DivisibleFilter filter = new DivisibleFilter(2);

        Assertions.assertTrue(filter.accept(number1));
        Assertions.assertFalse(filter.accept(number2));
    }
}
