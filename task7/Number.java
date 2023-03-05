package task7;

public class Number {
    public static void main(String[] args) {

        // Вывести в консоль 20 раз фразу "Это строка номер n", где n - номер строки

        for (int i = 1; i < 21; i++) {
            System.out.println("Это строка номер " + i);
        }

        //Вывести в консоль все числа от 40 до 20 включительно в порядке убывания

        System.out.println();
        for (int i = 40; i > 19; i--) {
            System.out.println( i);
        }

        //Вывести в консоль сумму всех нечётных чисел от 20 до 60 включительно

        int oddNumberCount = 0;//2n+1
        // int eventNumberCount - 2n

        int currentValue = 20;
        int limit = 60;
        while (currentValue <= limit){
            if (currentValue %2 != 0){
                oddNumberCount = oddNumberCount + currentValue;
            }
            currentValue++;
        }


            System.out.println(oddNumberCount);



        }

    }
