package task5;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {


    public static void main(String[] args) {

        // прогулка на выходных
        boolean isWeekend = true;
        boolean isRain = false;
        boolean invRain = !isRain;


        boolean canWalk = (isWeekend && invRain);
        System.out.println("сегодня можно гулять: " + canWalk);
        System.out.println();


        //покупки


        boolean result1 = canBuy(false, true);
        System.out.println("Я могу купить еду: " + result1);
        System.out.println();




        // пора домой через...


        int timeNowSeconds;


        Random random = new Random();
        timeNowSeconds = ThreadLocalRandom.current().nextInt(0, 281);


        System.out.println("- " + timeNowSeconds + " секунд");
        if (timeNowSeconds < 3600) {
            System.out.println("До конца рабочего дня осталось " + timeNowSeconds / 60 + " минут");
        } else {
            System.out.println("До конца рабочего дня осталось " + (281 - timeNowSeconds) / 3660 + "h");
        }

    }

    public static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {

        boolean result;
        result = isReweOpen || isEdekaOpen;

        boolean edeka = isEdekaOpen;
        boolean rewe = isReweOpen;
        if (edeka) {
            System.out.println(" Edeka open ");
        }
        if (rewe) {
            System.out.println("Rewe open");
        } else {
            System.out.println("all schop close");
        }
        return result;
    }





    }





