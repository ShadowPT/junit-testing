package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;

import java.util.Arrays;
import java.util.List;

public class ListAggregatorTest {
    private List<Integer> list;

    @BeforeEach
    public void setup(){
        this.list = Arrays.asList(1,2,4,2,5);
    }

    @Test
    public void sum() {
        //Arrange
        setup();

        //Act
        ListAggregator aggregator = new ListAggregator();
        int sum = aggregator.sum(list);

        //Assert
        Assertions.assertEquals(14, sum);
    }

    @Test
    public void max() {
        setup();

        ListAggregator aggregator = new ListAggregator();
        int max = aggregator.max(list);

        Assertions.assertEquals(5, max);
    }

    @Test
    public void min() {
        setup();

        ListAggregator aggregator = new ListAggregator();
        int min = aggregator.min(list);

        Assertions.assertEquals(1, min);
    }


    @Test
    public void distinct() {
        setup();

        ListAggregator aggregator = new ListAggregator();
        int distinct = aggregator.distinct(list);

        Assertions.assertEquals(4, distinct);
    }

    @Test
    public void max_bug_7263(){
        list = Arrays.asList(-1,-4,-5);

        ListAggregator aggregator = new ListAggregator();
        int max_bug_7263 = aggregator.max(list);

        Assertions.assertEquals(-1, max_bug_7263);
    }

    @Test
    public void distinct_bug_8726(){
        list = Arrays.asList(1,2,4,2);

        ListAggregator aggregator = new ListAggregator();
        int distinct_bug_8726 = aggregator.distinct(list);

        Assertions.assertEquals(3, distinct_bug_8726);
    }
}
