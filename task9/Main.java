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
        System.out.println(Arrays.toString(array));
    }
}
