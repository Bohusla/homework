package task9;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int arrayLength = 10;
        int valueRange = 11;
        Random random = new Random();
        int search = random.nextInt(valueRange);

        int[] array = new int[arrayLength];
        for (int i =0; i < arrayLength; i++) {
            array[i] = random.nextInt(valueRange);
        }
        System.out.println("masiv");
        System.out.println(Arrays.toString(array));
        System.out.println("sort masiv");
        
         System.out.println(Sort.insertionSort(array));; //  не получилось запустить метод
        
        Teacher's comment: Добрый день.
У Вас не получилось запустить метод, потому что Вы пытаетесь вывести в консоль результат работы метода. Но Ваш метод имеет тип возвращаемого значения - void. 
            То есть метод не возвращает вообще никакого значения. Соответственно, мы не можем вывести в консоль ничего, пустоту. То есть вместо:
System.out.println(Sort.insertionSort(array));
нужно просто вызвать этот метод:
Sort.insertionSort(array);
И после этого, чтобы убедиться, что массив отсортирован, вывести в консоль сам массив:
System.out.println(Arrays.toString(array));
    }
}
