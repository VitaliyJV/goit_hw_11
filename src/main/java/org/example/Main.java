package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static List<String> basicSourceList = Arrays.asList("Oleksandr", "Dmitriy", "Vitaliy", "Yana",
            "Viktor", "Igor", "Svetlana", "Lubov", "Roman", "Vasyl", "Petro", "Sergiy","Artem", "Andriy");

    public static void main(String[] args) {
        System.out.println("My source List: " + basicSourceList);
        Task_1 t1 = new Task_1();
        System.out.println("Task 1: ");
        System.out.println(t1.getOddNames(basicSourceList));

        Task_2 t2 = new Task_2();
        System.out.println("Task 2: ");
        System.out.println(t2.sortedFromZtoAList(basicSourceList));

        Task_3 t3 = new Task_3();
        System.out.println("Task 3: ");
        t3.intToStringArray(Task_3.sourceArray);

        Task_4 t4 = new Task_4();
        System.out.println("Task 4: ");
        t4.randomLongStream(11, 2^48, 5);

    }

}