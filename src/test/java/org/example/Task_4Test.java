package org.example;

import org.junit.jupiter.api.Test;

class Task_4Test {

    @Test
    void randomLongStream() {
        Task_4 t4 = new Task_4();
        System.out.println("Task 4: ");
        t4.randomLongStream(11, 2^48, 5);
    }

}