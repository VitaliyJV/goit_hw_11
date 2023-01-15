package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class Task_3 {

    public static String[] sourceArray = {"1, 2, 0", "4, 5"};

    int[] intToStringArray(String[] sourceArray) {
        StringBuilder sb1 = new StringBuilder();
        for (var elem: sourceArray) {
            sb1.append(elem).append(" ");
        }
        String allChars = sb1.toString().replaceAll(",","").strip();
        String[] modSourceArr = allChars.split(" ");

        int[] resIntArr = Stream.of(modSourceArr).mapToInt(Integer::parseInt).toArray();

        System.out.println(Arrays.toString(resIntArr));
        return resIntArr;
    }

}

