package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task_2 {

    public List sortedFromZtoAList(List<String> basicSourceList) {
        List sortedList = basicSourceList.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        return sortedList;
    }

}
