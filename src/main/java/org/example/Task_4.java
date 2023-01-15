package org.example;

import java.util.stream.LongStream;

public class Task_4 {

    public void randomLongStream(long c, long m, long seed) {
        long a = 25214903917L;
        LongStream.iterate(seed, x -> (a*x + c) % m)
                .limit(10)
                .forEach(System.out::println);

    }
}

/*
Используя Stream.iterate сделайте бесконечный стрим рандомных чисел, но не используя Math.random(). Реализуйте свой
"линейный конгруэнтный генератор". Для этого начните с x[0] = seed и затем каждый следующий элемент x[n + 1] = 1
(a x[n] + c) % m, для корректных значений a, c, и m. Необходимо имплементировать метод, который принимает на вход
параметры, c, m и seed и возвращает Stream<Long>. Для теста используйте данные a = 25214903917, c = 11 и m = 2^48
(2 в степени 48).
 */
