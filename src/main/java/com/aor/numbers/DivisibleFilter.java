package com.aor.numbers;

public class DivisibleFilter implements GenericListFilterer{
    private Integer divisor;

    public DivisibleFilter(Integer divisor){
        this.divisor=divisor;
    }
    public boolean accept(Integer number){
        return number%divisor==0;
    }

}
