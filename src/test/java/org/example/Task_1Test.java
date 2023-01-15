package org.example;

import static org.example.Main.basicSourceList;

class Task_1Test {

    @org.junit.jupiter.api.Test
    void getOddNames() {
        System.out.println("My source List: " + basicSourceList);
        Task_1 t1 = new Task_1();
        System.out.println("Task 1: ");
        System.out.println(t1.getOddNames(basicSourceList));

    }

}