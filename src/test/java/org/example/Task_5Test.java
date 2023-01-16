package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Task_5Test {

    @Test
    void zip() {
        List<String> l1 = Task_5.zip(Stream.of("one", "two", "three", "four"), Stream.of("1", "2", "3", "4", "5", "6")).collect(Collectors.toList());
        System.out.println(l1);
    }

}