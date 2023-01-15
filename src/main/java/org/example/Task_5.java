package org.example;

import java.util.Iterator;
import java.util.stream.Stream;

public class Task_5 {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> i1 = first.iterator();
        Iterator<T> i2 = second.iterator();
        Stream<T> resultStream = Stream.empty();
        while (i1.hasNext() & i2.hasNext()){
            resultStream = Stream.concat(resultStream, Stream.of(i1.next(), i2.next()));
        }
        return resultStream;
    }

}
