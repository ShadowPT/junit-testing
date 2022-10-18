package com.aor.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFilterer {
    private GenericListFilterer filter;

    public ListFilterer(GenericListFilterer filter){
        this.filter = filter;
    }

    public List<Integer> filter(List<Integer> list){
        List<Integer> tmpList = new ArrayList<Integer>();
        for(Integer i : list){
            if(filter.accept(i)){
                tmpList.add(i);
            }
        }
        return tmpList;
    }
}
