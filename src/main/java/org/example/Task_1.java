package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Task_1 {
/*
    public List<String> getOddNames(List<String> basicSourceList) {  результат достигнут, но мне я считаю, не предполагаемым путём
         List<String> isOddName = new ArrayList<>();
         for (int i = 0; i < basicSourceList.size(); i++) {
           if (i % 2 != 0) {
                isOddName.add(i + ". " + basicSourceList.get(i));
           }
         }
        System.out.println(isOddName);
       return isOddName;
    }
*/
    public String getOddNames(List<String> basicSourceList) {
        return IntStream.range(0, basicSourceList.size())
                .boxed()
                .map(name -> removeNotOddElem(name, basicSourceList))
                .collect(Collectors.joining());

    }

    public String removeNotOddElem(int x, List<String> basicSourceList) {
        return x %2 ==0 ? (x+1) + ". " + basicSourceList.get(x) + ", " : "";
    }

}


