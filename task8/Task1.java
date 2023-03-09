package task8;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class Task1 {
    //  Задача 1.
    //Дана целочисленная переменная а.
    //Дан массив целых чисел длиной на 1 меньше, чем значение переменной а.
    //Массив содержит все числа из диапазона от 1 до а.
    //Числа внутри массива не могут повторяться. При этом одно число обязательно окажется пропущенным,
    //т.к. длина массива на 1 меньше, чем количество чисел в заданном диапазоне.
    //Напишите программу, которая вычисляет это пропущенное число.
    //
    //Пример:
    //Переменная a = 5;
    //Массив int[] array = {1, 2, 3, 5}; (длина массива равна a-1, числа внутри не повторяются, пропущено число 4).
    //Ответ: 4.
    //Программа должна быть универсальной, то есть одинаково корректно работать с любыми данными, удовлетворяющими условию задачи.


    public static void main(String[] args) {


        int[] arrayMiss = {1, 4, 3, 5};
        Arrays.sort(arrayMiss);

        if (arrayMiss[0] != 1) {
            System.out.println("1");

        } else if (arrayMiss[1] != 2) {
            System.out.println("2");
        } else if (arrayMiss[2] != 3) {
            System.out.println("3");
        } else if (arrayMiss[3] != 4) {
            System.out.println("5");

        }

    }

}

































