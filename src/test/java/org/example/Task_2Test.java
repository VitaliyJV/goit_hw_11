package org.example;

import org.junit.jupiter.api.Test;

import static org.example.Main.basicSourceList;

class Task_2Test {

    @Test
    void sortedFromZtoAList() {
        Task_2 t2 = new Task_2();
        System.out.println("Task 2: ");
        System.out.println(t2.sortedFromZtoAList(basicSourceList));
    }

}