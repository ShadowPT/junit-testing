package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListFiltererTest {

    private List<Integer> list;

    @Test
    public void even_numbers_filter(){
        //Arrange
        this.list = Arrays.asList(1,2,5,10,12,15,25,31,9,7,6);
        List<Integer> expected = Arrays.asList(2,10,12,6);

        //Act
        DivisibleFilter divisibleFilter = new DivisibleFilter(2);
        ListFilterer filterer = new ListFilterer(divisibleFilter);
        List<Integer> filteredList = filterer.filter(list);

        //Assert
        Assertions.assertEquals(expected, filteredList);

    }

    @Test
    public void even_repeated_numbers_filter(){
        this.list = Arrays.asList(1,2,2,2,5,10,12,15,15,15,25,31,9,7,6);
        List<Integer> expected = Arrays.asList(2,2,2,10,12,6);

        DivisibleFilter divisibleFilter = new DivisibleFilter(2);
        ListFilterer filterer = new ListFilterer(divisibleFilter);
        List<Integer> filteredList = filterer.filter(list);

        Assertions.assertEquals(expected, filteredList);
    }

    @Test
    public void odd_numbers_filter(){
        //Arrange
        this.list = Arrays.asList(1,2,5,10,12,15,25,31,9,7,6);
        List<Integer> expected = Arrays.asList(12,15,9,6);

        //Act
        DivisibleFilter divisibleFilter = new DivisibleFilter(3);
        ListFilterer filterer = new ListFilterer(divisibleFilter);
        List<Integer> filteredList = filterer.filter(list);

        //Assert
        Assertions.assertEquals(expected, filteredList);

    }

    @Test
    public void odd_repeated_numbers_filter() {
        //Arrange
        this.list = Arrays.asList(1, 2, 2, 2, 5, 10, 12, 12, 12, 15, 25, 31, 9, 7, 6);
        List<Integer> expected = Arrays.asList(12, 12, 12, 15, 9, 6);

        //Act
        DivisibleFilter divisibleFilter = new DivisibleFilter(3);
        ListFilterer filterer = new ListFilterer(divisibleFilter);
        List<Integer> filteredList = filterer.filter(list);

        //Assert
        Assertions.assertEquals(expected, filteredList);
    }
}
