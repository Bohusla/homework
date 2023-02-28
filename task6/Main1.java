package task6;

import java.util.Random;

public class Main1 {
    public static void main(String[] args) {


        Random random = new Random();
        int month = random.nextInt(1, 13);

        switch (month) {
            case 1:
                System.out.println("Зима - январь");
                break;
            case 2:
                System.out.println("Зима - февраль");
                break;
            case 3:
                System.out.println("Осень - март");
                break;
            case 4:
                System.out.println("Весна - апрель");
                break;
            case 5:
                System.out.println("Весна - май");
                break;
            case 6:
                System.out.println("Лето - июнь");
                break;
            case 7:
                System.out.println("Лето - июль");
                break;
            case 8:
                System.out.println("Лето - август");
                break;
            case 9:
                System.out.println("Осень - сентябрь");
                break;
            case 10:
                System.out.println("Осень - октябрь");
                break;
            case 11:
                System.out.println("Осень - ноябрь");
                break;
            case 12:
                System.out.println("Зима - январь");


        }
        System.out.println(month);
    }





}
