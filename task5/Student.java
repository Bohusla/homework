package task5;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Student {
    public static void main(String[] args) {


        int newNumer = giveNumber(68);
        System.out.println("Номер студента - "+newNumer);

    }
    public static int giveNumber(int studNum){
        int n = studNum +1;
        Random random = new Random();
        int newStudNum = ThreadLocalRandom.current().nextInt(1, n);
        return newStudNum;
    }
}
